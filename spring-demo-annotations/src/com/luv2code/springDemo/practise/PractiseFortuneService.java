package com.luv2code.springDemo.practise;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class PractiseFortuneService implements PractiseFortuneServiceInterface {

    private List<String> theFortunes;

    private Random myRandom = new Random();

    public PractiseFortuneService(){
        System.out.println("Inside constructor of PractiseFortuneService");
    }

    @PostConstruct
    public void fileFortuneService(){

        System.out.println("PostConstructor just run");

        File file = new File("src/com/luv2code/springDemo/practise/fortune-data.txt");

        theFortunes = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            String tempLine;

            while ((tempLine = br.readLine()) != null){
                theFortunes.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {

        int index = myRandom.nextInt(theFortunes.size());
        String fortune = theFortunes.get(index);

        return fortune;
    }
}
