package com.luv2code.hibernate.demo;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {

    public static void main(String[] args) {

        //create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        //create session
        Session session = factory.getCurrentSession();
        try{

            //create objects
            Instructor instructor = new Instructor(
                    "Madhu",
                    "Patel",
                    "madhu@luve2code.com"
            );

            InstructorDetail instructorDetail = new InstructorDetail(
                    "http://www.youtube.com",
                    "Guitar"
            );

            //associate the objects
            instructor.setInstructorDetail(instructorDetail);

            //start a transaction
            session.beginTransaction();

            //save the instructor
            //it will also save the details object, because of CascadeType.All
            System.out.println("Saving instructor: " + instructor);
            session.save(instructor);


            //commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally {
            factory.close();
        }
    }
}
