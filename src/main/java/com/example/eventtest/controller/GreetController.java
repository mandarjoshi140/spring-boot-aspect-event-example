package com.example.eventtest.controller;

import com.example.eventtest.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    private GreetService greetServiceImpl;

    @GetMapping("/greet")
    public String greet(){
        return greetServiceImpl.greet();
    }

    @GetMapping("/greet/{name}")
    public String greetWithName(@PathVariable(name = "name") String name){
        return greetServiceImpl.greetWithName(name);
    }
}
