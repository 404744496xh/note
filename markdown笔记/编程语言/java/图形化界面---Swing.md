## <font style="color:rgb(79, 79, 79);">⓵ 前言</font>
<font style="color:rgb(77, 77, 77);">和早期版本中的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AWT</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">相比，</font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">更为强大、性能更优良，它除了保留了</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AWT</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中几个重量级组件之外，其他组件都为轻量级组件。这样。使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">开发出的窗体风格会与当前运行平台上的窗体风格一致。同时，程序员也可以在跨平台时指定窗体统一的风格与外观。</font>

## <font style="color:rgb(79, 79, 79);">⓶ Swing概述</font>
**<font style="color:rgb(77, 77, 77);">GUI</font>**<font style="color:rgb(77, 77, 77);">（图形用户界面）为程序提供图形界面，它最初的设计目的是为程序员构建一个通用的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">GUI</font>**<font style="color:rgb(77, 77, 77);">，使其能够在所有的平台上运行，但</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Java 1.0</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中基础类</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AWT</font>**<font style="color:rgb(77, 77, 77);">（抽象窗口工具箱）并没有达到这个要求，于是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">出现了，它是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AWT</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件的增强组件，但是它又不能完全替代</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AWT</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件，这两种组件需要同时出现在一个图形用户界面中。</font>

### <font style="color:rgb(79, 79, 79);">🐱</font><font style="color:rgb(79, 79, 79);"> Swing的特点</font>
<font style="color:rgb(77, 77, 77);">原来的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AWT</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件来自</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">java.awt</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">包，当含有</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AWT</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Java</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">应用程序在不同的平台上执行时，每个平台的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">GUI</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件的显示会有所不同，但是在不同平台运行使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">开发的应用程序时，就可以统一</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">GUI</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件的显示风格，因为</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);">组件允许编程人员在跨平台时指定统一的外观和风格。</font>

**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件通常被称为 “轻量级组件”，因为它完全由</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Java</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">语言编写，</font>**<font style="color:rgb(77, 77, 77);">Java</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">是不依赖于操作系统的语言，它可以在任何平台上运行，而依赖于本地平台的组件相应地被称为 “重量级组件”，比如</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AWT</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件就是依赖本地平台的窗口系统来决定组件的功能、外观和风格的。</font>

**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">主要具有以下特点。  
</font><font style="color:rgb(77, 77, 77);">(1) 轻量级组件  
</font><font style="color:rgb(77, 77, 77);">(2) 可插入外观组件</font>

### <font style="color:rgb(79, 79, 79);">🐱</font><font style="color:rgb(79, 79, 79);"> Swing包</font>
<font style="color:rgb(77, 77, 77);">为了有效地使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件，必须了解</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">包的层次结构和继承关系，其中比较重要的类是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Component</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类、</font>**<font style="color:rgb(77, 77, 77);">Container</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类和</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JComponent</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类。下图描述了这些类的层次和继承关系。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127364412-d07ff72f-c770-43fb-9ff4-3c1f973b64e4.png)

**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件中的大多数</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">GUI</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件都是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Component</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的直接子类或间接子类，</font>**<font style="color:rgb(77, 77, 77);">JComponent</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件各种特性的存放位置，这些组件的特性包括设定组件边界、</font>**<font style="color:rgb(77, 77, 77);">GUI</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件自动滚动等。</font>

**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件中的最重要的父类是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Container</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，</font>**<font style="color:rgb(77, 77, 77);">Container</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类又有两个最重要的子类，分别为</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">java.awt.Window</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">与</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">java.awt.Frame</font>**<font style="color:rgb(77, 77, 77);">。除了以往的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AWT</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类组件会继承这两个类之外，现在的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件同样也会扩展了这两个类。</font>

<font style="color:rgb(77, 77, 77);">从上图中我们可以看到，顶层父类是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Component</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类与</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Container</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，所以</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Java</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">关于窗口组件的编写，都与组件及容器的概念相关联。</font>

### <font style="color:rgb(79, 79, 79);">🐱</font><font style="color:rgb(79, 79, 79);"> 常用组件概述</font>
<font style="color:rgb(77, 77, 77);">下面给出基本的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件的概述，表中列举了常用的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件及其含义。</font>

| **<font style="color:rgb(79, 79, 79);">组件名称</font>** | **<font style="color:rgb(79, 79, 79);">定义</font>** |
| :---: | :---: |
| <font style="color:rgb(79, 79, 79);">JButton</font> | <font style="color:rgb(79, 79, 79);">按钮，按钮可以带一些图片或文字</font> |
| <font style="color:rgb(79, 79, 79);">JCheckBox</font> | <font style="color:rgb(79, 79, 79);">复选框</font> |
| <font style="color:rgb(79, 79, 79);">JComBox</font> | <font style="color:rgb(79, 79, 79);">下拉列表框，可以在下拉显示区域显示多个选项</font> |
| <font style="color:rgb(79, 79, 79);">JFrame</font> | <font style="color:rgb(79, 79, 79);">框架类</font> |
| <font style="color:rgb(79, 79, 79);">JDialog</font> | <font style="color:rgb(79, 79, 79);">对话框</font> |
| <font style="color:rgb(79, 79, 79);">JLabel</font> | <font style="color:rgb(79, 79, 79);">标签组件</font> |
| <font style="color:rgb(79, 79, 79);">JRadioButton</font> | <font style="color:rgb(79, 79, 79);">单选按钮</font> |
| <font style="color:rgb(79, 79, 79);">JList</font> | <font style="color:rgb(79, 79, 79);">能够在用户界面中显示一系列条目的组件</font> |
| <font style="color:rgb(79, 79, 79);">JTextField</font> | <font style="color:rgb(79, 79, 79);">文本框</font> |
| <font style="color:rgb(79, 79, 79);">JPasswordField</font> | <font style="color:rgb(79, 79, 79);">密码框</font> |
| <font style="color:rgb(79, 79, 79);">JTextArea</font> | <font style="color:rgb(79, 79, 79);">文本区域</font> |
| <font style="color:rgb(79, 79, 79);">JOptionPane</font> | <font style="color:rgb(79, 79, 79);">一些面板</font> |


## <font style="color:rgb(79, 79, 79);">⓷ 常见顶层窗体</font>
<font style="color:rgb(77, 77, 77);">窗体作为</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">应用程序中组件的承载体，处于非常重要的位置。</font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中常用的窗体包括</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">和</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体，下面我们将会讲解这两个窗体的使用方法。</font>

### <font style="color:rgb(79, 79, 79);">🐱</font><font style="color:rgb(79, 79, 79);"> JFrame 窗体</font>
**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体是一个容器，它是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">程序中各个组件的载体，因此，可以将</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">看作是承载这些</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件的容器。</font>

<font style="color:rgb(77, 77, 77);">在开发应用程序时，可以通过继承</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">java.swing.JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类来创建一个窗体，然后再在窗体中添加组件，同时为组件设置事件。由于该窗体继承了</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，所以它拥有最大化、最小化和关闭按钮。</font>

<font style="color:rgb(77, 77, 77);">下面将详细讲解</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体在</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Java</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">应用程序中的使用方法。</font>

**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">在程序中的语法格式如下：</font>

