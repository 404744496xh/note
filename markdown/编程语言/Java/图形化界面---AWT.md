## <font style="color:rgb(79, 79, 79);">👑👑</font><font style="color:rgb(79, 79, 79);"> AWT</font>
### <font style="color:rgb(79, 79, 79);">📜📜</font><font style="color:rgb(79, 79, 79);">Java AWT简介 (Introduction to Java AWT)</font>
<font style="color:rgb(77, 77, 77);">Java AWT (Abstract Window</font><font style="color:rgb(77, 77, 77);"> </font>[<font style="color:rgb(77, 77, 77);">Toolkit</font>](https://so.csdn.net/so/search?q=Toolkit&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">) package is a</font><font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(78, 161, 219);">library</font><font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">used for designing graphical user interfaces.</font>

<font style="color:rgb(77, 77, 77);">Java AWT(抽象窗口工具包)软件包是用于设计图形用户界面的库。</font>

<font style="color:rgb(77, 77, 77);">It contains classes for placing various user intractable components and graphics. However, the components of this class are platform dependent. They are heavy and rely on the OS for their functioning.</font>

<font style="color:rgb(77, 77, 77);">它包含用于放置各种用户难以处理的组件和图形的类。 但是，此类的组件取决于平台。 它们很重，并且依靠OS来运行。</font>

<font style="color:rgb(77, 77, 77);">The AWT package has classes using which we can create TextBoxes, CheckBoxes,</font><font style="color:rgb(77, 77, 77);"> </font>[<font style="color:rgb(77, 77, 77);">RadioButton</font>](https://so.csdn.net/so/search?q=RadioButton&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">, List, etc.</font>

<font style="color:rgb(77, 77, 77);">AWT包具有一些类，通过这些类可以创建TextBoxes ， CheckBoxes ， RadioButton ， List等。</font>

#### <font style="color:rgb(79, 79, 79);">🏮🏮</font><font style="color:rgb(79, 79, 79);">层次结构 (Hierarchy)</font>
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127739996-543919bc-a346-4fbb-a5ed-ca2076b0f26e.png)

<font style="color:rgb(77, 77, 77);">java.awt包提供了基本的GUI设计工具，主要包括组件（Component）、容器（Container）和布局管理器（LayoutManager）； Java的图形用户界面的最基本组成部分是组件（</font>[<font style="color:rgb(77, 77, 77);">Component</font>](https://so.csdn.net/so/search?q=Component&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">），组件不能独立地显示出来，必须将组件放在一定的容器中才可以显示出来； 组件（Component）  
</font><font style="color:rgb(77, 77, 77);">类的部分重要的成员方法有：  
</font><font style="color:rgb(77, 77, 77);">getComponentAt（int x，int y） //获得坐标（x，y）上的组件对象 getFont（） //获得组件的字体  
</font><font style="color:rgb(77, 77, 77);">paint(Grahics g） //绘制组件  
</font><font style="color:rgb(77, 77, 77);">repaint（） //重新绘制组件  
</font><font style="color:rgb(77, 77, 77);">setVisible（Boolean b） //设置组件是否可见  
</font>[<font style="color:rgb(77, 77, 77);">Container</font>](https://so.csdn.net/so/search?q=Container&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">是一个类，实际上是Component的子类，因此容器本身也是一个组件，具有组件的所有性质，但是它的主要功能是用来放置其他组件和容器；</font>

## **<font style="color:rgb(77, 77, 77);">2.3.2 常见API</font>**
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">Component作为基类，提供了如下常用的方法来设置组件的大小、位置、可见性等。  
</font><font style="color:rgb(77, 77, 77);">方法签名 方法功能  
</font><font style="color:rgb(77, 77, 77);">setLocation(int x, int y)  
</font><font style="color:rgb(77, 77, 77);">设置组件的位置。  
</font><font style="color:rgb(77, 77, 77);">setSize(int width, int reight)  
</font><font style="color:rgb(77, 77, 77);">设置组件的大小。  
</font><font style="color:rgb(77, 77, 77);">setBounds(int x, int y, int width, int height)  
</font><font style="color:rgb(77, 77, 77);">同时设置组件的位置、大小。  
</font><font style="color:rgb(77, 77, 77);">setVisible(Boolean b)  
</font><font style="color:rgb(77, 77, 77);">设置该组件的可见性。</font>

<font style="color:rgb(77, 77, 77);">Container作为容器根类，提供了如下方法来访问容器中的组件  
</font><font style="color:rgb(77, 77, 77);">方法签名 方法功能  
</font><font style="color:rgb(77, 77, 77);">Component add(Componen tcomp)  
</font><font style="color:rgb(77, 77, 77);">向容器中添加其他组件（该组件既可以是普通组件，也可以是容器），并返回被添加的组件。  
</font><font style="color:rgb(77, 77, 77);">Component getComponentAt(int x, int y)返回指定点的组件。  
</font><font style="color:rgb(77, 77, 77);">int getComponentCount():返回该容器内组件的数量。  
</font><font style="color:rgb(77, 77, 77);">Component[] getComponents()返回该容器内的所有组件。  
</font><font style="color:rgb(77, 77, 77);">2.3.3 容器演示</font>

<font style="color:rgb(77, 77, 77);">程序明明向 ScrollPane 容器中添加了 一个文本框和一个按钮，但只能看到 一个按钮，却看不到文本框 ，这是为什么 呢？这是因为ScrollPane 使用 BorderLayout 布局管理器的缘故，而 BorderLayout 导致了该容器中只有一个组件被显示出来。</font>

## <font style="color:rgb(79, 79, 79);">💐💐</font><font style="color:rgb(79, 79, 79);">2.4 LayoutManage布局管理器</font>
<font style="color:rgb(77, 77, 77);">之前，我们介绍了Component中有一个方法 setBounds()可以设置当前容器的位置和大小，但是我们需要明确一件事，如果我们手动的为组件设置位置和大小的话，就会造成程序的不通用性，例如：  
</font><font style="color:rgb(77, 77, 77);">Label label new = Label(“你好，世界”);  
</font><font style="color:rgb(77, 77, 77);">创建了一个lable组件，很多情况下，我们需要让lable组件的宽和“你好，世界”这个字符串自身的宽高一致，这种大小称为最佳大小。由于操作系统存在差异，例如在</font><font style="color:rgb(78, 161, 219);">windows</font><font style="color:rgb(77, 77, 77);">上，我们要达到这样的效果，需要把该Lable组件的宽和高分别设置为100px,20px,但是在Linux操作系统上，可能需要把Lable组件的宽和高分别设置为120px，24px，才能达到同样的效果。  
</font><font style="color:rgb(77, 77, 77);">如果要让我么的程序在不同的操作系统下，都有相同的使用体验，那么手动设置组件的位置和大小，无疑是一种灾难，因为有太多的组件，需要分别设置不同操作系统下的大小和位置。为了解决这个问题，Java提供了LayoutManager布局管理器，可以根据运行平台来自动调整组件大小，程序员不用再手动设置组件的大小和位置了，只需要为容器选择合适的布局管理器即可。</font>

### <font style="color:rgb(77, 77, 77);">2.4.1 FlowLayout</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">在 FlowLayout布局管理器 中，组件像水流一样向某方向流动 (排列) ，遇到障碍(边界)就折回，重头开始排列在默认情况下，FlowLayout 布局管理器从左向右排列所有组件，遇到边界就会折回下一行重新开始。  
</font><font style="color:rgb(77, 77, 77);">构造方法 方法功能  
</font><font style="color:rgb(77, 77, 77);">FlowLayout()  
</font><font style="color:rgb(77, 77, 77);">使用默认的对齐方式及默认的垂直间距、水平间距创建FlowLayout布  
</font><font style="color:rgb(77, 77, 77);">局管理器。  
</font><font style="color:rgb(77, 77, 77);">FlowLayout(int align)  
</font><font style="color:rgb(77, 77, 77);">使用指定的对齐方式及默认的垂直间距、水平间距创建 FlowLayout 布局管理器。  
</font><font style="color:rgb(77, 77, 77);">FlowLayout(int align,int hgap,int vgap)  
</font><font style="color:rgb(77, 77, 77);">使用指定的对齐方式及指定的垂直问距、水平间距创建FlowLayout布局管理器。  
</font><font style="color:rgb(77, 77, 77);">FlowLayout 中组件的排列方向(从左向右、从右向左、从中间向两边等)，该参数应该使用FlowLayout类的静态常</font>

#### <font style="color:rgb(79, 79, 79);">小案例</font>
```plain
package java2.awt;

import java.awt.*;

public class WindowDome {
    public static void main(String[] args) {
        Frame frame = new Frame("Panel");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
        for (int i = 0; i < 100; i++) {
            frame.add(new Button("按钮" + i));
        }//用for循环创建100个按钮，可能会乱码，后面有解决方法
//        Panel panel = new Panel();
//        panel.add(new TextField("测试文本"));
//        panel.add(new Button("测试按钮"));
//        frame.add(panel);
//        frame.setBounds(200,200,500,300);
        frame.pack();//窗口最佳大小
        frame.setVisible (true);//设为可见
    }
}

```

### <font style="color:rgb(77, 77, 77);">2.4.2 BorderLayout</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">BorderLayout将容器分为EAST、SOUTH、WEST、 NORTH、CENTER五个区域，普通组件可以被放置在这5 个区域的任意一个中。 BorderLayout布局 管理器的布局示意图如图所示。  
</font><font style="color:rgb(77, 77, 77);">NORTH</font>

<font style="color:rgb(77, 77, 77);">WEST CENTER EAST</font>

<font style="color:rgb(77, 77, 77);">SOUTH  
</font><font style="color:rgb(77, 77, 77);">当改变使用BorderLayout的容器大小时， NORTH、SOUTH和CENTER区域水平调整，而 EAST、 WEST和CENTER 区域垂直调整。使用BorderLayout有如下两个注意点:</font>

1. <font style="color:rgba(0, 0, 0, 0.75);">当向使用 BorderLayout 布局管理器的容器中添加组件时 ，需要指定要添加到哪个区域中 。 如果没有指定添加到哪个区域中，则默认添加到中间区域中；</font>
2. <font style="color:rgba(0, 0, 0, 0.75);">如果向同一个区域中添加多个组件时 ，后放入的组件会覆盖先放入的组件；  
</font><font style="color:rgba(0, 0, 0, 0.75);">构造方法 方法功能  
</font><font style="color:rgba(0, 0, 0, 0.75);">BorderLayout()  
</font><font style="color:rgba(0, 0, 0, 0.75);">使用默认的水平间距、垂直间距创建BorderLayout布局管理器。  
</font><font style="color:rgba(0, 0, 0, 0.75);">BorderLayout(int hgap,int vgap):  
</font><font style="color:rgba(0, 0, 0, 0.75);">使用指定的水平间距、垂直间距创建 BorderLayout 布局管理器。</font>

### <font style="color:rgb(77, 77, 77);">2.4.3GridLayout</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">GridLayout 布局管理器将容器分割成纵横线分隔的网格 ，每个网格所占的区域大小相同。当向使用GridLayout 布局管理器的容器中添加组件时， 默认从左向右、 从上向下依次添加到每个网格中 。 与FlowLayout不同的是，放置在 GridLayout 布局管理器中的各组件的大小由组件所处的区域决定(每 个组件将自动占满整个区域)。  
</font><font style="color:rgb(77, 77, 77);">构造方法 方法功能  
</font><font style="color:rgb(77, 77, 77);">GridLayout(int rows,in t cols)  
</font><font style="color:rgb(77, 77, 77);">采用指定的行数、列数，以及默认的横向间距、纵向间距将容器 分  
</font><font style="color:rgb(77, 77, 77);">割成多个网格  
</font><font style="color:rgb(77, 77, 77);">GridLayout(int rows,int cols,int hgap,int vgap)  
</font><font style="color:rgb(77, 77, 77);">采用指定 的行数、列数 ，以及指定的横向间距、 纵向间距将容器  
</font><font style="color:rgb(77, 77, 77);">分割成多个网格。  
</font><font style="color:rgb(77, 77, 77);">案伤  
</font><font style="color:rgb(77, 77, 77);">使用Frame+Panel，配合FlowLayout和GridLayout完成一个计算器效果。</font>

```plain
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        Frame frame = new Frame("计算器");
        Panel p1 = new Panel();
        p1.add(new TextField(30));
        frame.add(p1,BorderLayout.NORTH);
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(4,5,4,4));
        for (int i = 0; i < 10; i++) {
            p2.add(new Button(i + ""));
        }
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));
        p2.add(new Button("="));
        frame.add(p2);
        frame.pack();
        frame.setVisible(true);
    }
}
```

<font style="color:rgb(77, 77, 77);">效果  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127739974-b75787fa-d642-4b00-be71-438e5b037427.png)

### <font style="color:rgb(77, 77, 77);">2.4.4GridBagLayout</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">了解即可，学完swing会有更强大的布局管理器  
</font><font style="color:rgb(77, 77, 77);">GridBagLayout 布局管理器的功能最强大，但也最复杂，与GridLayout布局管理器不同的是，在GridBagLayout 布局管理器中，一个组件可以跨越一个或多个网格 ， 并可以设置各网格的大小互不相同，从而增加了布局的灵活性 。 当窗口的大小发生变化时 ， GridBagLayout 布局管理器也可以准确地控制窗口各部分的拉  
</font><font style="color:rgb(77, 77, 77);">伸。</font>

<font style="color:rgb(77, 77, 77);">由于在GridBagLayout布局中，每个组件可以占用多个网格，此时，我们往容器中添加组件的时候，就需要具体的控制每个组件占用多少个网格，java提供的GridBagConstaints类，与特定的组件绑定，可以完成具体大小和跨越性的设置。  
</font><font style="color:rgb(77, 77, 77);">GridBagConstraints API:  
</font><font style="color:rgb(77, 77, 77);">成员变量 含义  
</font><font style="color:rgb(77, 77, 77);">gridx 设置受该对象控制的GUI组件左上角所在网格的横向索引  
</font><font style="color:rgb(77, 77, 77);">gridy 设置受该对象控制的GUI组件左上角所在网格的纵向索引</font>

### <font style="color:rgb(77, 77, 77);">2.4.5 CardLayout</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">CardLayout 布局管理器以时间而非空间来管理它里面的组件，它将加入容器的所有组件看成一叠卡片（每个卡片其实就是一个组件），每次只有最上面的那个 Component 才可见。就好像一副扑克牌，它们叠在一起，每次只有最上面的一张扑克牌才可见.  
</font><font style="color:rgb(77, 77, 77);">方法名称 方法功能  
</font><font style="color:rgb(77, 77, 77);">CardLayout() 创建默认的 CardLayout 布局管理器。  
</font><font style="color:rgb(77, 77, 77);">CardLayout(int hgap,int vgap)通过指定卡片与容器左右边界的间距（ hgap)、上下边界 Cvgap)的间距来创建 CardLayout 布局管理器  
</font><font style="color:rgb(77, 77, 77);">first(Container target) 显示target 容器中的第一张卡片.  
</font><font style="color:rgb(77, 77, 77);">last(Container target) 显示target 容器中的最后一张卡片.  
</font><font style="color:rgb(77, 77, 77);">previous(Container target) 显示target容器中的前一张卡片.  
</font><font style="color:rgb(77, 77, 77);">next(Container target) 显示target 容器中的后一张卡片.  
</font><font style="color:rgb(77, 77, 77);">show(Container taget,String name)显示 target 容器中指定名字的卡片.</font>

<font style="color:rgb(77, 77, 77);">使用Frame和Panel以及CardLayout完成下图中的效果，点击底部 按钮，切换卡片</font>

### <font style="color:rgb(77, 77, 77);">2.4.6 BoxLayout</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">为了简化开发，SwingI引入了一个新的布局管理器：BoxLayout。BoxLayout可以在垂直和 水平两个方向上摆放GUI组件，BoxLayout 提供了如下一个简单的构造器:  
</font><font style="color:rgb(77, 77, 77);">方法名称 方法功能  
</font><font style="color:rgb(77, 77, 77);">BoxLayout(Container target, int axis)指定创建基于 target 容器的 BoxLayout 布局管理器，该布局管理器里的组件按axis 方向排列。其中 axis 有 BoxLayout.X_AXIS( 横向)和 BoxLayout.Y _AXIS (纵向)两个方向。</font>

<font style="color:rgb(77, 77, 77);">在java.swing包中，提供了一个新的容器Box，该容器的默认布局管理器就是BoxLayout,大多数情况下，使用Box容器去容纳多个GUI组件，然后再把Box容器作为一个组件，添加到其他的容器中，从而形成整体窗口布局。  
</font><font style="color:rgb(77, 77, 77);">方法名称 方法功能  
</font><font style="color:rgb(77, 77, 77);">static Box createHorizontalBox()  
</font><font style="color:rgb(77, 77, 77);">创建一个水平排列组件的 Box 容器。  
</font><font style="color:rgb(77, 77, 77);">static Box createVerticalBox()  
</font><font style="color:rgb(77, 77, 77);">创建一个垂直排列组件的 Box 容器。</font>

<font style="color:rgb(77, 77, 77);">通过之前的两个BoxLayout演示，我们会发现，被它管理的容器中的组件之间是没有间隔的，不是特别的美观，但之前学习的几种布局，组件之间都会有一些间距，那使用BoxLayout如何给组件设置间距呢？  
</font><font style="color:rgb(77, 77, 77);">其实很简单，我们只需要在原有的组件需要间隔的地方，添加间隔即可，而每个间隔可以是一个组件，只不过该组件没有内容，仅仅起到一种分隔的作用。  
</font><font style="color:rgb(77, 77, 77);">Box类中，提供了5个方便的静态方法来生成这些间隔组件：  
</font><font style="color:rgb(77, 77, 77);">方法名称 方法功能  
</font><font style="color:rgb(77, 77, 77);">static Component createHorizontalGlue()  
</font><font style="color:rgb(77, 77, 77);">创建一条水平 Glue (可在两个方向上同时拉伸的间距)  
</font><font style="color:rgb(77, 77, 77);">static Component createVerticalGlue()  
</font><font style="color:rgb(77, 77, 77);">创建一条垂直 Glue (可在两个方向上同时拉伸的间距 )  
</font><font style="color:rgb(77, 77, 77);">static Component createHorizontalStrut(int width)  
</font><font style="color:rgb(77, 77, 77);">创建一条指定宽度(宽度固定了，不能拉伸)的水平Strut (可在垂直方向上拉伸的间距)  
</font><font style="color:rgb(77, 77, 77);">static Component createVerticalStrut(int height)  
</font><font style="color:rgb(77, 77, 77);">创建一条指定高度(高度固定了，不能拉伸)的垂直Strut (可在水平方向上拉伸的间距)</font>

## <font style="color:rgb(79, 79, 79);">🌺🌺</font><font style="color:rgb(79, 79, 79);">2.5 AWT中常用组件()</font>
### <font style="color:rgb(77, 77, 77);">2.5.1 基本组件</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">组件名 功能  
</font><font style="color:rgb(77, 77, 77);">Button 按钮  
</font><font style="color:rgb(77, 77, 77);">Canvas 用于绘图的画布  
</font><font style="color:rgb(77, 77, 77);">Checkbox复选框组件（也可当做单选框组件使用）  
</font><font style="color:rgb(77, 77, 77);">CheckboxGroup用于将多个Checkbox 组件组合成一组，一组Checkbox 组件将只有一个可以被选中,即全部变成单选框组件  
</font><font style="color:rgb(77, 77, 77);">Choice 下拉选择框  
</font><font style="color:rgb(77, 77, 77);">Frame 窗口 ，在 GUI 程序里通过该类创建窗口  
</font><font style="color:rgb(77, 77, 77);">Label 标签类，用于放置提示性文本  
</font><font style="color:rgb(77, 77, 77);">List 列表框组件，可以添加多项条目  
</font><font style="color:rgb(77, 77, 77);">Panel 不能单独存在基本容器类，必须放到其他容器中  
</font><font style="color:rgb(77, 77, 77);">Scrollbar 滑动条组件。如果需要用户输入位于某个范围的值 ， 就可以使用滑动条组件 ，比如调色板中设置 RGB 的三个值所用的滑动条。当创建一个滑动条时，必须指定它的方向、初始值、 滑块的大小、最小值和最大值。  
</font><font style="color:rgb(77, 77, 77);">ScrollPane 带水平及垂直滚动条的容器组件  
</font><font style="color:rgb(77, 77, 77);">TextArea 多行文本域  
</font><font style="color:rgb(77, 77, 77);">TextField 单行文本框</font>

### <font style="color:rgb(77, 77, 77);">2.5.2 对话框Dialog</font>
#### <font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">2.5.2.1 Dialog</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">Dialog 是 Window 类的子类，是 一个容器类，属于特殊组件 .对话框是可以独立存在的顶级窗口，因此用法与普通窗口的用法几乎完全一样，但是使用对话框需要注意下面两点：  
</font><font style="color:rgb(77, 77, 77);">· 对话框通常依赖于其他窗口，就是通常需要有一个父窗口；  
</font><font style="color:rgb(77, 77, 77);">• 对话框有非模式(non-modal)和模式(modal)两种，当某个模式对话框被打开后，该模式对话框总是位于它的父窗口之上，在模式对话框被关闭之前，父窗口无法获得焦点。  
</font><font style="color:rgb(77, 77, 77);">方法名称  
</font><font style="color:rgb(77, 77, 77);">Dialog(Frame owner, String title, boolean modal)  
</font><font style="color:rgb(77, 77, 77);">方法功能:  
</font><font style="color:rgb(77, 77, 77);">创建一个对话框对象：  
  
</font><font style="color:rgb(77, 77, 77);">owner:当前对话框的父窗口  
  
</font><font style="color:rgb(77, 77, 77);">title:当前对话框的标题  
  
</font><font style="color:rgb(77, 77, 77);">modal：当前对话框是否是模式对话框，true/false</font>

#### <font style="color:rgb(77, 77, 77);">2.5.2.2FileDialog</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">Dialog 类还有一个子类：FileDialog ，它代表一个文件对话框，用于</font>**<font style="color:rgb(77, 77, 77);">打开或者保存</font>**<font style="color:rgb(77, 77, 77);"> 文件,需要注意的是FileDialog无法指定模态或者非模态，这是因为 FileDialog 依赖于运行平台的实现，如果运行平台的文件对话框是模态的，那么 FileDialog 也是模态的;否则就是非模态的。  
</font><font style="color:rgb(77, 77, 77);">方法名称 方法功能  
</font><font style="color:rgb(77, 77, 77);">FileDialog(Frame parent,String title, int mode)  
</font><font style="color:rgb(77, 77, 77);">创建一个文件对话框：  
  
</font><font style="color:rgb(77, 77, 77);">parent:指定父窗口  
  
</font><font style="color:rgb(77, 77, 77);">title:对话框标题  
  
</font><font style="color:rgb(77, 77, 77);">mode:文件对话框类型，如果指定为FileDialog.LOAD，用于打开文件，如果指定为FileDialog.SAVE,用于保存文件</font>

<font style="color:rgb(77, 77, 77);">String getDirectory()获取被打开或保存文件的绝对路径  
</font><font style="color:rgb(77, 77, 77);">String getFile() 获取被打开或保存文件的文件名</font>

### <font style="color:rgb(79, 79, 79);">🧨🧨</font><font style="color:rgb(79, 79, 79);">乱码问题</font>
```plain
import java.awt.*;
import java.awt.event.*;

public class MenuDome {
    private Frame frame = new Frame("菜单");
    MenuBar menuBar = new  MenuBar();
    Menu fileMenu = new Menu("文件");
    Menu editMenu = new Menu("编辑");
    Menu formatMenu = new Menu("注释");

    MenuItem auto = new MenuItem("自动换行");
    MenuItem copy = new MenuItem("复制");
    MenuItem paste = new MenuItem("粘贴");
    MenuItem comment = new MenuItem("注释 ctrl + shift",new MenuShortcut(KeyEvent.VK_Q,true));
    TextArea ta = new TextArea(4,60);


    public void init(){
        comment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("点击" + e.getActionCommand() + "\n");
            }
        });
        formatMenu.add(comment);

        editMenu.add(auto);
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.add(formatMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        frame.setMenuBar(menuBar);
        frame.add(ta);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDome().init();
    }
}
```

<font style="color:rgb(77, 77, 77);">可以看到，此时菜单栏出现了乱码，别慌，只是编码问题  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127739925-c9d8864c-fdc3-4902-8831-5f028b475bb5.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">按图一步一步来编辑配置  
</font><font style="color:rgb(77, 77, 77);">1.在右上角选项栏找到编辑配置  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127740340-564f6cf4-f01a-4979-801e-82151573a5de.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">2.</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127740506-91f6a1a8-7711-4c63-adfc-d635d6a94655.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">3.在VM这一栏输入-Dfile.encoding=gbk  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127740611-732df1a7-1068-4742-920e-9d083fd93e44.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">记得点应用和确定</font>

## <font style="color:rgb(79, 79, 79);">🎠🎠</font><font style="color:rgb(79, 79, 79);">2.6 事件处理</font>
<font style="color:rgb(77, 77, 77);">前面介绍了如何放置各种组件，从而得到了丰富多彩的图形界面，但这些界面还不能响应用户的任何操作。比如单击前面所有窗口右上角的"X"按钮，但窗口依然不会关闭。因为在 AWT 编程中 ，所有用户的操作，都必须都需要经过一套事件处理机制来完成，而 Frame 和组件本身并没有事件处理能力。</font>

### <font style="color:rgb(77, 77, 77);">2.6.1 GUI事件处理机制</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">定义：当在某个组件上发生某些操作的时候，会自动的触发一段代码的执行。  
</font><font style="color:rgb(77, 77, 77);">在GUI事件处理机制中涉及到4个重要的概念需要理解：  
</font><font style="color:rgb(77, 77, 77);">事件源（Event Source）：操作发生的场所，通常指某个组件，例如按钮、窗口等；  
</font><font style="color:rgb(77, 77, 77);">事件（Event）：在事件源上发生的操作可以叫做事件，GUI会把事件都封装到一个Event对象中，如果需要知道该事件的详细信息，就可以通过Event对象来获取。  
</font><font style="color:rgb(77, 77, 77);">事件监听器(Event Listener):当在某个事件源上发生了某个事件，事件监听器就可以对这个事件进行处理。  
</font><font style="color:rgb(77, 77, 77);">注册监听：把某个事件监听器（A）通过某个事件(B)绑定到某个事件源</font><font style="color:rgb(77, 77, 77);">©</font><font style="color:rgb(77, 77, 77);">上，当在事件源C上发生了事件B之后，那么事件监听器A的代码就会自动执行。</font>

### <font style="color:rgb(77, 77, 77);">2.6.2 GUI中常见事件和事件监听器</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">事件监听器必须实现事件监听器接口，AWT提供了大量的事件监听器接口用于实现不同类型的事件监听器，用于监听不同类型的事件。AWT中提供了丰富的事件类，用于封装不同组件上所发生的特定操作，AWT的事件类都是AWTEvent类的子类，AWTEvent是EventObject的子类。</font>

#### <font style="color:rgb(77, 77, 77);">2.6.2.1事件</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">AWT把事件分为了两大类：  
</font><font style="color:rgb(77, 77, 77);">1.</font>**<font style="color:rgb(77, 77, 77);">低级事件:</font>**<font style="color:rgb(77, 77, 77);">这类事件是基于某个特定动作的事件。比如进入、点击、拖放等动作的鼠标事件，再比如得到焦点和失去焦点等焦点事件。  
</font><font style="color:rgb(77, 77, 77);">事件 触发时机  
</font><font style="color:rgb(77, 77, 77);">ComponentEvent组件事件,当组件尺寸发生变化、位置发生移动、显示/隐藏状态发生改变时触发该事件。  
</font><font style="color:rgb(77, 77, 77);">ContainerEvent  
</font><font style="color:rgb(77, 77, 77);">容器事件,当容器里发生添加组件、删除组件时触发该事件。  
</font><font style="color:rgb(77, 77, 77);">WindowEvent窗口事件,当窗 口状态发生改变（如打开、关闭、最大化、最小化）时触发该事件。  
</font><font style="color:rgb(77, 77, 77);">FocusEvent  
</font><font style="color:rgb(77, 77, 77);">焦点事件,当组件得到焦点或失去焦点 时触发该事件 。  
</font><font style="color:rgb(77, 77, 77);">KeyEvent  
</font><font style="color:rgb(77, 77, 77);">键盘事件,当按键被按下、松开、单击时触发该事件。  
</font><font style="color:rgb(77, 77, 77);">MouseEvent  
</font><font style="color:rgb(77, 77, 77);">鼠标事件，当进行单击、按下、松开、移动鼠标等动作 时触发该事件。  
</font><font style="color:rgb(77, 77, 77);">*PaintEvent组件绘制事件，该事件是一个特殊的事件类型，当GUI组件调用 update/paint 方法来呈现自身时触发该事件，该事件并非专用于事件处理模型 。  
</font><font style="color:rgb(77, 77, 77);">2.</font>**<font style="color:rgb(77, 77, 77);">高级事件</font>**<font style="color:rgb(77, 77, 77);">：这类事件并不会基于某个特定动作，而是根据功能含义定义的事件。  
</font><font style="color:rgb(77, 77, 77);">事件 触发时机  
</font><font style="color:rgb(77, 77, 77);">ActionEvent动作事件,当按钮、菜单项被单击，在 TextField 中按 Enter键时触发  
</font><font style="color:rgb(77, 77, 77);">AjustmentEvent调节事件，在滑动条上移动滑块以调节数值时触发该事件。  
</font><font style="color:rgb(77, 77, 77);">ItemEvent选项事件，当用户选中某项，或取消选中某项时触发该事件。  
</font><font style="color:rgb(77, 77, 77);">TextEvent文本事件，当文本框、文本域里的文本发生改变时触发该事件。</font>

### <font style="color:rgb(77, 77, 77);">2.6.2事件监听器</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">不同的事件需要使用不同的监听器监听，不同的监听器需要实现不同的监听器接口，当指定事件发生后，事件监听器就会调用所包含的事件处理器(实例方法)来处理事件。  
</font><font style="color:rgb(77, 77, 77);">事件类别 描述信息 监听器接口名  
</font><font style="color:rgb(77, 77, 77);">ActionEvent 激活组 ActionListener  
</font><font style="color:rgb(77, 77, 77);">ItemEvent 选择了某些项目ItemListener  
</font><font style="color:rgb(77, 77, 77);">MouseEvent 鼠标移动 MouseMotionListener  
</font><font style="color:rgb(77, 77, 77);">MouseEvent 鼠标点击等 MouseListener  
</font><font style="color:rgb(77, 77, 77);">KeyEvent 键盘输入 KeyListener  
</font><font style="color:rgb(77, 77, 77);">FocusEvent 组件收到或失去焦点FocusListener  
</font><font style="color:rgb(77, 77, 77);">AdjustmentEvent 移动了滚动条等组件AdjustmentListener  
</font><font style="color:rgb(77, 77, 77);">ComponentEvent对象移动缩放显示隐藏等ComponentListener  
</font><font style="color:rgb(77, 77, 77);">WindowEvent 窗口收到窗口级事件 WindowListener  
</font><font style="color:rgb(77, 77, 77);">ContainerEvent 容器中增加删除了组件ContainerListener  
</font><font style="color:rgb(77, 77, 77);">TextEvent 文本字段或文本区发生改变TextListener</font>

#### <font style="color:rgb(79, 79, 79);">🎧🎧</font><font style="color:rgb(79, 79, 79);">监听器案例</font>
<font style="color:rgb(77, 77, 77);">将操作在运行款显示出来  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127740647-8a7de4fc-7ba3-4285-8f38-2012639902f4.png)

```plain
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        TextField tf = new TextField();
        Choice names = new Choice();
        names.add("1");
        names.add("2");
        names.add("3");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        tf.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                String text = tf.getText();
                System.out.println("内容为" + text);
            }
        });
        names.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object item = e.getItem();
                System.out.println("当前选中" + item);
            }
        });
         frame.addContainerListener(new ContainerListener() {
             @Override
             public void componentAdded(ContainerEvent e) {
                 Component child = e.getChild();
                 System.out.println("选中" + child);
             }

             @Override
             public void componentRemoved(ContainerEvent e) {

             }
         });

        Box box = Box.createHorizontalBox();
        box.add(names);
        box.add(tf);
        frame.add(box);
        frame.pack();
        frame.setVisible(true);
    }
}
```

## <font style="color:rgb(77, 77, 77);">2.7 菜单组件</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">前面讲解了如果构建GUI界面，其实就是把一些GUI的组件，按照一定的布局放入到容器中展示就可以了。在实际开发中，除了主界面，还有一类比较重要的内容就是菜单相关组件，可以通过菜单相关组件很方便的使用特定的功能，在AWT中，菜单相关组件的使用和之前学习的组件是一模一样的，只需要把菜单条、菜单、菜单项组合  
</font><font style="color:rgb(77, 77, 77);">到一起，按照一定的布局，放入到容器中即可。</font>

<font style="color:rgb(77, 77, 77);">下表中给出常见的菜单相关组件：  
</font><font style="color:rgb(77, 77, 77);">菜单组件名称 功能  
</font><font style="color:rgb(77, 77, 77);">MenuBar 菜单条 ，菜单的容器。  
</font><font style="color:rgb(77, 77, 77);">Menu 菜单组件，菜单项的容器。它也是Menultem的子类，所以可作为菜单项使用  
</font><font style="color:rgb(77, 77, 77);">PopupMenu 上下文菜单组件(右键菜单组件)  
</font><font style="color:rgb(77, 77, 77);">Menultem 菜单项组件。  
</font><font style="color:rgb(77, 77, 77);">CheckboxMenultem 复选框菜单项组件  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127740658-08977e5f-6a75-451d-bbbf-f000d865a291.png)

