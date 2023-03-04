package com.vladimirgumennyi.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Getting book from UniLibrary");
        System.out.println("--------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("Returning book in UniLibrary.");
        return "LOTR";
    }

    public void getMagazine() {
        System.out.println("Getting magazine from UniLibrary.");
        System.out.println("--------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Return magazine to UniLibrary.");
        System.out.println("--------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add book in UniLibrary.");
        System.out.println("--------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add magazine in UniLibrary.");
        System.out.println("--------------------------------");
    }
}