```plain
JFrame frame = new JFrame(title);
Container container = frame.getContentPane();
```

<font style="color:rgb(77, 77, 77);">①</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">frame</font>**<font style="color:rgb(77, 77, 77);">：</font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的对象。  
</font><font style="color:rgb(77, 77, 77);">②</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">container</font>**<font style="color:rgb(77, 77, 77);">：</font>**<font style="color:rgb(77, 77, 77);">Container</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的对象，可以使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象调用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">getContentPane()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法获取。</font>

<font style="color:rgb(77, 77, 77);">我们应该有这样的一个概念，就是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件的窗体通常与组件和容器相关，所以在</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象创建完成后，需要调用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">getContentPane()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法将窗体转换为容器，然后在容器中添加组件或设置布局管理器。通常这个容器用来包含和显示组件。如果需要将组件添加至容器，那么可以使用来自</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Container</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">add()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法进行设置，示例代码如下：</font>

```plain
container.add(new JButton("按钮"));                     //JButton按钮组件
```

<font style="color:rgb(77, 77, 77);">在容器中添加组件后，也可以使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Container</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">remove()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法将这些组件从容器中删除，示例代码如下：</font>

```plain
container.remove(new JButton("按钮"));
```

<font style="color:rgb(77, 77, 77);">我们来看看下面这个实例，该实例使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象创建了一个窗体，然后在其中添加一个组件。</font>

<font style="color:rgb(77, 77, 77);">在项目中创建</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">MyFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，该类继承</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类成为窗体类，然后在该类中创建标签组件，并添加到窗体界面中。</font>

```plain
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {                       	//定义一个类继承JFrame类

    public void CreateJFrame(String title) {                	//定义一个CreateJFrame()方法

        JFrame frame = new JFrame(title);                     	 //实例化一个JFrame对象
        Container container = frame.getContentPane();          	// 获取一个容器
        container.setBackground(Color.CYAN);                  	//设置容器的背景颜色

        JLabel jl = new JLabel("这是一个JFrame窗体");        	//创建一个JLabel标签
        jl.setHorizontalAlignment(SwingConstants.CENTER);       //使标签上的文字居中
        container.add(jl);                                      // 将标签添加到容器中


        frame.setVisible(true);                                //使窗体可视
        frame.setBounds(400,300,400, 300);  				   //设置窗体显示位置和大小
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);         //设置窗体关闭方式
    }

    public static void main(String args[]) {
        //在主方法中调用createJFrame()方法
        new MyFrame().CreateJFrame("一个JFrame窗体");
    }
}
```

<font style="color:rgb(77, 77, 77);">运行本实例程序，结果如下所示：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127364770-d3bae51d-8c91-4438-8640-1e098cdb8214.png)

<font style="color:rgb(77, 77, 77);">上述程序中的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">MyFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类继承了</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，在</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">CreateJFrame()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法中实例子化</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象。</font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的常用构造方法包括下面两种形式。</font>

```plain
public JFrame()

public JFrame(String title)
```

**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类中的两种构造方法分别为无参的构造方法与有参的构造方法：</font>

<font style="color:rgb(77, 77, 77);">第一种形式的构造方法创建一个初始不可见、没有标题的新窗体。</font>

<font style="color:rgb(77, 77, 77);">第二种形式的构造方法在实例化该</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象时，创建一个不可见但具有标题的窗体。</font>

<font style="color:rgb(77, 77, 77);">我们可以使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象调用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">show()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法使窗体可见，但是这个方法早已被新版</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JDK</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">弃用，现在通常使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">setVisible(true)</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法使窗体可见。</font>

<font style="color:rgb(77, 77, 77);">同时，可以使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">setBounds(x,y,width, height)</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法设置窗体显示位置和大小，其中</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">x</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">与</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">y</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">为窗体左上角坐标，</font>**<font style="color:rgb(77, 77, 77);">width</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">和</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">height</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">为窗体的宽和高。</font>

<font style="color:rgb(77, 77, 77);">创建窗体后，需要给予窗体一个关闭方式，可以调用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">setDefaultCloseOperation()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法关闭窗体。</font>

<font style="color:rgb(77, 77, 77);">Java为关闭窗体提供了多种方式，常用的有4种方式，分别为：</font>**<font style="color:rgb(77, 77, 77);">DO_NOTHING_ON_CLOSE</font>**<font style="color:rgb(77, 77, 77);">、</font>**<font style="color:rgb(77, 77, 77);">DISPOSE_ON_CLOSE</font>**<font style="color:rgb(77, 77, 77);">、</font>**<font style="color:rgb(77, 77, 77);">HIDE_ON_CLOSE</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">和</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">EXIT_ON_CLOSE</font>**<font style="color:rgb(77, 77, 77);">，这几种操作实质上是将一个</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">int</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类型的常量封装在</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">javax.swing.WindowConstants</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">接口中。</font>

<font style="color:rgb(77, 77, 77);">具体含义如下：</font>

| **<font style="color:rgb(79, 79, 79);">关闭窗体方式</font>** | **<font style="color:rgb(79, 79, 79);">描述</font>** |
| :---: | :---: |
| **<font style="color:rgb(79, 79, 79);">EXIT_ON_CLOSE</font>** | <font style="color:rgb(79, 79, 79);">退出应用程序，默认窗口关闭</font> |
| **<font style="color:rgb(79, 79, 79);">DO_NOTHING_ON_CLOSE</font>** | <font style="color:rgb(79, 79, 79);">什么都不做就将窗体关闭</font> |
| **<font style="color:rgb(79, 79, 79);">DISPOSE_ON_CLOSE</font>** | <font style="color:rgb(79, 79, 79);">移除窗口的默认窗口关闭操作</font> |
| **<font style="color:rgb(79, 79, 79);">HIDE_ON_CLOSE</font>** | <font style="color:rgb(79, 79, 79);">隐藏窗口的默认窗口关闭</font> |


### <font style="color:rgb(79, 79, 79);">🐱</font><font style="color:rgb(79, 79, 79);"> JDialog 窗体</font>
**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件中的对话框，它继承了</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AWT</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件中的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">java.awt.Dialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类。</font>

**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体的功能是从一个窗体中弹出另一个窗体，就像是在使用浏览器时弹出其他的对话框一样。</font>**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体实质上就是另一种类型的窗体，它与</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体类似，在使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体时也需要调用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">getContentPane()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法，从而将窗体转换为容器，然后在容器中设置窗体的特性。</font>

<font style="color:rgb(77, 77, 77);">在应用程序中创建</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体需要实例化</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，通常使用以下几种</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的构造方法。</font>

| **<font style="color:rgb(79, 79, 79);">构造方法</font>** | **<font style="color:rgb(79, 79, 79);">描述</font>** |
| :---: | :---: |
| **<font style="color:rgb(79, 79, 79);">public JDialog()</font>** | <font style="color:rgb(79, 79, 79);">创建一个没有标题和父窗体的对话框</font> |
| **<font style="color:rgb(79, 79, 79);">public JDialog(Frame f)</font>** | <font style="color:rgb(79, 79, 79);">创建一个指定父窗体的对话框，但该窗体没有标题</font> |
| **<font style="color:rgb(79, 79, 79);">public JDialog(Frame f, boolean model)</font>** | <font style="color:rgb(79, 79, 79);">创建一个指定类型的对话框，并指定父窗体，但该窗体没有指定标题</font> |
| **<font style="color:rgb(79, 79, 79);">public JDialog(Frame f, String title)</font>** | <font style="color:rgb(79, 79, 79);">创建一个指定标题和父窗体的对话框</font> |
| **<font style="color:rgb(79, 79, 79);">public JDialog(Frame f, String title, boolean model)</font>** | <font style="color:rgb(79, 79, 79);">创建一个指定标题、窗体和模式的对话框</font> |


