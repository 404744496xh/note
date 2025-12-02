package com.itheima.config;

import com.itheima.service.DeptService;
import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//配置类
public class CommonConfig {
    //声明第三方Bean对象(不建议在启动类，建议集中分类）
    @Bean//将这个方法返回的对象交给IOC容器管理，成为IOC容器Bean
         //通过@Bean注解的name/value属性可以指定Bean的名称，不指定默认为方法名
    public SAXReader reader(DeptService deptService){
        System.out.println("注入了deptService"+deptService);
        return new SAXReader();
    }
}
