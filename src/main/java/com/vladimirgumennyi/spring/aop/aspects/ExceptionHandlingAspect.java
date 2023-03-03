package com.vladimirgumennyi.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("com.vladimirgumennyi.spring.aop.aspects.MyPointcuts.allAddMethodsFromUniLibrary()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: logging catching exceptions when trying to" +
                "get book/magazine.");
        System.out.println("--------------------------------");
    }
}
