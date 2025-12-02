package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个窗口容器Frame");

        //创建两个对话框Dialog对象，一个模式的，一个非模式的
        Dialog mDialog = new Dialog(frame,"模式对话框",true);
        Dialog dialog = new Dialog(frame,"非模式对话框",false);
        //通过setBounds()方法设置Dialog 的位置及大小
        mDialog.setBounds(200,100,500,300);
        dialog.setBounds(200,100,500,300);

        //创建两个按钮
        Button btn1 = new Button("打开模式对话框");
        Button btn2 = new Button("打开非模式对话框");
        //给这两个按钮添加点击后的行为
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mDialog.setVisible(true);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);
            }
        });
        //把按钮添加到frame中
        frame.add(btn1,BorderLayout.NORTH);
        frame.add(btn2,BorderLayout.CENTER);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }
}