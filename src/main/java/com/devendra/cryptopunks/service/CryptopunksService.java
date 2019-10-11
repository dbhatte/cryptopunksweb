package com.devendra.cryptopunks.service;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public interface CryptopunksService {

    BigInteger getPunkOfferedPrice(BigInteger index) throws Exception;

    List<BigInteger> getPunksForSale() throws InterruptedException, ExecutionException;

    Map<String, Map<String, Object>> getAllPunkDetails() throws IOException;

}
