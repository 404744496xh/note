

# 13.1 File 类的使用
## 13.1.1 File 类的实例化
&#x20;·java.io.File 类：文件和文件目录路径的抽象表示形 式，与平台无关。

&#x20;·File 能新建、删除、重命名文件和目录，但 File 不 能访问文件内容本身。如果需要访问文件内容本身，则 需要使用输入 / 输出流。&#x20;

·想要在 Java 程序中表示一个真实存在的文件或目 录，那么必须有一个 File 对象，但是 Java 程序中的一个 File 对象，可能没有一个真实存在的文件或目录。

&#x20;·File 对象可以作为参数传递给流的构造器。&#x20;

**File 类的使用：**&#x20;

1. File 类的一个对象，代表一个文件或一个文件目录 ( 俗称：文件夹 )。

&#x20;2. File 类声明在 java.io 包下。&#x20;

3. File 类中涉及到关于文件或文件目录的创建、删除、 重命名、修改时间、文件大小等方法，并未涉及到写入 或读取文件内容的操作。如果需要读取或写入文件内容 必须使用 IO 流来完成。&#x20;

4. 后续 File 类的对象常会作为参数传递到流的构造器 中，指明读取或写入的 " 终点 "。

1. 如何创建 file 类的实例

&#x20;File(String filePath)：以 filePath 为路径创建 File 对象，可以是绝对路径 或者相对路径&#x20;

File(String parentPath,String childPath): 以 parentPath 为父路径，childPath 为子路径创建 File 对象。&#x20;

File(File parentFile,String childPath)：根据一个父 File 对象和子文件路径 创建 File 对象&#x20;

2. 相对路径：相较于某个路径下，指明的路径。&#x20;

绝对路径：包含盘符在内的文件或文件目录的路径。&#x20;

3. 路径分隔符 windows:\\ unix:/&#x20;

4. Java 程序支持跨平台运行，因此路径分隔符要慎用。

&#x20;5. 为了解决这个隐患，File 类提供了一个常量： public static final String separator。 根据操作系统，动态的提供分隔符。&#x20;

File file1= new File("d:\\Work\\info.txt");&#x20;

File file2= new File("d:"+ File.separator+ "Work"+ File.separator+ "info.txt");&#x20;

File file3= new File("d:/Work");

```java
public class FileTest { 
@Test 
    public void test() {
        // 构造器 1：
        File file1 = new File("hello.txt"); // 相对于当前 module&#x20;
        File file2 = new File("F:\\\java\\\Work2\\\JavaSenior\\\day08\\\ num.txt");&#x20;
        System.out.println(file1);
        System.out.println(file2);
        // 构造器 2：&#x20;
        File file3 = new File("D:\\\workspace\_idea1", "JavaSenior"); System.out.println(file3);&#x20;
        // 构造器 3：&#x20;
        File file4 = new File(file3, "hi.txt"); System.out.println(file4);&#x20;
    }
}
```

## 13.1.2 File 类的常用方法1&#x20;
1 public String getAbsolutePath()：获取绝对路径&#x20;

public String getPath()：获取路径&#x20;

public String getName()：获取名称&#x20;

public String getParent()：获取上层文件目录路径。若无，返回 null&#x20;

public long length()：获取文件长度（即：字节数）。不能获取目录的长度。

&#x20;public long lastModified()：获取最后一次的修改时间，毫秒值&#x20;

如下的两个方法适用于文件目录：&#x20;

public String[] list()：获取指定目录下的所有文件或者文件目录的名称数组&#x20;

public File[] listFiles()：获取指定目录下的所有文件或者文件目录的 File 数组

## File 类的常用方法 2
public boolean isDirectory()：判断是否是文件目录&#x20;

public boolean isFile()：判断是否是文件&#x20;

public boolean exists()：判断是否存在&#x20;

public boolean canRead()：判断是否可读&#x20;

public boolean canWrite()：判断是否可写&#x20;

public boolean isHidden()：判断是否隐藏

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957273428-980f5b4e-7ae2-4d19-a5f7-eead46076bd3.png)

当硬盘中真有一个真实的文件或目录存在时，创建 File 对象时，各个 属性会显式赋值。

&#x20;当硬盘中没有真实的文件或目录对应时，那么创建对象时，除了指定 的目录和路径之外，其他的属性都是取成员变量的默认值。&#x20;

创建硬盘中对应的文件或文件目录；&#x20;

public boolean createNewFile()：创建文件。若文件存在，则不创 建，返回 false；

&#x20;public boolean mkdir()：创建文件目录。如果此文件目录存在，就 不创建了。如果此文件目录的上层目录不存在，也不创建。&#x20;

public boolean mkdirs()：创建文件目录。如果上层文件目录不存 在，一并创建。&#x20;

删除磁盘中的文件或文件目录

&#x20;public boolean delete()：删除文件或者文件夹。 删除注意事项：Java 中的删除不走回收站。

```java
package 文件IO;
import java.io.File;
import java.io.IOException;
import java.util.Date;

class FileTest0 {
    public void test2() {
        File file = new File("Hello.txt");
        File file2 = new File("F:\\java\\Work2\\JavaSenior\\day08\\ num.txt");
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

    public void test4() {
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\book\\num.txt");
        boolean renameTo = file2.renameTo(file1);
        System.out.println(renameTo);
    }
}

```

# IO 流原理及流的分类
## IO 流原理
I/O 是 Input/Output 的缩写，I/O 技术是非常实用的 技术，用于处理设备之间的数据传输。如读 / 写文件， 网络通讯等。

