[TOC]

## 1、swing窗口和面板容器

### 窗口：(JFrame)

这里是类继承【JFrame】，然后完成基本设置，一定要显示true，不然看不见。

|                   方法名称                  |                概述                |
| :-------------------------------------: | :------------------------------: |
|             getContentPane()            |       返回此窗体的 contentPane 对象      |
|        getDefaultCloseOperation()       |       返回用户在此窗体上单击关闭按钮时执行的操作      |
|  setContentPane(Container contentPane)  |         设置 contentPane 属性        |
| setDefaultCloseOperation(int operation) |      设置用户在此窗体上单击关闭按钮时默认执行的操作     |
| setDefaultLookAndFeelDecorated (boolean |                                  |
|       defaultLookAndFeelDecorated)      | 设置 JFrame 窗口使用的 Windows 外观（如边框、关 |
|              闭窗口的 小部件、标题等）              |                                  |
|        setIconImage(Image image)        |          设置要作为此窗口图标显不的图像         |
|      setJMenuBar( JMenuBar menubar)     |             设置此窗体的菜单栏            |
|     setLayout(LayoutManager manager)    |        设置 LayoutManager 属性       |

    package Swing;

    import java.awt.Container;

    import javax.swing.JFrame;
    import javax.swing.JLabel;

    public class Action extends JFrame{

        /**
         * 序列化id
         */
        private static final long serialVersionUID = 1L;

        public Action() {
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
            new Action();
        }
    }

### **面板：**(JPanel)

是一种中间层容器，它能容纳组件并将组件组合在一起，但它本身必须添加到其他容器中使用。

|             方法名及返回值类型             |        说明       |
| :-------------------------------: | :-------------: |
|   Component add(Component comp)   | 将指定的组件追加到此容器的尾部 |
|    void remove(Component comp)    |   从容器中移除指定的组件   |
|        void setFont(Font f)       |     设置容器的字体     |
| void setLayout(LayoutManager mgr) |    设置容器的布局管理器   |
|    void setBackground(Color c)    |     设置组件的背景色    |

```java
package Swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionJPanel extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ActionJPanel() {
        // TODO Auto-generated constructor stub
        setTitle("面板测试");
        //设置窗口位置和大小·前面俩是x y轴,后面俩是长高
        setBounds(600, 300, 1200, 200);
        //创建一个面板对象
        JPanel jp=new JPanel();
        //创建一个文本标签
        JLabel jl=new JLabel("祝愿程序员都会开心幸福安康。");
        jl.setFont(new Font("黑体",Font.BOLD,66));
        /**
         *1、边框布局（BorderLayout）
         *2、流式布局（FlowLayout）
         *3、网格布局（GridLayout）
         *4、盒子布局（BoxLaYout）
         *5、空布局（null）
         */
        jl.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp.setBackground(Color.pink);//设置背景色·喜欢粉色
        jp.add(jl);//将标签添加到面板
        add(jp);//将面板添加到窗口
        setVisible(true);//设置窗口可见
        setDefaultCloseOperation(EXIT_ON_CLOSE);//别忘关闭窗口
    }
    public static void main(String[] args) {
        new ActionJPanel();
    }
}
```

## 2、swing布局管理setLayout

    	/**
    	 *1、边框布局（BorderLayout）
    	 *2、流式布局（FlowLayout）
    	 *3、网格布局（GridLayout）
    	 *4、盒子布局（BoxLaYout）
    	 *5、空布局（null）
    	 */

### 边框布局BorderLayout

也就是需要自己定制位置：

    package Swing;

    import java.awt.BorderLayout;

    import javax.swing.JButton;
    import javax.swing.JFrame;

    public class ActionBorderLayout extends JFrame{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public ActionBorderLayout() {
            // TODO Auto-generated constructor stub
            setSize(400,200);
            //为Frame窗口设置布局为边框布局:BorderLayout
            setLayout(new BorderLayout());
            JButton button1=new JButton ("上·一般写标题或菜单");
            JButton button2=new JButton("左·写菜单的比较多，但不一定用");
            JButton button3=new JButton("中·表格信息");
            JButton button4=new JButton("右·很少用到");
            JButton button5=new JButton("下·备案号啥的");
            //上n下s左w右e中center
            add(button1,BorderLayout.NORTH);
            add(button2,BorderLayout.WEST);
            add(button3,BorderLayout.CENTER);
            add(button4,BorderLayout.EAST);
            add(button5,BorderLayout.SOUTH);
            setBounds(300,200,600,300);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
            new ActionBorderLayout();
        }
    }