<font style="color:rgb(77, 77, 77);">菜单相关组件使用：  
</font><font style="color:rgb(77, 77, 77);">1.准备菜单项组件，这些组件可以是Menultem及其子类对象  
</font><font style="color:rgb(77, 77, 77);">2.准备菜单组件Menu或者PopupMenu(右击弹出子菜单)，把第一步中准备好的菜单项组件添加进来；  
</font><font style="color:rgb(77, 77, 77);">3.准备菜单条组件MenuBar，把第二步中准备好的菜单组件Menu添加进来；  
</font><font style="color:rgb(77, 77, 77);">4.把第三步中准备好的菜单条组件添加到窗口对象中显示。  
</font><font style="color:rgb(77, 77, 77);">小技巧：  
</font><font style="color:rgb(77, 77, 77);">1.如果要在某个菜单的菜单项之间添加分割线，那么只需要调用Menu的add（new Menultem(“-”) 即可。  
</font><font style="color:rgb(77, 77, 77);">2.如果要给某个菜单项关联快捷键功能，那么只需要在创建菜单项对象时设置即可，例如给菜单项关联ctrl+shift+Q 快捷键，只需要：new Menultem(“菜单项名字”,new MenuShortcut(KeyEvent.VK_Q,true);</font>

#### <font style="color:rgb(79, 79, 79);">菜单小案例</font>
<font style="color:rgb(77, 77, 77);">实现如下</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127740948-9dd8466b-08a6-47bb-b9db-d6432da4ee2c.png)

