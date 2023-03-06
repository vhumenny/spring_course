package com.vladimirgumennyi.spring.hibernate_one_to_one;


import com.vladimirgumennyi.spring.hibernate_one_to_one.entity.Detail;
import com.vladimirgumennyi.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory(); Session session = factory.getCurrentSession()) {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 3000);
//            Detail detail = new Detail("Kiev", "654321", "oleh@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();

//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 10);
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();

        }
    }
}
