package com.luv2code.springDemo.pracitse;

import com.luv2code.springDemo.Coach;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {

    @Override
    public String getDailyWorkout() {

        return "You need to do some push ups for 15 minutes";
    }

    @Value("${foo.fortune}")
    private String fortune;

    @Override
    public String getDailyFortune() {

        return fortune;
    }
}
