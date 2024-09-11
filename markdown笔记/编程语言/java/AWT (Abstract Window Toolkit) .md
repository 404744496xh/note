[TOC]

## 层次结构 (Hierarchy)

![img](https://img-blog.csdnimg.cn/2018111110251168.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQwNTA3ODU3,size_16,color_FFFFFF,t_70 "img")

java.awt包提供了基本的GUI设计工具，主要包括组件（Component）、容器（Container）和布局管理器（LayoutManager）； Java的图形用户界面的最基本组成部分是组件（Component），组件不能独立地显示出来，必须将组件放在一定的容器中才可以显示出来；

## 组件（Component）

重要的成员方法有：

> getComponentAt（int x，int y） //获得坐标（x，y）上的组件对象
> getFont（） //获得组件的字体
> paint(Grahics g） //绘制组件
> repaint（） //重新绘制组件
> setVisible（Boolean b） //设置组件是否可见
> setBounds(int x, int y, int width, int height)//同时设置组件的位置、大小。
> setLocation(int x, int y)//设置组件的位置。

## 容器(Container)

> Component add(Componen tcomp) 向容器中添加其他组件（该组件既可以是普通组件，也可以是容器），并返回被添加的组件。
> Component getComponentAt(int x, int y)返回指定点的组件。
> int getComponentCount():返回该容器内组件的数量。
> Component\[] getComponents()返回该容器内的所有组件。

## Frame(窗口)

> public String getTitle() : 获取框架的标题。 标题显示在框架的边框中。
> public void setTitle(String title) : 将此框架的标题设置为指定的字符串。
> public void setIconImage(Image image) : 将要显示的图像设置为此窗口的图标。默认Image对象为null
> public MenuBar getMenuBar() : 获取此框架的菜单栏。
> public void setMenuBar(MenuBar mb) : 将此框架的菜单栏设置为指定的菜单栏。
> public boolean isResizable() ：显示该框架是否可由用户调整大小。 默认情况下，所有帧最初都可调整大小。
> public void setResizable(boolean resizable) ：设置该框架是否可以由用户调整大小。
> public void setShape(Shape shape) ：设置窗口的形状。
> public void removeNotify() ：通过删除其与其本机屏幕资源的连接，使此框架不可显示。 使框架不可显示将使其任何一个孩子被制成不可显示的。 该方法在内部被工具包调用，不应该被程序直接调用。

按钮文本显示乱码解决办法：依次点击Run -> Edit Configurations -> 左边选中要修改的项 -> 在右侧找到并点击Modify options -> 点击Add VM options -> 在新出现的框中输入 -Dfile.encoding=gbk -> 点击OK 。

# LayoutManager布局管理器

如果要让我们的程序在不同的操作系统下，都有相同的体验，那么手动设置组件的位置和大小，无疑是一种灾难，因为有太多的组件，需要分别设置不同操作系统下的大小和位置。为了解决这个问题，Java提供了LayoutManager布局管理器，可以根据运行平台来自动调整组件大小，程序员不用再手动设置组件大小和位置了，只需要为容器选择合适的布局管理器即可。

AWT中接口LayoutManager有五个实现类：GridLayout（网格布局）、FlowLayout（流式布局）、CardLayout（卡片布局）、GridBagLayout（网格包布局）和BorderLayout（边框布局）。为了简化开发，Swing引入了一个新的布局管理器BoxLayout。

## FlowLayout（流式布局）

在FlowLayout布局管理器中，组件像水流一样向某方向流动（排列），遇到障碍（边界）就折回，中心开始排列。在默认情况下，FlowLayout布局管理器从左向右排列所有组件，遇到边界就会折回下一行重新开始。

|                    构造方法                   |                   方法功能                  |
| :---------------------------------------: | :-------------------------------------: |
|                FlowLayout()               | 使用默认的对齐方式及默认的垂直间距、水平间距创建FlowLayout布局管理器 |
|           FlowLayout(int align)           | 使用指定的对齐方式及默认的垂直间距、水平间距创建FlowLayout布局管理器 |
| FlowLayout(int align, int hgap, int vgap) | 使用指定的对齐方式及指定的垂直间距、水平间距创建FlowLayout布局管理器 |

FlowLayout中组件的排列方向（从左向右、从右向左、从中间向两边等），该参数应该使用FlowLayout类的静态常量：FlowLayout.LEFT、FlowLayout.CENTER、FlowLayout.RIGHT。默认是左对齐。

    package AWT;

    import java.awt.*;

    public class FlowLayoutDemo {
        public static void main(String[] args) {
            Frame frame = new Frame("这是一个窗口容器Frame");

            //通过setLayout()方法设置容器的布局管理器
            frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
            //添加多个按钮到frame中
            for (int i = 0; i < 10; i++) {
                frame.add(new Button("按钮"+i));
            }
            //通过pack()方法设置最佳大小
            frame.pack();

            //设置Frame的位置和大小
            frame.setBounds(400,200,500,300);
            //设置Frame可见
            frame.setVisible(true);
        }
    }

## BorderLayout（边框布局）

BorderLayout将容器分为EAST、SOUTH、WEST、CENTER五个区域，普通组件可以被放置在这5个区域的任意一个中。

![](https://img-blog.csdnimg.cn/a27553f9cb4945c3af4617d1c676e753.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBA5ZWK5ZmiMTIzMQ==,size_16,color_FFFFFF,t_70,g_se,x_16)

当改变使用BorderLayout的容器大小时，NORTH、SOUTH和CENTER区域水平调整，而EAST、WEST和CENTER区域垂直调整，使用BorderLayout有如下两个注意点：

当向使用BorderLayout布局的容器中添加组件时，需要指定要添加到哪个区域中。如果没有指定添加到哪个区域中，则默认添加到中间区域中；
如果向同一个区域中添加多个组件，后放入的组件会覆盖先放入的组件。

|               构造方法               |                方法功能               |
| :------------------------------: | :-------------------------------: |
|          BorderLayout()          | 使用默认的水平间距、垂直间距创建BorderLayout布局管理器 |
| BorderLayout(int hgap, int vgap) | 使用指定的水平间距、垂直间距创建BorderLayout布局管理器 |

    package AWT;

    import java.awt.*;

    public class BorderLayoutDemo {
        public static void main(String[] args) {
            Frame frame = new Frame("这是一个窗口容器Frame");

            //通过setLayout()方法设置容器的布局管理器
            frame.setLayout(new BorderLayout(30,30));
            //往frame的指定区域添加组件
            frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
            frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);
            frame.add(new Button("东侧按钮"),BorderLayout.EAST);
            frame.add(new Button("西侧按钮"),BorderLayout.WEST);
            frame.add(new Button("中间按钮"),BorderLayout.CENTER);

            //通过pack()方法设置最佳大小
            frame.pack();
            //设置Frame的位置和大小
            frame.setBounds(400,200,500,300);
            //设置Frame可见
            frame.setVisible(true);
        }
    }

## GridLayout（网格布局）

GridLayout布局管理器将容器分割成纵横线分隔的网格，每个网格所占的区域大小相同。当向使用GridLayout布局管理器的容器中添加组件时，默认从左到右、从上到下依次添加到每个网格中。与FlowLayout不同的是，放置在GridLayout布局管理器中的各组件的大小由组件所处的区域决定（每个组件将自动占满整个区域）。

|                        构造方法                        |                 方法功能                 |
| :------------------------------------------------: | :----------------------------------: |
|           GridLayout(int rows, int cols)           | 采用指定的行数、列数，以及默认的横向间距、纵向间距将容器分割成多个网格。 |
| GridLayout(int rows, int cols, int hgap, int vgap) | 采用指定的行数、列数，以及指定的横向间距、纵向间距将容器分割成多个网格。 |

    package AWT;

    import java.awt.*;

    public class GridLayoutDemo {
        public static void main(String[] args) {
            Frame frame = new Frame("这是一个窗口容器Frame");
            //通过setLayout()方法设置容器的布局管理器
            frame.setLayout(new BorderLayout());

            //创建一个Panel对象，里面存放一个TextField组件
            Panel p1 = new Panel();
            p1.add(new TextField(50));
            //把这个Panel添加到frame的北边区域
            frame.add(p1,BorderLayout.NORTH);

            //创建一个Panel对象，并且设置它的布局管理器为GridLayout
            Panel p2 = new Panel();
            p2.setLayout(new GridLayout(3,5,4,4));
            //往Panel中添加内容
            for (int i = 0; i < 10; i++) {
                p2.add(new Button(i+""));
            }
            p2.add(new Button("+"));
            p2.add(new Button("-"));
            p2.add(new Button("*"));
            p2.add(new Button("/"));
            p2.add(new Button("."));
            //把当前的Panel添加到frame中
            frame.add(p2,BorderLayout.CENTER);

            //通过pack()方法设置最佳大小
            frame.pack();
            //设置Frame的位置和大小
            frame.setBounds(500,200,400,250);
            //设置Frame可见
            frame.setVisible(true);
        }
    }

## GridBagLayout（网格包布局）

GridBagLayout布局管理器的功能最强大，但也最复杂，与GirdLayout布局管理器不同的是，在GridBagLayout布局管理器中，一个组件可以跨越一个或多个网格，并且可以设置网格的大小互不相同，从而增加了布局的灵活性。当窗口的大小发生变化时，GridBagLayout布局管理器也可以准确地控制窗口各部分的拉伸。

![](https://img-blog.csdnimg.cn/a6c20220b1124af38365e810d11ab186.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBA5ZWK5ZmiMTIzMQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

由于在GirdBagLayout布局中，每个组件可以占用多个网格，此时，我们往容器中添加组件的时候，就需要具体地控制每个组件占用多少个网格，java提供的GridBagConstraints类，与特定的组件绑定，可以完成具体大小和跨越性的设置。

GirdBagConstraints API：

|    变量和类型   |     字段     |                   描述                   |
| :--------: | :--------: | :------------------------------------: |
| static int |    BOTH    |               水平和垂直调整组件大小              |
| static int |   CENTER   |              将组件放在其显示区域的中心             |
| static int |    EAST    |            将组件放在显示区域的右侧，垂直居中           |
| static int |  REMAINDER |           指定此组件是其列或行中的最后一个组件           |
|     int    | gridheight |            指定组件显示区域的列中的单元格数            |
|     int    |  gridwidth |             指定组件显示区域的行中单元格数            |
|     int    |    gridx   | 指定包含组件显示区域前沿的单元格，其中一行中的第一个单元格具有gridx=0 |
|     int    |    gridy   |    指定组件显示区域顶部的单元格，其中最顶层的单元格为gridy=0    |
|   double   |   weightx  |              指定如何分配额外的水平空间             |
|   double   |   weighty  |              指定如何分配额外的垂直空间             |

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

## CardLayout（卡片布局）

CardLayout布局管理器以时间而非空间来管理它里面的组件，它将加入容器的所有组件看成一叠卡片（每个卡片其实就是一个组件），每次只有最上面的哪个Component才可见。

|                 方法名称                |                            方法功能                           |
| :---------------------------------: | :-------------------------------------------------------: |
|             CardLayout()            |                    创建默认的CardLayout布局管理器                   |
|    CardLayout(int hgap, int vgap)   | 通过指定卡片与容器左右边界的间距（hgap）、上下边界的间距（vgap）的间距来创建CardLayout布局管理器 |
|       first(Container target)       |                     显示target容器中的第一张卡片                     |
|        last(Container target)       |                     显示target容器中的最后一张卡片                    |
|      previous(Container target)     |                     显示target容器中的前一张卡片                     |
|        next(Container target)       |                     显示target容器中的后一张卡片                     |
| show(Container target, String name) |                     显示target容器中指定名字的卡片                    |

    package AWT;

    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    public class CardLayoutDemo {
        public static void main(String[] args) {
            Frame frame = new Frame("这是一个窗口容器Frame");

            //创建一个Panel，用来存储多张卡片
            Panel p1 = new Panel();
            //创建CardLayout对象，并且把该对象设置给p1
            CardLayout cLayout = new CardLayout();
            p1.setLayout(cLayout);
            //往p1中存储多个组件
            String[] names = {"第一张", "第二张", "第三张", "第四张", "第五张", "第六张"};
            for (int i = 0; i < names.length; i++) {
                //每次添加都是作为最后一个组件添加到末尾
                p1.add(names[i], new Button(names[i])); //添加时指定组件的名字
            }
            //把p1放到frame的中间区域
            frame.add(p1, BorderLayout.CENTER);

            //创建另外一个Panel，用来存放5个按钮组件
            Panel p2 = new Panel();
            Button btn1 = new Button("上一张");
            Button btn2 = new Button("下一张");
            Button btn3 = new Button("第一张");
            Button btn4 = new Button("最后一张");
            Button btn5 = new Button("第三张");
            //创建一个事件监听器，监听按钮的点击动作
            ActionListener listener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String actionCommand = e.getActionCommand(); //这个字符串其实就是按钮上的文字
                    switch (actionCommand) {
                        case "上一张":
                            cLayout.previous(p1);
                            break;
                        case "下一张":
                            cLayout.next(p1);
                            break;
                        case "第一张":
                            cLayout.first(p1);
                            break;
                        case "最后一张":
                            cLayout.last(p1);
                            break;
                        case "第三张":
                            cLayout.show(p1, "第三张");
                            break;
                    }
                }
            };
            //把当前事件监听器和多个按钮绑定到一起
            btn1.addActionListener(listener);
            btn2.addActionListener(listener);
            btn3.addActionListener(listener);
            btn4.addActionListener(listener);
            btn5.addActionListener(listener);
            //把按钮添加到容器p2中
            p2.add(btn1);
            p2.add(btn2);
            p2.add(btn3);
            p2.add(btn4);
            p2.add(btn5);
            //把p2放到frame的南边区域
            frame.add(p2, BorderLayout.SOUTH);

            //通过pack()方法设置最佳大小
            frame.pack();
            //设置Frame的位置和大小
            frame.setBounds(400, 200, 500, 300);
            //设置Frame可见
            frame.setVisible(true);
        }
    }

## BoxLayout（盒子布局）

&#x20;为了简化开发，Swing引入了一个新的布局管理器BoxLayout。BoxLayout可以在垂直和水平两个方向上摆放GUI组件，BoxLayout提供了如下一个简单的构造器：

|                  方法名称                 |                                                    方法功能                                                   |
| :-----------------------------------: | :-------------------------------------------------------------------------------------------------------: |
| BoxLayout(Container target, int axis) | 指定创建基于target容器的BoxLayout布局管理器，该布局管理器里的组件按axis方向排列。其中axis有BoxLayout.X\_AXIS（横向）和BoxLayout.Y\_AXIS（纵向）两个方向。 |

    package AWT;

    import javax.swing.*;
    import java.awt.*;

    public class BoxLayoutDemo {
        public static void main(String[] args) {
            Frame frame = new Frame("这是一个窗口容器Frame");
            //基于frame容器创建一个BoxLayout对象，并且该对象存放组件是垂直存放
            BoxLayout boxLayout = new BoxLayout(frame,BoxLayout.Y_AXIS);
            //把BoxLayout设置给frame
            frame.setLayout(boxLayout);
            //往frame中添加两个Button组件
            frame.add(new Button("按钮1"));
            frame.add(new Button("按钮2"));

            //通过pack()方法设置最佳大小
            frame.pack();
            //设置Frame的位置和大小
            frame.setBounds(400,200,500,300);
            //设置Frame可见
            frame.setVisible(true);
        }
    }

### Box容器

为了更方便地使用BoxLayout，在java.swing包中，提供了一个新的容器Box，该容器地默认布局管理器就是BoxLayout，大多数情况下，使用Box容器去容纳多个GUI组件，然后再把Box容器作为一个组件，添加到其它地容器中，从而形成整体窗口布局。

|               方法名称               |       方法功能       |
| :------------------------------: | :--------------: |
| static Box createHorizontalBox() | 创建一个水平排列组件的Box容器 |
|  static Box createVerticalBox()  | 创建一个垂直排列组件的Box容器 |

通过上面的演示，我们会发现，被它管理的容器中的组件之间是没有间隔的，是不是特别的美观，但之前学习的几种布局，组件之间都会有一些间距，那使用BoxLayout如何给组件设置间距呢？

其实很简单，我们只需要在原有的组件需要间隔的地方，添加间隔即可，而每个间隔可以是一个组件，只不过该组件没有内容，仅仅起到一种分隔的作用。

Box类中，提供了几个方便的静态方法来生成这些间隔组件：

|                        方法名称                       |                    方法功能                    |
| :-----------------------------------------------: | :----------------------------------------: |
|      static Component createHorizontalGlue()      |         创建一条水平Glue（可在两个方向上同时拉伸的间距）。        |
|       static Component createVerticalGlue()       |         创建一条垂直Glue（可在两个方向上同时拉伸的间距）。        |
| static Component createHorizontalStrut(int width) | 创建一条指定宽度（宽度固定，不能拉伸）的水平Strut（可在垂直方向上拉伸的间距）。 |
|  static Component createVerticalStrut(int height) | 创建一条只当高度（高度固定，不能拉伸）的垂直Strut（可在水平方向上拉伸的间距）。 |

# AWT中常用组件

## 基本组件

|      组件名      |                                    功能                                   |
| :-----------: | :---------------------------------------------------------------------: |
|     Button    |                                    按钮                                   |
|     Canvas    |                                 用于绘图的画布                                 |
|    Checkbox   |                            复选框组件（也可当作单选框组件使用）                           |
| CheckboxGroup |          用于将多个Checkbox组件合成一组，一组Checkbox组件将只有一个可以被选中，即全部变成单选框组件          |
|     Choice    |                                  下拉选择框                                  |
|     Frame     |                            窗口，在GUI程序里通过该类创建窗口                           |
|     Label     |                               标签类，用于放置提示文本                              |
|      List     |              列表框组件，可以添加多项条目。条目通过调用列表元素对象的toString()方法来显示其信息             |
|     Panel     |                          不能单独存在的基本容器类，必须放到其它容器中                         |
|   Scrollbar   | 滑动条组件。如果需要用户输入位于某个范围的值，就可以使用滑动条组件。当创建一个滑动条时，必须指定它的方向、初始值、滑块的大小、最小值和最大值。 |
|   ScrollPane  |                              带水平及垂直滚动条的容器组件                             |
|    TextArea   |                                  多行文本域                                  |
|   TextField   |                                  单行文本框                                  |

## Dialog（对话框）

Dialog是Window类的子类，是一个容器类，属于特殊组件。Dialog是可以独立存在的顶级窗口，因此用法与普通窗口的用法几乎完全一样，但是使用对话框需要注意下面两点：

*   对话框通常依赖于其它窗口，就是通常需要有一个父窗口； 对话框有非模式（non-modal）和模式（modal）两种。当某个模式对话框被打开后，该模
*   \对话框总是位于它的父窗口之上，在模式对话框被关闭之前，父窗口无法获得焦点。&#x20;

|                       方法名称                       | 方法功能                                                                                                        |
| :----------------------------------------------: | :---------------------------------------------------------------------------------------------------------- |
| Dialog(Frame owner, String title, boolean modal) | 创建一个对话框对象： <br>          owner：当前对话框的父窗口； <br> title：当前对话框的标题；     <br>    modal：当前对话框是否是模式对话框。true / false |

    package AWT;

    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    public class DialogDemo {
        public static void main(String[] args) {
            Frame frame = new Frame("这是一个窗口容器Frame");

            //创建两个对话框Dialog对象，一个模式的，一个非模式的
            Dialog mDialog = new Dialog(frame,"模式对话框",true);
            Dialog dialog = new Dialog(frame,"非模式对话框",false);
            //通过setBounds()方法设置Dialog 的位置及大小
            mDialog.setBounds(200,100,500,300);
            dialog.setBounds(200,100,500,300);

            //创建两个按钮
            Button btn1 = new Button("打开模式对话框");
            Button btn2 = new Button("打开非模式对话框");
            //给这两个按钮添加点击后的行为
            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mDialog.setVisible(true);
                }
            });
            btn2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(true);
                }
            });
            //把按钮添加到frame中
            frame.add(btn1,BorderLayout.NORTH);
            frame.add(btn2,BorderLayout.CENTER);

            //通过pack()方法设置最佳大小
            frame.pack();
            //设置Frame的位置和大小
            frame.setBounds(400,200,500,300);
            //设置Frame可见
            frame.setVisible(true);
        }
    }

