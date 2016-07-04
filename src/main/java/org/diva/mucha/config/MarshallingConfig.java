package org.diva.mucha.config;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.diva.mucha.model.Greeting;

@ApplicationScoped
public class MarshallingConfig {

    @Produces
    public Marshaller getMarshaller() throws JAXBException {
        return getJAXBContext().createMarshaller();
    }
    
    @Produces
    public Unmarshaller getUnmarshaller() throws JAXBException {
        return getJAXBContext().createUnmarshaller();
    }
    
    private JAXBContext getJAXBContext() throws JAXBException {
        return JAXBContext.newInstance(Greeting.class);
    }
}
