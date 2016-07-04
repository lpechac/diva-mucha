package org.diva.mucha;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.diva.mucha.model.Greeting;

@WebService(serviceName = "SoapEndpoint")
public class SoapEndpoint {

    @WebMethod(operationName = "getGreeting")
    public Greeting getGreeting(@WebParam(name = "text") String text) {
        Greeting greeting = new Greeting(text);
        return greeting;
    }
}
