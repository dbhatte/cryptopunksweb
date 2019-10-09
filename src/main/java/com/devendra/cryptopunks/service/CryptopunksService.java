package com.devendra.cryptopunks.service;

import org.web3j.tuples.generated.Tuple5;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface CryptopunksService {

    CompletableFuture<Tuple5<Boolean, BigInteger, String, BigInteger, String>> isPunkOfferedForSale(BigInteger index);

    List<BigInteger> getPunksForSale() throws InterruptedException, ExecutionException;

    Map<String, String> getAllPunkDetails() throws IOException;

}
