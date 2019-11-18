package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

    @RequestMapping("/helloworld")
    public String helloWorld(){
        return "hello world";
    }

    @RequestMapping("/xxx")
    public String xx() {
        System.out.println("xx");
        return "xx";
    }
}
