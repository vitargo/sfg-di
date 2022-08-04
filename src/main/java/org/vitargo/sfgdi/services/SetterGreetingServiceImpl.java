package org.vitargo.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String getGreeting(){
        return "Glory to Ukraine!!! from SetterGreetingServiceImpl";
    }
}
