package AWT;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        //1、创建窗口对象
        Frame frame = new Frame("这是一个窗口容器Frame");
        //2、设置窗口的位置和大小
        frame.setLocation(100,100); //单位是像素
        frame.setSize(500,300); //单位是像素
        //3、设置窗口对象可见
        frame.setVisible(true);
    }
}