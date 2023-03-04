package com.vladimirgumennyi.spring.hibernate_test;

import com.vladimirgumennyi.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Aleksandr", "Ivanov", "IT", 500);
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            System.out.println(employee);
        }
    }
}
