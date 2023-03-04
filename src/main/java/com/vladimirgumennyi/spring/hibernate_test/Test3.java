package com.vladimirgumennyi.spring.hibernate_test;

import com.vladimirgumennyi.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            List<Employee> employees = session.createQuery("from Employee")
//                    .getResultList();
            List<Employee> employees = session.createQuery("from Employee " +
                            "where name = 'Aleksandr' AND salary>1000")
                    .getResultList();
            for (Employee e:employees) {
                System.out.println(e);
            }


            session.getTransaction().commit();

        }
    }
}
