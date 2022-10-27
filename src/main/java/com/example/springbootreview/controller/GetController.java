package com.example.springbootreview.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
    
}
