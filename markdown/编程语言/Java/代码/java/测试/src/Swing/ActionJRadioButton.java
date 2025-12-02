package Swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ActionJRadioButton extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ActionJRadioButton() {
        // TODO Auto-generated constructor stub
        setTitle("文本输入框");
        setSize(800,100);
        JPanel panel=new JPanel();    //创建面板
        JLabel label1=new JLabel("今日翻牌子：");
        JRadioButton rb1=new JRadioButton("海棠");    //创建JRadioButton对象
        JRadioButton rb2=new JRadioButton("夏竹");    //创建JRadioButton对象
        JRadioButton rb3=new JRadioButton("秋香",true);    //创建JRadioButton对象
        JRadioButton rb4=new JRadioButton("冬梅");    //创建JRadioButton对象
        label1.setFont(new Font("华文行楷",Font.BOLD,26));    //修改字体样式
        ButtonGroup group=new ButtonGroup();
        //添加JRadioButton到ButtonGroup中
        group.add(rb1);
        group.add(rb2);
        panel.add(label1);
        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);
        panel.add(rb4);
        add(panel);
        setBackground(Color.pink);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ActionJRadioButton();
    }
}