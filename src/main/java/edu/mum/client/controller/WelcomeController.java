package edu.mum.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    
    @GetMapping("/")// aour first page alwasy be the login
    private String start(){
        return "login";
    }
    @GetMapping("/login")
    private String login(){
        return "login";
    }
    @GetMapping("/indexT")
    private String intextest(){
        return "index";
    }
}
