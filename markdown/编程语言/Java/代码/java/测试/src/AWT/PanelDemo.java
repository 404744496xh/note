package AWT;

import java.awt.*;

public class PanelDemo {
    public static void main(String[] args) {
        //1、创建一个Window对象，因为Panel以及其它的容器，都不能独立存在，必须依附于Window存在
        Frame frame = new Frame("这是一个窗口容器Frame");
        //2、创建一个Panel对象
        Panel p = new Panel();
        //3、创建一个文本框和一个按钮，并且把它们放入Panel容器中
        p.add(new TextField("这是一个测试文本"));
        p.add(new Button("这是一个测试按钮"));
        //4、把Panel放入Window中
        frame.add(p);
        //5、设置Window的位置和大小
        frame.setBounds(400,200,500,300);
        //6、设置Window可见
        frame.setVisible(true);
    }
}