package com.devendra.cryptopunks.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CryptopunksServiceTest {

    private static final Logger log = LoggerFactory.getLogger(CryptopunksServiceTest.class);

    @Autowired
    private CryptopunksService service;

    @Test
    public void callOneAsyncTest() throws ExecutionException, InterruptedException {
        log.info(service.isPunkOfferedForSale(BigInteger.valueOf(7245)).get().component1().toString());
    }

    //@Test
    public void getPunksForSaleTest() throws ExecutionException, InterruptedException {
        log.info(service.getPunksForSale().toString());
    }

    @Test
    public void getAllPunkDetails() throws IOException {
        assertEquals("Punk loaded count is correct", 8991, service.getAllPunkDetails().size());
    }
}
