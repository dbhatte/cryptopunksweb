package com.devendra.cryptopunks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class CryptopunksServiceImpl implements CryptopunksService {

    @Value("${ethereum.cryptopunks.contract.address}")
    private String contractAddress;

    @Autowired
    Web3j web3j;

    @Autowired
    Credentials credentials;

    @Autowired
    ContractGasProvider contractGasProvider;

    @Autowired
    CryptoPunksMarket market;

    @Bean
    CryptoPunksMarket cryptoPunksMarket() {
        return CryptoPunksMarket.load(contractAddress, web3j, credentials, contractGasProvider);
    }

    @Override
    public List<BigInteger> getPunksForSale() throws InterruptedException, ExecutionException {

        List<BigInteger> range = LongStream.rangeClosed(7240, 7250)
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
    @Async
    public CompletableFuture<Tuple5<Boolean, BigInteger, String, BigInteger, String>> isPunkOfferedForSale(BigInteger index) {
        return market.punksOfferedForSale(index).sendAsync();
    }

}
