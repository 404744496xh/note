package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个窗口容器Frame");

        //创建2个FileDialog对象
        FileDialog f1 = new FileDialog(frame,"123.jpg",FileDialog.LOAD);
        FileDialog f2 = new FileDialog(frame,"111.jpg",FileDialog.SAVE);

        //创建两个按钮
        Button b1 = new Button("打开文件");
        Button b2 = new Button("保存文件");
        //给这两个按钮设置点击后的行为：获取打开或者保存的路径文件名
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true); //代码会阻塞到这里
                //获取选择的路径及文件
                String directory = f1.getDirectory();
                String file = f1.getFile();
                System.out.println("打开的文件路径为："+directory);
                System.out.println("打开的文件名称为："+file);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f2.setVisible(true); //代码会阻塞到这里
                String directory = f2.getDirectory();
                String file = f2.getFile();
                System.out.println("保存的文件路径为："+directory);
                System.out.println("保存的文件名称为："+file);
            }
        });

        //把按钮添加到frame中
        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2,BorderLayout.CENTER);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }
}