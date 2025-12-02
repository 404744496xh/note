package 文件IO;

import 注解.Test;
import java.io.*;
import java.util.Date;

public class FileTest {
//    File file1= new File("d:\\Work\\info.txt");
//    File file2= new File("d:"+ File.separator+ "Work"+ File.separator+ "info.txt");
//    File file3= new File("d:/Work");
    public void test() {
// 构造器 1：
        File file1 = new File("hello.txt"); // 相对于当前 module
        File file2 = new File(" num.txt");
        System.out.println(file1);
        System.out.println(file2);
// 构造器 2：
        File file3 = new File(System.getProperty("user.dir"), "JavaSenior");
        System.out.println(file3);
// 构造器 3：
        File file4 = new File(file3, "hi.txt");
        System.out.println(file4);
    }

    public void test2() {
        File file = new File("Hello.txt");
        File file2 = new File(" num.txt");
                System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(new Date(file.lastModified()));
        System.out.println();
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
    }

    public void test3() {
// 文件需存在！！！
        File file = new File("F:\\java\\Work2\\JavaSenior");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
    /**
     * File 类的重命名功能
     * public boolean renameTo(File dest): 把文件重命名为指定的文件
     路径 比如：file1.renameTo(file2) 为例：
     * 要想保证返回 true, 需要 file1 在硬盘中是存在的，且 file2 不能在
     硬盘中存在。
     */

    public void test4() {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\book\\num.txt");
        boolean renameTo = file2.renameTo(file1);
        System.out.println(renameTo);
    }

    @Test
    public void test5() {
        File file1 = new File("hello.txt");
        file1 = new File("hello1.txt");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
        System.out.println();
        File file2 = new File("D:\\book");
        file2 = new File("D:\\book1");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());
    }
    @Test
    public void test6() throws IOException {
        File file1 = new File("hi.txt");
        if (!file1.exists()) {
// 文件的创建
            file1.createNewFile();
            System.out.println(" 创建成功 ");
        } else { // 文件存在
            file1.delete();
            System.out.println(" 删除成功 ");

        }
    }

    @Test
    public void test7() {
// 文件目录的创建
        File file1 = new File("d:\\io\\io1\\io3");
        boolean mkdir = file1.mkdir();
        if (mkdir) {
            System.out.println(" 创建成功 1");
        }
        File file2 = new File("d:\\io\\io1\\io4");
        boolean mkdir1 = file2.mkdirs();
        if (mkdir1) {
            System.out.println(" 创建成功 2");
        }
// 要想删除成功，io4 文件目录下不能有子目录或文件
        File file3 = new File("D:\\io\\io1\\io4");
        file3 = new File("D:\\io\\io1");
        System.out.println(file3.delete());
    }

    public static void main(String[] args) {
        FileTest ft=new FileTest();
    }
}
