package com.luv2code.springDemo.pracitse;

import com.luv2code.springDemo.FortuneService;
import java.util.List;
import java.util.Random;

public class PractiseFortuneService implements FortuneService {

    private String[] theFortune = {
            "Never give up",
            "TOday is your lucky day",
            "Beware of the wolf"
    };

    private Random myRandom = new Random();

    @Override
    public String getFortune() {

        int index = myRandom.nextInt(theFortune.length);

        String fortune = theFortune[index];

        return fortune;
    }
}
