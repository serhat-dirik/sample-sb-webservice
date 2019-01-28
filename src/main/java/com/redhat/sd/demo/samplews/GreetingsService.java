package com.redhat.sd.demo.samplews;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;
import java.util.ArrayList;

@WebService(targetNamespace = "http://com.redhat.sd.demo/", name = "GreetingsService")
public interface GreetingsService {


    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHello",
                    targetNamespace = "http://com.redhat.sd.demo/",
                    className = "com.redhat.sd.demo.samplews.SayHello")
    @WebMethod(action = "urn:SayHello")
    @ResponseWrapper(localName = "sayHelloResponse",
                     targetNamespace = "http://com.redhat.sd.demo/",
                     className = "com.redhat.sd.demo.samplews.SayHelloResponse")
    String sayHello(@WebParam(name = "myname", targetNamespace = "") String myname);

}
