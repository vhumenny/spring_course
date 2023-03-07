package com.vladimirgumennyi.spring.hibernate_one_to_many_bi;


import com.vladimirgumennyi.spring.hibernate_one_to_many_bi.entity.Department;
import com.vladimirgumennyi.spring.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory(); Session session = factory.getCurrentSession()) {

//            Employee employee1 = new Employee("Oleg", "Ivanov", 800);
//            Employee employee2 = new Employee("Andrey", "Petrov", 1000);
//            Employee employee3 = new Employee("Vladimir", "Gumennyi", 900);
//
//            Department department = new Department("Sales", 800, 1500);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("done");

            session.beginTransaction();

            Department department = session.get(Department.class, 3);

            System.out.println(department);

            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println(department.getEmps());

//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


        }
    }
}
