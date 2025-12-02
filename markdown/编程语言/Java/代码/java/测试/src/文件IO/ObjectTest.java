package 文件IO;

import 注解.Test;
import java.io.*;
public class ObjectTest {
    // 序列化过程：将内存中的 java 对象保存到磁盘中或通过网络传输出去 使用 ObjectOutputStream 实现
    @Test
    public void test() {
        ObjectOutputStream oos = null;
        try {
// 创造流
            oos = new ObjectOutputStream(new
                    FileOutputStream("object.dat"));
// 制造对象
            oos.writeObject(new String(" 秦始皇陵欢迎你 "));
// 刷新操作
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
// 3. 关闭流
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // 反序列化：将磁盘文件中的对象还原为内存中的一个 java 对象 使用 ObjectInputStream 来实现
    @Test
    public void test2() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream
                    ("object.dat"));
            Object obj = ois.readObject();
            String str = (String) obj;
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//自定义类的序列化

    /**
     * 序列化过程：将内存中的 java 对象保存到磁盘中或通过网络传输出
     去 使用 ObjectOutputStream 实现
     */
    @Test
    public void test0() {
        ObjectOutputStream oos = null;
        try {
// 创造流
            oos = new ObjectOutputStream(new
                    FileOutputStream("object.dat"));
// 制造对象
            oos.writeObject(new String(" 秦始皇陵欢迎你 "));
// 刷新操作
            oos.flush();
            oos.writeObject(new Person(" 李时珍 ", 65));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
// 3. 关闭流
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 反序列化：将磁盘文件中的对象还原为内存中的一个 java 对象 使
     用 ObjectInputStream 来实现
     */
    @Test
    public void test02() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new
                    FileInputStream("object.dat"));
            Object obj = ois.readObject();
            String str = (String) obj;
            Person p = (Person) ois.readObject();
            System.out.println(str);
            System.out.println(p);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ObjectTest o = new ObjectTest();
        o.test();
    }
}

