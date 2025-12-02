package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuDemo1 {
    Frame frame = new Frame("这是一个窗口容器Frame");

    //创建菜单条
    MenuBar menuBar = new MenuBar();

    //创建菜单组件
    Menu fileMenu = new Menu("文件");
    Menu editMenu = new Menu("编辑");
    Menu formatMenu = new Menu("格式");

    //创建菜单项组件
    MenuItem auto = new MenuItem("自动换行");
    MenuItem copy = new MenuItem("复制");
    MenuItem paste = new MenuItem("粘贴");

    MenuItem comment = new MenuItem("注释",
            new MenuShortcut(KeyEvent.VK_Q,true)); //关联快捷键ctrl+shift+Q
    MenuItem cancelComment = new MenuItem("取消注释");

    //创建文本框
    TextArea ta = new TextArea(6,40);

    //组装视图
    public void init() {
        comment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("您点击了菜单项："+e.getActionCommand()+"\n");
            }
        });

        formatMenu.add(comment);
        formatMenu.add(cancelComment);

        //组装编辑菜单
        editMenu.add(auto);
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.add(formatMenu);

        //组装菜单条
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        //把菜单条和文本框放入frame中
        frame.setMenuBar(menuBar);
        frame.add(ta,BorderLayout.CENTER);

        //通过pack()方法设置最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置Frame可见
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemo1().init();
    }
}