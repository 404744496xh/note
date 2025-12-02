package Swing;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionJComboBox extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ActionJComboBox() {
        // TODO Auto-generated constructor stub
        setTitle("文本输入框");
        setSize(800,100);
        JPanel jp=new JPanel();    //创建面板
        JLabel label1=new JLabel("幸福模式：");    //创建标签
        JComboBox cmb=new JComboBox();    //创建JComboBox
        cmb.addItem("--请选择--");    //向下拉列表中添加一项
        cmb.addItem("长命百岁");
        cmb.addItem("幸福安康");
        cmb.addItem("颐养天年");
        jp.add(label1);
        jp.add(cmb);
        add(jp);
        setBackground(Color.pink);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ActionJComboBox();
    }
}