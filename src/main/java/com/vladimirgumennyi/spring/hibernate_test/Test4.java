package com.vladimirgumennyi.spring.hibernate_test;

import com.vladimirgumennyi.spring.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(1500);
            session.createQuery("update Employee set salary=1000 " +
                    "where name = 'Aleksandr'").executeUpdate();

            session.getTransaction().commit();

        }
    }
}