&#x20;Java 程 序 中， 对 于 数 据 的 输 入 / 输 出 操 作 以“ 流 (stream)”的方式进行。

&#x20;java.io 包下提供了各种“流”类和接口，用以获取不 同种类的数据，并通过标准的方法输入或输出数据。&#x20;

输入 input：读取外部数据（磁盘、光盘等存储设备 的数据）到程序（内存）中。 输出 output：将程序（内存）数据输出到磁盘、光盘 等存储设备中。

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957273511-b0497b0d-6f9c-4139-88d0-38bd6d252471.png)

# 流的分类
按操作数据单位不同分为：字节流 (8 bit)，字符流 (16 bit)&#x20;

按数据流的流向不同分为：输入流，输出流&#x20;

按流的角色的不同分为：节点流，处理流 Java 的 IO 流共涉及 40 多个类，实际上非常规则，都 是从如下 4 个抽象基类派生的。&#x20;

由这四个类派生出来的子类名称都是以其父类名作为 子类名后缀。

| 抽象基类 | 字节流 | 字符流 |
| :--- | :--- | :--- |
| 输入流 | InputSteam | Reader |
| 输出流 | OutputStream | Writer |


![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957273583-b5c20607-1ee8-4640-a85e-7f494d1a23a1.png)

## IO流的体系结构
| 分类 | 字节输入流 | 字节输出流 | 字符输入流 | 字符输出流 |
| :--- | :--- | :--- | :--- | :--- |
| 抽象基类 | InputSteam | OutputSteam | Reader | Writer |
| 访问文件 | FileInputSteam | FileOutputSteam | FileReader | FileWriter |
| 访问数组 | ByteArrayInputSteam | ByteArrayOutputSteam | CharArrayReader | CharArrayWrite |
| 访问管道 | PipedInputSteam | pipedOutputSteam | PipedReader | PipedWriter |
| 访问字符串 |  |  | StringReader | StringWriter |
| 缓冲流 | BufferedInputSteam | BufferedOutputSteam | BufferedReader | BufferedWrite |
| 转换流 |  |  | InputSteamReader | OutputSteamWriter |
| 对象流 | ObjectInputSteam | ObjectOutputSteam |  |  |
|  | FilterInputSteam | FilterOutputSteam | FilterReader | FilterWriter |
| 打印流 |  | PrintSteam |  | PrintWrite |
| 推回输入流 | PushbackInputSteam |  | PushbackReader |  |
| 特殊流 | DataInputSteam | DataOutputSteam |  |  |


