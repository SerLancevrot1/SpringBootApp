package com.example.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirdtController {

    @RequestMapping("/q")
    public String index(){
        return "index";
    }

}
