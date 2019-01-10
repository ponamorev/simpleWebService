package ru.penzgtu.ponamorev.client;

import ru.penzgtu.ponamorev.ws.HelloWebService;
import ru.penzgtu.ponamorev.ws.HelloWebServiceImplService;

public class HelloWebServiceClient {
    public static void main(String[] args) {
        // connect to tag 'service' in WSDL-description
        HelloWebServiceImplService helloService = new HelloWebServiceImplService();
        // get information from tag 'service' and connect to web service
        HelloWebService hello = helloService.getHelloWebServiceImplPort();

        // address to web service and print result to console
        System.out.println(hello.getHelloString("Vyacheslav"));
    }
}