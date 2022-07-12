package org.vitargo.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService{
    @Override
    public String getGreeting(){
        return "Glory to Ukraine!!! from PropertyGreetingServiceImpl";
    }
}
