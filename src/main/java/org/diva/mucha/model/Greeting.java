package org.diva.mucha.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
public class Greeting implements Serializable {
    
    @Id
    @XmlTransient
    private String id;
    
    @Column(length = 100, nullable = true)
    private String hi;

    public Greeting() {
    }
    
    public Greeting(String hi) {
        this.hi = hi;
    }

    public String getHi() {
        return hi;
    }

    public void setHi(String hi) {
        this.hi = hi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