### 流式布局管理器FlowLayout

自己从上到下从左到右排序：

    package Swing;

    import java.awt.Color;
    import java.awt.FlowLayout;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;

    public class ActionFlowLayout extends JFrame{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public ActionFlowLayout() {
            // TODO Auto-generated constructor stub
            setTitle("流式布局");
            setSize(400,200);
            JPanel jPanel=new JPanel();//创建面板
            JButton btn1=new JButton("1");//创建按钮
            JButton btn2=new JButton("2");
            JButton btn3=new JButton("3");
            JButton btn4=new JButton("4");
            JButton btn5=new JButton("5");
            JButton btn6=new JButton("6");
            JButton btn7=new JButton("7");
            //按钮背景色
            btn7.setBackground(Color.BLUE);
            //按钮文字颜色
            btn7.setForeground(Color.WHITE);
            JButton btn8=new JButton("8");
            JButton btn9=new JButton("9");
            jPanel.add(btn1);//面板中添加按钮
            jPanel.add(btn2);
            jPanel.add(btn3);
            jPanel.add(btn4);
            jPanel.add(btn5);
            jPanel.add(btn6);
            jPanel.add(btn7);
            jPanel.add(btn8);
            jPanel.add(btn9);
            //向JPanel添加FlowLayout布局管理器，将组件间的横向和纵向间隙都设置为20像素
            jPanel.setLayout(new FlowLayout(FlowLayout.LEADING,20,20));
            jPanel.setBackground(Color.pink);    //设置背景色
            add(jPanel);    //添加面板到容器
            setBounds(300,200,300,150);    //设置容器的大小
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
            new ActionFlowLayout();
        }
    }

### 卡片布局CardLayout

这个能用于切换，毕竟【cards.add(p1,"card1");】可以通过判断来处理：

    package Swing;

    import java.awt.CardLayout;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JTextField;

    public class ActionCardLayout extends JFrame{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public ActionCardLayout() {
            // TODO Auto-generated constructor stub
            setTitle("卡牌布局");
            setSize(400,200);
            JPanel p1=new JPanel();    //面板1
            JPanel p2=new JPanel();    //面板2
            JPanel cards=new JPanel(new CardLayout());    //卡片式布局的面板
            p1.add(new JButton("登录按钮"));
            p1.add(new JButton("注册按钮"));
            p1.add(new JButton("找回密码按钮"));
            p2.add(new JTextField("用户名文本框",20));
            p2.add(new JTextField("密码文本框",20));
            p2.add(new JTextField("验证码文本框",20));
            cards.add(p1,"card1");    //向卡片式布局面板中添加面板1
            cards.add(p2,"card2");    //向卡片式布局面板中添加面板2
            CardLayout cl=(CardLayout)(cards.getLayout());
            cl.show(cards,"card1");    //调用show()方法显示面板1
            //cl.show(cards,"card2");    //调用show()方法显示面板2
            add(cards);
            setBounds(300,200,400,200);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
            new ActionCardLayout();
        }
    }

### 网格布局GridLayout

也就是【CSS的栅格化】布局类似

    package Swing;

    import java.awt.Font;
    import java.awt.GridLayout;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;

    public class ActionGridLayout extends JFrame{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public ActionGridLayout() {
            // TODO Auto-generated constructor stub
            setTitle("网格布局");
            setSize(400,200);
            JPanel panel=new JPanel();//创建面板
            //指定面板的布局为GridLayout，4行4列，间隙为10
            panel.setLayout(new GridLayout(4,4,10,10));
            Font font = new Font("黑体",Font.BOLD,50);
            panel.add(new JButton("7"));//添加按钮
            panel.add(new JButton("8"));
            panel.add(new JButton("9"));
            panel.add(new JButton("/"));
            panel.add(new JButton("4"));
            panel.add(new JButton("5"));
            panel.add(new JButton("6"));
            panel.add(new JButton("*"));
            panel.add(new JButton("1"));
            panel.add(new JButton("2"));
            panel.add(new JButton("3"));
            panel.add(new JButton("-"));
            panel.add(new JButton("0"));
            panel.add(new JButton("."));
            JButton butResult = new JButton("=");
            butResult.setFont(font);
            panel.add(butResult);
            panel.add(new JButton("+"));
            add(panel);    //添加面板到容器
            setBounds(300,200,666,300);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
            new ActionGridLayout();
        }
    }

