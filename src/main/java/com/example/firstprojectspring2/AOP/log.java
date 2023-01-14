package com.example.firstprojectspring2.AOP;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Aspect

public class log {

    @Before("execution(* com.example.firstprojectspring2.Services.EquipeService.* (..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

    @After("execution(* com.example.firstprojectspring2.Services.EquipeService.* (..))")
    public void logMethodEnd(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Out in method " + name + " : ");
    }
}
