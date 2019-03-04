package com.luv2code.springDemo.practise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PractiseApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("practiseApplicationContext.xml");

        PractiseCoach practiseCoach = context.getBean("gymCoach", PractiseCoach.class);

        System.out.println(practiseCoach.getDailyWorkout());

        System.out.println(practiseCoach.getDailyFortune());

        context.close();
    }


}
