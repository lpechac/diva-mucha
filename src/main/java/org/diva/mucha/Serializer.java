package org.diva.mucha;

import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.diva.mucha.model.Greeting;

@ApplicationScoped
public class Serializer {
    
    private Marshaller marshaller;

    public String toXml(Greeting greeting) {
        StringWriter sw = new StringWriter();
        try {
            marshaller.marshal(greeting, sw);
        } catch (JAXBException ex) {
            Logger.getLogger(Serializer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sw.toString();
    }
    
    @PostConstruct
    private void getMarshaller() {
        try {
            JAXBContext context = JAXBContext.newInstance(Greeting.class);
            marshaller = context.createMarshaller();
        } catch (JAXBException ex) {
            Logger.getLogger(Serializer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
