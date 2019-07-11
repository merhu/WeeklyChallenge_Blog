package com.example.demo;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Home";
    }

    @RequestMapping("/Base")
    public String base() {
        return "Base";
    }

    @RequestMapping("/AboutUs")
    public String aboutUs() {
        return "AboutUs";
    }

    @RequestMapping("/ProgramDesign")
    public String programDesign() {
        return "ProgramDesign";
    }

    @RequestMapping("/HTML")
    public String hTML() {
        return "HTML";
    }

    @RequestMapping("/Algorithms")
    public String algorithms() {
        return "Algorithms";
    }

    @RequestMapping("/HFBootstrap")
    public String hFBootstrap() {
        return "HFBootstrap";
    }

    @RequestMapping("/Encapsulation")
    public String encapsulation() {
        return "Encapsulation";
    }

}
