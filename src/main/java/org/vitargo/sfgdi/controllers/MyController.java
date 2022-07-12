package org.vitargo.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import org.vitargo.sfgdi.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getHello(){
        System.out.println("Glory to Ukraine!!! Glory to heroes!!!");
        return "Good evening, we are from Ukraine!";
    }

    public String getPrimaryGreeting(){
        return greetingService.getGreeting();
    }
}
