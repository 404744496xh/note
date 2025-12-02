package AWT;

import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个窗口容器Frame");

        //通过setLayout()方法设置容器的布局管理器
        frame.setLayout(new BorderLayout(30,30));
        //往frame的指定区域添加组件
        frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
        frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);
        frame.add(new Button("东侧按钮"),BorderLayout.EAST);
        frame.add(new Button("西侧按钮"),BorderLayout.WEST);
        frame.add(new Button("中间按钮"),BorderLayout.CENTER);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }
}