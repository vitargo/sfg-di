package org.vitargo.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String getHello(){
        System.out.println("Glory to Ukraine!!! Glory to heroes!!!");
        return "Good evening, we are from Ukraine!";
    }
}