```plain
import java.awt.*;
import java.awt.event.*;

public class MenuDome {
    private Frame frame = new Frame("菜单");
    MenuBar menuBar = new  MenuBar();
    Menu fileMenu = new Menu("文件");
    Menu editMenu = new Menu("编辑");
    Menu formatMenu = new Menu("注释");

    MenuItem auto = new MenuItem("自动换行");
    MenuItem copy = new MenuItem("复制");
    MenuItem paste = new MenuItem("粘贴");
    MenuItem comment = new MenuItem("注释 ctrl + shift",new MenuShortcut(KeyEvent.VK_Q,true));
    TextArea ta = new TextArea(4,60);


    public void init(){
        comment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append("点击" + e.getActionCommand() + "\n");
            }
        });
        formatMenu.add(comment);

        editMenu.add(auto);
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.add(formatMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        frame.setMenuBar(menuBar);
        frame.add(ta);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDome().init();
    }
}
```

## <font style="color:rgb(77, 77, 77);">2.8 绘图</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">很多程序如各种游戏都需要在窗口中绘制各种图形，除此之外，即使在开发JavaEE项目时， 有 时候也必须"动态"地向客户 端生成各种图形、图表，比如 图形验证码、统计图等，这都需要利用AWT的绘图功能。</font>

