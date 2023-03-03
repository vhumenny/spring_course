package com.vladimirgumennyi.spring.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("com.vladimirgumennyi.spring.aop.aspects.MyPointcuts.allAddMethodsFromUniLibrary()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice Authorization to get book/magazine");
        System.out.println("--------------------------------");
    }
}
