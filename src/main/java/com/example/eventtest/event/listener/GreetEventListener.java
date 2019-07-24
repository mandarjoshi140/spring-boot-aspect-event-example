package com.example.eventtest.event.listener;

import com.example.eventtest.event.model.GreetEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GreetEventListener implements ApplicationListener<GreetEvent>
{
    @Override
    public void onApplicationEvent(GreetEvent greetEvent) {
        log.info("Did you know who greeted me? - "+ greetEvent.getMessage());
    }
}
