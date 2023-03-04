package com.vladimirgumennyi.spring.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: " +
//                "logging get of students before method getStudents.");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//            throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: " +
//                "logging throw of exception " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: logging normal finish of program or" +
                " after throw of exception.");
    }


//    @AfterReturning(pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        firstStudent.setNameSurname("Mr. " + nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        firstStudent.setAvgGrade(avgGrade + 1);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: " +
//                "logging get of students after method getStudents.");
//    }
}
