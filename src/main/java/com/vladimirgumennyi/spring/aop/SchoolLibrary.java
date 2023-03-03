package com.vladimirgumennyi.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Getting book from SchoolLibrary.");
    }
}
