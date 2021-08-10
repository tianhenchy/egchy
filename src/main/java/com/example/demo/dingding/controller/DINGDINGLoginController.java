package com.example.demo.dingding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 钉钉扫码登录
 */
@RestController
@RequestMapping("/dingding")
public class DINGDINGLoginController {

    @GetMapping("/login")
    public String login(){
       return null ;
    }

}
