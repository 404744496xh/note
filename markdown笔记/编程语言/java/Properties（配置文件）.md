## Properties的常用方法：

1.setProperty(String key, String value)
调用 Hashtable 的方法 put。

2.getProperty(String key)
用指定的键在此属性列表中搜索属性

3.getProperty(String key, StringdefaultValue)
用指定的键在属性列表中搜索属性。

4.load(InputStream inStream)
从输入流中读取属性列表（键和元素对）。

5.load(Reader reader)
按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。

6.loadFromXML(InputStream in)
将指定输入流中由 XML 文档所表示的所有属性加载到此属性表中。

7.store(OutputStream out, String comments)
以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。

8.store(Writer writer, String comments)
以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。

9.storeToXML(OutputStream os, String comment)
发出一个表示此表中包含的所有属性的 XML 文档。
10.storeToXML(OutputStream os, String comment, String encoding)
使用指定的编码发出一个表示此表中包含的所有属性的 XML 文档。

```
package 集合;

import java.io.*;
import java.util.Properties;

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

```

## ResourceBundle中获取值

获取ResourceBundle实例后可以通过下面的方法获得本地化值。
getObject(String key);
getString(String key);
getStringArray(String key);
还可以通过keySet()方法获取所有的key。Set keys = bundle.keySet();
其它ResourceBundle 方法可以通过查看文档获得。

测试及验证

新建4个属性文件
my\_en\_US.properties：cancelKey=cancel

my\_zh\_CN.properties：cancelKey=\u53D6\u6D88（取消）

my\_zh.properties：cancelKey=\u53D6\u6D88zh（取消zh）

my.properties：cancelKey=\u53D6\u6D88default（取消default）

获取bundle
ResourceBundle bundle = ResourceBundle.getBundle("res", new Locale("zh", "CN"));
1
其中new Locale(“zh”, “CN”)提供本地化信息，上面这行代码，程序会首先在classpath下寻找my\_zh\_CN.properties文件，若my\_zh\_CN.properties文件不存在，则取找my\_zh.properties，如还是不存在，继续寻找my.properties,若都找不到就抛出异常。

```java
import javax.annotation.Resource;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author OovEver
 * 2018/1/14 22:12
 */
public class Main {

    public static void main(String args[]) {
        ResourceBundle bundle = ResourceBundle.getBundle("my", new Locale("zh", "CN"));
        String cancel = bundle.getString("cancelKey");
        System.out.println(cancel);

        bundle = ResourceBundle.getBundle("my", Locale.US);
        cancel = bundle.getString("cancelKey");
        System.out.println(cancel);

        bundle = ResourceBundle.getBundle("my", Locale.getDefault());
        cancel = bundle.getString("cancelKey");
        System.out.println(cancel);

        bundle = ResourceBundle.getBundle("my", Locale.GERMAN);
        cancel = bundle.getString("cancelKey");
        System.out.println(cancel);
        bundle = ResourceBundle.getBundle("my");
        for (String key : bundle.keySet()) {
            System.out.println(bundle.getString(key));
        }
    }
}
```

