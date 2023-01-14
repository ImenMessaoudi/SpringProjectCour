package com.example.firstprojectspring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FirstProjectSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectSpringApplication.class, args);
    }

}
