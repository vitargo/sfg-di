package org.vitargo.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService{

    @Override
    public String getGreeting() {
        return "Glory to Heroes!!! from Primary Bean";
    }
}
