package com.devendra.cryptopunks.generated;

import io.reactivex.Flowable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple4;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.5.5.
 */
@SuppressWarnings("rawtypes")
public class CryptoPunksMarket extends Contract {
    private static final String BINARY = "6060604052606060405190810160405280604081526020017f616333396166343739333131396565343662626666333531643863623662356681526020017f3233646136303232323132366164643432363865323631313939613239323162815250600090805190602001906200007892919062000202565b50604060405190810160405280600b81526020017f43727970746f50756e6b7300000000000000000000000000000000000000000081525060029080519060200190620000c792919062000202565b5060006007556000600860006101000a81548160ff02191690831515021790555060006009555b33600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550612710600681905550600654600981905550604060405190810160405280600b81526020017f43525950544f50554e4b53000000000000000000000000000000000000000000815250600390805190602001906200018f92919062000202565b50604060405190810160405280600281526020017fcfbe00000000000000000000000000000000000000000000000000000000000081525060049080519060200190620001de92919062000202565b506000600560006101000a81548160ff021916908360ff1602179055505b620002b1565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200024557805160ff191683800117855562000276565b8280016001018555821562000276579182015b828111156200027557825182559160200191906001019062000258565b5b50905062000285919062000289565b5090565b620002ae91905b80821115620002aa57600081600090555060010162000290565b5090565b90565b612ed580620002c16000396000f3006060604052361561015d576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806306fdde031461015f578063088f11f3146101f8578063091dbfd2146102a457806318160ddd146102bc57806323165b75146102e2578063313ce5671461030b57806339c5dde6146103375780633ccfd60b146103ce57806351605d80146103e057806352f29a2514610479578063581781681461049f5780635a3b7e42146104ff5780636e743fa91461059857806370a08231146106115780637ecedac91461065b5780638126c38a1461066d5780638264fe98146106975780638b72a2ec146106af57806395d89b41146106ee578063979bc63814610787578063a75a9049146107a7578063bf31196f146107e6578063c0d6ce631461082e578063c44193c314610854578063c81d1d5b1461087d578063f3f437031461089d578063f6eeff1e146108e7575bfe5b341561016757fe5b61016f610907565b60405180806020018281038252838181518152602001915080519060200190808383600083146101be575b8051825260208311156101be5760208201915060208101905060208303925061019a565b505050905090810190601f1680156101ea5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561020057fe5b61021660048080359060200190919050506109a5565b60405180861515151581526020018581526020018473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018381526020018273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019550505050505060405180910390f35b6102ba6004808035906020019091905050610a28565b005b34156102c457fe5b6102cc610cf6565b6040518082815260200191505060405180910390f35b34156102ea57fe5b6103096004808035906020019091908035906020019091905050610cfc565b005b341561031357fe5b61031b6112aa565b604051808260ff1660ff16815260200191505060405180910390f35b341561033f57fe5b6103cc600480803590602001908201803590602001908080602002602001604051908101604052809392919081815260200183836020028082843782019150505050505091908035906020019082018035906020019080806020026020016040519081016040528093929190818152602001838360200280828437820191505050505050919050506112bd565b005b34156103d657fe5b6103de61137c565b005b34156103e857fe5b6103f0611465565b604051808060200182810382528381815181526020019150805190602001908083836000831461043f575b80518252602083111561043f5760208201915060208101905060208303925061041b565b505050905090810190601f16801561046b5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561048157fe5b610489611503565b6040518082815260200191505060405180910390f35b34156104a757fe5b6104bd6004808035906020019091905050611509565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b341561050757fe5b61050f61153c565b604051808060200182810382528381815181526020019150805190602001908083836000831461055e575b80518252602083111561055e5760208201915060208101905060208303925061053a565b505050905090810190601f16801561058a5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34156105a057fe5b6105b660048080359060200190919050506115da565b60405180851515151581526020018481526020018373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200182815260200194505050505060405180910390f35b341561061957fe5b610645600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050611637565b6040518082815260200191505060405180910390f35b341561066357fe5b61066b61164f565b005b341561067557fe5b61067d6116ca565b604051808215151515815260200191505060405180910390f35b6106ad60048080359060200190919050506116dd565b005b34156106b757fe5b6106ec600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091908035906020019091905050611c5b565b005b34156106f657fe5b6106fe61207a565b604051808060200182810382528381815181526020019150805190602001908083836000831461074d575b80518252602083111561074d57602082019150602081019050602083039250610729565b505050905090810190601f1680156107795780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561078f57fe5b6107a56004808035906020019091905050612118565b005b34156107af57fe5b6107e4600480803573ffffffffffffffffffffffffffffffffffffffff169060200190919080359060200190919050506123f0565b005b34156107ee57fe5b61082c600480803590602001909190803590602001909190803573ffffffffffffffffffffffffffffffffffffffff169060200190919050506126c5565b005b341561083657fe5b61083e6128e4565b6040518082815260200191505060405180910390f35b341561085c57fe5b61087b60048080359060200190919080359060200190919050506128ea565b005b341561088557fe5b61089b6004808035906020019091905050612af4565b005b34156108a557fe5b6108d1600480803573ffffffffffffffffffffffffffffffffffffffff16906020019091905050612c91565b6040518082815260200191505060405180910390f35b34156108ef57fe5b6109056004808035906020019091905050612ca9565b005b60038054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561099d5780601f106109725761010080835404028352916020019161099d565b820191906000526020600020905b81548152906001019060200180831161098057829003601f168201915b505050505081565b600c6020528060005260406000206000915090508060000160009054906101000a900460ff16908060010154908060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16908060030154908060040160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16905085565b600061271082101515610a3b5760006000fd5b600860009054906101000a900460ff161515610a575760006000fd5b6000600a600084815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161415610aaf5760006000fd5b3373ffffffffffffffffffffffffffffffffffffffff16600a600084815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161415610b1c5760006000fd5b6000341415610b2b5760006000fd5b600d60008381526020019081526020016000209050806003015434111515610b535760006000fd5b600081600301541115610bd6578060030154600e60008360020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600082825401925050819055505b6080604051908101604052806001151581526020018381526020013373ffffffffffffffffffffffffffffffffffffffff16815260200134815250600d600084815260200190815260200160002060008201518160000160006101000a81548160ff0219169083151502179055506020820151816001015560408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550606082015181600301559050503373ffffffffffffffffffffffffffffffffffffffff16827f5b859394fabae0c1ba88baffe67e751ab5248d2e879028b8c8d6897b0519f56a346040518082815260200191505060405180910390a35b5050565b60065481565b60006000600061271085101515610d135760006000fd5b600860009054906101000a900460ff161515610d2f5760006000fd5b3373ffffffffffffffffffffffffffffffffffffffff16600a600087815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515610d9d5760006000fd5b339250600d60008681526020019081526020016000209150600082600301541415610dc85760006000fd5b8382600301541015610dda5760006000fd5b8160020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16600a600087815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550600b60008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000815480929190600190039190505550600b60008360020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600081548092919060010191905055508160020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168373ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef60016040518082815260200191505060405180910390a360a0604051908101604052806000151581526020018681526020018360020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200160008152602001600073ffffffffffffffffffffffffffffffffffffffff16815250600c600087815260200190815260200160002060008201518160000160006101000a81548160ff0219169083151502179055506020820151816001015560408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506060820151816003015560808201518160040160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555090505081600301549050608060405190810160405280600015158152602001868152602001600073ffffffffffffffffffffffffffffffffffffffff1681526020016000815250600d600087815260200190815260200160002060008201518160000160006101000a81548160ff0219169083151502179055506020820151816001015560408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506060820151816003015590505080600e60008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600082825401925050819055508160020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168373ffffffffffffffffffffffffffffffffffffffff16867f58e5d5a525e3b40bc15abaa38b5882678db1ee68befd2f60bafe3a7fd06db9e385600301546040518082815260200191505060405180910390a45b5050505050565b600560009054906101000a900460ff1681565b60006000600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561131e5760006000fd5b83519150600090505b8181101561137557611367848281518110151561134057fe5b90602001906020020151848381518110151561135857fe5b906020019060200201516123f0565b5b8080600101915050611327565b5b50505050565b6000600860009054906101000a900460ff16151561139a5760006000fd5b600e60003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205490506000600e60003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055503373ffffffffffffffffffffffffffffffffffffffff166108fc829081150290604051809050600060405180830381858888f19350505050151561146157fe5b5b50565b60008054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156114fb5780601f106114d0576101008083540402835291602001916114fb565b820191906000526020600020905b8154815290600101906020018083116114de57829003601f168201915b505050505081565b60075481565b600a6020528060005260406000206000915054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b60028054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156115d25780601f106115a7576101008083540402835291602001916115d2565b820191906000526020600020905b8154815290600101906020018083116115b557829003601f168201915b505050505081565b600d6020528060005260406000206000915090508060000160009054906101000a900460ff16908060010154908060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16908060030154905084565b600b6020528060005260406000206000915090505481565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161415156116ac5760006000fd5b6001600860006101000a81548160ff0219169083151502179055505b565b600860009054906101000a900460ff1681565b600060006000600860009054906101000a900460ff1615156116ff5760006000fd5b600c60008581526020019081526020016000209250612710841015156117255760006000fd5b8260000160009054906101000a900460ff1615156117435760006000fd5b60008360040160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141580156117de57503373ffffffffffffffffffffffffffffffffffffffff168360040160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614155b156117e95760006000fd5b82600301543410156117fb5760006000fd5b600a600085815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168360020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614151561188d5760006000fd5b8260020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16915033600a600086815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550600b60008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000815480929190600190039190505550600b60003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600081548092919060010191905055503373ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef60016040518082815260200191505060405180910390a3611a1484612ca9565b34600e60008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600082825401925050819055503373ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff16857f58e5d5a525e3b40bc15abaa38b5882678db1ee68befd2f60bafe3a7fd06db9e3346040518082815260200191505060405180910390a4600d600085815260200190815260200160002090503373ffffffffffffffffffffffffffffffffffffffff168160020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161415611c54578060030154600e60003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008282540192505081905550608060405190810160405280600015158152602001858152602001600073ffffffffffffffffffffffffffffffffffffffff1681526020016000815250600d600086815260200190815260200160002060008201518160000160006101000a81548160ff0219169083151502179055506020820151816001015560408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550606082015181600301559050505b5b50505050565b6000600860009054906101000a900460ff161515611c795760006000fd5b3373ffffffffffffffffffffffffffffffffffffffff16600a600084815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515611ce75760006000fd5b61271082101515611cf85760006000fd5b600c600083815260200190815260200160002060000160009054906101000a900460ff1615611d2b57611d2a82612ca9565b5b82600a600084815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550600b60003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000815480929190600190039190505550600b60008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600081548092919060010191905055508273ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef60016040518082815260200191505060405180910390a38273ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167f05af636b70da6819000c49f85b21fa82081c632069bb626f30932034099107d8846040518082815260200191505060405180910390a3600d600083815260200190815260200160002090508273ffffffffffffffffffffffffffffffffffffffff168160020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161415612074578060030154600e60008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008282540192505081905550608060405190810160405280600015158152602001838152602001600073ffffffffffffffffffffffffffffffffffffffff1681526020016000815250600d600084815260200190815260200160002060008201518160000160006101000a81548160ff0219169083151502179055506020820151816001015560408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550606082015181600301559050505b5b505050565b60048054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156121105780601f106120e557610100808354040283529160200191612110565b820191906000526020600020905b8154815290600101906020018083116120f357829003601f168201915b505050505081565b600060006127108310151561212d5760006000fd5b600860009054906101000a900460ff1615156121495760006000fd5b6000600a600085815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614156121a15760006000fd5b3373ffffffffffffffffffffffffffffffffffffffff16600a600085815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141561220e5760006000fd5b600d600084815260200190815260200160002091503373ffffffffffffffffffffffffffffffffffffffff168260020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161415156122825760006000fd5b3373ffffffffffffffffffffffffffffffffffffffff16837f6f30e1ee4d81dcc7a8a478577f65d2ed2edb120565960ac45fe7c50551c8793284600301546040518082815260200191505060405180910390a381600301549050608060405190810160405280600015158152602001848152602001600073ffffffffffffffffffffffffffffffffffffffff1681526020016000815250600d600085815260200190815260200160002060008201518160000160006101000a81548160ff0219169083151502179055506020820151816001015560408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550606082015181600301559050503373ffffffffffffffffffffffffffffffffffffffff166108fc829081150290604051809050600060405180830381858888f1935050505015156123ea57fe5b5b505050565b600160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614151561244d5760006000fd5b600860009054906101000a900460ff16156124685760006000fd5b612710811015156124795760006000fd5b8173ffffffffffffffffffffffffffffffffffffffff16600a600083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161415156126c0576000600a600083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161415156125bc57600b6000600a600084815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008154809291906001900391905055506125d0565b600960008154809291906001900391905055505b81600a600083815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550600b60008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600081548092919060010191905055508173ffffffffffffffffffffffffffffffffffffffff167f8a0e37b73a0d9c82e205d4d1a3ff3d0b57ce5f4d7bccf6bac03336dc101cb7ba826040518082815260200191505060405180910390a25b5b5050565b600860009054906101000a900460ff1615156126e15760006000fd5b3373ffffffffffffffffffffffffffffffffffffffff16600a600085815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614151561274f5760006000fd5b612710831015156127605760006000fd5b60a0604051908101604052806001151581526020018481526020013373ffffffffffffffffffffffffffffffffffffffff1681526020018381526020018273ffffffffffffffffffffffffffffffffffffffff16815250600c600085815260200190815260200160002060008201518160000160006101000a81548160ff0219169083151502179055506020820151816001015560408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506060820151816003015560808201518160040160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055509050508073ffffffffffffffffffffffffffffffffffffffff16837f3c7b682d5da98001a9b8cbda6c647d2c63d698a4184fd1d55e2ce7b66f5d21eb846040518082815260200191505060405180910390a35b505050565b60095481565b600860009054906101000a900460ff1615156129065760006000fd5b3373ffffffffffffffffffffffffffffffffffffffff16600a600084815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161415156129745760006000fd5b612710821015156129855760006000fd5b60a0604051908101604052806001151581526020018381526020013373ffffffffffffffffffffffffffffffffffffffff168152602001828152602001600073ffffffffffffffffffffffffffffffffffffffff16815250600c600084815260200190815260200160002060008201518160000160006101000a81548160ff0219169083151502179055506020820151816001015560408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506060820151816003015560808201518160040160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055509050506000827f3c7b682d5da98001a9b8cbda6c647d2c63d698a4184fd1d55e2ce7b66f5d21eb836040518082815260200191505060405180910390a35b5050565b600860009054906101000a900460ff161515612b105760006000fd5b60006009541415612b215760006000fd5b6000600a600083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515612b7a5760006000fd5b61271081101515612b8b5760006000fd5b33600a600083815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550600b60003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008154809291906001019190505550600960008154809291906001900391905055503373ffffffffffffffffffffffffffffffffffffffff167f8a0e37b73a0d9c82e205d4d1a3ff3d0b57ce5f4d7bccf6bac03336dc101cb7ba826040518082815260200191505060405180910390a25b50565b600e6020528060005260406000206000915090505481565b600860009054906101000a900460ff161515612cc55760006000fd5b3373ffffffffffffffffffffffffffffffffffffffff16600a600083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515612d335760006000fd5b61271081101515612d445760006000fd5b60a0604051908101604052806000151581526020018281526020013373ffffffffffffffffffffffffffffffffffffffff16815260200160008152602001600073ffffffffffffffffffffffffffffffffffffffff16815250600c600083815260200190815260200160002060008201518160000160006101000a81548160ff0219169083151502179055506020820151816001015560408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506060820151816003015560808201518160040160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550905050807fb0e0a660b4e50f26f0b7ce75c24655fc76cc66e3334a54ff410277229fa10bd460405180905060405180910390a25b505600a165627a7a72305820845f16694d231d58e5e7db3b9057f849c657ba594ec80b76bddc5da71bd7f14b0029";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_PUNKSOFFEREDFORSALE = "punksOfferedForSale";

