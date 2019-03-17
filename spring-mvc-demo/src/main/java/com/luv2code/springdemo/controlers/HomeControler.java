package com.luv2code.springdemo.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {

    @RequestMapping("/")
    public String showPage(){
        return "main-menu";
    }
}