## 3、swing标签JLabel

&#x9;

|                       方法名称                       |                 说明                |
| :----------------------------------------------: | :-------------------------------: |
|             void setText(Stxing text)            |        定义 JLabel 将要显示的单行文本        |
|             void setIcon(Icon image)             |         定义 JLabel 将要显示的图标         |
|       void setIconTextGap(int iconTextGap)       | 如果 JLabel 同时显示图标和文本，则此属性定义它们之间的间隔 |
| void setHorizontalTextPosition(int textPosition) |      设置 JLabel 的文本相对其图像的水平位置      |
|    void setHorizontalAlignment(int alignment)    |          设置标签内容沿 X 轴的对齐方式         |
|                   int getText()                  |        返回 JLabel 所显示的文本字符串        |
|              Component getLabelFor()             |         获得将 JLabel 添加到的组件         |
|               int getIconTextGap()               |        返回此标签中显示的文本和图标之间的间隔量       |
|          int getHorizontalTextPosition()         |      返回 JLabel 的文本相对其图像的水平位置      |
|           int getHorizontalAlignment()           |        返回 JLabel 沿 X 轴的对齐方式       |

    package Swing;

    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;

    public class ActionJLabel extends JFrame{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public ActionJLabel() {
            // TODO Auto-generated constructor stub
            setTitle("测试");
            setSize(400,200);
            JPanel jp=new JPanel();    //创建面板
            JLabel label1=new JLabel("1、普通标签");    //创建标签
            JLabel label2=new JLabel();
            label2.setText("2、调用setText()方法");
            //创建既含有文本又含有图标的JLabel对象
            jp.add(label1);//添加标签到面板
            jp.add(label2);
            add(jp);
            setBounds(300,200,400,100);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
            new ActionJLabel();
        }
    }

## 4、swing按钮

|                       方法名称                       |              说明              |
| :----------------------------------------------: | :--------------------------: |
|    addActionListener(ActionListener listener)    |   为按担组件注册 ActionListener 监听  |
|              void setIcon(Icon icon)             |           设置按钮的默认图标          |
|             void setText(String text)            |            设置按鈕的文本           |
|             void setMargin(Insets m)             |        设置按钮边框和标签之间的空白        |
|          void setMnemonic(int nmemonic)          | 设置按钮的键盘快捷键，所设置的快捷键在实际操作时需要结合 |
|                     Alt 键进行实现                    |                              |
|          void setPressedIcon(Icon icon)          |          设置按下按钮时的图标          |
|          void setSelectedIcon(Icon icon)         |          设置选择按鈕时的图标          |
|          void setRolloveiicon(Icon icon)         |        设置鼠标移动到按扭区域时的图标       |
|          void setDisabledIcon(Icon icon)         |         设置按钮无效状态下的图标         |
|        void setVerticalAlignment(int alig)       |        设置图标和文本的垂直对齐方式        |
|       void setHorizontalAlignment(int alig)      |        设置图标和文本的水平对齐方式        |
|           void setEnable(boolean flag)           |            启用或禁用按扭           |
|  void setVerticalTextPosition(int textPosition)  |        设置文本相对于图标的垂直位置        |
| void setHorizontalTextPosition(int textPosition) |        设置文本相对于图标的水平位置        |

    package Swing;

    import java.awt.Color;
    import java.awt.Dimension;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.SwingConstants;

    public class ActionJButton extends JFrame{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public ActionJButton() {
            // TODO Auto-generated constructor stub
            setTitle("按鈕");
            setSize(400,200);
            JPanel jp=new JPanel();    //创建JPanel对象
            JButton btn1=new JButton("我是普通按钮");    //创建JButton对象
            JButton btn2=new JButton("我是带背景颜色按钮");
            JButton btn3=new JButton("我是不可用按钮");
            JButton btn4=new JButton("我是底部对齐按钮");
            jp.add(btn1);
            btn2.setBackground(Color.YELLOW);    //设置按钮背景色
            jp.add(btn2);
            btn3.setEnabled(false);    //设置按钮不可用
            jp.add(btn3);
            Dimension preferredSize=new Dimension(160, 60);    //设置尺寸
            btn4.setPreferredSize(preferredSize);    //设置按钮大小
            btn4.setVerticalAlignment(SwingConstants.BOTTOM);    //设置按钮垂直对齐方式
            jp.add(btn4);
            add(jp);
            setBounds(300, 200, 600, 300);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
            new ActionJButton();
        }
    }