<font style="color:rgb(77, 77, 77);">下面我们来看一个实例，该实例主要实现单击</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体中的按钮后弹出另一个对话框窗体的功能。</font>

<font style="color:rgb(77, 77, 77);">要求：在项目中创建</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">MyJDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，该类继承</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体，然后在窗体中添加一个按钮，当用户单击该按钮后，程序将弹出一个对话框窗体。</font>

```plain
import javax.swing.*;
import java.awt.*;

class MyJDialog extends JDialog {                           //创建新类继承JDialog类

    public MyJDialog(MyFrame frame) {
        //实例化一个JDialog类对象，指定对话框的父窗体、窗体标题和类型
        super(frame, "JDialog窗体", true);

        Container container = getContentPane();                    //创建一个容器
        container.add(new JLabel("这是一个对话框"));           //在容器中添加标签
        setBounds(120, 120, 150, 100);          //设置对话框窗体大小
    }
}

public class MyFrame extends JFrame {                            //创建新类

    public MyFrame() {
        Container container = getContentPane();                 //创建一个容器
        container.setLayout(null);

        JLabel label = new JLabel("这是一个JFrame窗体");      //在窗体中设置标签
        label.setHorizontalAlignment(SwingConstants.CENTER);    //将标签的文字置于标签中间位置
        container.add(label);

        JButton button = new JButton("点我弹出对话框");         //定义一个按钮
        button.setBounds(10, 10, 150, 20);

        //为按钮添加鼠标单击事件
        button.addActionListener(e -> {
            //使MyJDialog窗体可见
            new MyJDialog(MyFrame.this).setVisible(true);
        });

        container.add(button);                             // 将按钮添加到容器中
        container.setBackground(Color.white);

        setSize(400,300);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    //main方法
    public static void main(String args[]) {
        // 实例化MyJDialog类对象
        new MyFrame();
    }
}
```

<font style="color:rgb(77, 77, 77);">运行本实例，运行结果如下图所示：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127365071-5f4e0eb2-d592-4fba-a20a-73eea890fe02.png)

<font style="color:rgb(77, 77, 77);">本实例为了使对话框在父窗体中弹出，定义了一个</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体，然后在该窗体中添加一个按钮，并为此按钮添加一个鼠标单击监听事件（这儿使用了</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">lambda</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">表达式），这里使用 “</font>**<font style="color:rgb(77, 77, 77);">new MyJDialog().setVisible(true)</font>**<font style="color:rgb(77, 77, 77);">” 语句使对话框窗体可见，这样就实现了当用户单击该按钮后将弹出对话框的功能。</font>

<font style="color:rgb(77, 77, 77);">由于</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">MyJDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类继承了</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，所以可以在构造方法中使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">super</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">关键字调用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">构造方法。这里使用了 “</font>**<font style="color:rgb(77, 77, 77);">public JDialog(Frame f, String title, boolean model)</font>**<font style="color:rgb(77, 77, 77);">” 这种形式的构造方法，同时设置了自定义的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体及对话框的标题和窗体类型。</font>

<font style="color:rgb(77, 77, 77);">从本实例的代码可以看出，</font>**<font style="color:rgb(77, 77, 77);">JDialog</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体与</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">窗体形式基本相同，甚至在设置窗体的特性时所调用的方法名称都基本相同，比如设置窗体大小、设置窗体关闭状态等。</font>

## <font style="color:rgb(79, 79, 79);">⓸ 应用基本组件</font>
<font style="color:rgb(77, 77, 77);">软件界面是软件和用户之间的交流平台，而组件则是构成软件界面的基本元素，是软件和用户之间的交流途径。例如，用标签组件来显示相关信息，用单选按钮、复选框、文本框等接受用户的输入信息，用按钮来提交用户的输入信息等等。</font>

### <font style="color:rgb(79, 79, 79);">🐱</font><font style="color:rgb(79, 79, 79);"> 标签组件：JLabel</font>
<font style="color:rgb(77, 77, 77);">用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JLabel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件显示文本和图像时，不仅可以只显示其中的一者，而且可以同时显示。在通过构造方法创建组件对象时，可以设置标签内容相对于组件的水平显示位置。</font>

**<font style="color:rgb(77, 77, 77);">JLabel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类提供的所有构造方法如下表所示：</font>

| **<font style="color:rgb(79, 79, 79);">构造方法</font>** | **<font style="color:rgb(79, 79, 79);">描述</font>** |
| :---: | :---: |
| **<font style="color:rgb(79, 79, 79);">JLabel()</font>** | <font style="color:rgb(79, 79, 79);">创建一个既无文本内容，又无图像内容的标签</font> |
| **<font style="color:rgb(79, 79, 79);">JLabel(String text)</font>** | <font style="color:rgb(79, 79, 79);">创建一个具有文本内容的标签</font> |
| **<font style="color:rgb(79, 79, 79);">JLabel(String text, int horizontalAlignment)</font>** | <font style="color:rgb(79, 79, 79);">创建一个具有文本内容并且指定水平显示位置的标签</font> |
| **<font style="color:rgb(79, 79, 79);">JLabel(Icon icon)</font>** | <font style="color:rgb(79, 79, 79);">创建一个具有图像内容的标签</font> |
| **<font style="color:rgb(79, 79, 79);">JLabel(Icon icon, int horizontalAlignment)</font>** | <font style="color:rgb(79, 79, 79);">创建一个具有图像内容并且指定水平显示位置的标签</font> |
| **<font style="color:rgb(79, 79, 79);">JLabel(String text, Icon icon, int horizontalAlignment)</font>** | <font style="color:rgb(79, 79, 79);">创建一个既有文本内容，又有图像内容，并且指定水平显示位置的标签</font> |


<font style="color:rgb(77, 77, 77);">构造方法中的入口参数</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">horizontalAlignment</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">可以从</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JLabel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的静态常量中选择，可选的静态常量如下表所示：</font>

| **<font style="color:rgb(79, 79, 79);">静态变量</font>** | **<font style="color:rgb(79, 79, 79);">常量值</font>** | **<font style="color:rgb(79, 79, 79);">标签内容显示位置</font>** |
| :---: | :---: | :---: |
| **<font style="color:rgb(79, 79, 79);">LEFT</font>** | <font style="color:rgb(79, 79, 79);">2</font> | <font style="color:rgb(79, 79, 79);">靠左侧显示</font> |
| **<font style="color:rgb(79, 79, 79);">CENTER</font>** | <font style="color:rgb(79, 79, 79);">0</font> | <font style="color:rgb(79, 79, 79);">居中显示</font> |
| **<font style="color:rgb(79, 79, 79);">RIGHT</font>** | <font style="color:rgb(79, 79, 79);">4</font> | <font style="color:rgb(79, 79, 79);">靠右侧显示</font> |