## FileDialog（文件对话框）

&#x20;Dialog类还有一个子类FileDialog，它代表一个文件对话框，用于打开或者保存文件，需要注意的是FileDialog无法确定模态或者非模态，这是因为FIleDialog依赖于运行平台的实现，如果运行平台的文件对话框是模态的，那么FileDialog也是模态的；否则就是非模态的。

|                       方法名称                       | 方法功能                                                                                                                  |
| :----------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------- |
| FileDialog(Frame parent, String title, int mode) | 创建一个文件对话框：<br> parent：指定父窗口；<br> title：对话框标题；<br>mode：文件对话框类型，如果指定为FileDialog.LOAD，用于打开文件；如果指定为FileDialog.SAVE，用于保存文件 |
|               String getDirectory()              | 获取被打开或保存文件的绝对路径                                                                                                       |
|                 String getFile()                 | 获取被打开或保存文件的文件名                                                                                                        |

# 事件处理

前面介绍了如何放置各种组件，从而得到了丰富多彩的图形界面，但这些界面还不能响应用户的任何操作。因为在AWT编程中，所有用户的操作，都必须要经过一套事件处理机制来完成，而Frame和组件本身没有事件处理能力。

## GUI事件处理机制

定义：当在某个组件上发生某个操作的时候，会自动地触发一段代码的执行。

