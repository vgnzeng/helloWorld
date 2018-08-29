package com.zeng.helloWorld.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index(String name) {
        return "Hello World, " +name;
    }
}