## 节点流 ( 或文件流 )
### FileReader 读入数据的基本操作
> 抽象基类 			  节点流（或文件流）
>
> InputStream 			FileInputStream (read(byte[] buffer))
>
> OutputStream   		FileOutputStream (write(byte[] buffer,0,len)
>
> Reader					FileReader (read(char[] cbuf))
>
> Writer    					FileWriter (write(char[] cbuf,0,len)&#x20;
>
> 缓冲流（处理流的一种）
>
> &#x20;BufferedInputStream (read(byte[] buffer))&#x20;
>
> BufferedOutputStream (write(byte[] buffer,0,len) / flush()&#x20;
>
> BufferedReader (read(char[] cbuf) / readLine())&#x20;
>
> BufferedWriter (write(char[] cbuf,0,len) / flush()
>

读取文件【四个步骤】&#x20;

建立一个流对象，将已存在的一个文件加载进流。&#x20;

&#x9;FileReaderfr= new FileReader(new File(“Test.txt”));&#x20;

创建一个临时存放数据的数组。&#x20;

&#x9;char[] ch= new char[1024];&#x20;

调用流对象的读取方法将流中的数据读入到数组中。&#x20;

&#x9;fr.read(ch);&#x20;

关闭资源。

&#x9; fr.close();&#x20;

将 hello.txt 文件内容读入程序中，并输出到控制台&#x20;

说明点：&#x20;

1. read() 的理解：返回读入的一个字符。如果达到文件末尾，返回 -1。&#x20;

2. 异常的处理：为了保证流资源一定可以执行关闭操作。需要使用 try-catch-finally 处理。&#x20;

3. 读入的文件一定要存在，否则就会报 FileNotFoundException。

```java
package 文件IO;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
    class FileReaderWriterTest {
        public void start() throws IOException {
            File file = new File("hello.txt");// 相较于当前工程
            file.createNewFile();
        }
        public void test() {
            FileReader fr = null;
            try {
// 实例化 File 对象，指明要操作的文件
                File file = new File("hello.txt");// 相较于当前的 Module
// 2. 提供具体的流
                fr = new FileReader(file);
                // 3. 数据的读入过程
// read():返回读入的一个字符。如果达到文件末尾，返回-1.
// 方式一：
// int data = fr.read();
// while (data != -1) {
// System.out.print((char) data);
// data = fr.read();
// }
// 方式二：语法上针对于方式一的修改
                int data;
                while ((data = fr.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // 4. 流的关闭操作
// try {
// if (fr != null)
// fr.close();
// } catch (IOException e) {
// e.printStackTrace();
// }
// 或
                if (fr != null) {
                    try {
                        fr.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

```

### FileReader 中使用 read(char[] cbuf) 读入数据
```java
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterTest {
    // 对 read() 操作升级：使用 read 的重载方法
    public void test2() {
        FileReader fr = null;
        try {
// 1.File 类的实例化
            File file = new File("hello.txt");
// 2.FileReader 流的实例化
            fr = new FileReader(file);
            // 3. 读入的操作
// read(char[] cbuf): 返回每次读入 cbuf 数组中的字符的个数。如果达到文件末尾，返回 -1
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                // 方式一：
// 错误的写法
// for (int i = 0; i < cbuf.length; i++) {
// System.out.print(cbuf[i]);
// }
// // 正确的写法
// for (int i = 0; i < len; i++) {
// System.out.print(cbuf[i]);
// }
// 方式二：
// 错误的写法 , 对应着方式一的错误的写法
// String str = new String(cbuf);
// System.out.print(str);
// 正确的写法
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
// 4. 资源的关闭
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

### 13.3.3 FileWriter 写出数据的操作
写入文件

创建流对象，建立数据存放文件。  FileWriterfw= new FileWriter(new File(“Test.txt”));

调用流对象的写入方法，将数据写入流。    fw.write(“atguigu-songhongkang”);

关闭流资源，并将流中的数据清空到文件中。 fw.close();  
从内存中写出数据到硬盘的文件里。  
说明：

1. 输出操作，对应的 File 可以不存在的。并不会报异常。
2. .File 对应的硬盘中的文件如果不存在，在输出的过程中，会自动创建此文件。 File 对应的硬盘中的文件如果存在： 如果流使用的构造器是：**FileWriter(file,false) / FileWriter(file): 对原有文件的覆盖。** 如果流使用的构造器是：**FileWriter(file,true): 不会对原有文件覆盖，而 是在原有文件基础上追加内容。**

```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {
    public void test3() {
        FileWriter fw = null;
        try {
// 1. 提供 File 类的对象，指明写出到的文件
            File file = new File("hello1.txt");
// 2. 提供 FileWriter 的对象，用于数据的写出
            fw = new FileWriter(file, false);
// 3. 写出的操作
            fw.write("I have a dream!\n");
            fw.write("you need to have a dream!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
// 4. 流资源的关闭
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();

                }

            }

        }
    }
}
```

### 13.3.4 使用 FileReader 和 FileWriter 实现文本文件的复制
```java
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {
    public void test4() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
// 1. 创建 File 类的对象，指明读入和写出的文件
            File srcFile = new File("hello1.txt");
            File srcFile2 = new File("hello2..txt");
            // 不能使用字符流来处理图片等字节数据
// File srcFile = new File(" 爱情与友情 .jpg");
// File srcFile2 = new File(" 爱情与友情 1.jpg");
// 2. 创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(srcFile2);
// 3. 数据的读入和写出操作
            char[] cbuf = new char[5];
            int len; // 记录每次读入到 cbuf 数组中的字符的个数
            while ((len = fr.read(cbuf)) != -1) {
// 每次写出 len 个字符
                fw.write(cbuf, 0, len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流资源
// 方式一：
// try {
// if (fw != null)
// fw.close();
// } catch (IOException e) {
// e.printStackTrace();13.3.4 使用 FileReader 和 FileWriter实现文本文件的复制478 479
// } finally {
// try {
// if (fr != null)
// fr.close();
// } catch (IOException e) {
// e.printStackTrace();
//}
//}
// 方式二：
try {
        if (fw != null)
            fw.close();
    } catch (IOException e) {
        e.printStackTrace();

    }
try {
        if (fr != null)
            fr.close();
    } catch (IOException e) {
        e.printStackTrace();

    }

}
}
}
```

### 13.3.5 使用 FileInputStream 不能读取文本 文件的测试
测试 FileInputStream 和 FileOutputStream 的使用。&#x20;

结论：&#x20;

1. 对于文本文件 (.txt,.java,.c,.cpp)，使用字符流处理；&#x20;

2. 对于非文本文件 (.jpg,.mp3,.mp4,.avi,.doc,.ppt,...)，使用字节流处理。

```java
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileIOPutTest {
    // 使用字节流 FileInputStream 处理文本文件，可能出现乱码。
    public void testFileInputStream() {
        FileInputStream fis = null;
        try {
// 1. 造文件
            File file = new File("hello.txt");
// 2. 造流
            fis = new FileInputStream(file);
// 3. 读数据
            byte[] buffer = new byte[5];
            int len; // 记录每次读取的字节的个数
            while ((len = fis.read(buffer)) != -1) {
                String str = new String(buffer, 0, len);
                System.out.print(str);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
// 4. 关闭资源
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();

                }

            }

        }
    }
}
```

### 13.3.6 使用 FileInputStream 和 FileOutputStream 读写非文本文件
实现对图片的复制操作

```java
import java.io.*;

public class FileIOPutTest {
    public void testFileInputOutputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
// 1. 造文件
            File srcFile = new File(" 爱情与友情 .jpg");
            File destFile = new File(" 爱情与友情 2.jpg");
// 2. 造流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
// 3. 复制的过程
            byte[] buffer = new byte[5];
            int len;
// 4. 读数据
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println(" 复制成功 ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
// 5. 关闭资源
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

```

## 13.4 缓冲流
为了提高数据读写的速度，Java API 提供了带缓冲功 能的流类，在使用这些流类时，会创建一个内部缓冲区 数组，缺省使用 8192 个字节 (8Kb) 的缓冲区。

```java
public class bufferedInputStream extends FilterInputStream{
    private static int DEFAULT_BUFFER_SIZE = 8192;
}
```

缓冲流要“套接”在相应的节点流之上，根据数据操作单位可以把缓 冲流分为：&#x20;

BufferedInputStream 和 BufferedOutputStream；

&#x20;BufferedReader 和 BufferedWriter；

当读取数据时，数据按块读入缓冲区，其后的读操作则直接访问缓冲区。&#x20;

当使用 BufferedInputStream 读取字节文件时，BufferedInputStream 会一 次性从文件中读取 8192 个 (8Kb)，存在缓冲区中，直到缓冲区装满了，才重 新从文件中读取下一个 8192 个字节数组。&#x20;

向流中写入字节时，不会直接写到文件，先写到缓冲区中直到缓冲区 写满，BufferedOutputStream 才会把缓冲区中的数据一次性写到文件里。

使用方法 flush() 可以强制将缓冲区的内容全部写入输出流。&#x20;

关闭流的顺序和打开流的顺序相反。只要关闭最外层流即可，关闭最 外层流也会相应关闭内层节点流。&#x20;

flush() 方法的使用：手动将 buffer 中内容写入文件。&#x20;

&#x9;如果是带缓冲区的流对象的 close() 方法，不但会关闭流，还会在关闭 流之前刷新缓冲区，关闭后不能再写出。

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957273671-4c94bf10-e776-4307-ac26-2d9333d6dfc7.png)

### 13.4.1 缓冲流 ( 字节型 ) 实现非文本文件的复制
处理流之一：缓冲流的使用&#x20;

1. 缓冲流：

&#x20;BufferedInputStream&#x20;

BufferedOutputStream

&#x20;BufferedReader&#x20;

BufferedWriter&#x20;

2. 作用：提供流的读取、写入的速度；

&#x20;提高读写速度的原因：内部提供了一个缓冲区。&#x20;

3. 处理流，就是“套接”在已有的流的基础上。

```java
import java.io.*;

public class BufferedTest {
    // 实现非文本文件的复制
    public void BufferedStreamTest() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
// 1. 造文件
            File srcFile = new File(" 爱情与友情 .jpg");
            File destFile = new File(" 爱情与友情 3.jpg");
            // 2. 造流
// 2.1 造节点流
            FileInputStream fis = new FileInputStream((srcFile));
            FileOutputStream fos = new
                    FileOutputStream(destFile);
// 2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
// 3. 复制的细节：读取、写入
            byte[] buffer = new byte[10];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
//bos.flush();// 刷新缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 资源关闭
// 要求：先关闭外层的流，再关闭内层的流
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 说明：关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭，我们可以省略 .
// fos.close();
// fis.close();
        }
    }
}
```

### 13.4.2 缓冲流与节点流读写速度对比
```java
import java.io.*;

public class Main {
    // 实现文件复制的方法
    public static void copyFileWithBuffered(String srcPath, String
            destPath) {
        BufferedInputStream bis;
        bis = null;
        BufferedOutputStream bos = null;
        try {
// 1. 造文件
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            // 2. 造流 // 2.1 造节点流
            FileInputStream fis = new FileInputStream((srcFile));
            FileOutputStream fos = new FileOutputStream
                    (destFile);
// 2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
// 3. 复制的细节：读取、写入
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 资源关闭
// 要求：先关闭外层的流，再关闭内层的流
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
 // 说明：关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭，我们可以省略 .
// fos.close();
// fis.close();
        }
    }
    public static void testCopyFileWithBuffered() {
        long start = System.currentTimeMillis();
        String srcPath = "爱情与友情.jpg";
        String destPath = "爱情与友情.jpg";
        copyFileWithBuffered(srcPath, destPath);
        long end = System.currentTimeMillis();
        System.out.println(" 复 制 操 作 花 费 的 时 间 为：" + (end - start)); // 1
    }

    public static void main(String[] args) {
        testCopyFileWithBuffered();
    }
}


```

### 13.4.3 缓冲流 ( 字符型 ) 实现文本文件的复制
```java
import java.io.*;

public class BufferedTest {
    // 使用 BufferedReader 和 BufferedWriter 实现文本文件的复制
    public void test4() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
// 创建文件和相应的流
            br = new BufferedReader(new FileReader(new
                    File("dbcp.txt")));
            bw = new BufferedWriter(new FileWriter(new
                    File("dbcp1.txt")));
            // 读写操作
// 方式一：使用 char[] 数组
// char[] cbuf = new char[1024];
// int len;
// while ((len = br.read(cbuf)) != -1) {
// bw.write(cbuf, 0, len);
// bw.flush();
//}
// 方式二：使用 String
        String data;
        while ((data = br.readLine()) != null) {
            // 方法一：
// bw.write(data + "\n");//data 中不包含换行符
// 方法二：
            bw.write(data); // data 中不包含换行符
            bw.newLine(); // 提供换行的操作

        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
// 关闭资源
        if (bw != null) {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();

            }

        }
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();

            }

        }

    }
}
}

