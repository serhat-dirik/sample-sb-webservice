package com.redhat.sd.demo.samplews;

import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint greetingsServiceEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new GreetingsServiceImpl());
        endpoint.publish("/greetingsService");
        return endpoint;
    }

    @Bean
    public Endpoint accountServiceEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new AccountServiceImpl());
        endpoint.publish("/accountService");
        return endpoint;
    }
}
