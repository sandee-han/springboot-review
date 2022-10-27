package com.example.springbootreview.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @GetMapping(value = "/request")
    public String getRequestParam1(@RequestParam String name, @RequestParam String email, @RequestParam String organization){
        return name + " " + email + " " + organization;
    }

    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        param.entrySet().forEach(map->{
            System.out.printf("key:%s value:%s\n", map.getKey(), map.getValue());
        });
        return null;
    }
}
