package edu.mum.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    
    @GetMapping("/")
    private String start(){
        return "index";
    }
    @GetMapping("/login")
    private String login(){
        return "login2";
    }
}
