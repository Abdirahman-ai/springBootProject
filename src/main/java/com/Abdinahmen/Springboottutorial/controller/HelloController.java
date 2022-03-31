package com.Abdinahmen.Springboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to Abdinahmen Daily Code " +
                "This is my first project hope you enjoy!! ";
    }
}
