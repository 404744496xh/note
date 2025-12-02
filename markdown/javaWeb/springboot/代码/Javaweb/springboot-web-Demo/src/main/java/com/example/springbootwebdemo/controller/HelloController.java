package com.example.springbootwebdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
@RestController
public class HelloController {
    @RequestMapping("/hello0")
    public String hello0(){
        System.out.println("Hello World0~");
        return "Hello World0~";
    }
}