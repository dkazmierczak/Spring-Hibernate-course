package com.luv2code.springDemo.practise;

public class BoxCoach implements PractiseCoach {

    private PractiseFortuneServiceInterface theFortuneService;

    public BoxCoach(PractiseFortuneServiceInterface fortuneService){
        theFortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise your left jab";
    }

    @Override
    public String getDailyFortune() {
        return theFortuneService.getFortune();
    }
}
