package AWT;

import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个窗口容器Frame");

        //创建一个ScrollPane对象
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        sp.add(new TextField("这是测试文本"));
        sp.add(new Button("这是测试按钮"));
        //把ScrollPane添加到Frame中
        frame.add(sp);

        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }
}