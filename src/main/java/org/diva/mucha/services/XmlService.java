package org.diva.mucha.services;

import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.diva.mucha.model.Greeting;

@ApplicationScoped
public class XmlService {
    
    @Inject
    private Marshaller marshaller;

    public String toXml(Greeting greeting) {
        StringWriter sw = new StringWriter();
        try {
            marshaller.marshal(greeting, sw);
        } catch (JAXBException ex) {
            Logger.getLogger(XmlService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sw.toString();
    }
}
