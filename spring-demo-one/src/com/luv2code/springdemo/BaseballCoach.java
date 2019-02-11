package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

    //deifne a private field for the dependency
    private  FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practise";
    }

    @Override
    public String getDailyFortune() {

        //use my fortuneService to get a fortune :D
        return fortuneService.getFortune();
    }
}