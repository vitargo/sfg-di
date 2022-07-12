package org.vitargo.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public String getGreeting(){
        return "Glory to Ukraine!!!";
    }
}