## 5、swing的表单操作（文本框、文本域、单选、复选、下拉）

### 文本框JTextField：

|                    方法名称                    |          说明         |
| :----------------------------------------: | :-----------------: |
|        Dimension getPreferredSize()        |      获得文本框的首选大小     |
|    void scrollRectToVisible(Rectangle r)   |    向左或向右滚动文本框中的内容   |
|        void setColumns(int columns)        |   设置文本框最多可显示内容的列数   |
|            void setFont(Font f)            |       设置文本框的字体      |
|   void setScrollOffset(int scrollOffset)   | 设置文本框的滚动偏移量（以像素为单位） |
| void setHorizontalAlignment(int alignment) |    设置文本框内容的水平对齐方式   |

    package Swing;

    import java.awt.Font;

    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JTextField;

    public class ActionJTextField extends JFrame{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public ActionJTextField() {
            // TODO Auto-generated constructor stub
            setTitle("文本输入框");
            setSize(600,300);
            JPanel jp=new JPanel();    //创建面板
            JTextField txtfield1=new JTextField();    //创建文本框
            txtfield1.setText("普通文本框");    //设置文本框的内容
            JTextField txtfield2=new JTextField(28);
            txtfield2.setFont(new Font("楷体",Font.BOLD,16));    //修改字体样式
            txtfield2.setText("指定长度和字体的文本框");
            JTextField txtfield3=new JTextField(30);
            txtfield3.setText("居中对齐");
            txtfield3.setHorizontalAlignment(JTextField.CENTER);    //居中对齐
            jp.add(txtfield1);
            jp.add(txtfield2);
            jp.add(txtfield3);
            add(jp);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
            new ActionJTextField();
        }
    }

### 文本域JTextArea：

|                       方法名称                      |                      说明                     |
| :---------------------------------------------: | :-----------------------------------------: |
|             void append(String str)             |             将字符串 str 添加到文本域的最后位置            |
|           void setColumns(int columns)          |                   设置文本域的列数                  |
|              void setRows(int rows)             |                   设置文本域的行数                  |
|                 int getColumns()                |                   获取文本域的列数                  |
|          void setLineWrap(boolean wrap)         |                  设置文本域的换行策略                 |
|                  int getRows()                  |                   获取文本域的行数                  |
|       void insert(String str,int position)      |              插入指定的字符串到文本域的指定位置              |
| void replaceRange(String str,int start,int end) | 将指定的开始位 start 与结束位 end 之间的字符串用指定的字符串 str 取代 |

    package Swing;

    import java.awt.Color;
    import java.awt.Dimension;
    import java.awt.Font;

    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JScrollPane;
    import javax.swing.JTextArea;

    public class ActionJTextArea extends JFrame{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public ActionJTextArea() {
            // TODO Auto-generated constructor stub
            setTitle("文本输入框");
            setSize(600,300);
            JPanel jp=new JPanel();    //创建一个JPanel对象
            JTextArea jta=new JTextArea("请输入内容",7,30);
            jta.setLineWrap(true);    //设置文本域中的文本为自动换行
            jta.setForeground(Color.BLACK);    //设置组件的背景色
            jta.setFont(new Font("楷体",Font.BOLD,16));    //修改字体样式
            jta.setBackground(Color.YELLOW);    //设置按钮背景色
            JScrollPane jsp=new JScrollPane(jta);    //将文本域放入滚动窗口
            Dimension size=jta.getPreferredSize();    //获得文本域的首选大小
            jsp.setBounds(110,90,size.width,size.height);
            jp.add(jsp);    //将JScrollPane添加到JPanel容器中
            add(jp);    //将JPanel容器添加到JFrame容器中
            setBackground(Color.pink);
            setSize(400,200);    //设置JFrame容器的大小
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
            new ActionJTextArea();
        }
    }

### 单选框JRadioButton：

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

