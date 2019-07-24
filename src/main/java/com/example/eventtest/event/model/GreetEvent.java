package com.example.eventtest.event.model;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

@Data
public class GreetEvent extends ApplicationEvent {

    private String message;

    public GreetEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