**<font style="color:rgb(77, 77, 77);">JLabel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类中提供了众多的方法，方便程序员设置标签的内容，常用方法有以下几个：</font>

| **<font style="color:rgb(79, 79, 79);">方法</font>** | **<font style="color:rgb(79, 79, 79);">描述</font>** |
| :---: | :---: |
| **<font style="color:rgb(79, 79, 79);">setText(String text)</font>** | <font style="color:rgb(79, 79, 79);">设置要显示的文本</font> |
| **<font style="color:rgb(79, 79, 79);">setIcon(Icon icon)</font>** | <font style="color:rgb(79, 79, 79);">设置要显示的图像</font> |
| **<font style="color:rgb(79, 79, 79);">setHorizontalAlignment(int alignment)</font>** | <font style="color:rgb(79, 79, 79);">设置标签内容在水平方向的对齐方式</font> |
| **<font style="color:rgb(79, 79, 79);">setHorizontalTextPosition(int textPosition)</font>** | <font style="color:rgb(79, 79, 79);">设置文本相对于图像在水平方向的位置</font> |
| **<font style="color:rgb(79, 79, 79);">setVerticalAlignment(int alignment)</font>** | <font style="color:rgb(79, 79, 79);">设置标签内容在垂直方向的对齐方式</font> |
| **<font style="color:rgb(79, 79, 79);">setVerticalTextPosition(int textPosition)</font>** | <font style="color:rgb(79, 79, 79);">设置文本相对于图像在垂直方向的位置</font> |
| **<font style="color:rgb(79, 79, 79);">setIconTextGap(int iconTextGap)</font>** | <font style="color:rgb(79, 79, 79);">设置文本和图像之间的距离，单位为像素，默认为 4 像素</font> |
| **<font style="color:rgb(79, 79, 79);">setEnabled(boolean enabled)</font>** | <font style="color:rgb(79, 79, 79);">设置标签是否可用，设为 false 时表示不可用，默认为可用</font> |
| **<font style="color:rgb(79, 79, 79);">setDisabledIcon(Icon disabledIcon)</font>** | <font style="color:rgb(79, 79, 79);">设置当标签不可以时显示的图像</font> |


<font style="color:rgb(77, 77, 77);">下面我们将通过一个例子来进一步了解</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JLabel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件的使用方法。</font>

<font style="color:rgb(77, 77, 77);">要求：首先将窗口标题修改为 “添加标签”，然后创建一个带有指定文本的标签对象，并为标签添加一幅图像，设置标签内容的显示位置，最后将标签设置为不可用，并设置标签在不可用的情况下显示另一幅图像。</font>

```plain
import javax.swing.*;

public class MyFrame extends JFrame {       //创建新类
    JLabel label;

    public MyFrame() {
        //修改窗口标题
        setTitle("添加标签");

        label = new JLabel("我是一个JLabel！", JLabel.CENTER);                               //创建指定文本的标签对象

        label.setIcon(new ImageIcon("C:\\Users\\15269\\Desktop\\自行车.png"));              //为标签添加图像

        label.setHorizontalTextPosition(JLabel.CENTER);                                    //设置文本相对于图像的水平位置

        label.setVerticalTextPosition(JLabel.BOTTOM);                                     //设置文本相对于图像的垂直位置

        label.setEnabled(false);                                                       	  //设置标签为不可用

        label.setDisabledIcon(new ImageIcon("C:\\Users\\15269\\Desktop\\射箭.png"));      //设置标签在不可用的情况下显示的图像

        add(label);  // 将标签添加到窗口中

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,300,800,650);
        setVisible(true);
    }

    //main方法
    public static void main(String args[]) {
        new MyFrame();
    }
}
```

<font style="color:rgb(77, 77, 77);">直接运行该实例，将会显示如下图所示的窗口：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127365117-e1384930-219e-42be-8f7d-7a6f26c86e5b.png)

<font style="color:rgb(77, 77, 77);">在标签不可用的情况下文字是灰色的，如果未设置标签在不可用的情况下显示其他图像，那么显示的原图像也将是灰色的，比如我们将</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">label.setDisabledIcon(new ImageIcon(“C:\Users\15269\Desktop\射箭.png”))</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">这一行注释掉，将会得到下图这样的图像：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127365208-db621ea6-723b-4e5c-b6f2-f1e08e341814.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">如果我们将</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">label.setEnabled(false)</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">注释掉，将会得到这样的结果：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127365235-0e8f490c-8a04-4a7b-ba6d-6c0c4cc2ab68.png)

### <font style="color:rgb(79, 79, 79);">🐱</font><font style="color:rgb(79, 79, 79);"> 按钮组件</font>
**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中的按钮是较为常见的组件，它用于触发特定动作。</font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">提供了很多种按钮，包括提交按钮、复选框按钮、单选按钮等，这些按钮都是从</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AbstractButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类中继承而来的。</font>

#### <font style="color:rgb(79, 79, 79);">🐶</font><font style="color:rgb(79, 79, 79);"> 普通按钮：JButton</font>
**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中的普通按钮由</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象表示，其构造方法主要有如下几种形式：  
</font>**<font style="color:rgb(77, 77, 77);">① public JButton()  
</font>****<font style="color:rgb(77, 77, 77);">② public JButton(String text)  
</font>****<font style="color:rgb(77, 77, 77);">③ public JButton(Icon icon)  
</font>****<font style="color:rgb(77, 77, 77);">④ public JButton(String text, Icon icon)</font>**

<font style="color:rgb(77, 77, 77);">通过使用上述构造方法，在</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">按钮上不仅能显示文本标签，还可以显示图标。上述构造方法中的第一个构造方法可以生成不带任何文字和图标的组件，然后根据需要再使用相应的方法为按钮设置指定的文本和图标，其他构造方法都在初始化时指定了按钮上显示的图标或文字。</font>

<font style="color:rgb(77, 77, 77);">下面我们通过一个简单的例子来进一步了解</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">的使用。</font>

<font style="color:rgb(77, 77, 77);">创建窗体，然后在窗体中添加两个按钮组件，分别用于显示文本内容与图片内容。</font>

```plain
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class MyFrame extends JFrame {       //创建新类
    JPanel root;
    JButton messageButton,imageButton;

    public MyFrame() throws IOException {
        root = new JPanel();      //定义面板容器
        setContentPane(root);
        setLayout(null);         //设置面板为绝对布局

        //按钮添加文字
        messageButton = new JButton("普通按钮");        //定义显示文本内容的按钮
        messageButton.setBounds(54, 68, 100, 40);      //设置按钮显示位置和大小
        root.add(messageButton);                       //将按钮添加到面板容器中

        //按钮添加图标
        ImageIcon icon = new ImageIcon(ImageIO.read(new File("C:\\Users\\15269\\Desktop\\坏笑.png")));                                             //定义图片对象
        imageButton = new JButton(icon);                //定义显示图片的按钮对象
        imageButton.setBounds(196, 40, 120, 120);       //定义按钮显示位置
        root.add(imageButton);                          //就按钮显示在面板中

        //设置窗口风格
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,300,400,300);
        setVisible(true);
    }

    //main方法
    public static void main(String args[]) throws IOException {
        new MyFrame();
    }
}
```

