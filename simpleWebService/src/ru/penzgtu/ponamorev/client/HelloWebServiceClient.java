package ru.penzgtu.ponamorev.client;

// class for getting WSDL-description
import java.net.URL;
// there is exception which can be thrown during working with URL
import java.net.MalformedURLException;

// classes for parsing XML with WSDL-description
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

// out web service
import ru.penzgtu.ponamorev.ws.HelloWebService;

public class HelloWebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        // get URL with WSDL-description
        URL url = new URL("http://localhost:1986/wss/hello?wsdl");

        // Look parameters of next constructor in the first tag WSDL-description - definitions
        // First argument - attribute 'targetNamespace'
        // Second attribute - attribute 'name'
        QName qName = new QName("http://ws.ponamorev.penzgtu.ru/", "HelloWebServiceImplService");

        // Now we can get tag 'service' into WSDL-description
        Service service = Service.create(url, qName);
        // Next, we should get inner tag 'port' for getting link of our web service remote object
        HelloWebService hello = service.getPort(HelloWebService.class);

        //  Great! Now we can use RPC
        System.out.println(hello.getHelloString("Kakaha"));
    }
}