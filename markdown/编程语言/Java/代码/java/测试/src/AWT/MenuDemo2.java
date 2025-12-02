package AWT;

import java.awt.*;
import java.awt.event.*;

public class MenuDemo2 {
    Frame frame = new Frame("这是一个窗口容器Frame");

    //创建文本域
    TextArea ta = new TextArea("默认显示的文本\n",6,40);

    //创建Panel容器
    Panel p = new Panel();

    //创建PopupMenu
    PopupMenu popupMenu = new PopupMenu();
    //创建菜单项
    MenuItem comment = new MenuItem("注释");
    MenuItem cancelComment = new MenuItem("取消注释");
    MenuItem copy = new MenuItem("复制");
    MenuItem save = new MenuItem("保存");

    //组装视图
    public void init() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                ta.append("您点击了："+actionCommand+"\n");
            }
        };
        comment.addActionListener(listener);
        cancelComment.addActionListener(listener);
        copy.addActionListener(listener);
        save.addActionListener(listener);
        //组装PopupMenu
        popupMenu.add(comment);
        popupMenu.add(cancelComment);
        popupMenu.add(copy);
        popupMenu.add(save);
        p.add(popupMenu);
        //设置Panel的大小
        p.setPreferredSize(new Dimension(400,100));
        //给Panel注册鼠标事件，监听用户释放鼠标的动作，展示菜单
        p.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                boolean flag = e.isPopupTrigger();
                if(flag) {
                    //显示PopupMenu
                    popupMenu.show(p,e.getX(),e.getY());
                }
            }
        });

        //放置ta和p
        frame.add(ta,BorderLayout.CENTER);
        frame.add(p,BorderLayout.SOUTH);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemo2().init();
    }
}