### 复选框JCheckBox：

    package Swing;

    import java.awt.Color;
    import java.awt.Font;

    import javax.swing.JCheckBox;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;

    public class ActionJCheckBox extends JFrame{
        /**
         *
         */
        private static final long serialVersionUID = 1L;

        public ActionJCheckBox() {
            // TODO Auto-generated constructor stub
            setTitle("文本输入框");
            setSize(800,100);
            JPanel jp=new JPanel();    //创建面板
            JLabel label=new JLabel("嵩山秘术·初子决：");
            label.setFont(new Font("华文行楷",Font.BOLD,26));    //修改字体样式
            JCheckBox chkbox1=new JCheckBox("拙石", true);    //创建指定文本和状态的复选框
            JCheckBox chkbox2=new JCheckBox("璞玉");    //创建指定文本的复选框
            JCheckBox chkbox3=new JCheckBox("破梦", true);
            JCheckBox chkbox4=new JCheckBox("灭神");
            JCheckBox chkbox5=new JCheckBox("诸佛", true);
            JCheckBox chkbox6=new JCheckBox("戳魔");
            jp.add(label);
            jp.add(chkbox1);
            jp.add(chkbox2);
            jp.add(chkbox3);
            jp.add(chkbox4);
            jp.add(chkbox5);
            jp.add(chkbox6);
            add(jp);
            setBackground(Color.pink);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        public static void main(String[] args) {
            new ActionJCheckBox();
        }
    }

### 下拉JComboBox：

|                     方法名称                     |          说明         |
| :------------------------------------------: | :-----------------: |
|         void addItem(Object anObject)        | 将指定的对象作为选项添加到下拉列表框中 |
| void insertItemAt(Object anObject,int index) |   在下拉列表框中的指定索引处插入项  |
|       void removeltem(0bject anObject)       |   在下拉列表框中删除指定的对象项   |
|        void removeItemAt(int anlndex)        |  在下拉列表框中删除指定位置的对象项  |
|             void removeAllItems()            |     从下拉列表框中删除所有项    |
|              int getItemCount()              |     返回下拉列表框中的项数     |
|          Object getItemAt(int index)         | 获取指定索引的列表项，索引从 0 开始 |
|            int getSelectedIndex()            |      获取当前选择的索引      |
|           Object getSelectedltem()           |       获取当前选择的项      |

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

## 6、swing列表框JList

```
package Swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class ActionJList extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ActionJList() {
        // TODO Auto-generated constructor stub
        setTitle("文本输入框");
        setBounds(500,100,500,200);    //设置窗体位置和大小
        JPanel contentPane=new JPanel();    //创建内容面板
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));    //设置面板的边框
        contentPane.setLayout(new BorderLayout(0, 0));    //设置内容面板为边界布局
        setContentPane(contentPane);    //应用内容面板
        JScrollPane scrollPane=new JScrollPane();    //创建滚动面板
        contentPane.add(scrollPane,BorderLayout.CENTER);    //将面板增加到边界布局中央
        JList list=new JList();
        //限制只能选择一个元素
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);    //在滚动面板中显示列表
        String[] listData=new String[12];    //创建一个含有12个元素的数组
        for (int i=0;i<listData.length;i++)
        {
            listData[i]="这是列表框的第"+(i+1)+"个元素~";    //为数组中各个元素赋值
        }
        list.setListData(listData);    //为列表填充数据
        setBackground(Color.pink);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ActionJList();
    }
}

```

## 7、swing事件监听Event

![](https://img-blog.csdnimg.cn/img_convert/11d1a51cae226451afba12d13feaec7c.gif)

    package Swing;

    import java.awt.BorderLayout;
    import java.awt.Font;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JList;
    import javax.swing.JPanel;
    import javax.swing.border.EmptyBorder;

    public class Ewvendemo extends JFrame{
        JList list;
        JLabel label;
        JButton button1;
        int clicks=0;
        public Ewvendemo()
        {
            setTitle("动作事件监听器示例");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(500,300,400,200);
            JPanel contentPane=new JPanel();
            contentPane.setBorder(new EmptyBorder(5,5,5,5));
            contentPane.setLayout(new BorderLayout(0,0));
            setContentPane(contentPane);
            label=new JLabel("还未点击过");
            label.setFont(new Font("楷体",Font.BOLD,16));    //修改字体样式
            contentPane.add(label, BorderLayout.SOUTH);
            button1=new JButton("我是普通按钮");    //创建JButton对象
            button1.setFont(new Font("黑体",Font.BOLD,16));    //修改字体样式
            button1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    label.setText("按钮被单击了 "+(clicks++)+" 次");
                }
            });
            new Thread(new Runnable() {

                @Override
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                        label.setText("自动点击了1次，当前 "+(clicks++)+" 次");
                    }
                }
            }).start();
            contentPane.add(button1);
            setVisible(true);
        }
        public static void main(String[] args)
        {
            new Ewvendemo();
        }
    }