### <font style="color:rgb(77, 77, 77);">2.8.1 组件绘图原理</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">之前我们已经学习过很多组件，例如Button、Frame、Checkbox等等，不同的组件，展示出来的图形都不一样，其实这些组件展示出来的图形，其本质就是用AWT的绘图来完成的。  
</font><font style="color:rgb(77, 77, 77);">在AWT中，真正提供绘图功能的是Graphics对象，那么Component组件和Graphics对象存在什么关系，才能让Component绘制自身图形呢？在Component类中，提供了下列三个方法来完成组件图形的绘制与刷新：  
</font><font style="color:rgb(77, 77, 77);">paint(Graphics g):绘制组件的外观；  
</font><font style="color:rgb(77, 77, 77);">update(Graphics g):内部调用paint方法，刷新组件外观；  
</font><font style="color:rgb(77, 77, 77);">repaint():调用update方法，刷新组件外观；</font>

### <font style="color:rgb(77, 77, 77);">2.8.2 Graphics对象的使用</font>
<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">实际生活中如果需要画图，首先我们得准备一张纸，然后在拿一支画笔，配和一些颜色，就可以在纸上画出来各种各样的图形，例如圆圈、矩形等等。程序中绘图也一样，也需要画布，画笔，颜料等等。AWT中提供了Canvas类充当画布，提供了Graphics类来充当画笔，通过调用Graphics对象的setColor()方法可以给画笔设置颜色。  
</font>**<font style="color:rgb(77, 77, 77);">画图的步骤</font>**<font style="color:rgb(77, 77, 77);">：  
</font><font style="color:rgb(77, 77, 77);">1.自定义类，继承Canvas类，重写paint(Graphics g)方法完成画图；  
</font><font style="color:rgb(77, 77, 77);">2.在paint方法内部，真正开始画图之前调用Graphics对象的setColor()、setFont()等方法设置画笔的颜色、字体等属性；o  
</font><font style="color:rgb(77, 77, 77);">3.调用Graphics画笔的drawXxx()方法开始画图。</font>

