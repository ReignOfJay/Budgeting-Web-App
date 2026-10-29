package com.dyyy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;


//@RestController
@Controller 
public class Home{
    
    @GetMapping("/")
    public String sayHello() {
        return "home";
    }

}
