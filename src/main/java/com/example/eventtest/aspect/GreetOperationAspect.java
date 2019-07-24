package com.example.eventtest.aspect;

import com.example.eventtest.event.model.GreetEvent;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class GreetOperationAspect {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @AfterReturning(pointcut="execution(* com.example.eventtest.service.GreetService.*(..))",returning = "result")
    public void aroundGreet(JoinPoint joinPoint, Object result) throws Throwable {
        applicationEventPublisher.publishEvent(new GreetEvent(this, (String)result));
    }
}
