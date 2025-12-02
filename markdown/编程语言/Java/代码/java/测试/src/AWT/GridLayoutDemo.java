package AWT;

import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个窗口容器Frame");
        //通过setLayout()方法设置容器的布局管理器
        frame.setLayout(new BorderLayout());

        //创建一个Panel对象，里面存放一个TextField组件
        Panel p1 = new Panel();
        p1.add(new TextField(50));
        //把这个Panel添加到frame的北边区域
        frame.add(p1,BorderLayout.NORTH);

        //创建一个Panel对象，并且设置它的布局管理器为GridLayout
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3,5,4,4));
        //往Panel中添加内容
        for (int i = 0; i < 10; i++) {
            p2.add(new Button(i+""));
        }
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));
        p2.add(new Button("."));
        //把当前的Panel添加到frame中
        frame.add(p2,BorderLayout.CENTER);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(500,200,400,250);
        //设置Frame可见
        frame.setVisible(true);
    }
}