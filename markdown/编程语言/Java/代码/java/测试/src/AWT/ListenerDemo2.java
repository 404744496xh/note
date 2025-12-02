package AWT;

import java.awt.*;
import java.awt.event.*;

public class ListenerDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //设置WindowListener，监听用户点击x的动作，如果点击x，则关闭窗口
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //停止当前程序
                System.exit(0); //退出JVM
            }
        });

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }
}