package com.devendra.cryptopunks.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.web3j.tuples.generated.Tuple5;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class CryptopunksServiceImpl implements CryptopunksService {

    @Autowired
    CryptoPunksMarket cryptoPunksMarket;

    @Value("${cryptopunks.list.url}")
    private String cryptopunksUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<BigInteger> getPunksForSale() throws InterruptedException, ExecutionException {

        List<BigInteger> range = LongStream.rangeClosed(0, 9999)
            .boxed().map(BigInteger::valueOf).collect(Collectors.toList());

        List<CompletableFuture<Tuple5<Boolean, BigInteger, String, BigInteger, String>>> completableFutures = range.stream().map(this::isPunkOfferedForSale).collect(Collectors.toList());

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

        return completableFuture.get();
    }

    @Override
    @Cacheable("cryptopunk")
    public Map<String, Map<String, Object>>  getAllPunkDetails() throws IOException {
        String result = restTemplate.getForObject(
            cryptopunksUrl, String.class);

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(result, Map.class);
    }

    @Override
    @Async
    public CompletableFuture<Tuple5<Boolean, BigInteger, String, BigInteger, String>> isPunkOfferedForSale(BigInteger index) {
        return cryptoPunksMarket.punksOfferedForSale(index).sendAsync();
    }

    public BigInteger getPunkOfferedPrice(BigInteger index) throws Exception {
        return cryptoPunksMarket.punksOfferedForSale(index).send().component4();
    }


}
