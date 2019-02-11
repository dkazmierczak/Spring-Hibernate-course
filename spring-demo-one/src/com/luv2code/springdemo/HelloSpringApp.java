package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrive ben from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //call method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //let's call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
