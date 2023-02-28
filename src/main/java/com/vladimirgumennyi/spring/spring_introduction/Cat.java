package com.vladimirgumennyi.spring.spring_introduction;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