<font style="color:rgb(77, 77, 77);">运行本程序，结果如下图所示：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127365502-35bac6d8-d147-4b87-b192-9bbe02505199.png)

#### <font style="color:rgb(79, 79, 79);">🐶</font><font style="color:rgb(79, 79, 79);"> 单选按钮：JRadioButton</font>
<font style="color:rgb(77, 77, 77);">默认情况下的单选按钮显示为一个圆形图标，在该图标旁通常放置一些说明性文字。为了使多个单选按钮表现出某种功能，应用程序一般将多个单选按钮放置在按钮组中，即当用户选中某个单选按钮后，按钮组 中其他按钮将被自动取消选中。</font>

<font style="color:rgb(77, 77, 77);">单选按钮是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件中</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JRadioButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的对象，该类是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JToggleButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">的子类，而</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JToggleButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类又是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AbstractButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的子类，因此，单选按钮的一系列控制方法都是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AbstractButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类中的方法。</font>

**<font style="color:rgb(77, 77, 77);">(1) 单选按钮</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">可以使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JRadioButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类中的构造方法创建单选按钮对象。</font>

**<font style="color:rgb(77, 77, 77);">JRadioButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的常用构造方法主要有以下几种形式：  
</font>**<font style="color:rgb(77, 77, 77);">① public JRadioButton()  
</font>****<font style="color:rgb(77, 77, 77);">② public JRadioButton(Icon icon)  
</font>****<font style="color:rgb(77, 77, 77);">③ public JRadioButton(Icon icon, boolean selected)  
</font>****<font style="color:rgb(77, 77, 77);">④ public JRadioButton(String text)  
</font>****<font style="color:rgb(77, 77, 77);">⑤ public JRadioButton(String text, Icon icon)  
</font>****<font style="color:rgb(77, 77, 77);">⑥ public JRadioButton(String text, Icon icon, boolean selected)</font>**

<font style="color:rgb(77, 77, 77);">通过观察上述构造方法的形式，我们知道在初始化单选按钮时可以同时设置单选按钮的图标、文字及默认是否被选中等属性。</font>

**<font style="color:rgb(77, 77, 77);">(2) 按钮组</font>**<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">存在一个</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">ButtonGroup</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，该类用于产生按钮组。如果希望将所有的单选按钮放置在按钮组中，那么我们需要实例化一个</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JRadioButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象，并使用该对象调用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">add()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法添加单选按钮。</font>

<font style="color:rgb(77, 77, 77);">下面我们让通过一个简单的例子来看一下，创建窗体，然后在窗体中添加单选按钮。</font>

```plain
import javax.swing.*;

public class MyFrame extends JFrame {       
    JPanel root;
    JRadioButton radioButton, radioButton_1, radioButton_2, radioButton_3;

    public MyFrame() {
        root = new JPanel();      //定义面板容器
        setContentPane(root);
        setLayout(null);         //设置面板为绝对布局

        //定义单选按钮
        radioButton = new JRadioButton("学习");
        radioButton_1 = new JRadioButton("打豆豆");
        radioButton_2 = new JRadioButton("运动");
        radioButton_3 = new JRadioButton("旅行");

        //定义按钮显示位置和大小
        radioButton.setBounds(45, 29, 73, 23);
        radioButton_1.setBounds(134, 29, 121, 23);
        radioButton_2.setBounds(45, 74, 73, 23);
        radioButton_3.setBounds(134, 74, 121, 23);

        //将按钮添加到面板中
        root.add(radioButton);
        root.add(radioButton_1);
        root.add(radioButton_2);
        root.add(radioButton_3);

        //定义按钮组控件
        ButtonGroup group = new ButtonGroup();

        //将单选按钮添加到按钮组中
        group.add(radioButton);
        group.add(radioButton_1);
        group.add(radioButton_2);
        group.add(radioButton_3);

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 271, 161);
        setVisible(true);
    }

    //main方法
    public static void main(String args[]) {
        new MyFrame();
    }
}
```

<font style="color:rgb(77, 77, 77);">本实例运行结果如下图所示：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127366001-108bff1d-ccf3-425b-b6d4-a793df802d8a.png)

<font style="color:rgb(77, 77, 77);">从上面的代码可以看出，单选按钮与按钮组的用法基本类似，只是按钮组在实例化单选按钮对象后还需要将其添加到按钮组中。</font>

#### <font style="color:rgb(79, 79, 79);">🐶</font><font style="color:rgb(79, 79, 79);"> 复选框：JCheckBox</font>
**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件中的复选框的使用也非常广泛，一般情况下，它显示为一个方块图标，外加一段描述性文字。与单选按钮不同的是复选框可以进行多选选择，每一个复选框都提供 “选中” 与 “不选中” 两种状态。复选框由</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JCheckBox</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的对象表示，它同样继承于</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AbstractButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，所以复选框组件的属性设置也来源于</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AbstractButton</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类。</font>

**<font style="color:rgb(77, 77, 77);">JCheckBox</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">的常用构造方法如下：  
</font>**<font style="color:rgb(77, 77, 77);">① public JCheckBox()  
</font>****<font style="color:rgb(77, 77, 77);">② public JCheckBox(Icon icon, Boolean checked)  
</font>****<font style="color:rgb(77, 77, 77);">③ public JCheckBox(String text, Boolean checked)</font>**

<font style="color:rgb(77, 77, 77);">复选框与其他按钮的设置基本相同，除了可以在初始化时设置图标之外，还可以设置复选框的文字域是否被选中。</font>

<font style="color:rgb(77, 77, 77);">下面让我们来看一个实例，将滚动面板与复选框结合使用。  
</font><font style="color:rgb(77, 77, 77);">要求：在项目中创建</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">CheckBoxFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，该类继承</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类成为窗体组件，在类中设置窗体添加多个复选框。</font>

```plain
import javax.swing.*;

public class CheckBoxFrame extends JFrame {
    JPanel root;
    JCheckBox checkBox,checkBox_1,checkBox_2,checkBox_3;

    public CheckBoxFrame() {
        root = new JPanel();      //定义面板容器
        setContentPane(root);
        setLayout(null);         //设置面板为绝对布局

        //定义复选框组件
        checkBox = new JCheckBox("C");
        checkBox_1 = new JCheckBox("C++");
        checkBox_2 = new JCheckBox("Java");
        checkBox_3 = new JCheckBox("Python");

        //设置复选框显示位置和大小
        checkBox.setBounds(31, 28, 73, 23);
        checkBox_1.setBounds(132, 28, 73, 23);
        checkBox_2.setBounds(31, 75, 54, 23);
        checkBox_3.setBounds(132, 75, 74, 23);

        //往面板中添加复选框
        root.add(checkBox);
        root.add(checkBox_1);
        root.add(checkBox_2);
        root.add(checkBox_3);

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 271, 161);
        setVisible(true);
    }

    //main方法
    public static void main(String args[]) {
        new CheckBoxFrame();
    }
}
```