在GUI事件处理机制中涉及到4个重要的概念需要理解：

事件源（Event Source）：操作发生的场所，通常指某个组件，例如按钮、窗口等。
事件（Event）：在事件源上发生的操作可以叫作事件，GUI会把事件都封装到一个Event对象中，如果需要直到该事件的详细信息，就可以通过Event对象来获取。
事件监听器（Event Listener）：当在某个事件源上发生了某个事件，事件监听器就可对这个事件进行处理。
注册监听：把某个事件监听器（A）通过某个事件（B）绑定到某个事件源（C）上，当在事件源C上发生了事件B之后，那么事件监听器A的代码就会自动执行。

![](https://img-blog.csdnimg.cn/0f9743014dc247909fbbf9fdf998c113.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBA5ZWK5ZmiMTIzMQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

**使用步骤：**

1.  创建事件源组件对象；
2.  自定义类，实现XxxListener接口（ActionListener），重写方法(actionPerformed)；
3.  创建事件监听器对象（自定义类对象）；
4.  调用事件源组件对象的addXxxListener方法完成注册监听。(addActionListener)

    package AWT;

    import java.awt.\*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    public class EventDemo {
    Frame frame = new Frame("这是一个窗口容器Frame");

        TextField tf = new TextField(30); //30列的单行文本框
        Button ok = new Button("确定");

        //组装视图
        public void init() {
            MyListener myListener = new MyListener(); //创建自定义监听器对象
            ok.addActionListener(myListener); //注册监听

            //把tf和ok翻入frame中
            frame.add(tf,BorderLayout.NORTH);
            frame.add(ok);

            //通过pack()方法设置最佳大小
            frame.pack();
            //设置Frame的位置和大小
            frame.setBounds(400,200,500,300);
            //设置Frame可见
            frame.setVisible(true);
        }

        //自定义事件监听器
        private class MyListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Hello World");
            }
        }
        public static void main(String[] args) {
            new EventDemo().init();
        }

    }

