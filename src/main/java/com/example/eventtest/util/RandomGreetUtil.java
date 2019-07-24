package com.example.eventtest.util;

import java.util.Random;

public class RandomGreetUtil {
    private static String[] greetMessages = {"Hey","Hello","Hi","Howdy","Namaste","Sup"};

    public static String getGreeting(String name){
        Random random = new Random();
        return greetMessages[random.nextInt(greetMessages.length)] +", "+ name;
    }
}
