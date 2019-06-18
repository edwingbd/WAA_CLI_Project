package edu.mum.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WelcomeController {
    
    @GetMapping("/")// aour first page alwasy be the login
    private String start(){
        return "login";
    }
    @PostMapping("/login")
    private String login(){

        return "redirect:/reports/entryReport";
    }
    @GetMapping("/reports/entryReport")
    private String indextest(){
        return "reports/entryReport";
    }
}
