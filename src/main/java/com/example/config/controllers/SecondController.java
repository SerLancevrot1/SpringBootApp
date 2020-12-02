package com.example.config.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/blog")
    public String blog(){

        return "blog";
    }
}
