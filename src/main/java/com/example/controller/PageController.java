package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class PageController {

    @RequestMapping("/test")
    public String index(){
        return "index";
    }
}
