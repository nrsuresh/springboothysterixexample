package com.springboot.hysterix.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    @RequestMapping("hello")
    public String sayHello() {
        return "Hello docker world";
    }
}
