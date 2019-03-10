package com.luv2code.springDemo.practise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PractiseSportConfig {

    @Bean
    public PractiseFortuneServiceInterface happyFortuneService(){
        return new PractiseFortuneService();
    }

    @Bean
    public PractiseCoach boxCoach(){
        BoxCoach boxCoach = new BoxCoach(happyFortuneService());
        return boxCoach;
    }
}
