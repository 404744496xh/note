package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //创建组件
        TextField tf = new TextField(30);
        Choice names = new Choice();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        //给文本域添加TextListener，监听内容的变化
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                String text = tf.getText();
                System.out.println("当前文本框的内容为："+text);
            }
        });
        //给下拉选择框添加ItemListener，监听条目选项的变化
        names.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object item = e.getItem();
                System.out.println("当前选中的条目为："+item);
            }
        });
        //给frame注册ContainerListener监听器，监听容器中组件的添加
        frame.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                Component child = e.getChild();
                System.out.println("frame中添加了："+child);
            }

            @Override
            public void componentRemoved(ContainerEvent e) {

            }
        });

        //添加到frame中
        Box hBox = Box.createHorizontalBox();
        hBox.add(names);
        hBox.add(tf);
        frame.add(hBox);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }
}