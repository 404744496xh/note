package Swing;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionJFrame extends JFrame{

    /**
     * 序列化id
     */
    private static final long serialVersionUID = 1L;

    public ActionJFrame() {
        //设置显示窗口标题
        setTitle("大标题，就是左上角显示的标题");
        //设置窗口显示尺寸
        setSize(666,200);
        //设置窗口是否可以关闭
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建一个标签
        JLabel lable=new JLabel("lable就是一个文本");
        //获取本窗口的内容窗格
        Container c=getContentPane();
        //将lable标签组件添加到内容窗格上
        c.add(lable);
        //设置本窗口是否可见
        setVisible(true);
    }

    public static void main(String[] args) {
        new ActionJFrame();
    }
}