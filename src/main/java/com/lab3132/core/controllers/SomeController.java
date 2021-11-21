package com.lab3132.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping("/hello")
    public String sayHello(){
        return "<h1>Hello Guys</h1>" +
                "<br>" + "<h2><i>I am Aladinskiy George<i> and it's my Java Practice site</h2><br>" +
                "My VK - https://vk.com/aladinsky0 <br>" +
                "My GitHub - https://github.com/Goga270/Lab1_George_Al <br>" +
                "<h1> Thanks for visit</h1>";
    }
}