## GUI中常见事件和事件监听器

事件监听器必须实现事件监听器接口，AWT提供了大量的事件监听器接口用于实现不同类型的事件监听器，来监听不同类型的事件。AWT中提供了丰富的事件类，用于封装不同组件上所发生的特定操作，AWT的事件类都是AWTEvent类的子类，AWTEvent类是EventObject类的子类。

### 事件

AWT把事件分为了两大类：

**1、低级事件**：这类事件是基于某个特定动作的事件。比如进入、点击、拖放等动作的鼠标事件，再比如得到焦点和失去焦点等焦点事件。

|       事件       |                                  触发时机                                  |
| :------------: | :--------------------------------------------------------------------: |
| ComponentEvent |                组件事件，当组件尺寸发生变化、位置发生移动、显示/隐藏状态发生改变时触发该事件。                |
| ContainerEvent |                       容器事件，当容器里发生添加组件、删除组件时触发该事件。                      |
|   WindowEvent  |                  窗口事件，当窗口状态发生改变（如打开、关闭、最大化、最小化）时触发该事件。                 |
|   FocusEvent   |                        焦点事件，当组件得到焦点或失去焦点时触发该事件。                        |
|    KeyEvent    |                        键盘事件，当案件被按下、松开、单机时触发该事件。                        |
|   MouseEvent   |                     鼠标事件，当进行单机、按下、松开、移动鼠标等动作时触发该事件。                    |
|   PaintEvent   | 组件绘制事件，该事件是一个特殊的事件类型，当GUI组件调用update/paint方法来呈现自身时触发该事件，该事件并非专用于事件处理模型。 |

