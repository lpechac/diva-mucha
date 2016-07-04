package org.diva.mucha.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.diva.mucha.model.Greeting;

@ApplicationScoped
public class PersistenceService {

    @Inject
    private XmlService serializer;
    
    public Greeting save(Greeting greeting) {
        String xml = serializer.toXml(greeting);
        throw new RuntimeException("Not yet implemented");
    }
    
    public Greeting read(Greeting greeting) {
        throw new RuntimeException("Not yet implemented");
    }
}
