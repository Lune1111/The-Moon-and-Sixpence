package com.BookStore.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Executable;
@Component
@Aspect
public class ServiceAdvice {
    @Pointcut("execution(* com.BookStore.service.bookService.JJService())")
    private void SystemException(){}

    @Before("SystemException()")
    public void methed(){
        System.out.println("执行Success");
    }
}
