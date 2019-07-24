package com.example.eventtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class EventTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventTestApplication.class, args);
	}

}
