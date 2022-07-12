package org.vitargo.sfgdi.controllers;

import org.vitargo.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
