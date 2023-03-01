package com.vladimirgumennyi.spring.spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean is crated");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
