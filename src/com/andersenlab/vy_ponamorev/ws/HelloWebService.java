package com.andersenlab.vy_ponamorev.ws;

// there are annotations - the way for determination out classes and methods which connect with web service technologies
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

// define, that our interface will work as webservice
@WebService
// define, that web service will be used for procedure calling
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWebService {
    // define, that this method can be used remote
    @WebMethod
    public String getHelloString(String name);
}