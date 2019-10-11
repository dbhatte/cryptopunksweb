package com.devendra.cryptopunks.controller;

import com.devendra.cryptopunks.service.CryptopunksService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@RestController
public class CryptopunksController {

    public static final String PUNK_SALE_DETAIL_URL = "/cryptopunks";
    public static final String PUNKS_FOR_SALE_LIST_URL = "/cryptopunks/sale";
    private static final Logger log = LoggerFactory.getLogger(CryptopunksController.class);

    @Autowired
    private CryptopunksService cryptopunksService;

    @RequestMapping(PUNKS_FOR_SALE_LIST_URL)
    public List<BigInteger> getPunksForSale() throws ExecutionException, InterruptedException {
        return cryptopunksService.getPunksForSale();
    }

    @RequestMapping(PUNK_SALE_DETAIL_URL)
    public String getPunkDetailsForSale(@RequestParam(value = "id") BigInteger id)
    throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        Map <String, Object> punkDetails = cryptopunksService.getAllPunkDetails().get(id.toString());

        Map result = new HashMap();
        if (punkDetails == null) {
            result.put("gender", "Unknown");
            result.put("accessories", "[]");
        }
        else {
            result.putAll(punkDetails);
        }
        result.put("offerPrice", cryptopunksService.getPunkOfferedPrice(id));
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
    }
}
