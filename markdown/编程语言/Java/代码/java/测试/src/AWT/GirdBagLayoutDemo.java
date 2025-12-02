package AWT;

import java.awt.*;

public class GirdBagLayoutDemo {
    public static void main(String[] args) {
        //创建Frame对象
        Frame frame = new Frame("这是一个窗口容器Frame");
        //创建GridBagLayout对象
        GridBagLayout gbLayout = new GridBagLayout();
        //把Frame对象的布局管理器设置为GridBagLayout
        frame.setLayout(gbLayout);

        //创建GridBagConstraints对象
        GridBagConstraints gbCon = new GridBagConstraints();
        /*设置所有的GridBagConstraints对象的fill属性为GridBagConstraints.BOTH。
        当有空白区域时，组件自动扩大占满空白区域*/
        gbCon.fill = GridBagConstraints.BOTH;
        //设置GridBagConstraints对象的weightx设置为1，表示横向扩展比例为1
        gbCon.weightx = 1;
        //把GridBagConstraints的weighty设置为1，表示纵向扩展比例为1
        gbCon.weighty = 1;

        //创建容量为10的Button数组并初始化
        Button[] btns = new Button[10];
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new Button("按钮"+i);
        }

        //往frame中添加数组中的第0，1，2个Button
        addComponent(frame,btns[0],gbLayout,gbCon);
        addComponent(frame,btns[1],gbLayout,gbCon);
        addComponent(frame,btns[2],gbLayout,gbCon);
        //把GridBagConstraints的gridwidth设置为GridBagConstraints.REMAINDER，表明当前组件是横向最后一个组件
        gbCon.gridwidth = GridBagConstraints.REMAINDER;
        //把Button数组中第3个按钮添加到frame中
        addComponent(frame,btns[3],gbLayout,gbCon);

        //把Button数组中第4个按钮添加到frame中
        addComponent(frame,btns[4],gbLayout,gbCon);

        //把GridBagConstraints的gridheight和gridwidth设置为2，表示纵向和横向会占用2个网格
        gbCon.gridwidth = 2;
        gbCon.gridheight = 2;
        //把Button数组中第5个按钮添加到frame中
        addComponent(frame,btns[5],gbLayout,gbCon);

        //把GridBagConstraints的gridheight和gridwidth设置为1，表示纵向会占用1个网格
        gbCon.gridwidth = 1;
        gbCon.gridheight = 1;
        //把Button数组中第6个按钮添加到frame中
        addComponent(frame,btns[6],gbLayout,gbCon);

        //把GridBagConstraints的gridwidth设置为GridBagConstraints.REMAINDER，表明当前组件是横向最后一个组件
        gbCon.gridwidth = GridBagConstraints.REMAINDER;
        //把Button数组中第7个按钮添加到frame中
        addComponent(frame,btns[7],gbLayout,gbCon);

        //把GridBagConstraints的gridheight设置为1，表示纵向会占用1个网格
        gbCon.gridwidth = 1;
        gbCon.gridheight = 1;
        //把Button数组中第8，9个按钮添加到frame中
        addComponent(frame,btns[8],gbLayout,gbCon);
        addComponent(frame,btns[9],gbLayout,gbCon);

        //设置frame为最佳大小
        frame.pack();
        //设置Frame的位置和大小
        frame.setBounds(400,200,500,300);
        //设置frame可见
        frame.setVisible(true);

    }

    public static void addComponent(Container container, Component c, GridBagLayout gbLayout, GridBagConstraints gbCon) {
        gbLayout.setConstraints(c,gbCon);
        container.add(c);
    }
}