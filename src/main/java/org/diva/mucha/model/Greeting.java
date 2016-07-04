package org.diva.mucha.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {
    
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
}
