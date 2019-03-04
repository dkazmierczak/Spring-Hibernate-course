package com.luv2code.springDemo.practise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements PractiseCoach {

    @Autowired
    private PractiseFortuneService fortuneService;

    public GymCoach(){
        System.out.println("Inside constructor of GymCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "You need to do some push ups for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
