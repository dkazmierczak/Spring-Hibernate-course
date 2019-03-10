package com.luv2code.springDemo.practise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PractiseApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PractiseSportConfig.class);

        PractiseCoach practiseCoach = context.getBean("boxCoach", PractiseCoach.class);

        System.out.println(practiseCoach.getDailyWorkout());

        System.out.println(practiseCoach.getDailyFortune());

        context.close();
    }


}
