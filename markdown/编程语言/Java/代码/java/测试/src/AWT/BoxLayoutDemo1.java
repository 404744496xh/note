package AWT;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个窗口容器Frame");

        //创建一个水平排列组件的Box容器
        Box hBox = Box.createHorizontalBox();
        //往当前容器中添加两个按钮
        hBox.add(new Button("水平按钮1"));
        hBox.add(new Button("水平按钮2"));

        //创建一个垂直排列组件的Box容器
        Box vBox = Box.createVerticalBox();
        //往当前容器中添加两个按钮
        vBox.add(new Button("垂直按钮1"));
        vBox.add(new Button("垂直按钮2"));

        //把两个Box添加到Frame中展示
        frame.add(hBox,BorderLayout.NORTH);
        frame.add(vBox,BorderLayout.CENTER);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }
}