package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsDemo1 {
    private final String RECT_SHAPE = "rect";
    private final String OVAL_SHAPE = "oval";
    private Frame frame = new Frame("这是一个窗口容器Frame");

    Button btnRect = new Button("绘制矩形");
    Button btnOval = new Button("绘制椭圆");

    //创建Panel，承载按钮
    Panel p = new Panel();

    //定义一个变量，记录当前要绘制椭圆还是矩形
    private String shape = "";

    //自定义类，继承Canvas类，重写paint(Graphics g)方法完成画图
    private class MyCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
            //绘制不同的图形
            if(shape.equals(RECT_SHAPE)) {
                //绘制矩形
                g.setColor(Color.BLACK); //设置当前画笔的颜色为黑色
                g.drawRect(50,100,100,50);
            }else if(shape.equals(OVAL_SHAPE)) {
                //绘制椭圆
                g.setColor(Color.RED); //设置当前画笔的颜色为红色
                g.drawOval(100,50,50,100);
            }
        }
    }
    //自定义画布对象
    MyCanvas drawArea = new MyCanvas();

    //组装视图
    public void init() {
        btnRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shape = RECT_SHAPE; //修改标记的值为rect
                drawArea.repaint();
            }
        });
        btnOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shape = OVAL_SHAPE; //修改标记的值为rect
                drawArea.repaint();
            }
        });
        //设置drawArea的大小
        drawArea.setPreferredSize(new Dimension(300,200));
        frame.add(drawArea);

        p.add(btnRect);
        p.add(btnOval);
        frame.add(p,BorderLayout.SOUTH);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GraphicsDemo1().init();
    }
}