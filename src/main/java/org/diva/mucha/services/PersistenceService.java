package org.diva.mucha.services;

import java.util.List;
import java.util.UUID;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.diva.mucha.model.Greeting;

@Stateless
public class PersistenceService {
    
    @PersistenceContext(unitName = "diva-mucha-test-ds")
    private EntityManager em;
    
    public Greeting save(Greeting greeting) {
        if (greeting.getId() == null) {
            greeting.setId(UUID.randomUUID().toString());
            em.persist(greeting);
        } else {
            em.merge(greeting);
        }
        return read(greeting.getId());
    }
    
    public List<Greeting> list() {
        return em.createQuery("select g from Greeting g", Greeting.class).getResultList();
    }
    
    public Greeting read(String id) {
        return em.find(Greeting.class, id);
    }
}
