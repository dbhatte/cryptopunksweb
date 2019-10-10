package com.devendra.cryptopunks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
@EnableCaching
@EnableAsync
public class CryptopunksApplication {

    public static void main(String[] args) {
        SpringApplication.run(CryptopunksApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean(name = "asyncExecutor")
    public Executor asyncExecutor() {
        ExecutorService executor = Executors.newFixedThreadPool(20);
        return executor;
    }

}