```

## 13.5 转换流
**转换流概述与 InputStreamReader 的使用。  
****转换流提供了在字节流和字符流之间的转换 Java API 提供了两个转换流：**

> InputStreamReader：将 InputStream 转换为 Reader  
实现将字节的输入流按指定字符集转换为字符的输入流。  
需要和 InputStream“套接”。  
构造器：
>

> public InputStreamReader(InputStreamin)  
public InputSreamReader(InputStreamin,StringcharsetName)  
如：Reader isr= new InputStreamReader(System.in,”gbk”);
>

> OutputStreamWriter：将 Writer 转换为 OutputStream
>

> 实现将字符的输出流按指定字符集转换为字节的输出流。  
需要和 OutputStream“套接”。  
构造器：
>

> public OutputStreamWriter(OutputStreamout)  
public OutputSreamWriter(OutputStreamout,StringcharsetName)
>

**字节流中的数据都是字符时，转成字符流操作更高效。  
****很多时候我们使用转换流来处理文件乱码问题，实现编 码和解码的功能**

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957273740-93a9fe67-df08-4bee-84c8-4c2b6e959799.png)

**处理流之二：转换流的使用**

1. 转换流：属于字符流；

> &#x20;InputStreamReader：将一个字节的输入流转换为字符的输入流。&#x20;
>
> OutputStreamWriter：将一个字符的输出流转换为字节的输出流。&#x20;
>

2. 作用：提供字节流与字符流之间的转换。&#x20;

3. 解码：字节、字节数组 ---> 字符数组、字符串。&#x20;

编码：字符数组、字符串 ---> 字节、字节数组。

4. 字符集&#x20;

> ASCII：美国标准信息交换码。 用一个字节的 7 位可以表示。  
ISO8859-1：拉丁码表。欧洲码表。 用一个字节的 8 位表示。  
GB2312：中国的中文编码表。 最多两个字节编码所有字符。  
GBK：中国的中文编码表升级，融合了更多的中文文字符号。 最多两个字节编码。 Unicode：国际标准码，融合了目前人类使用的所有字符。为每个字符 分配唯一的字符码。所有的文字都用两个字节来表示。 UTF-8：变长的编码方式，可用 1-4 个字节来表示一个字符。
>

Unicode 不完美，这里就有三个问题，一个是，我们已经知道，英 文字母只用一个字节表示就够了，第二个问题是如何才能区别 Unicode 和 ASCII ？计算机怎么知道两个字节表示一个符号，而不是分别表示两个符号 呢？第三个，如果和 GBK等双字节编码方式一样，用最高位是 1 或 0 表示 两个字节和一个字节，就少了很多值无法用于表示字符，不够表示所有字符。 Unicode 在很长一段时间内无法推广，直到互联网的出现。

面向传输的众多 UTF（UCS Transfer Format）标准出现了，顾名思义， **UTF-8 就是每次 8 个位传输数据，而 UTF-16 就是每次 16 个位。** 这 是为传输而设计的编码，并使编码无国界，这样就可以显示全世界上所有文 化的字符了。 Unicode 只是定义了一个庞大的、全球通用的字符集，并为每个字符规 定了唯一确定的编号，具体存储成什么样的字节流，取决于字符编码方案。 推荐的 Unicode 编码是 UTF-8 和 UTF-16。

```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
// 此时处理异常的话，仍然应该使用 try-catch-finally InputStreamReader的使用，实现字节的输入流到字符的输入流的转换
    public void test() throws IOException {
        FileInputStream fis = new FileInputStream("dbcp.txt");
// InputStreamReader isr = new InputStreamReader(fis);
// 使用系统默认的字符集
// 参数 2 指明了字符集，具体使用哪个字符集，取决于文件dbcp.txt 保存时使用的字符集
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // 使用系统默认的字符集
        char[] cbuf = new char[20];
        int len;
        while ((len = isr.read(cbuf)) != -1) {
            String str = new String(cbuf, 0, len);
            System.out.print(str);
        }
        isr.close();
    }
}
```

## 13.6 标准输入、输出流、打印流、数据流
### 13.6.1 标准输入、输出流
System.in 和 System.out 分别代表了系统标准的输入和 输出设备；

&#x20;默认输入设备是：键盘，输出设备是：显示器；

System.in 的类型是 InputStream； System.out 的类型是 PrintStream，其是 OutputStream 的子类 FilterOutputStream 的子类；

**重定向：**  
通过 System 类的 setIn，setOut 方法对默认设备进行改变。

> public static void setIn(InputStreamin)&#x20;  
public static void setOut(PrintStreamout)&#x20;
>

其他流的使用&#x20;  
1. 标准的输入、输出流&#x20;  
2. 打印流&#x20;  
3. 数据流&#x20;

> 1. 标准的输入、输出流
>

> 1.1 System.in: 标准的输入流，默认从键盘输入；  
System.out: 标准的输出流，默认从控制台输出。  
1.2 System 类的 setIn(InputStream is) / setOut(PrintStream ps) 方式重新指定输 入和输出的流。  
1.3 练习： 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，直至当输入“e”或者“exit”时，退出程序。
>

方法一：使用 Scanner 实现，调用 next() 返回一个字符串。  
方法二：使用 System.in 实现。System.in ---> 转换流 ---> BufferedReader 的 readLine()。

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherStreamTest {
    public void test() {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader
                    (System.in);
            br = new BufferedReader(isr);
            while (true) {
                System.out.println(" 请输入字符串：");
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".
                        equalsIgnoreCase(data)) {
                    System.out.println(" 程序结束 ");
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

### 13.6.2 打印流、数据流
打印流：  
实现将基本数据类型的数据格式转化为字符串输出；  
**打印流：PrintStream 和 PrintWriter； ·**

> 提供了一系列重载的 print() 和 println() 方法， 用于多种数据类型的输出。
>
> &#x20;·PrintStream 和 PrintWriter 的 输 出 不 会 抛 出 IOException 异常。&#x20;
>
> ·PrintStream 和 PrintWriter 有自动 flush 功能
>
> ·PrintStream 打印的所有字符都使用平台的默认字符编码转换为字节。在需要写入字符而不是写入字节 的情况下，应该使用 PrintWriter 类。
>
> &#x20;·System.out 返回的是 PrintStream 的实例。&#x20;
>

**数据流：**&#x20;

为了方便地操作 Java 语言的基本数据类型和 String 的 数据，可以使用数据流。&#x20;

数据流有两个类：( 用于读取和写出基本数据类型、 String 类的数据）

&#x20;·DataInputStream 和 DataOutputStream · 分 别“ 套 接” 在 InputStream 和 OutputStream 子类的流上。

DataInputStream 中的方法：

> boolean readBoolean() 					byte readByte()&#x20;
>
> char readChar() 								float readFloat()&#x20;
>
> double readDouble() 						short readShort()&#x20;
>
> long readLong() 								int readInt()&#x20;
>
> String readUTF() 								void readFully(byte[s] b)
>

DataOutputStream将上述的方法的 read 改为相应的 write 即可

2. 打印流：PrintStream 和 PrintWriter

&#x20;	提供了一系列重载的 print() 和 println()

&#x20;3. 数据流&#x20;

3.1 DataInputStream 和 DataOutputStream；&#x20;

3.2 作用：用于读取或写出基本数据类型的变量或字符串。&#x20;

练习：将内存中的字符串、基本数据类型的变量写出到文件中。&#x20;

注意：处理异常的话，仍然应该使用 try-catch-finally。

```java
import java.io.*;

