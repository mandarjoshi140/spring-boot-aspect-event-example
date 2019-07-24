package com.example.eventtest.service;

import com.example.eventtest.util.RandomGreetUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GreetServiceImpl implements GreetService {

    @Override
    public String greet(){
        return RandomGreetUtil.getGreeting("this is Server");
    }

    @Override
    public String greetWithName(String name){
        return RandomGreetUtil.getGreeting(name);
    }
}