<font style="color:rgb(77, 77, 77);">其实画图的核心就在于使用Graphics画笔在Canvas画布上画出什么颜色、什么样式的图形，所以核心在画笔上下表中列出了Graphics类中常用的一些方法：</font>

| <font style="color:rgb(77, 77, 77);">方法名称 </font> | <font style="color:rgb(77, 77, 77);">方法功能</font> |
| --- | --- |
| <font style="color:rgb(77, 77, 77);">setColor(Color c)</font> | <font style="color:rgb(77, 77, 77);">设置颜色</font> |
| <font style="color:rgb(77, 77, 77);">setFont(Font font)</font> | <font style="color:rgb(77, 77, 77);">设置字体</font> |
| <font style="color:rgb(77, 77, 77);">drawLine()</font> | <font style="color:rgb(77, 77, 77);">绘制直线</font> |
| <font style="color:rgb(77, 77, 77);">drawRect()</font><font style="color:rgb(78, 161, 219);"></font> | <font style="color:rgb(78, 161, 219);">绘制矩形</font> |
| <font style="color:rgb(77, 77, 77);">drawRoundRect()</font> | <font style="color:rgb(77, 77, 77);">绘制圆角矩形</font> |
| <font style="color:rgb(77, 77, 77);">drawOval()</font> | <font style="color:rgb(77, 77, 77);">绘制椭圆形</font> |
| <font style="color:rgb(77, 77, 77);">drawPolygon()</font> | <font style="color:rgb(77, 77, 77);">绘制多边形</font> |
| <font style="color:rgb(77, 77, 77);">drawArc()</font> | <font style="color:rgb(77, 77, 77);">绘制圆弧</font> |
| <font style="color:rgb(77, 77, 77);">drawPolyline()</font> | <font style="color:rgb(77, 77, 77);">绘制折线</font> |
| <font style="color:rgb(77, 77, 77);">fillRect()</font> | <font style="color:rgb(77, 77, 77);">填充矩形区域</font> |
| <font style="color:rgb(77, 77, 77);">fillRoundRect()</font> | <font style="color:rgb(77, 77, 77);">填充圆角矩形区域</font> |
| <font style="color:rgb(77, 77, 77);">fillOval()</font> | <font style="color:rgb(77, 77, 77);">填充椭圆区域</font> |
| <font style="color:rgb(77, 77, 77);">fillPolygon()</font> | <font style="color:rgb(77, 77, 77);">填充多边形区域</font> |
| <font style="color:rgb(77, 77, 77);">fillArc()</font> | <font style="color:rgb(77, 77, 77);">填充圆弧对应的扇形区域</font> |
| <font style="color:rgb(77, 77, 77);">drawlmage()</font> | <font style="color:rgb(77, 77, 77);">绘制位图</font> |