\*\*2、高级事件：\*\*这类事件并不会基于某个特定动作，而是根据功能含义定义的事件。

|        事件       |                  触发时机                  |
| :-------------: | :------------------------------------: |
|   ActionEvent   | 动作事件，当按钮、菜单项被单击，在TextField中按Enter键时触发。 |
| AdjustmentEvent |       调节事件，在滑动条上移动滑块以调节数值时触发该事件。       |
|    ItemEvent    |       选项事件，当用户选中某项，或取消选中某项时触发该事件。      |
|    TextEvent    |      文本事件，当文本框、文本域里的文本发生改变时触发该事件。      |

### 事件监听器

不同的事件需要使用不同的事件监听器监听，不同的监听器需要实现不同的监听器接口，当指定事件发生后，事件监听器就会调用所包含的事件处理器（实例方法）来处理事件。

|       事件类别      |     描述信息     |        监听器接口名       |
| :-------------: | :----------: | :-----------------: |
|   ActionEvent   |     激活组件     |    ActionListener   |
|    ItemEvent    |    选择了某些项目   |     ItemListener    |
|    MouseEvent   |     鼠标移动     | MouseMotionListener |
|    MouseEvent   |     鼠标点击等    |    MouseListener    |
|     KeyEvent    |     键盘输入     |     KeyListener     |
|    FocusEvent   |   组件收到或失去焦点  |    FocusListener    |
| AdjustmentEvent |   移动了滚动条等组件  |  AdjustmentListener |
|  ComponentEvent |  对象移动缩放显示隐藏等 |  ComponentListener  |
|   WindowEvent   |   窗口收到窗口级事件  |    WindowListener   |
|  ContainerEvent |  容器中增加或删除了组件 |  ContainerListener  |
|    TextEvent    | 文本字段或文本区发生改变 |     TextListener    |

