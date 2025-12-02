package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    Frame frame = new Frame("这是一个窗口容器Frame");

    TextField tf = new TextField(30); //30列的单行文本框
    Button ok = new Button("确定");

    //组装视图
    public void init() {
        MyListener myListener = new MyListener(); //创建自定义监听器对象
        ok.addActionListener(myListener); //注册监听

        //把tf和ok翻入frame中
        frame.add(tf,BorderLayout.NORTH);
        frame.add(ok);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }

    //自定义事件监听器
    private class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tf.setText("Hello World");
        }
    }
    public static void main(String[] args) {
        new EventDemo().init();
    }
}