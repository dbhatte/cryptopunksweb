package com.devendra.cryptopunks;

import com.devendra.cryptopunks.generated.CryptoPunksMarket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.DefaultGasProvider;

import java.io.IOException;

@Configuration
public class EthereumConfiguration {

    private static final Logger log = LoggerFactory.getLogger(CryptopunksApplication.class);

    @Value("${ethereum.service.url}")
    private String url;

    @Value("${ethereum.wallet.source}")
    private String source;

    @Value("${ethereum.wallet.password}")
    private String walletPassword;

    @Value("${ethereum.cryptopunks.contract.address}")
    private String contractAddress;

    @Bean
    Web3j web3j() throws IOException {
        Web3j web3j = Web3j.build(new HttpService(url));
        log.info("Connected to Ethereum client version: "
            + web3j.web3ClientVersion().send().getWeb3ClientVersion());
        return web3j;
    }

    @Bean
    Credentials credentials() throws IOException, CipherException {
        Credentials credentials =
            WalletUtils.loadCredentials(
                walletPassword,
                source
            );
        log.info("Credentials loaded");
        return credentials;
    }

    @Bean
    ContractGasProvider contractGasProvider() {
        return new DefaultGasProvider();
    }

    @Bean
    CryptoPunksMarket cryptoPunksMarket(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return CryptoPunksMarket.load(contractAddress, web3j, credentials, contractGasProvider);
    }


}