### 案例

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

案例2：给Frame设置WindowListener，监听用户点击x的动作，如果用户点击x，则关闭当前窗口。

    package AWT;

    import java.awt.*;
    import java.awt.event.*;

    public class ListenerDemo2 {
        public static void main(String[] args) {
            Frame frame = new Frame();

            //设置WindowListener，监听用户点击x的动作，如果点击x，则关闭窗口
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    //停止当前程序
                    System.exit(0); //退出JVM
                }
            });

            //通过pack()方法设置最佳大小
            frame.pack();
            //设置Frame的位置和大小
            frame.setBounds(400,200,500,300);
            //设置Frame可见
            frame.setVisible(true);
        }
    }

# 菜单组件

在实际开发中，除了主界面，还有一类比较重要的内容就是菜单相关组件，可以通过菜单相关组件很方便地使用特定的功能。在AWT中，菜单相关组件的使用和之前学习的组件是一模一样的，只需要把菜单条、菜单、菜单项组合到一起，按照一定的布局，放入到容器中即可。

下表给出常用的菜单相关组件：

|      菜单组件名称      |                   功能                   |
| :--------------: | :------------------------------------: |
|      MenuBar     |               菜单条，菜单的容器。               |
|       Menu       | 菜单组件，菜单项的容器。它也是MenuItem的子类，所以可作为菜单项使用。 |
|     PopupMenu    |            上下文菜单组件（右键菜单组件）。            |
|     MenuItem     |                 菜单项组件。                 |
| CheckboxMenuItem |                复选框菜单项组件。               |

