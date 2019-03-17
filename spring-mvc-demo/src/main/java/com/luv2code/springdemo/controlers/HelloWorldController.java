package com.luv2code.springdemo.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    //need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showeForm(){
        return "helloworld-form";
    }

    //need a controller method to process the HTML form

}