    public static final String FUNC_ENTERBIDFORPUNK = "enterBidForPunk";

    public static final String FUNC_TOTALSUPPLY = "totalSupply";

    public static final String FUNC_ACCEPTBIDFORPUNK = "acceptBidForPunk";

    public static final String FUNC_DECIMALS = "decimals";

    public static final String FUNC_SETINITIALOWNERS = "setInitialOwners";

    public static final String FUNC_WITHDRAW = "withdraw";

    public static final String FUNC_IMAGEHASH = "imageHash";

    public static final String FUNC_NEXTPUNKINDEXTOASSIGN = "nextPunkIndexToAssign";

    public static final String FUNC_PUNKINDEXTOADDRESS = "punkIndexToAddress";

    public static final String FUNC_STANDARD = "standard";

    public static final String FUNC_PUNKBIDS = "punkBids";

    public static final String FUNC_BALANCEOF = "balanceOf";

    public static final String FUNC_ALLINITIALOWNERSASSIGNED = "allInitialOwnersAssigned";

    public static final String FUNC_ALLPUNKSASSIGNED = "allPunksAssigned";

    public static final String FUNC_BUYPUNK = "buyPunk";

    public static final String FUNC_TRANSFERPUNK = "transferPunk";

    public static final String FUNC_SYMBOL = "symbol";