![](https://img-blog.csdnimg.cn/2dd16253147e4e0e8908dc8b4c6002b8.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBA5ZWK5ZmiMTIzMQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

菜单相关组件使用：

1.  准备菜单项组件，这些组件可以是MenuItem及其子类对象；
2.  准备菜单组件Menu或者PopupMenu（右击弹出菜单），把第一步中准备好的菜单项组件添加进来；
3.  准备菜单条组件MenuBar，把第二步中准备好的菜单组件Menu添加进来；
4.  把第三步中准备好的菜单条组件添加到窗口对象中显示。

小技巧：

如果要在某个菜单的菜单项之间添加分割线，那么只需要调用Menu的add(new MenuItem("-"));即可；
如果要给某个菜单项关联快捷键功能，那么只需要在创建菜单项对象时设置即可，例如给菜单项关联Ctrl+Shift+Q快捷键，只需要：new MenuItem("菜单项名字",new MenuShortCun(KeyEvent.VK\_Q,true));

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

# 绘图

很多程序如各种游戏都需要在窗口中绘制各种图形，除此之外，即使在开发javaEE项目时，有时候也必须“动态”地向客户端生成各种图形、图标，比如图形验证码、统计图等，这都需要利用AWT地绘图功能。

## 组件绘图原理

之前我们已经学过很多组件，例如Button、Frame。Checkbox等等，不同的组件，展示出来的图形都不一样，其实这些组件展示出来的图形，其本质就是用AWT的绘图来完成的。

在AWT中，真正提供绘图功能的是Graphics对象，那么Component组件和Graphics对象存在什么关系，才能让Component绘制自身图形呢？在Component类中，提供了下列三个方法来完成组件图形的绘制与刷新：

*   paint(Graphics g)：绘制组件的外观；
*   update(Graphics g)：调用内部paint方法，刷新组件外观；
*   repaint()：调用update方法，刷新组件外观。

![](https://img-blog.csdnimg.cn/52000d7c74a94859bc023a1066d0345f.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBA5ZWK5ZmiMTIzMQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

一般情况下，update和paint方法是由AWT系统负责调用，如果程序要希望系统重新绘制组件，可以调用repaint()方法完成。

Graphics对象的使用
AWT中提供了Canvas类充当画布，提供了Graphics类来充当画笔，通过调用Graphics对象的setColor()方法可以给画笔设置颜色。

画图的步骤：

1.  自定义类，继承Canvas类，重写paint(Graphics g)方法完成画图；
2.  在paint()方法内部，真正开始画图之前调用Graphics对象的setColor()、setFont()等方法设置画笔的颜色、字体等属性；
3.  调用Graphics画笔的drawXxx()方法开始画图。

其实画图的核心就在于使用Graphics画笔在Canvas画布上画出什么颜色、什么样式的图形，所以核心在画笔上，下表给出了Graphics类中常用的一些方法：

|        方法名称        |     方法功能    |
| :----------------: | :---------: |
|  setColor(Color c) |     设置颜色    |
| setFont(Font font) |     设置字体    |
|     drawLine()     |     绘制直线    |
|     drawRect()     |     绘制矩形    |
|   drawRoundRect()  |    绘制圆角矩形   |
|     drawOval()     |    绘制椭圆形    |
|    drawPolygon()   |    绘制多边形    |
|      drawArc()     |     绘制圆弧    |
|   drawPolyline()   |     绘制折线    |
|     fillRect()     |    填充矩形区域   |
|   fillRoundRect()  |   填充圆角矩形区域  |
|     fillOval()     |    填充椭圆区域   |
|    fillPolygon()   |   填充多边形区域   |
|      fillArc()     | 填充圆弧对应的扇形区域 |
|     drawImage()    |     绘制位图    |

案例1——绘制矩形和椭圆：

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

Java也可用于开发一些动画，就是间隔一定的时间（通常小于0.1秒）重新绘制新的图像，两次绘制的图像之间差异较小，肉眼看起来就成了所谓的动画。为了实现间隔一定时间就重新调用组件的repaint()方法，可以借助于Swing提供的Timer类，Timer类是一个定时器，它有如下一个构造器：Timer(int delay, ActionListener listener)：每间隔delay毫秒，系统自动触发ActionListener监听器里的事件处理器方法，在方法内部我们就可以调用组件的repaint()方法，完成组件重绘。

案例2——弹球小游戏

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

处理位图
如果仅仅绘制一些简单的几何图形，程序的图形效果依然比较单调。AWT也允许在组件上绘制位图，Graphics提供了drawImage(Image image)方法用于绘制位图，该方法需要一个Image参数代表位图，通过该方法就可以绘制出指定的位图。

位图使用步骤：

1.创建Image的子类对象BufferedImage(intwidth,intheight,intImageType)，创建时需要指定位图的宽高及类型属性；此时相当于在内存中生成了一张图片；

2.调用BufferedImage对象的getGraphics()方法获取画笔，此时就可以往内存中的这张图片上绘图了，绘图的方法和之前学习的一模一样；

3.调用组件paint方法中提供的Graphics对象的drawImage()方法，一次性地将内存中地图片BufferedImage绘制到特定的组件上。

使用位图绘制组件的好处：

使用位图来绘制组件，相当于实现类图的缓冲区，此时绘图时没有直接把图形绘制到组件上，而是先绘制到内存中的BufferedImage上，等全部绘制完毕，再一次性地将图像显示到组件上即可，这样用户的体验会好一些。