<font style="color:rgb(77, 77, 77);">运行本实例，运行结果如下图所示：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127366251-35967d45-ea49-4f46-a31c-3c4e904a3096.png)

### <font style="color:rgb(79, 79, 79);">🐱</font><font style="color:rgb(79, 79, 79);"> 文本组件</font>
<font style="color:rgb(77, 77, 77);">在现实项目开发中，文本组件是使用最为广泛的组件，尤其是文本框与密码框组件，通过文本组件可以很轻松地处理单行文字、多行文字、口令字段。下面我们来看文本组件的定义及其使用。</font>

#### <font style="color:rgb(79, 79, 79);">🐶</font><font style="color:rgb(79, 79, 79);"> 文本框：JTextField</font>
<font style="color:rgb(77, 77, 77);">文本框用来显示或编辑一个单行文本，通过</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JTextField</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类对象创建，该类继承了</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">javax.swing.text.JTextComponent</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类。</font>

<font style="color:rgb(77, 77, 77);">下面列举了一些常用的创建文本框的构造方法。  
</font>**<font style="color:rgb(77, 77, 77);">① public JTextField()  
</font>****<font style="color:rgb(77, 77, 77);">② public JTextField(String text)  
</font>****<font style="color:rgb(77, 77, 77);">③ public JTextField(int fieldwidth)  
</font>****<font style="color:rgb(77, 77, 77);">④ public JTextField(String text, int fieldwidth)  
</font>****<font style="color:rgb(77, 77, 77);">⑤ public JTextField(Document docModel, String text, int fieldWidth)</font>**

<font style="color:rgb(77, 77, 77);">从上面的构造方法中，我们可以看出，定义</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JTextField</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件很简单，并且可以在初始化文本框时设置文本框的默认文字、文本框的长度等。</font>

<font style="color:rgb(77, 77, 77);">下面让我们来看一个关于文本框的实例。  
</font><font style="color:rgb(77, 77, 77);">要求：在项目中创建</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JTextFieldFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，该类继承</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类成为窗体组件，然后向该窗体添加标签组件和文本框组件。</font>

```plain
import javax.swing.*;

public class JTextFieldFrame extends JFrame {
    JPanel root;
    JLabel userNameLabel,passWordLabel;
    JTextField userTextField,passWordTextField;
    JButton enterButton,closeButton;

    public JTextFieldFrame() {
        root = new JPanel();      //定义面板容器
        setContentPane(root);
        setLayout(null);         //设置面板为绝对布局

        //用户名标签
        userNameLabel = new JLabel("用户名：");
        userNameLabel.setBounds(52, 33, 54, 15);
        root.add(userNameLabel);

        //用户名文本框
        userTextField = new JTextField(12);
        userTextField.setBounds(116, 30, 139, 21);
        root.add(userTextField);

        //密码标签
        passWordLabel = new JLabel("密 码：");       //定义标签对象
        passWordLabel.setBounds(52, 74, 54, 15);
        root.add(passWordLabel);

        //密码文本框
        passWordTextField = new JTextField(12);
        passWordTextField.setBounds(116, 71, 139, 21);
        root.add(passWordTextField);

        //登录按钮
        enterButton = new JButton("登录");          //定义按钮对象
        enterButton.setBounds(64, 116, 69, 23);
        root.add(enterButton);

        //退出按钮
        closeButton = new JButton("退出");
        closeButton.setBounds(174, 116, 69, 23);
        root.add(closeButton);

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 340, 256);
        setVisible(true);
    }

    //main方法
    public static void main(String[] args) {
        new JTextFieldFrame();
    }
}
```

<font style="color:rgb(77, 77, 77);">该实例运行结果如下图所示：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127366172-f4adc268-b17e-44e9-b952-9a262f04ea43.png)

#### <font style="color:rgb(79, 79, 79);">🐶</font><font style="color:rgb(79, 79, 79);"> 密码框：JPasswordField</font>
<font style="color:rgb(77, 77, 77);">密码框与文本框的定义和用法基本相同，它们俩的区别是密码框使用户输入的字符串以某种符号进行加密。密码框对象是通过</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JPasswordField</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类 来 创 建 的，</font>**<font style="color:rgb(77, 77, 77);">JPasswordField</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的构造方法与</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JTextField</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的构造方法非常相似，下面列举几个常用的构造方法：  
</font>**<font style="color:rgb(77, 77, 77);">① public JPasswordField()  
</font>****<font style="color:rgb(77, 77, 77);">② public JPasswordFiled(String text)  
</font>****<font style="color:rgb(77, 77, 77);">③ public JPasswordField(int fieldwidth)  
</font>****<font style="color:rgb(77, 77, 77);">④ public JPasswordField(String text, int fieldwidth)  
</font>****<font style="color:rgb(77, 77, 77);">⑤ public JPasswordField(Document docModel, String text, int fieldWidth)</font>**

<font style="color:rgb(77, 77, 77);">在程序中定义密码框，示例代码如下。</font>

```plain
JPasswordField jp = new JPasswordField();
jp.setEchoChar('#');       //设置回显字符
```

<font style="color:rgb(77, 77, 77);">使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JPasswordField</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类中所提供的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">setEchoChar()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法，可以改变密码框的回显字符。</font>

<font style="color:rgb(77, 77, 77);">下面我们运用密码框对前面的登录界面进行改进，代码如下：</font>

```plain
import javax.swing.*;

public class JTextFieldFrame extends JFrame {
    JPanel root;
    JLabel userNameLabel,passWordLabel;
    JTextField userTextField;
    JButton enterButton,closeButton;
    JPasswordField passWordTextField;

    public JTextFieldFrame() {
        root = new JPanel();      //定义面板容器
        setContentPane(root);
        setLayout(null);         //设置面板为绝对布局

        //用户名标签
        userNameLabel = new JLabel("用户名：");
        userNameLabel.setBounds(52, 33, 54, 15);
        root.add(userNameLabel);

        //用户名文本框
        userTextField = new JTextField(12);
        userTextField.setBounds(116, 30, 139, 21);
        root.add(userTextField);

        //密码标签
        passWordLabel = new JLabel("密 码：");       //定义标签对象
        passWordLabel.setBounds(52, 74, 54, 15);
        root.add(passWordLabel);

        //密码文本框
        passWordTextField = new JPasswordField(12);
        passWordTextField.setBounds(116, 71, 139, 21);
        passWordTextField.setEchoChar('●');       //设置回显字符
        root.add(passWordTextField);

        //登录按钮
        enterButton = new JButton("登录");          //定义按钮对象
        enterButton.setBounds(64, 116, 69, 23);
        root.add(enterButton);

        //退出按钮
        closeButton = new JButton("退出");
        closeButton.setBounds(174, 116, 69, 23);
        root.add(closeButton);

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 340, 256);
        setVisible(true);
    }

    //main方法
    public static void main(String[] args) {
        new JTextFieldFrame();
    }
}
```

<font style="color:rgb(77, 77, 77);">改进后的运行结果如下：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127366261-0c302e81-233a-41a4-98ac-eda261a1dee3.png)

#### <font style="color:rgb(79, 79, 79);">🐶</font><font style="color:rgb(79, 79, 79);"> 文本域：JTextArea</font>
<font style="color:rgb(77, 77, 77);">文本域组件是一个非常常见而又十分重要的组件，用来接受用户的多行文字输入，它的使用也非常简单。</font>

