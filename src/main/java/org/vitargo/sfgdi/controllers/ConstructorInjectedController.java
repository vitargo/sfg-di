package org.vitargo.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import org.vitargo.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
