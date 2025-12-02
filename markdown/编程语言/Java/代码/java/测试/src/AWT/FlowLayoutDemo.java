package AWT;

import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个窗口容器Frame");

        //通过setLayout()方法设置容器的布局管理器
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
        //添加多个按钮到frame中
        for (int i = 0; i < 10; i++) {
            frame.add(new Button("按钮"+i));
        }
        //通过pack()方法设置最佳大小
        frame.pack();

        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }
}