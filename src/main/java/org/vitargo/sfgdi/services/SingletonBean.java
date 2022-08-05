package org.vitargo.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating singleton bean....");
    }

    public String getBeanType(){
        return "I'm singleton bean!!!!";
    }
}