public class OtherStreamTest {
    public void test2() {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new
                    File("D:\\IO\\text.txt"));
            // 创建打印输出流 , 设置为自动刷新模式 ( 写入换行符或字节 '\n' 时都会刷新输出缓冲区 )
            ps = new PrintStream(fos, true);
            if (ps != null) { // 把标准输出流 ( 控制台输出 ) 改成文件
                System.setOut(ps);
            }
            for (int i = 0; i <= 255; i++) { // 输出 ASCII 字符
                System.out.print((char) i);
                if (i % 50 == 0) { // 每 50 个数据一行
                    System.out.println(); // 换行
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }
}


```

2. 打印流：PrintStream 和 PrintWriter  
&#x20;       提供了一系列重载的 print() 和 println()  
&#x20;       3. 数据流  
&#x20;       3.1 DataInputStream 和 DataOutputStream；  
&#x20;       3.2 作用：用于读取或写出基本数据类型的变量或字符串。  
&#x20;       练习：将内存中的字符串、基本数据类型的变量写出到文件中。  
&#x20;       注意：处理异常的话，仍然应该使用 try-catch-finally。

```java
public class OtherStreamTest {
    public void test3() throws IOException {
// 1.
        DataOutputStream dos = new DataOutputStream(new
                FileOutputStream("data.txt"));
// 2.
        dos.writeUTF(" 刘刚 ");
        dos.flush(); // 刷新操作，将内存中的数据写入文件
        dos.writeInt(23);
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();
// 3.
        dos.close();
    }
// 将文件中存储的基本数据类型变量和字符串读取到内存中，保存在变量中。
// 注意点：读取不同类型的数据的顺序要与当初写入文件时，保存的数据的顺序一致！

