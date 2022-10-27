package com.example.springbootreview.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }


}
