package com.itheima;

import com.example.EnableHeaderConfig;
import com.example.HeaderConfig;
import com.example.MyImportSelector;
import com.example.TokenParser;
import org.dom4j.io.SAXReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
//导入第三方Bean
//方法一
//@ComponentScan({"com.itheima", "com.example"})//使用频繁性能低

//方法二
//@Import({TokenParser.class})//导入普通类
//@Import({HeaderConfig.class})//导入配置类
//@Import({MyImportSelector.class})//导入ImportSelector的实现类
@EnableHeaderConfig
@SpringBootApplication
public class SpringbootWebConfig2Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebConfig2Application.class, args);
    }
}
