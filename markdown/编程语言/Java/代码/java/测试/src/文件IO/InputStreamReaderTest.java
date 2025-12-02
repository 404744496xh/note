package 文件IO;

import 注解.Test;
import java.io.*;

public class InputStreamReaderTest {
// 此时处理异常的话，仍然应该使用 try-catch-finally InputStreamReader的使用，实现字节的输入流到字符的输入流的转换
    @Test
    public void test() throws IOException {
        FileInputStream fis = new FileInputStream("hello.txt");
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

    public static void main(String[] args) {
        InputStreamReaderTest isr = new InputStreamReaderTest();
        try {
            isr.test();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}