## 8.wing菜单JMenu

|              方法名称              |                  说明                 |
| :----------------------------: | :---------------------------------: |
|          add(Action a)         | 创建连接到指定 Action 对象的新菜单项，并将其追加到此菜单的末尾 |
|        add(Component c)        |            将某个组件追加到此菜单的末尾           |
|   add(Component c,int index)   |           将指定组件添加到此容器的给定位置          |
|     add(JMenuItem menultem)    |           将某个菜单项追加到此菜单的末尾           |
|          add(String s)         |      创建具有指定文本的新菜单项，并将其追加到此菜单的末尾     |
|         addSeparator()         |            将新分隔符追加到菜单的末尾            |
|     doCliclc(int pressTime)    |             以编程方式执行单击操作             |
|           getDelay()           |      返回子菜单向上或向下弹出前建议的延迟（以毫秒为单位）     |
|        getltem(int pos)        |          返回指定位置的 JMenuItem          |
|         getItemCount()         |            返回菜单上的项数，包括分隔符           |
|     getMenuComponent(int n)    |             返回位于位置 n 的组件            |
|       getMenuComponents()      |        返回菜单子组件的 Component 数组        |
|        getSubElements()        | 返回由 MenuElement 组成的数组，其中包含此菜单组件的子菜单 |
|  insert(JMenuItem mi,int pos)  |         在给定位置插入指定的 JMenuitem        |
|      insert(String s,pos)      |          在给定位置插入具有指定文本的新菜单项         |
|   insertSeparator(int index)   |             在指定的位置插入分隔符             |
|  isMenuComponent(Component c)  |     如果在子菜单层次结构中存在指定的组件，则返回 true     |
|      isPopupMenuVisible()      |         如果菜单的弹出窗口可见，则返回 rue         |
|          isSelected()          |    如果菜单是当前选择的（即高亮显示的）菜单，则返回 true    |
|        isTopLevelMenu()        |    如果菜单是顶层菜单（即菜单栏的直接子级），则返回 true    |
|         setDelay(int d)        |    设置菜单的 PopupMenu 向上或向下弹出前建议的延迟    |
|  setMenuLocation(int x,int y)  |              设置弹出组件的位置              |
| setPopupMenuVisible(boolean b) |              设置菜单弹出的可见性             |
|     setSelected(boolean b)     |              设置菜单的选择状态              |

    package Swing;

    import java.awt.event.ActionEvent;
    import java.awt.event.KeyEvent;

    import javax.swing.JCheckBoxMenuItem;
    import javax.swing.JFrame;
    import javax.swing.JMenu;
    import javax.swing.JMenuBar;
    import javax.swing.JMenuItem;
    import javax.swing.KeyStroke;

    public class JMenudemo extends JMenuBar{

        private static final long serialVersionUID = 1L;
        public JMenudemo()
        {
            add(createFileMenu());    //添加文件菜单
            add(createEditMenu());    //添加编辑菜单
            setVisible(true);

        }
        public static void main(String[] agrs)
        {
            JFrame frame=new JFrame("菜单栏");
            frame.setSize(300,200);
            frame.setJMenuBar(new JMenudemo());
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        //定义文件菜单
        private JMenu createFileMenu()
        {
            JMenu menu=new JMenu("文件(F)");
            menu.setMnemonic(KeyEvent.VK_F);    //设置快速访问符
            JMenuItem item=new JMenuItem("新建(N)",KeyEvent.VK_N);
            item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
            menu.add(item);
            item=new JMenuItem("打开(O)",KeyEvent.VK_O);
            item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
            menu.add(item);
            item=new JMenuItem("保存(S)",KeyEvent.VK_S);
            item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
            menu.add(item);
            menu.addSeparator();
            item=new JMenuItem("退出(E)",KeyEvent.VK_E);
            item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
            menu.add(item);
            return menu;
        }
        //定义“编辑”菜单
        private JMenu createEditMenu()
        {
            JMenu menu=new JMenu("编辑(E)");
            menu.setMnemonic(KeyEvent.VK_E);
            JMenuItem item=new JMenuItem("撤销(U)",KeyEvent.VK_U);
            item.setEnabled(false);
            menu.add(item);
            menu.addSeparator();
            item=new JMenuItem("剪贴(T)",KeyEvent.VK_T);
            menu.add(item);
            item=new JMenuItem("复制(C)",KeyEvent.VK_C);
            menu.add(item);
            menu.addSeparator();
            JCheckBoxMenuItem cbMenuItem=new JCheckBoxMenuItem("自动换行");
            menu.add(cbMenuItem);
            return menu;
        }
    }

## 9.swing工具栏JToolBar

|                  构造方法                 |                 说明                |
| :-----------------------------------: | :-------------------------------: |
|               JToolBar()              |     创建新的工具栏，默认的方向为 HORIZONTAL     |
|       JToolBar(int orientation)       |      创建具有指定 orientation 的新工具栏     |
|         JToolBar(String name)         |        创建一个具有指定 name 的新工具栏        |
| JToolBar(String name,int orientation) | 创建一个具有指定 name 和 orientation 的新工具栏 |

|              方法名称              |                    说明                   |
| :----------------------------: | :-------------------------------------: |
|          add(Action a)         |           添加一个指派动作的新的 JButton           |
|         addSeparator()         |            将默认大小的分隔符添加到工具栏的末尾           |
|  addSeparator(Dimension size)  |            将指定大小的分隔符添加到工具栏的末尾           |
|   getComponentAtIndex(int i)   |               返回指定索引位置的组件               |
| getComponentIndex(Component c) |                返回指定组件的索引                |
|           getMargin()          |            返回工具栏边框和它的按钮之间的空白            |
|        getOrientation()        |                返回工具栏的当前方向               |
|          isFloatable()         |             获取 floatable 属性             |
|          isRollover()          |              返回 rollover 状态             |
|   setBorderPainted(boolean b)  | 设置 borderPainted 属性，如果需要绘制边框，则此属性为 true |
|     setFloatable(boolean b)    |  设置 floatable 属性，如果要移动工具栏，此属性必须设置为 true |
|  setLayout(LayoutManager mgr)  |               设置此容器的布局管理器               |
|       setMargin(Insets m)      |            设置工具栏边框和它的按钮之间的空白            |
|      setOrientation(int o)     |                 设置工具栏的方向                |
|  setRollover(boolean rollover) |           设置此工具栏的 rollover 状态           |

    package Swing;

    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.net.URL;
    import javax.swing.ImageIcon;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JToolBar;
    public class ToolBarDemo extends JPanel implements ActionListener
    {
        protected JTextArea textArea;
        protected String newline="\n";
        static final private String OPEN="OPEN";
        static final private String SAVE="SAVE";
        static final private String NEW="NEW";
        //事件监听器部分的代码省略，请查阅源文件
        protected void displayResult(String actionDescription)
        {
            textArea.append(actionDescription+newline);
        }
        public static void main(String[] args)
        {
            JFrame.setDefaultLookAndFeelDecorated(true);
            //定义窗体
            JFrame frame=new JFrame("工具栏");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //定义面板
            ToolBarDemo newContentPane=new ToolBarDemo();
            newContentPane.setOpaque(true);
            frame.setContentPane(newContentPane);
            //显示窗体
            frame.pack();
            frame.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e)
        {
            // TODO 自动生成的方法存根
        }
        public ToolBarDemo()
        {
            super(new BorderLayout());
            //创建工具栏
            JToolBar toolBar=new JToolBar();
            addButtons(toolBar);
            //创建一个文本域，用来输出一些信息
            textArea=new JTextArea(15, 30);
            textArea.setEditable(false);
            JScrollPane scrollPane=new JScrollPane(textArea);
            //把组件添加到面板中
            setPreferredSize(new Dimension(450, 110));
            add(toolBar,BorderLayout.PAGE_START);
            add(scrollPane,BorderLayout.CENTER);
        }
        protected void addButtons(JToolBar toolBar)
        {
            JButton button=null;
            button=makeNavigationButton("test",NEW,"新建一个文件","新建");
            toolBar.add(button);
            button=makeNavigationButton("test",OPEN,"打开一个文件","打开");
            toolBar.add(button);
            button=makeNavigationButton("test",SAVE,"保存当前文件","保存");
            toolBar.add(button);
        }
        protected JButton makeNavigationButton(String imageName,String actionCommand,String toolTipText,String altText)
        {
            //搜索图片
            String imgLocation=imageName+".jpg";
            URL imageURL=ToolBarDemo.class.getResource(imgLocation);
            //初始化工具按钮
            JButton button=new JButton();
            //设置按钮的命令
            button.setActionCommand(actionCommand);
            //设置提示信息
            button.setToolTipText(toolTipText);
            button.addActionListener(this);
            if(imageURL!=null)
            {
                //找到图像
                button.setIcon(new ImageIcon(imageURL));
            }
            else
            {
                //没有图像
                button.setText(altText);
                System.err.println("Resource not found: "+imgLocation);
            }
            return button;
        }
    }

## 10、swing文件选择器JFileChooser

    package Swing;

    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.JButton;
    import javax.swing.JFileChooser;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
    import javax.swing.JTextField;
    public class JFileChooserDemo
    {
        private JLabel label=new JLabel("所选文件路径：");
        private JTextField jtf=new JTextField(25);
        private JButton button=new JButton("浏览");
        public JFileChooserDemo()
        {
            JFrame jf=new JFrame("文件选择器");
            JPanel panel=new JPanel();
            panel.add(label);
            panel.add(jtf);
            panel.add(button);
            jf.add(panel);
            jf.pack();    //自动调整大小
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            button.addActionListener(new MyActionListener());    //监听按钮事件
        }
        //Action事件处理
        class MyActionListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                JFileChooser fc=new JFileChooser("F:\\");
                int val=fc.showOpenDialog(null);    //文件打开对话框
                if(val==fc.APPROVE_OPTION)
                {
                    //正常选择文件
                    jtf.setText(fc.getSelectedFile().toString());
                }
                else
                {
                    //未正常选择文件，如选择取消按钮
                    jtf.setText("未选择文件");
                }
            }
        }
        public static void main(String[] args)
        {
            new JFileChooserDemo();
        }
    }

