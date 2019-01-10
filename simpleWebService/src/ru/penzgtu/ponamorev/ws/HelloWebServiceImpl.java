package ru.penzgtu.ponamorev.ws;

import javax.jws.WebService;

// use endpointInterface to specify full name of class-interface our web service
@WebService(endpointInterface = "ru.penzgtu.ponamorev.ws.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {
    @Override
    public String getHelloString(String name) {
        // return salutation
        return "Hello, " + name + "!";
    }
}