**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中的任何一个文本域都是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JTextArea</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类型的对象，</font>**<font style="color:rgb(77, 77, 77);">JTextArea</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">常用的构造方法如下：  
</font>**<font style="color:rgb(77, 77, 77);">① public JTextArea()  
</font>****<font style="color:rgb(77, 77, 77);">② public JTextArea(String text)  
</font>****<font style="color:rgb(77, 77, 77);">③ public JTextArea(int rows, int columns)  
</font>****<font style="color:rgb(77, 77, 77);">④ public JTextArea(Document doc)  
</font>****<font style="color:rgb(77, 77, 77);">⑤ public JTextArea(Document doc, String Text, int rows, int columns)</font>**

<font style="color:rgb(77, 77, 77);">通过上述构造方法，我们可以在初始化文本域时提供默认文本、设置文本域的长与宽。</font>

<font style="color:rgb(77, 77, 77);">下面让我们通过一个实例来更好地理解和使用文本域。  
</font><font style="color:rgb(77, 77, 77);">要求：在项目中创建</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JTextAreaFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，该类继承</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类成为窗体组件，然后向该窗体中添加文本域组件。</font>

```plain
import javax.swing.*;

public class JTextAreaFrame extends JFrame {
    JPanel root;
    JTextArea textArea;

    public JTextAreaFrame(String title) {
        super(title);

        root = new JPanel();      //定义面板容器
        setContentPane(root);
        setLayout(null);         //设置面板为绝对布局

        textArea = new JTextArea();              //定义文本域组件
        textArea.setLineWrap(true);              //设置文本域自动换行
        textArea.setBounds(20, 10, 290, 200);
        root.add(textArea);                      //将文本域添加到面板

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 340, 260);
        setVisible(true);
    }

    //main方法
    public static void main(String[] args) {
        new JTextAreaFrame("JTextArea");
    }
}
```

<font style="color:rgb(77, 77, 77);">该实例运行结果如下：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127366391-44eb16ac-318e-43fe-85ae-53ad03815839.png)

**<font style="color:rgb(77, 77, 77);">JTextArea</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">setLineWrap()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法可以设置文本域的自动换行属性。文本域对象的初始状态是不允许换行的，调用该方法并给定参数</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">true</font>**<font style="color:rgb(77, 77, 77);">，就可以将文本域设置为自动换行状态啦。</font>

### <font style="color:rgb(79, 79, 79);">🐱</font><font style="color:rgb(79, 79, 79);"> 列表组件</font>
**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">提供了两种列表组件，分别为下拉列表框与列表框。</font>

<font style="color:rgb(77, 77, 77);">下拉列表框与列表框都是带有多个选项的组件，用户可以从中选择需要的选项。和下拉列表框相比，列表框显得更直观一些，它将所有选项罗列在列表框中，而下拉列表框显得更为便捷和美观，它将所有的项目隐藏起来，当用户需要选用其中的选项时才会显现出来。</font>

#### <font style="color:rgb(79, 79, 79);">🐶</font><font style="color:rgb(79, 79, 79);"> 下拉列表框：JComboBox</font>
**<font style="color:rgb(77, 77, 77);">(1) JComoBox类</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">初次使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中的下拉列表框时，会感觉到</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Java</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中的下拉列表框与</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Windows</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">操作系统中的下拉列表框类似，但是实质上两者并不相同，</font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中的下拉列表框不仅支持用户从中选择选项，同时还支持用户编辑项目中的内容。</font>

<font style="color:rgb(77, 77, 77);">下拉列表框是一个带条状的显示区，它具有下拉功能。在下拉列表框的右边存在一个倒三角形的按钮，当用户单击该按钮时，下拉列表框中的选项将会以列表的形式显示出来。</font>

**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">中的下拉列表框使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JComboBox</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类对象来表示，它是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">javax.swing.JComponent</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类的子类。</font>

**<font style="color:rgb(77, 77, 77);">JComboBox</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">的常用构造方法如下。  
</font>**<font style="color:rgb(77, 77, 77);">① public JComboBox()  
</font>****<font style="color:rgb(77, 77, 77);">② public JComboBox(ComboBoxMode dataModel)  
</font>****<font style="color:rgb(77, 77, 77);">③ public JComboBox(Object[] arrayData)  
</font>****<font style="color:rgb(77, 77, 77);">④ public JComboBox(Vector vector)</font>**

<font style="color:rgb(77, 77, 77);">在初始化下拉列表框时，既可以选择同时指定下拉列表框中的选项内容，也可以在程序中使用其他方法设置下拉列表框中的内容。下拉列表框中的内容可以被封装在</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">ComboBoxModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类型、数组或者</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Vector</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类型中。</font>

**<font style="color:rgb(77, 77, 77);">(2) JCcomboBox 模型</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">在开发程序时，一般将下拉列表框中的选项封装在</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">ComboBoxModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类型中。</font>**<font style="color:rgb(77, 77, 77);">ComboBoxModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类型为接口，它代表一般模型，可以自定义一个类实现该接口，然后在初始化</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JComboBox</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象时向上转型为</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">ComboBoxModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">接口类型，但是必须实现下面的两个方法：</font>

**<font style="color:rgb(77, 77, 77);">① public void setSelectedItem(Object item)  
</font>****<font style="color:rgb(77, 77, 77);">② public Object getSelectedItem()</font>**

<font style="color:rgb(77, 77, 77);">其中，</font>**<font style="color:rgb(77, 77, 77);">setSelectedItem()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法是设置下拉列表框的选中项，</font>**<font style="color:rgb(77, 77, 77);">getSelectedItem()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法用于返回下拉列表框中的选中项，有了这两个方法，我们就可以轻松地对下拉列表框中的项目进行操作。</font>

<font style="color:rgb(77, 77, 77);">自定义的这个类除了可以实现该接口外，还可以继承</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AbstractListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，在该类中也有两个操作下拉列表框的重要方法：</font>

**<font style="color:rgb(77, 77, 77);">① getSize()</font>**<font style="color:rgb(77, 77, 77);">：返回列表的长度。  
</font>**<font style="color:rgb(77, 77, 77);">② getElementAt(in index)</font>**<font style="color:rgb(77, 77, 77);">：返回指定索引处的值。</font>

<font style="color:rgb(77, 77, 77);">下面让我们通过一个实例来更好地理解和使用下拉列表框。  
</font><font style="color:rgb(77, 77, 77);">要求：在项目中创建</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JListDemoFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，该类继承</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类成为窗体组件，然后向该窗体中添加下拉列表框组件。</font>

