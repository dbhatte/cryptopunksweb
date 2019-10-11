# CryptoPunks
## Requirements

- Web3J
    - Install Web3J (for Mac you can use Homebrew)
    - Create wallet. See https://docs.web3j.io/command_line_tools/#wallet-tools for details on howto
    - Edit the ethereum.wallet.source & ethereum.wallet.password in application.properties accordingly
- JDK 11
- Maven

## To compile
```
mvn compile
mvn package
```
## To run
```
java -jar target/cryptopunks-0.0.1-SNAPSHOT.jar
```
## To test
```
mvn test
```
## URLs for testing
- For List of Cryptopunks for sale : http://localhost:8080/cryptopunks/sale
- For Details of a single cryptopunk : http://localhost:8080/cryptopunks?id=7245
