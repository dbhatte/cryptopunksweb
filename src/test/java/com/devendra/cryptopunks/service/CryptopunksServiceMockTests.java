package com.devendra.cryptopunks.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CryptopunksServiceMockTests {

    @Mock
    private CryptopunksService service;

    @Test()
    public void testIsPunkOfferedForSale() throws ExecutionException, InterruptedException {
       //TODO: Need to find how to mock future
    }
    @Test
    public void checkPunksForSale() throws ExecutionException, InterruptedException {

        when(service.getPunksForSale()).thenReturn(Arrays.asList(BigInteger.valueOf(10)));

        assertTrue("Punks for Sale count is wrong", service.getPunksForSale().size() == 1);
    }

}

