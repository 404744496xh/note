package com.example.springbootwebdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类
//@ComponentScan({"com.itheima.dao","com.itheima"})
@SpringBootApplication //默认扫描当前包及其子包
public class SpringbootWebDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootWebDemoApplication.class, args);
    }

}
