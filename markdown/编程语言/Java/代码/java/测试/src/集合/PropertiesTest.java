package 集合;

import java.io.*;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesTest {
    public static void main(String[] args) {
//为properties对象添加属性和获取值
        Properties p = new Properties();
        p.setProperty("name", "zhangsan");
        p.setProperty("age", "20");
        p.setProperty("sex", "男");
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("age"));
        System.out.println(p.getProperty("sex"));
        // 遍历
        for (String key : p.stringPropertyNames()) {
            System.out.println(key + ":" + p.getProperty(key));
        }

//properties配置文件格式写入到硬盘中的某个文件夹
        try {
            p.store(new FileOutputStream(new File("E:\\toolbox\\java\\测试\\src\\test.properties")), "propertiesTest");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//properties加载和读取配置文件（以properties文件为例）
        Properties pro;
        try {
            pro=new Properties();
            //通过字节输入流
            //load(InputStream inStream)
            //pro.load(new FileInputStream("src/test.properties"));

            //通过类加载器 获取当前类路径
            //类路径是指      / bin路径
            //pro.load(this.getClass().getResourceAsStream("/test.properties"));
            //pro.load(this.getClass().getClassLoader().getResourceAsStream("test.properties"));

            //也可以使用当前上下文的类加载器，不用“/”
            pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("test.properties"));

            //通过字符输入流
            //load(Reader reader)
            //pro.load(new FileReader("src/test.properties"));
            for(String key: pro.stringPropertyNames())
                System.out.println(key + ":" + p.getProperty(key));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
