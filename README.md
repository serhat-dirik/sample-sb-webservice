# Spring-Boot CXF JAXWS Sample

This example demonstrates how you can use Apache CXF with Spring Boot
based on a [fabric8 Java base image](https://github.com/fabric8io/base-images#java-base-images).

The quickstart uses Spring Boot to configure a little application that includes a CXF JAXWS endpoint.


### Building

The example can be built with

    mvn clean package


### Running the example locally

The example can be run locally using the following Maven goal:

    java -jar ./target/sample-sb-ws-1.0-SNAPSHOT.jar --server.port=8080
Visit
    http://localhost:8080/ws/accountService?wsdl or
    http://localhost:8080/ws/greetingsService?wsdl
