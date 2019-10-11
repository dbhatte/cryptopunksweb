package com.devendra.cryptopunks.service;

import com.devendra.cryptopunks.generated.CryptoPunksMarket;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.web3j.tuples.generated.Tuple5;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class CryptopunksServiceImpl implements CryptopunksService {

    private static final Logger log = LoggerFactory.getLogger(CryptopunksServiceImpl.class);

    @Value("${cryptopunks.list.url}")
    private String cryptopunksUrl;

    @Autowired
    CryptoPunksMarket cryptoPunksMarket;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Executor asyncExecutor;

    private static final List<BigInteger> range = LongStream.rangeClosed(0, 9999).boxed().map(BigInteger::valueOf).collect(Collectors.toList());

    @Override
    public List<BigInteger> getPunksForSale() throws InterruptedException, ExecutionException {
        log.info("getPunksForSale start");

        List<CompletableFuture<Tuple5<Boolean, BigInteger, String, BigInteger, String>>> completableFutures = range.stream().map(index -> CompletableFuture.supplyAsync(() -> supplier(index), asyncExecutor)).collect(Collectors.toList());

        CompletableFuture<Void> allFutures = CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[0]));

        CompletableFuture<List<Tuple5<Boolean, BigInteger, String, BigInteger, String>>> allCompletableFuture =
            allFutures.thenApply(future ->
                completableFutures.stream()
                    .map(CompletableFuture::join)
                    .collect(Collectors.toList())
            );

        CompletableFuture<List<BigInteger>> completableFuture =
            allCompletableFuture
                .thenApply(
                    tuple5s -> tuple5s.stream()
                                    .filter(Tuple5::component1)
                                    .map(Tuple5::component2)
                                    .collect(Collectors.toList()));

        final List<BigInteger> punksForSale = completableFuture.get();

        log.info("getPunksForSale end");

        return punksForSale;
    }

    private Tuple5<Boolean, BigInteger, String, BigInteger, String> supplier(BigInteger index) {
        try {
            return cryptoPunksMarket.punksOfferedForSale(index).send();
        }
        catch (Exception e) {
            log.error(e.getMessage());
        }
        return new Tuple5<>(false, index, "", BigInteger.ZERO, "");
    }

    /*
    * Please note this returns only values till 8999. Need to use another API for all punks details
    * Output from this class is a constant and so is cached for performance
    * */
    @Override
    @Cacheable("cryptopunk")
    public Map<String, Map<String, Object>>  getAllPunkDetails() throws IOException {
        log.info("getAllPunkDetails start");
        String result = restTemplate.getForObject(cryptopunksUrl, String.class);

        ObjectMapper mapper = new ObjectMapper();
        log.info("getAllPunkDetails end");

        return mapper.readValue(result, Map.class);
    }

    @Override
    public BigInteger getPunkOfferedPrice(BigInteger index) throws Exception {
        return cryptoPunksMarket.punksOfferedForSale(index).send().component4();
    }

}
