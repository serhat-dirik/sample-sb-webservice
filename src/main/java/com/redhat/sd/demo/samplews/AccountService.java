package com.redhat.sd.demo.samplews;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;
import java.util.ArrayList;

@WebService(targetNamespace = "http://com.redhat.sd.demo/", name = "AccountService")
public interface AccountService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAccounts",
                    targetNamespace = "http://com.redhat.sd.demo/",
                    className = "com.redhat.sd.demo.samplews.GetAccounts")
    @WebMethod(action = "urn:GetAccounts")
    @ResponseWrapper(localName = "getAccountsResponse",
                     targetNamespace = "http://com.redhat.sd.demo/",
                     className = "com.redhat.sd.demo.samplews.GetAccountsResponse")
    List<Account> getAccounts();


    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAccount",
                    targetNamespace = "http://com.redhat.sd.demo/",
                    className = "com.redhat.sd.demo.samplews.GetAccount")
    @WebMethod(action = "urn:GetAccount")
    @ResponseWrapper(localName = "getAccountResponse",
                     targetNamespace = "http://com.redhat.sd.demo/",
                     className = "com.redhat.sd.demo.samplews.GetAccountResponse")
    Account getAccount(@WebParam(name = "id", targetNamespace = "") String id);
}
