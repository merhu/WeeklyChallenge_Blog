package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
        public String home(){return "Home";}

    @RequestMapping("/Base")
     public String base(){return "Base";}

    @RequestMapping("/AboutUs")
    public String aboutUs(){return "AboutUs";}

}