    public void test4() throws IOException {
// 1.
        DataInputStream dis = new DataInputStream(new
                FileInputStream("data.txt"));
// 2.
        String name = dis.readUTF();
        int age = dis.readInt();
        boolean isMale = dis.readBoolean();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("isMale = " + isMale);
// 3.
        dis.close();
    }
}

```

## 13.7 对象流;
### 13.7.1 对象序列化机制的理解
&#x20;·ObjectInputStream 和 OjbectOutputSteam。

&#x20;·用于存储和读取基本数据类型数据或对象的处理流。它的强大之处 就是可以把 Java 中的对象写入到数据源中，也能把对象从数据源中还原回来。

&#x20;·序列化：用 ObjectOutputStream 类保存基本类型数据或对象的机制。

&#x20;·反序列化：用 ObjectInputStream 类读取基本类型数据或对象的机制。&#x20;

·ObjectOutputStream 和 ObjectInputStream 不能序列化 static 和 transient 修饰的成员变量。

&#x20;·对象序列化机制允许把内存中的 Java 对象转换成平台无关的二进制 流，从而允许把这种二进制流持久地保存在磁盘上，或通过网络将这种二进 制流传输到另一个网络节点。当其它程序获取了这种二进制流，就可以恢复 成原来的 Java 对象。&#x20;

·序列化的好处在于可将任何实现了 Serializable 接口的对象转化为字节数据，使其在保存和传输时可被还原。

&#x20;·序列化是 RMI（Remote Method Invoke - 远程方法调用）过程的参 数和返回值都必须实现的机制，而 RMI 是JavaEE 的基础。因此序列化机制 是 JavaEE 平台的基础。&#x20;

·如果需要让某个对象支持序列化机制，则必须让对象所属的类及其 属性是可序列化的，为了让某个类是可序列化的，该类必须实现如下两个接 口之一。否则，会抛出 NotSerializableException 异常。

&#x20;·Serializable&#x20;

·Externalizable&#x20;

### 13.7.2 对象流序列化与反序列化字符串操作&#x20;
对象流的使用：&#x20;

1.ObjectInputStream 和 ObjectOutputStream&#x20;

2. 作用：用于存储和读取基本数据类型数据或对象的 处理流。它的强大之处就是可以把 Java 中的对象写入到 数据源中，也能把对象从数据源中还原回来。

```java
package 文件IO;
import java.io.*;
public class ObjectTest {
    // 序列化过程：将内存中的 java 对象保存到磁盘中或通过网络传输出去 使用 ObjectOutputStream 实现
    public void test() {
        ObjectOutputStream oos = null;
        try {
// 创造流
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
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
}

```

### 13.7.3 自定义类实现序列化与反序列化操作&#x20;
若某个类实现了 Serializable 接口，该类的对象就是可序 列化的：

&#x9; ·创建一个 ObjectOutputStream。&#x20;

&#x9;·调用 ObjectOutputStream 对象的 writeObject( 对象 ) 方法输出可序列化对象。

&#x9; ·注意写出一次，操作 flush() 一次。&#x20;

反序列化

&#x9; ·创建一个 ObjectInputStream 对象调用 readObject() 方法读取流中的对象。

&#x20;强调：如果某个类的属性不是基本数据类型或 String 类型，而是另一个引用类型，那么这个引用类型必须是 可序列化的，否则拥有该类型的 Field 的类也不能序列化。&#x20;

对象流的使用：

&#x20;1. ObjectInputStream 和 ObjectOutputStream。&#x20;

2. 作用：用于存储和读取基本数据类型数据或对象的处理流。它的强 大之处就是可以把 Java 中的对象写入到数据源中，也能把对象从数据源中还 原回来。

&#x20;3. 要想一个 java 对象是可序列化的，需要满足相应的要求。见 Person. java。&#x20;

4. 序列化机制： 对象序列化机制允许把内存中的 Java 对象转换成平台无关的二进 制流，从而允许把这种。 二进制流持久地保存在磁盘上，或通过网络将这种二进制流传输 到另一个网络节点。 当其它程序获取了这种二进制流，就可以恢复成原来的 Java 对象。

Person 类

```java
package 文件IO;
import java.io.*;
public class ObjectTest {
    
    /**
     * 序列化过程：将内存中的 java 对象保存到磁盘中或通过网络传输出
     去 使用 ObjectOutputStream 实现
     */
    public void test3() {
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
    public void test4() {
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
}

```

### 13.7.4 serialVersionUID 的理解&#x20;
凡是实现 Serializable 接口的类都有一个表示序列化版 本标识符的静态变量：

&#x20;·private static final long serialVersionUID；&#x20;

·serialVersionUID 用来表明类的不同版本间的兼 容性。简言之，其目的是以序列化对象进行版本控制， 有关各版本反序列化时是否兼容。

&#x20;·如果类没有显示定义这个静态常量，它的值是 Java 运行时环境根据类的内部细节自动生成的。若类的实 例变量做了修改，serialVersionUID 可能发生变化。故建议， 显式声明。&#x20;

简单来说，Java 的序列化机制是通过在运行时判断类 的 serialVersionUID 来验证版本一致性的。在进行反序列 化时，JVM 会把传来的字节流中的 serialVersionUID 与本 地相应实体类的 serialVersionUID 进行比较，如果相同就 认为是一致的，可以进行反序列化，否则就会出现序列 化版本不一致的异常。

(InvalidCastException) Person 需要满足如下的要求，方可序列化：&#x20;

1. 需要实现接口：Serializable；&#x20;

2. 当前类提供一个全局常量：serialVersionUID；&#x20;

3. 除了当前 Person 类需要实现 Serializable 接口之外，还必须保证其内 部所有属性。 也必须是可序列化的。（默认情况下，基本数据类型可序列化）

## 13.8 随机存取文件流;
RandomAccessFile 声明在 java.io 包下，但直接继承于 java. lang.Object 类。并且它实现了 DataInput、DataOutput 这 两个接口，也就意味着这个类既可以读也可以写。

RandomAccessFile 类支持“随机访问” 的方式，程序可 以直接跳到文件的任意地方来读、写文件：&#x20;

·支持只访问文件的部分内容

·可以向已存在的文件后追加内容

RandomAccessFile 对象包含一个记录指针，用以标示当前 读写处的位置。RandomAccessFile 类对象可以自由移动记 录指针：

> ·long getFilePointer()：获取文件记录指针的当前位置。  
·void seek(long pos)：将文件记录指针定位到pos位置。&#x20;
>

构造器：

> ·public RandomAccessFile(File file, String mode)&#x20;  
·public RandomAccessFile(String name, String mode)
>

创建 RandomAccessFile 类实例需要指定一个 mode 参数， 该参数指定 RandomAccessFile 的访问模式：

> ·r: 以只读方式打开&#x20;  
·rw：打开以便读取和写入  
·rwd: 打开以便读取和写入；同步文件内容的更新  
·rws: 打开以便读取和写入；同步文件内容和元数据 的更新。&#x20;
>

如果模式为只读 r。则不会创建文件，而是会去读取一个 已经存在的文件，如果读取的文件不存在则会出现异常。 如果模式为 rw 读写。如果文件不存在则会去创建文件， 如果存在则不会创建。

### 13.8.1 RandomAccessFile 实现数据的 读写操作
RandomAccessFile 的使用：&#x20;

1.RandomAccessFile 直接继承于 java.lang.Object 类，实现了 DataInput 和 DataOutput 接口。 2.RandomAccessFile 既可以作为一个输入流，又可以作为一个输出流。&#x20;

3. 如果 RandomAccessFile 作为输出流时，写出到的文件如果不存在， 则在执行过程中自动创建。 如果写出到的文件存在，则会对原有文件内容进行覆盖。（默认情况下， 从头覆盖）

&#x20;4. 可以通过相关的操作，实现 RandomAccessFile“插入”数据的效果。

### 13.8.1 RandomAccessFile 实现数据的 插入操作
```java
package 文件IO;
import java.io.*;
class RandomAccessFileTest {

    public void test() {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("123.jpg"), "r");
                    raf2 = new RandomAccessFile(new File("12345.jpg"), "rw");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = raf1.read(buffer)) != -1) {
                raf2.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf2 != null) {
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void test2() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello.txt", "rw");
        raf1.write("xyz".getBytes());
        raf1.close();
    }
    
    // 使用 RandomAccessFile 实现数据的插入效果
    public void test3() throws IOException {
        RandomAccessFile raf1 = new RandomAccessFile("hello. txt", "rw");
        raf1.seek(3); // 将指针调到角标为 3 的位置
// 保存指针 3 后面的所有数据到 StringBuilder 中
        StringBuilder builder = new StringBuilder((int) new
                File("hello.txt").length());
        byte[] buffer = new byte[20];
        int len;
        while ((len = raf1.read(buffer)) != -1) {
            builder.append(new String(buffer, 0, len));
        }
// 调回指针，写入“xyz”
        raf1.seek(3);
        raf1.write("xyz".getBytes());
// 将 StringBuilder 中的数据写入到文件中
        raf1.write(builder.toString().getBytes());
        raf1.close();
// 思考：将 StringBuilder 替换为 ByteArrayOutputStream
    }
}

```

## 13.9 NIO.2 中 Path、Paths、Files 类的使用
Java NIO (New IO，Non-Blocking IO) 是 从 Java 1.4 版本开始引入的一套新的 IO API，可以替代标准的 Java IO API。NIO 与原来的 IO 有同样的作用和目的，但是使 用的方式完全不同，NIO 支持面向缓冲区的 (IO 是面向 流的 )、基于通道的 IO 操作。NIO 将以更加高效的方式 进行文件的读写操作。&#x20;

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957273801-981d4700-a374-4529-b62b-53f77a1bd5e7.png)

Java API 中提供了两套 NIO，一套是针对标准输入输 出 NIO，另一套就是网络编程 NIO。 随着 JDK 7 的发布，Java 对 NIO 进行了极大的扩展， 增强了对文件处理和文件系统特性的支持，以至于我们 称他们为 NIO.2。因为 NIO 提供的一些功能，NIO 已经 成为文件处理中越来越重要的部分。&#x20;

早期的 Java 只提供了一个 File 类来访问文件系统，但 File 类的功能比较有限，所提供的方法性能也不高。而且， 大多数方法在出错时仅返回失败，并不会提供异常信息。&#x20;

NIO. 2 为了弥补这种不足，引入了 Path 接口，代表 一个平台无关的平台路径，描述了目录结构中文件的位 置。Path 可以看成是 File 类的升级版本，实际引用的资 源也可以不存在。

在以前 IO 操作都是这样写的：

> import java.io.File;  
File file = new File(“index.html”);
>

但在 Java7 中，我们可以这样写：&#x20;

> import java.nio.file.Path;&#x20;  
import java.nio.file.Paths;&#x20;  
Path path = Paths.get(“index.html”);&#x20;
>

同时，NIO.2 在 java.nio.file 包下还提供了 Files、Paths 工具类，Files 包 含了大量静态的工具方法来操作文件；Paths 则包含了两个返回 Path 的静态 工厂方法。&#x20;

**Paths 类提供的静态 get() 方法用来获取 Path 对象：**

> ·static Pathget(String first, String … more)：用于将多个字符串串 连成路径。&#x20;  
·static Path get(URI uri)：返回指定 uri 对应的 Path 路径
>

#### **1、Path 接口**
**Path 常用方法**

> ·String toString()：返回调用 Path 对象的字符串表示形式；  
·boolean startsWith(String path)： 判断是否以 path 路径开始；  
·boolean endsWith(String path)：判断是否以 path 路径结束；  
·boolean isAbsolute()：判断是否是绝对路径；  
·Path getParent()：返回 Path 对象包含整个路径，不包含 Path 对象指定的文 件路径；  
·Path getRoot()：返回调用 Path 对象的根路径；  
·Path getFileName()：返回与调用 Path 对象关联的文件名；  
·intgetNameCount()：返回 Path 根目录后面元素的数量；  
·Path getName(int idx)：返回指定索引位置 idx 的路径名称；  
·Path toAbsolutePath()：作为绝对路径返回调用 Path 对象；  
·Path resolve(Path p)：合并两个路径， 返回台并后的路径对应的 Path 对象；  
·File toFile()：将 Path 转化为 File 类的对象。
>

#### **2、Files 类**
**Files 常用方法：用于判断**

> ·boolean exist(Path path, LinkOption .. opts)：判断文件是否存在&#x20;  
·boolean isDirectory(Path path, LinkOption .. opts)：判断是否是目录&#x20;  
·boolean isRegularFile(Path path, LinkOption .. opts)：判断是否是文件&#x20;  
·boolean isHidden(Path path)：判断是否是隐藏文件&#x20;  
·boolean isReadable(Path path)：判断文件是否可读&#x20;  
·boolean isWritable(Path path)：判断文件是否可写  
·boolean notExists(Path path, LinkOption .. opts)：判断文件是否不存在&#x20;
>

**Files 常用方法 : 用于操作内容**&#x20;

> ·SeekableByteChannel newByteChannel(Path path, OpenOption..how)： 获取与指定文件的连接，how 指定打开方式。  
·DirectoryStream newDirectoryStream(Path path)：打开 path 指定 的目录。  
·InputStream newlnputStream(Path path, OpenOption..how)：获取 InputStream 对象。  
·OutputStream newOutputStream(Path path, OpenOptin...how)：获取 OutputStream 对象。
>

**javano.file.Files 用于操作文件或目录的工具类。**

Files 常用方法：

> ·Path copy(Path src, Path dest, CopyOption ... how)：文件的复制；  
;·Path createDirectory(Path path, FileAttribute .... attr)：创建一个目录；  
·Path createFile(Path path, FileAttribute ... arr)：创建一一个文件；  
·void delete(Path path)：删除一个文件 / 目录，如果不存在，执行报错；  
·void deletelfExists(Path path)：Path 对应的文件 / 月录如果存在，执行删除；  
·Path move(Path sre, Path dest, CopyOption.. .how)：将 src 移动到 dest 位置；  
·long size(Path path)：返回 path 指定文件的大小。
>

&#x9;

