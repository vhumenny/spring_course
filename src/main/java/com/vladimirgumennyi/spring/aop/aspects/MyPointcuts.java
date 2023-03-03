package com.vladimirgumennyi.spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* com.vladimirgumennyi.spring.aop.UniLibrary.add*(..))")
    public void allAddMethodsFromUniLibrary() {
    }
}
