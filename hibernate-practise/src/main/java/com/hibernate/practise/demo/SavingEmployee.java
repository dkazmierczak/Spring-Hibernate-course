package com.hibernate.practise.demo;

import com.hibernate.practise.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SavingEmployee {

    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            //create employee object
            System.out.println("creating new employee object");
            Employee employee = new Employee("Garry", "Oldman", "Gotham Police Department");

            //start a transaction
            session.beginTransaction();

            //save employee
            System.out.println("Saving the employee...");
            session.save(employee);

            //commit transaction
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }
    }
}
