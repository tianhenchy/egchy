package com.example.demo.dingding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ngrok")
public class NgrokController {


//    @GetMapping("test")
//    public String ngrok(){
//
//        return "Hello ngrok" ;
//    }

    @PostMapping("/test")
    public String robot(){
        System.out.println("robot");
        return "Hello ngrok" ;
    }
}
