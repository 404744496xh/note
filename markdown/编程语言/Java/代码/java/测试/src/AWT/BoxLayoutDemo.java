package AWT;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个窗口容器Frame");
        //基于frame容器创建一个BoxLayout对象，并且该对象存放组件是垂直存放
        BoxLayout boxLayout = new BoxLayout(frame,BoxLayout.Y_AXIS);
        //把BoxLayout设置给frame
        frame.setLayout(boxLayout);
        //往frame中添加两个Button组件
        frame.add(new Button("按钮1"));
        frame.add(new Button("按钮2"));

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }
}