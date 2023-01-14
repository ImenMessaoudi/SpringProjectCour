package com.example.firstprojectspring2.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Slf4j
@Aspect
public class TempExecution {

    /*@Around("execution(* com.example.firstprojectspring2.Services.EquipeService.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable
    {
        //ProceedingJoinPoint:donne  un  privilage  de  l'xecuter ou  pas
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method"+pjp.getSignature().getName()+ "execution time: " + elapsedTime + "milliseconds.");
        return obj;
    }*/
}