    public static final String FUNC_WITHDRAWBIDFORPUNK = "withdrawBidForPunk";

    public static final String FUNC_SETINITIALOWNER = "setInitialOwner";

    public static final String FUNC_OFFERPUNKFORSALETOADDRESS = "offerPunkForSaleToAddress";

    public static final String FUNC_PUNKSREMAININGTOASSIGN = "punksRemainingToAssign";

    public static final String FUNC_OFFERPUNKFORSALE = "offerPunkForSale";

    public static final String FUNC_GETPUNK = "getPunk";

    public static final String FUNC_PENDINGWITHDRAWALS = "pendingWithdrawals";

    public static final String FUNC_PUNKNOLONGERFORSALE = "punkNoLongerForSale";

    public static final Event ASSIGN_EVENT = new Event("Assign",
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event TRANSFER_EVENT = new Event("Transfer",
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event PUNKTRANSFER_EVENT = new Event("PunkTransfer",
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event PUNKOFFERED_EVENT = new Event("PunkOffered",
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>() {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event PUNKBIDENTERED_EVENT = new Event("PunkBidEntered",
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>() {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event PUNKBIDWITHDRAWN_EVENT = new Event("PunkBidWithdrawn",
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>() {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event PUNKBOUGHT_EVENT = new Event("PunkBought",
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}, new TypeReference<Uint256>() {}, new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}));
    ;

    public static final Event PUNKNOLONGERFORSALE_EVENT = new Event("PunkNoLongerForSale",
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>(true) {}));
    ;

    @Deprecated
    protected CryptoPunksMarket(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected CryptoPunksMarket(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected CryptoPunksMarket(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected CryptoPunksMarket(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> name() {
        final Function function = new Function(FUNC_NAME,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple5<Boolean, BigInteger, String, BigInteger, String>> punksOfferedForSale(BigInteger param0) {
        final Function function = new Function(FUNC_PUNKSOFFEREDFORSALE,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}, new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Address>() {}));
        return new RemoteFunctionCall<Tuple5<Boolean, BigInteger, String, BigInteger, String>>(function,
                new Callable<Tuple5<Boolean, BigInteger, String, BigInteger, String>>() {
                    @Override
                    public Tuple5<Boolean, BigInteger, String, BigInteger, String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<Boolean, BigInteger, String, BigInteger, String>(
                                (Boolean) results.get(0).getValue(),
                                (BigInteger) results.get(1).getValue(),
                                (String) results.get(2).getValue(),
                                (BigInteger) results.get(3).getValue(),
                                (String) results.get(4).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> enterBidForPunk(BigInteger punkIndex, BigInteger weiValue) {
        final Function function = new Function(
                FUNC_ENTERBIDFORPUNK,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(punkIndex)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteFunctionCall<BigInteger> totalSupply() {
        final Function function = new Function(FUNC_TOTALSUPPLY,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> acceptBidForPunk(BigInteger punkIndex, BigInteger minPrice) {
        final Function function = new Function(
                FUNC_ACCEPTBIDFORPUNK,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(punkIndex),
                new org.web3j.abi.datatypes.generated.Uint256(minPrice)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> decimals() {
        final Function function = new Function(FUNC_DECIMALS,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> setInitialOwners(List<String> addresses, List<BigInteger> indices) {
        final Function function = new Function(
                FUNC_SETINITIALOWNERS,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(
                        org.web3j.abi.datatypes.Address.class,
                        org.web3j.abi.Utils.typeMap(addresses, org.web3j.abi.datatypes.Address.class)),
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.datatypes.generated.Uint256.class,
                        org.web3j.abi.Utils.typeMap(indices, org.web3j.abi.datatypes.generated.Uint256.class))),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> withdraw() {
        final Function function = new Function(
                FUNC_WITHDRAW,
                Arrays.<Type>asList(),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> imageHash() {
        final Function function = new Function(FUNC_IMAGEHASH,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<BigInteger> nextPunkIndexToAssign() {
        final Function function = new Function(FUNC_NEXTPUNKINDEXTOASSIGN,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<String> punkIndexToAddress(BigInteger param0) {
        final Function function = new Function(FUNC_PUNKINDEXTOADDRESS,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<String> standard() {
        final Function function = new Function(FUNC_STANDARD,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<Tuple4<Boolean, BigInteger, String, BigInteger>> punkBids(BigInteger param0) {
        final Function function = new Function(FUNC_PUNKBIDS,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}, new TypeReference<Uint256>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple4<Boolean, BigInteger, String, BigInteger>>(function,
                new Callable<Tuple4<Boolean, BigInteger, String, BigInteger>>() {
                    @Override
                    public Tuple4<Boolean, BigInteger, String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<Boolean, BigInteger, String, BigInteger>(
                                (Boolean) results.get(0).getValue(),
                                (BigInteger) results.get(1).getValue(),
                                (String) results.get(2).getValue(),
                                (BigInteger) results.get(3).getValue());
                    }
                });
    }

    public RemoteFunctionCall<BigInteger> balanceOf(String param0) {
        final Function function = new Function(FUNC_BALANCEOF,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> allInitialOwnersAssigned() {
        final Function function = new Function(
                FUNC_ALLINITIALOWNERSASSIGNED,
                Arrays.<Type>asList(),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<Boolean> allPunksAssigned() {
        final Function function = new Function(FUNC_ALLPUNKSASSIGNED,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteFunctionCall<TransactionReceipt> buyPunk(BigInteger punkIndex, BigInteger weiValue) {
        final Function function = new Function(
                FUNC_BUYPUNK,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(punkIndex)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteFunctionCall<TransactionReceipt> transferPunk(String to, BigInteger punkIndex) {
        final Function function = new Function(
                FUNC_TRANSFERPUNK,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, to),
                new org.web3j.abi.datatypes.generated.Uint256(punkIndex)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<String> symbol() {
        final Function function = new Function(FUNC_SYMBOL,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> withdrawBidForPunk(BigInteger punkIndex) {
        final Function function = new Function(
                FUNC_WITHDRAWBIDFORPUNK,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(punkIndex)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> setInitialOwner(String to, BigInteger punkIndex) {
        final Function function = new Function(
                FUNC_SETINITIALOWNER,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, to),
                new org.web3j.abi.datatypes.generated.Uint256(punkIndex)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> offerPunkForSaleToAddress(BigInteger punkIndex, BigInteger minSalePriceInWei, String toAddress) {
        final Function function = new Function(
                FUNC_OFFERPUNKFORSALETOADDRESS,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(punkIndex),
                new org.web3j.abi.datatypes.generated.Uint256(minSalePriceInWei),
                new org.web3j.abi.datatypes.Address(160, toAddress)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> punksRemainingToAssign() {
        final Function function = new Function(FUNC_PUNKSREMAININGTOASSIGN,
                Arrays.<Type>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> offerPunkForSale(BigInteger punkIndex, BigInteger minSalePriceInWei) {
        final Function function = new Function(
                FUNC_OFFERPUNKFORSALE,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(punkIndex),
                new org.web3j.abi.datatypes.generated.Uint256(minSalePriceInWei)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> getPunk(BigInteger punkIndex) {
        final Function function = new Function(
                FUNC_GETPUNK,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(punkIndex)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> pendingWithdrawals(String param0) {
        final Function function = new Function(FUNC_PENDINGWITHDRAWALS,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, param0)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<TransactionReceipt> punkNoLongerForSale(BigInteger punkIndex) {
        final Function function = new Function(
                FUNC_PUNKNOLONGERFORSALE,
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(punkIndex)),
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public List<AssignEventResponse> getAssignEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(ASSIGN_EVENT, transactionReceipt);
        ArrayList<AssignEventResponse> responses = new ArrayList<AssignEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AssignEventResponse typedResponse = new AssignEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.to = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.punkIndex = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<AssignEventResponse> assignEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, AssignEventResponse>() {
            @Override
            public AssignEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ASSIGN_EVENT, log);
                AssignEventResponse typedResponse = new AssignEventResponse();
                typedResponse.log = log;
                typedResponse.to = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.punkIndex = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<AssignEventResponse> assignEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ASSIGN_EVENT));
        return assignEventFlowable(filter);
    }

    public List<TransferEventResponse> getTransferEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(TRANSFER_EVENT, transactionReceipt);
        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransferEventResponse typedResponse = new TransferEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<TransferEventResponse> transferEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, TransferEventResponse>() {
            @Override
            public TransferEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TRANSFER_EVENT, log);
                TransferEventResponse typedResponse = new TransferEventResponse();
                typedResponse.log = log;
                typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<TransferEventResponse> transferEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRANSFER_EVENT));
        return transferEventFlowable(filter);
    }

    public List<PunkTransferEventResponse> getPunkTransferEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(PUNKTRANSFER_EVENT, transactionReceipt);
        ArrayList<PunkTransferEventResponse> responses = new ArrayList<PunkTransferEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PunkTransferEventResponse typedResponse = new PunkTransferEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.punkIndex = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PunkTransferEventResponse> punkTransferEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, PunkTransferEventResponse>() {
            @Override
            public PunkTransferEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PUNKTRANSFER_EVENT, log);
                PunkTransferEventResponse typedResponse = new PunkTransferEventResponse();
                typedResponse.log = log;
                typedResponse.from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.to = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.punkIndex = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<PunkTransferEventResponse> punkTransferEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PUNKTRANSFER_EVENT));
        return punkTransferEventFlowable(filter);
    }

    public List<PunkOfferedEventResponse> getPunkOfferedEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(PUNKOFFERED_EVENT, transactionReceipt);
        ArrayList<PunkOfferedEventResponse> responses = new ArrayList<PunkOfferedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PunkOfferedEventResponse typedResponse = new PunkOfferedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.punkIndex = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.toAddress = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.minValue = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PunkOfferedEventResponse> punkOfferedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, PunkOfferedEventResponse>() {
            @Override
            public PunkOfferedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PUNKOFFERED_EVENT, log);
                PunkOfferedEventResponse typedResponse = new PunkOfferedEventResponse();
                typedResponse.log = log;
                typedResponse.punkIndex = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.toAddress = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.minValue = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<PunkOfferedEventResponse> punkOfferedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PUNKOFFERED_EVENT));
        return punkOfferedEventFlowable(filter);
    }

    public List<PunkBidEnteredEventResponse> getPunkBidEnteredEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(PUNKBIDENTERED_EVENT, transactionReceipt);
        ArrayList<PunkBidEnteredEventResponse> responses = new ArrayList<PunkBidEnteredEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PunkBidEnteredEventResponse typedResponse = new PunkBidEnteredEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.punkIndex = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.fromAddress = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PunkBidEnteredEventResponse> punkBidEnteredEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, PunkBidEnteredEventResponse>() {
            @Override
            public PunkBidEnteredEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PUNKBIDENTERED_EVENT, log);
                PunkBidEnteredEventResponse typedResponse = new PunkBidEnteredEventResponse();
                typedResponse.log = log;
                typedResponse.punkIndex = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.fromAddress = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<PunkBidEnteredEventResponse> punkBidEnteredEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PUNKBIDENTERED_EVENT));
        return punkBidEnteredEventFlowable(filter);
    }

    public List<PunkBidWithdrawnEventResponse> getPunkBidWithdrawnEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(PUNKBIDWITHDRAWN_EVENT, transactionReceipt);
        ArrayList<PunkBidWithdrawnEventResponse> responses = new ArrayList<PunkBidWithdrawnEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PunkBidWithdrawnEventResponse typedResponse = new PunkBidWithdrawnEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.punkIndex = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.fromAddress = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PunkBidWithdrawnEventResponse> punkBidWithdrawnEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, PunkBidWithdrawnEventResponse>() {
            @Override
            public PunkBidWithdrawnEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PUNKBIDWITHDRAWN_EVENT, log);
                PunkBidWithdrawnEventResponse typedResponse = new PunkBidWithdrawnEventResponse();
                typedResponse.log = log;
                typedResponse.punkIndex = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.fromAddress = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<PunkBidWithdrawnEventResponse> punkBidWithdrawnEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PUNKBIDWITHDRAWN_EVENT));
        return punkBidWithdrawnEventFlowable(filter);
    }

    public List<PunkBoughtEventResponse> getPunkBoughtEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(PUNKBOUGHT_EVENT, transactionReceipt);
        ArrayList<PunkBoughtEventResponse> responses = new ArrayList<PunkBoughtEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PunkBoughtEventResponse typedResponse = new PunkBoughtEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.punkIndex = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.fromAddress = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.toAddress = (String) eventValues.getIndexedValues().get(2).getValue();
            typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PunkBoughtEventResponse> punkBoughtEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, PunkBoughtEventResponse>() {
            @Override
            public PunkBoughtEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PUNKBOUGHT_EVENT, log);
                PunkBoughtEventResponse typedResponse = new PunkBoughtEventResponse();
                typedResponse.log = log;
                typedResponse.punkIndex = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.fromAddress = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.toAddress = (String) eventValues.getIndexedValues().get(2).getValue();
                typedResponse.value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<PunkBoughtEventResponse> punkBoughtEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PUNKBOUGHT_EVENT));
        return punkBoughtEventFlowable(filter);
    }

    public List<PunkNoLongerForSaleEventResponse> getPunkNoLongerForSaleEvents(TransactionReceipt transactionReceipt) {
        List<EventValuesWithLog> valueList = extractEventParametersWithLog(PUNKNOLONGERFORSALE_EVENT, transactionReceipt);
        ArrayList<PunkNoLongerForSaleEventResponse> responses = new ArrayList<PunkNoLongerForSaleEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PunkNoLongerForSaleEventResponse typedResponse = new PunkNoLongerForSaleEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.punkIndex = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<PunkNoLongerForSaleEventResponse> punkNoLongerForSaleEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, PunkNoLongerForSaleEventResponse>() {
            @Override
            public PunkNoLongerForSaleEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PUNKNOLONGERFORSALE_EVENT, log);
                PunkNoLongerForSaleEventResponse typedResponse = new PunkNoLongerForSaleEventResponse();
                typedResponse.log = log;
                typedResponse.punkIndex = (BigInteger) eventValues.getIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<PunkNoLongerForSaleEventResponse> punkNoLongerForSaleEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PUNKNOLONGERFORSALE_EVENT));
        return punkNoLongerForSaleEventFlowable(filter);
    }

    @Deprecated
    public static CryptoPunksMarket load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new CryptoPunksMarket(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static CryptoPunksMarket load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new CryptoPunksMarket(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static CryptoPunksMarket load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new CryptoPunksMarket(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static CryptoPunksMarket load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new CryptoPunksMarket(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<CryptoPunksMarket> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, BigInteger initialWeiValue) {
        return deployRemoteCall(CryptoPunksMarket.class, web3j, credentials, contractGasProvider, BINARY, "", initialWeiValue);
    }

    public static RemoteCall<CryptoPunksMarket> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, BigInteger initialWeiValue) {
        return deployRemoteCall(CryptoPunksMarket.class, web3j, transactionManager, contractGasProvider, BINARY, "", initialWeiValue);
    }

    @Deprecated
    public static RemoteCall<CryptoPunksMarket> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployRemoteCall(CryptoPunksMarket.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    @Deprecated
    public static RemoteCall<CryptoPunksMarket> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployRemoteCall(CryptoPunksMarket.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static class AssignEventResponse extends BaseEventResponse {
        public String to;

        public BigInteger punkIndex;
    }

    public static class TransferEventResponse extends BaseEventResponse {
        public String from;

        public String to;

        public BigInteger value;
    }

    public static class PunkTransferEventResponse extends BaseEventResponse {
        public String from;

        public String to;

        public BigInteger punkIndex;
    }

    public static class PunkOfferedEventResponse extends BaseEventResponse {
        public BigInteger punkIndex;

        public String toAddress;

        public BigInteger minValue;
    }

    public static class PunkBidEnteredEventResponse extends BaseEventResponse {
        public BigInteger punkIndex;

        public String fromAddress;

        public BigInteger value;
    }

    public static class PunkBidWithdrawnEventResponse extends BaseEventResponse {
        public BigInteger punkIndex;

        public String fromAddress;

        public BigInteger value;
    }

    public static class PunkBoughtEventResponse extends BaseEventResponse {
        public BigInteger punkIndex;

        public String fromAddress;

        public String toAddress;

        public BigInteger value;
    }

    public static class PunkNoLongerForSaleEventResponse extends BaseEventResponse {
        public BigInteger punkIndex;
    }
}
