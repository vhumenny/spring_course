package com.vladimirgumennyi.spring.aop.aspects;

import com.vladimirgumennyi.spring.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("com.vladimirgumennyi.spring.aop.aspects.MyPointcuts.allAddMethodsFromUniLibrary()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Info about book: name - " + myBook.getName() +
                            " author - " + myBook.getAuthor() +
                            " year of publication - " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Book is added in library by - " + obj);
                }
            }
        }
        System.out.println("beforeAddLoggingAdvice: logging try to get book/magazine");
        System.out.println("--------------------------------");
    }


//    @Pointcut("execution(* com.vladimirgumennyi.spring.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void com.vladimirgumennyi.spring.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing log #10");
//    }
//    @Pointcut("execution(* com.vladimirgumennyi.spring.aop.UniLibrary.get*()")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* com.vladimirgumennyi.spring.aop.UniLibrary.return*()")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void AllGetAndReturnMethodsFromUniLibrary() {}
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//
//    @Before("AllGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//    }


//    @Before("execution(public void com.vladimirgumennyi.spring.aop.UniLibrary.getBook())")
//    @Before("execution(public void get*())")
//    @Before("execution(public void getBook(String))")
//    @Before("execution(public void *(*))")
//    @Before("execution(public void *(..))")
//    @Before("execution(public void getBook(com.vladimirgumennyi.spring.aop.Book))")
//    @Before("execution(public void getBook(com.vladimirgumennyi.spring.aop.Book, ..))")
//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: trying to get book/magazine");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice Authorization to get book/magazine");
//    }


//    @Before("execution(public void returnBook())")
//    @Before("execution(* returnBook())")
//    @Before("execution(* *())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: trying to return book");
//    }
}
