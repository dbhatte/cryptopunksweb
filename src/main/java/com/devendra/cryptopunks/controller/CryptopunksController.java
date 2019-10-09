package com.devendra.cryptopunks.controller;

import com.devendra.cryptopunks.service.CryptopunksService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
public class CryptopunksController {

    private static final Logger log = LoggerFactory.getLogger(CryptopunksController.class);

    @Autowired
    private CryptopunksService cryptopunksService;

    @RequestMapping("/cryptopunks/sale")
    public List<BigInteger> getPunksForSale() throws ExecutionException, InterruptedException {
        return cryptopunksService.getPunksForSale();
    }

}