## 11、swing对话框JOptionPane

    package Swing;

    import javax.swing.JOptionPane;

    public class JOptionPanedemo {
        public JOptionPanedemo() {
            // TODO Auto-generated constructor stub

            JOptionPane.showMessageDialog(null,"用户名或密码错误！","错误 ",0);
            JOptionPane.showMessageDialog(null,"请注册或登录...","提示",1);
            JOptionPane.showMessageDialog(null,"普通会员无权执行删除操作！","警告",2);
            JOptionPane.showMessageDialog(null,"你是哪一位？请输入用户名","问题",3);
            JOptionPane.showMessageDialog(null,"扫描完毕，没有发现病毒！","提示",JOptionPane.PLAIN_MESSAGE);
        }
        public static void main(String[] args) {
            new JOptionPanedemo();
        }
    }

## 12、swing表格JTable

绑定jdbc的数据就能做具体操作了

|                        方法名称                       |                    说明                    |
| :-----------------------------------------------: | :--------------------------------------: |
|                  getColumnCount()                 |                 返回列模型中的列数                |
|             getColumnN ame(int column)            |         返回出现在视图中 column 列位置处的列名称         |
|                   getRowCount()                   |        返回 JTable 中可以显示的行数（给定无限空间）        |
|                   getRowSorter()                  |                 返回负责排序的对象                |
|                getSelectedColumn()                |       返回第一个选定列的索引，如果没有选定的列， 则返回 -1       |
|                  getSelectedRow()                 |       返回第一个选定行的索引，如果没有选定的行， 则返回 -1       |
|           getValueAt(int row,int column)          |          返回 row 和 column 位置的单元格值         |
|                    isEditing()                    |            如果正在编辑单元格，则返回 true            |
|                    selectAll()                    |              选择表中的所有行、列和单元格              |
| setColumnSelectionInterval(int index0,int index1) |       选择从 index0 到 index1之间（包含两端）的列      |
|   setRowSelectionInterval(int index0,int index1)  |      选择从 index0 到 index1 之间（包含两端）的行      |
|      setTableHeader(JTableHeader tableHeader)     | 将此 JTable 所使用的 tableHeader 设置为 newHeader |
|      setUpdateSelectionOnSort(boolean update)     |               指定排序后是否应该更新选择              |
|   setValueAt(Object a Value,int row,int column)   |        设置表模型中 row 和 column 位置的单元格值       |

