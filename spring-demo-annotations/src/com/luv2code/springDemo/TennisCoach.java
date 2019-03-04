package com.luv2code.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    //define a default constructor
    public TennisCoach(){
        System.out.println(">> TenisCoach:  inside default constructor");
    }

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">>TennisCouch: inside of doMyStartupStuff()");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">>TennisCouch: inside of doCleanupStuff()");
    }

//    //define a setter method
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//        System.out.println(">> TenisCoach:  inside doSomeCrazyStuff() method");
//    }

//    //    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
