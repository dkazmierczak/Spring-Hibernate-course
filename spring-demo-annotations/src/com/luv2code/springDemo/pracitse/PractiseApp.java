package com.luv2code.springDemo.pracitse;

import com.luv2code.springDemo.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PractiseApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach practiseCoach = context.getBean("gymCoach", Coach.class);

        System.out.println(practiseCoach.getDailyWorkout());

        context.close();
    }


}
