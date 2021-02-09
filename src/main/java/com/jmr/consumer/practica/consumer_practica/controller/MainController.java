package com.jmr.consumer.practica.consumer_practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/test")
    public String test()
        {
            return "test";
        }

    @GetMapping(value = {"/", "/index"})
    public String getHomePage(Model model) {

        return "index";
    }


}