```plain
import javax.swing.*;

public class JComboBoxFrame extends JFrame {
    JPanel root;
    JLabel messageLabel;
    JComboBox comboBox;

    public JComboBoxFrame(String title) {
        super(title);

        root = new JPanel();      //定义面板容器
        setContentPane(root);
        setLayout(null);         //设置面板为绝对布局

        messageLabel = new JLabel("请选择你的星座：");             //定义标签组件
        messageLabel.setBounds(31, 25, 130, 15);    //设置标签组件大小
        root.add(messageLabel);

        //定义字符串数组对象
        String[] constellations = {
                "白羊座", "金牛座", "双子座", "巨蟹座",
                "狮子座", "处女座", "天秤座", "天蝎座",
                "射手座", "摩羯座", "双鱼座", "水瓶座"
        };
        comboBox = new JComboBox(constellations);                    //定义下拉列表框组件
        comboBox.setBounds(130, 22, 100, 21);     //设置列表大小
        root.add(comboBox);                                         //将下拉列表添加到面板

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 310, 230);
        setVisible(true);
    }

    //main方法
    public static void main(String[] args) {
        new JComboBoxFrame("JComboBox");
    }
}
```

<font style="color:rgb(77, 77, 77);">该实例运行结果如下：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127367014-896ccd71-d37e-4815-af83-f7ea35616fd6.png)

#### <font style="color:rgb(79, 79, 79);">🐶</font><font style="color:rgb(79, 79, 79);"> 列表框：JList</font>
<font style="color:rgb(77, 77, 77);">与下拉列表框相比，列表框将所有选项显示在列表框中，在窗体上占据固定的大小，如果列表框中的选项较多，需要具有滚动效果，那么可以将列表框放入滚动面板中。用户在选择列表框中的某一项后，按住</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Shift</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">键并选择列表框中的其他选项，其他选项也会被选中。用户也可以按住</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Ctrl</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">键并单击列表框中的项目，这样，列表框中的项目就处于非选中状态。</font>

**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JList</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类对象来表示列表框，下面列举几个常用的构造方法：</font>

**<font style="color:rgb(77, 77, 77);">① public void JList()  
</font>****<font style="color:rgb(77, 77, 77);">② public void JList(Object[] listData)  
</font>****<font style="color:rgb(77, 77, 77);">③ public void JList(Vector listData)  
</font>****<font style="color:rgb(77, 77, 77);">④ public void JList(ListMode dataModel)</font>**

<font style="color:rgb(77, 77, 77);">在上述构造方法中，存在一个没有参数的构造方法，当使用该方法进行构造时，用户既可以在初始化列表框后使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">setListData()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法对列表框进行设置，也可以在初始化的过程中对列表框中的选项进行设置。设置的方式有三种，分别为数组、</font>**<font style="color:rgb(77, 77, 77);">Vector</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类型和</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">ListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">模型。</font>

<font style="color:rgb(77, 77, 77);">当使用数组作为构造方法的参数时，首先需要创建列表选项的数组，然后再利用构造方法来初始化列表框。</font>

<font style="color:rgb(77, 77, 77);">使用数组作为初始化列表框的参数，示例代码如下：</font>

```plain
String[] contents={"列表1","列表2","列表3","列表4"};
JList jl = new JList(contents);
```

<font style="color:rgb(77, 77, 77);">如果使用上述构造方法中的第三种构造方法，那么通常将</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Vector</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类型的数据作为初始化</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JList</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">组件的参数，示例代码如下：</font>

```plain
Vector contents = new Vector();
JList jl = new JList(contents);
contents.add("列表1");
contents.add("列表2");
contents.add("列表3");
contents.add("列表4");
```

<font style="color:rgb(77, 77, 77);">如果使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">ListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">模型为参数，那么需要创建</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">ListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象。</font>**<font style="color:rgb(77, 77, 77);">ListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">是</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Swing</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">包中的一个接口，它提供了获取列表框属性的方法。但是在通常情况下，为了使用户不完全实现</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">ListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">接口中的方法，通常自定义一个类继承实现该接口的抽象类</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AbstractListModel</font>**<font style="color:rgb(77, 77, 77);">。该类提供了</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">getElementAt()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">与</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">getSize()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法，其中，</font>**<font style="color:rgb(77, 77, 77);">getElementAt()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法代表根据项目的索引获取列表框中的值，而</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">getSize()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法用于获取列表框中项目的个数。</font>

<font style="color:rgb(77, 77, 77);">第</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">4</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">种构造方法我们具体来看一个实例。  
</font><font style="color:rgb(77, 77, 77);">要求：在项目中创建</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">Jlist</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，使该类继承</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">JFrame</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类成为窗体组件，然后在该类中创建列表框，并添加到窗体中。</font>

```plain
import javax.swing.*;

public class JListFrame extends JFrame {
    JPanel root;
    JList list;
    JScrollPane js;

    public JListFrame(String title) {
        super(title);

        root = new JPanel();      //定义面板容器
        setContentPane(root);
        setLayout(null);         //设置面板为绝对布局

        list = new JList(new MyListModel());
        js = new JScrollPane(list);
        js.setBounds(10, 10, 100, 100);
        root.add(js);

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 260, 230);
        setVisible(true);
    }

    class MyListModel extends AbstractListModel {   //继承抽象类AbstractListModel
        private String[] constellations = {
                "白羊座", "金牛座", "双子座", "巨蟹座",
                "狮子座", "处女座", "天秤座", "天蝎座",
                "射手座", "摩羯座", "双鱼座", "水瓶座"
        };

        //设置列表框内容
        public Object getElementAt(int x) {    //重写getElementAt()方法
            if (x < constellations.length)
                return constellations[x++];
            else
                return null;
        }

        public int getSize() {                //重写getSize()方法
            return constellations.length;
        }
    }

    //main方法
    public static void main(String[] args) {
        new JListFrame("JList");
    }
}
```

<font style="color:rgb(77, 77, 77);">运行该实例，运行结果如下图所示：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127367070-4f0158a3-f31e-42b5-b574-4c77c39cec66.png)

<font style="color:rgb(77, 77, 77);">除了可以使用这个实例中所示的方式创建列表框之外，还可以使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">DefaultListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类创建列表框，该类扩展了</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">AbstractListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类，所以也可以通过</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">DefaultListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">对象向上转型为</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">ListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">接口初始化列表框。同时，</font>**<font style="color:rgb(77, 77, 77);">DefaultListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类提供</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">addElement()</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">方法实现将内容添加到列表框中。</font>

<font style="color:rgb(77, 77, 77);">下面我们将使用</font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">DefaultListModel</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">类来创建列表框，具体代码如下：</font>

```plain
import javax.swing.*;

public class JListFrame extends JFrame {
    JPanel root;
    JList list;
    DataModel mode;

    public JListFrame(String title) {
        super(title);

        root = new JPanel();      //定义面板容器
        setContentPane(root);

        mode = new DataModel();

        list = new JList(mode);

        list.setBorder(BorderFactory.createTitledBorder("配件"));

        root.add(new JScrollPane(list));

        //设置窗口风格
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400, 300, 260, 230);
        setVisible(true);
    }

    class DataModel extends DefaultListModel {

        String[] s = {"主板", "显示器", "内存", "CPU", "硬盘", "电源", "键盘", "鼠标", "显卡"};

        public int getSize() {
            return s.length;
        }

        public String getElementAt(int index) {
            return (index + 1) + "." + s[index++];
        }
    }

    //main方法
    public static void main(String[] args) {
        new JListFrame("JList");
    }
}
```

<font style="color:rgb(77, 77, 77);">运行该实例，结果如下图所示：  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728127367321-1817800c-1e99-4f63-9836-b54d01af616d.png)

