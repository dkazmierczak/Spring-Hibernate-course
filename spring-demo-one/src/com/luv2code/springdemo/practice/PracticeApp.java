package com.luv2code.springdemo.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("practice.solution.xml");

        BasketballCoach coach = context.getBean("myBasketballCoach", BasketballCoach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());
    }
}
