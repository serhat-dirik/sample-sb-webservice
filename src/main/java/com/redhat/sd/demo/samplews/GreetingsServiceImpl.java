package com.redhat.sd.demo.samplews;

import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;

@javax.jws.WebService(serviceName = "GreetingsService", portName = "GreetingsPort",
                    targetNamespace = "http://com.redhat.sd.demo/",
                    endpointInterface = "com.redhat.sd.demo.samplews.GreetingsService")
public class GreetingsServiceImpl implements GreetingsService {

    private static final Logger LOG = Logger.getLogger(GreetingsServiceImpl.class.getName());

    public String sayHello(java.lang.String myname) {
        LOG.info("Executing operation sayHello" + myname);
        try {
            return "Hello, Welcome to CXF Spring boot " + myname + "!!!";
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}
