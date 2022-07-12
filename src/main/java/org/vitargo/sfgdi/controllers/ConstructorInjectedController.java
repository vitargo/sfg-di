package org.vitargo.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.vitargo.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
