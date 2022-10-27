package com.example.springbootreview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping(value = "/name")
    public String getName() {
        return "Flature";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello world";
    }



}
