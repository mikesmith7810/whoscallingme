package com.guardian.hackathon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "Hello World";
    }

}
