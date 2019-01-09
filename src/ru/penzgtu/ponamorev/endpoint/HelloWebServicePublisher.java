package ru.penzgtu.ponamorev.endpoint;

// our web service
import ru.penzgtu.ponamorev.ws.HelloWebServiceImpl;

// class for launch web server with services
import javax.xml.ws.Endpoint;

public class HelloWebServicePublisher {
    public static void main(String... args) {
        // launch web server on port 1986
        // address is specified in first argument
        // web service is specified in second argument
        Endpoint.publish("http://localhost:1986/wss/hello", new HelloWebServiceImpl());
    }
}