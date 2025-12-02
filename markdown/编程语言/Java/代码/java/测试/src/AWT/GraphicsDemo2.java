package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicsDemo2 {
    //创建窗口对象
    private Frame frame = new Frame("这是一个窗口容器Frame");

    //设置桌面宽度和高度
    private final int TABLE_WIDTH = 300;
    private final int TABLE_HEIGHT = 400;

    //设置球拍的宽度和高度
    private final int RACKET_WIDTH = 60;
    private final int RACKET_HEIGHT = 20;
    //定义变量，记录球拍的坐标
    private int racketX = 120;
    private final int racketY = 340;

    //设置小球的大小
    private final int BALL_SIZE = 16;
    //定义变量，记录小球的坐标
    private int ballX = 120;
    private int ballY = 20;
    //定义变量，记录小球在x和y方向上分别移动的速度
    private int speedX = 5;
    private int speedY = 0;

    //定义变量，表示当前游戏是否已结束
    private boolean isOver = false;

    //声明一个定时器
    private Timer timer;

    //自定义一个类继承Canvas充当画布
    private class MyCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
            //在这里绘制内容
            if (isOver) {
                //游戏结束
                g.setColor(Color.BLUE);
                g.setFont(new Font("Times", Font.BOLD, 30));
                g.drawString("游戏结束！", 80, 200);
            } else {
                //游戏中
                //绘制小球
                g.setColor(Color.RED);
                g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
                //绘制球拍
                g.setColor(Color.PINK);
                g.fillRect(racketX, racketY, RACKET_WIDTH, RACKET_HEIGHT);
            }
        }
    }

    //创建绘画区域
    MyCanvas myCanvas = new MyCanvas();

    //组装视图以及游戏逻辑的控制
    public void init() {
        //完成球拍坐标的变化
        KeyListener listener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //获取当前按下的键
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    //<- 应该向左移动
                    if (racketX > 0) {
                        racketX -= 10;
                    }
                }
                if (keyCode == KeyEvent.VK_RIGHT) {
                    //-> 应该向右移动
                    if (racketX < TABLE_WIDTH - RACKET_WIDTH) {
                        racketX += 10;
                    }
                }
            }
        };
        MouseMotionListener mouseMotionListener = new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                //获取当前鼠标位置
                int mouseX = e.getX();
                if (mouseX < (RACKET_WIDTH / 2)) {
                    //设置球拍的位置
                    racketX = 0;
                } else if (mouseX > (TABLE_WIDTH - RACKET_WIDTH / 2)) {
                    racketX = TABLE_WIDTH - RACKET_WIDTH;
                } else {
                    racketX = mouseX - (RACKET_WIDTH / 2);
                }
            }
        };

        //给frame和myCanvas注册监听器
        frame.addKeyListener(listener);
        myCanvas.addKeyListener(listener);
        myCanvas.addMouseMotionListener(mouseMotionListener);
        frame.addMouseMotionListener(mouseMotionListener);

        //完成小球坐标的变化
        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //更新小球的坐标
                speedY += 1;
                ballX += speedX;
                ballY += speedY;
                //根据边界范围，修正速度
                if (ballX <= 0 || ballX >= (TABLE_WIDTH - BALL_SIZE)) {
                    speedX = -speedX; //反向运动
                }
                if (ballY <= 0 || (ballY > (racketY - BALL_SIZE) &&
                        ballX >= (racketX - BALL_SIZE) && (ballX <= racketX + RACKET_WIDTH))) {
                    speedY = -speedY;
                }
                if (ballY > (racketY - BALL_SIZE) &&
                        (ballX < (racketX - BALL_SIZE) || ballX > (racketX + RACKET_WIDTH))) {
                    //当小球超出了球拍的范围，游戏结束
                    //停止定时器
                    timer.stop();
                    //修改游戏是否结束的标记
                    isOver = true;
                }
                //重绘界面
                myCanvas.repaint();
            }
        };
        timer = new Timer(30, task);
        timer.start();

        //
        myCanvas.setPreferredSize(new Dimension(TABLE_WIDTH, TABLE_HEIGHT));
        frame.add(myCanvas);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame可见
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GraphicsDemo2().init();
    }
}