#### <font style="color:rgb(79, 79, 79);">🎃🎃</font><font style="color:rgb(79, 79, 79);">绘图案例</font>
<font style="color:rgb(77, 77, 77);">需求：编写一个窗口实现绘制矩形和圆形  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127741216-db62a974-cb3a-49e6-a6de-b63dbc34bb02.png)

```plain
package java2.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CanvasShape {
    public final String RECT = "rect";
    public final String OVAL = "oval";
    
    private Frame frame = new Frame("绘图");
    
    Button bRect = new Button("矩形");
    Button bOval = new Button("椭圆");
    private String shape = "";//判断形状
    private class MyCanvas extends Canvas{
        @Override//这里编写MyCanvas类继承Canvas类
        public void paint(Graphics g) {//g就是画笔
            if(shape.equals(RECT))
            {
                g.setColor(Color.BLUE);
                g.drawRect(100,100,150,100);
            }//图像的颜色位置坐标和长宽大小
            else if(shape.equals(OVAL)){
                g.setColor(Color.PINK);
                g.drawOval(100,100,200,200);

            }

        }
    }
    MyCanvas drawArea = new MyCanvas();
//这相当于画布
    public void init(){
        bRect.addActionListener(new ActionListener() {//监听器来监听动作行为做出反应
            @Override
            public void actionPerformed(ActionEvent e) {
                shape = RECT;
                drawArea.repaint();
            }
        });
        bOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shape = OVAL;
                drawArea.repaint();
            }
        });

        Panel p = new Panel();
        p.add(bOval);
        p.add(bRect);
        drawArea.setPreferredSize(new Dimension(300,300));//画布大小尺寸
        frame.add(p,BorderLayout.SOUTH);
        frame.add(drawArea);

        frame.addWindowListener(new WindowAdapter() {//用于关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setVisible(true);

    }


    public static void main(String[] args) {
        new CanvasShape().init();
    }
}
```

