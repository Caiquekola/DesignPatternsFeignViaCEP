package com.dpviacep.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RequestMapping("/")
@RestController 
public class HomeController {
    @GetMapping("/")
    public static String home(){
        System.out.println("Hello World!");
        return "<h1 style='display:flex; flex-content:center; justify-content:center'>Hello World!</h1>";
    }
}
