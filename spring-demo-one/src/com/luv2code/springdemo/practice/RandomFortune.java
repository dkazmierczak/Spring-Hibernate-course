package com.luv2code.springdemo.practice;

import com.luv2code.springdemo.FortuneService;

import java.util.Random;

public class RandomFortune implements FortuneService {

    private String[] fortunes = {
            "Patience and perseverance is the key to fortune",
            "Today is a good day to have a good day",
            "No pain no gain"
    };

    Random random = new Random();

    @Override
    public String getFortune() {

        int index = random.nextInt(fortunes.length);

        return fortunes[index];
    }
}
