## <font style="color:rgb(79, 79, 79);">Java语言的特点</font>
**<font style="color:rgb(77, 77, 77);">1.面向对象</font>**

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">面向对象(OOP)就是Java语言的基础，也是Java语言的重要特性。面向对象的概念：生活中的一切事物都可以被称之为对象，生活中随处可见的事物就是一个对象，我们可以将这些事物的状态特征（属性）以及行为特征（方法）提取并出来，并以固定的形式表示。</font>**

**<font style="color:rgb(77, 77, 77);">2.简单好用</font>**

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">Java语言是由C和C++演变而来的，它省略了C语言中所有的难以理解、容易混淆的特性（比如指针），变得更加严谨、简洁、易使用。</font>**

**<font style="color:rgb(77, 77, 77);">3.健壮性</font>**

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">Java的安全检查机制，将许多程序中的错误扼杀在摇蓝之中。 另外，在Java语言中还具备了许多保证程序稳定、健壮的特性（强类型机制、异常处理、垃圾的自动收集等），有效地减少了错误，使得Java应用程序更加健壮。</font>**

**<font style="color:rgb(77, 77, 77);">4.安全性</font>**

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">Java通常被用在网络环境中，为此，Java提供了一个安全机制以防恶意代码的攻击，从而可以提高系统的安全性。</font>**

**<font style="color:rgb(77, 77, 77);">5.平台无关性</font>**

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">Java平台无关性由Java 虚拟机实现，Java软件可以不受计算机硬件和操作系统的约束而在任意计算机环境下正常运行。</font>**

**<font style="color:rgb(77, 77, 77);">6.支持多线程</font>**

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">在C++ 语言没有内置的多线程机制，因此必须调用操作系统的多线程功能来进行多线程程序设计，而 Java 语言却提供了多线程支持。多线程机制使应用程序在同一时间并行执行多项任务，该机制使得程序能够具有更好的交互性、实时性。</font>**

**<font style="color:rgb(77, 77, 77);">7.分布式（支持网络编程）</font>**

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">Java语言具有强大的、易于使用的网络能力，非常适合开发分布式计算的程序。java中提供了网络应用编程接口(java.net)，使得我们可以通过URL、Socket等远程访问对象。</font>**

**<font style="color:rgb(77, 77, 77);">8.编译与解释共存</font>**

[<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">Java 是编译与解释共存的语言</font>](https://blog.csdn.net/Lzy410992/article/details/117898940)

---

## <font style="color:rgb(79, 79, 79);">Java语法基础</font>
**<font style="color:rgb(77, 77, 77);">标识符：</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">用来标识类名、对象名、变量名、方法名、类型名、数组名、文件名的有效字符序列。</font>

**<font style="color:rgb(77, 77, 77);">合法的标识符：</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">由字母、数字、下划线“_”、美元符号“$”或者“￥”组成，并且首字符不能是数字。</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">不能把java关键字和保留字作为标识符。</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">标识符对大小写敏感。</font>

**<font style="color:rgb(77, 77, 77);">关键字：Java语言中已经赋予了特定含义的</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029139835-53433848-65b5-4587-9e5e-e0db54817c92.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">保留字：</font>**<font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">const、goto</font>`<font style="color:rgb(77, 77, 77);">，Java版本中尚未使用，但以后版本可能会作为关键字使用</font>

**<font style="color:rgb(77, 77, 77);">变量：程序运行期间可以被改变的量。在程序中使用变量，必须先创建它并为它取一个名字，并且指明它能够存储信息的类型，这称为“变量声明”，也叫容器的创建。</font>**

**<font style="color:rgb(77, 77, 77);">变量的使用：</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">变量的声明：数据类型 变量名;</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">变量的赋值：变量名 = 数据;</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">变量的操作：放入打印语句进行输出或者进行运算</font>

**<font style="color:rgb(77, 77, 77);">Java 中的注释有三种：</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">单行注释//</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">多行注释/* */</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">文档注释/** **/</font>

---

## <font style="color:rgb(79, 79, 79);">数据类型</font>
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029139865-deb6f890-b81e-4b27-afaf-b620fe9bbf34.png)

**<font style="color:rgb(77, 77, 77);">基本数据类型（8个），也称原始数据类型：</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029140089-8676cc6a-a527-49ae-8b62-07a2967d9414.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">引用数据类型（3种）：数组、类、接口</font>**

**<font style="color:rgb(77, 77, 77);">类型转换：</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">自动类型转换，也叫隐式转换</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">强制类型转换，也叫显式转换  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029140312-e52e38db-452c-4917-8703-655c99b24241.png)

---

## <font style="color:rgb(79, 79, 79);">运算符</font>
**<font style="color:rgb(77, 77, 77);">运算符：一种特殊符号，用以表示数据的运算、赋值和比较数与整数</font>**

**<font style="color:rgb(77, 77, 77);">运算符分类：算术运算符、赋值运算符、比较运算符、逻辑运算符、三元运算符</font>**

**<font style="color:rgb(77, 77, 77);">1.算术运算符</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029140284-38bc4953-c468-4087-99ec-2c4c6d4bd101.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">2.赋值运算符</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029140574-76ea148e-2b04-46a5-b885-edbb07615da3.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">3.比较运算符</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029140561-92795510-fe42-439b-8732-4afccc5097e8.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">4.逻辑运算符</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029140671-2db639a5-65cd-42b0-8c97-30516c20b3e1.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">5.三元运算符</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">条件表达式</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">b?x:y;</font>`<font style="color:rgb(77, 77, 77);">，先计算条件b，然后进行判断。如果b的值为true，计算x的值，运算结果为x的值；否则，计算y的值，运算结果为y的值。  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029140855-3d26bde5-20f9-4b93-841e-84a0008ed536.png)



![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728041123863-e432f79a-d4b0-4b2d-bfe8-9bb6f69b95e5.png)

---

## <font style="color:rgb(79, 79, 79);">Java流程控制语句</font>
### <font style="color:rgb(79, 79, 79);">选择结构</font>
**<font style="color:rgb(77, 77, 77);">if语句：</font>**<font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">if(条件表达式){ 一条或多条语句 };</font>`

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029140960-d7741714-4e8f-4a07-80cd-d9329173a6b9.png)

**<font style="color:rgb(77, 77, 77);">if else语句：</font>**<font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">if(条件表达式) {语句块1} else {语句块2}</font>`<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029141113-6c31cda4-42e9-4fd1-9f1c-dd6dac2b632d.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">if多分支语句：</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029141344-19434527-2a81-4552-abaf-2ea167e86626.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">switch开关语句：</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029141556-31279d1f-2e08-4c44-b1a6-a92f262e8093.png)

### <font style="color:rgb(79, 79, 79);">循环结构</font>
**<font style="color:rgb(77, 77, 77);">在程序中当要重复性的做某项工作时可以使用循环语句，包括：for循环、while循环、do…while循环。</font>**

**<font style="color:rgb(77, 77, 77);">for循环语句：</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029141514-a2a2ad43-bca2-4d5b-bf4c-9d16adfa6bb8.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">while循环语句：</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029141645-c75ef5c1-ee43-49da-b265-394163f98bfa.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">do…while循环语句：</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029141955-b0e9bb4c-1c0f-47c8-8130-c6323a5f55e5.png)

### <font style="color:rgb(79, 79, 79);">流程跳转</font>
**<font style="color:rgb(77, 77, 77);">流程跳转语句：</font>**`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">break,continue</font>`

+ **<font style="color:rgba(0, 0, 0, 0.75);">break：在switch中结束case条件判断，在循环体中结束循环</font>**
+ **<font style="color:rgba(0, 0, 0, 0.75);">continue：作用在循环体中，结束循环体的本次循环，而进入下次循环</font>**

---

## <font style="color:rgb(79, 79, 79);">数组</font>
<font style="color:rgb(77, 77, 77);">数组是数据的集合，一个容器，用来存储任何类型的数据，包括原始数据类型和引用数据类型，但是一旦指定了数组的类型之后，就只能用来存储指定类型的数据。</font>

**<font style="color:rgb(77, 77, 77);">数组声明的三种方式：</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">数据类型[] 数组名 = new 数据类型[长度];</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">数据类型[] 数组名 = {数据,数据,…,数据};</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">数据类型[] 数组名 = new 数据类型长度[] {数据,数据,…,数据};</font>

**<font style="color:rgb(77, 77, 77);">一维数组：</font>**

+ **<font style="color:rgb(77, 77, 77);">数组变量的声明：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">语法：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">数据类型[] 数组名;</font>`<font style="color:rgb(77, 77, 77);">，如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">int[] num;</font>`<font style="color:rgb(77, 77, 77);">、</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">double[] d;</font>`<font style="color:rgb(77, 77, 77);">、</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">String[] str;</font>`
+ **<font style="color:rgb(77, 77, 77);">数组对象的创建：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">语法：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">数组名 = new 数据类型[长度];</font>`<font style="color:rgb(77, 77, 77);">，如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">num = new int[4];</font>`<font style="color:rgb(77, 77, 77);">，数组声明其长度后不可改变</font>
+ **<font style="color:rgb(77, 77, 77);">赋值：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">语法：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">数组名[下标] = 数据;</font>`<font style="color:rgb(77, 77, 77);">，如：num[0] = 3;</font>
+ **<font style="color:rgb(77, 77, 77);">数组元素的使用及遍历：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">语法：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">数组名[下标]</font>`<font style="color:rgb(77, 77, 77);">，获取指定下标是数据。  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029142055-835a66da-b37b-4033-8074-c79c6aa5f880.png)

**<font style="color:rgb(77, 77, 77);">二维数组：</font>**

+ **<font style="color:rgb(77, 77, 77);">数组变量的声明：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">语法：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">数据类型[][] 数组名;</font>`<font style="color:rgb(77, 77, 77);">，如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">int[][] num;</font>`<font style="color:rgb(77, 77, 77);">、</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">double[][] d;</font>`<font style="color:rgb(77, 77, 77);">、</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">String[][] str;</font>`
+ **<font style="color:rgb(77, 77, 77);">数组对象的创建：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">语法：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">数组名 = new 数据类型[外长度][内长度];</font>`<font style="color:rgb(77, 77, 77);">，如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">num = new int[4][3];</font>`<font style="color:rgb(77, 77, 77);">，数组声明其长度后不可改变</font>
+ **<font style="color:rgb(77, 77, 77);">赋值：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">语法：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">数组名[外下标][内下标] = 数据;</font>`<font style="color:rgb(77, 77, 77);">，如：num[0][0]= 3;</font>
+ **<font style="color:rgb(77, 77, 77);">数组元素的使用及遍历：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">语法：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">数组名[外下标][内下标]</font>`<font style="color:rgb(77, 77, 77);">，获取指定下标是数据。  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029142127-e2a20e03-eaab-4a96-a2d4-cb35a0196cf8.png)

---

## <font style="color:rgb(79, 79, 79);">对象与类</font>
**<font style="color:rgb(77, 77, 77);">对象：客观存在能够相互区分的个体，比如这辆汽车、这个人、这间房子、这张桌子、这株植物、这张支票、这件雨衣。概括来说就是：万物皆对象。</font>**

**<font style="color:rgb(77, 77, 77);">类：若干具有相同属性和行为的对象的群体或者抽象，类是创建对象的模板，由属性和行为两部分组成</font>**

**<font style="color:rgb(77, 77, 77);">类是对象的概括或者抽象，对象是类的实例化。</font>**

### <font style="color:rgb(79, 79, 79);">类的声明</font>
```plain
[修饰符] class 类名{//类的声明部分
	[成员变量]
	[成员方法]
}
```

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029142277-7f63b342-5f51-45a3-8cd2-696761e6caef.png)

**<font style="color:rgb(77, 77, 77);">成员变量的声明：</font>**<font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">[修饰符] 数据类型 变量名 [= 初始值];</font>`

**<font style="color:rgb(77, 77, 77);">成员方法的声明：</font>**

```plain
[修饰符] 返回值类型 方法名([数据类型 参数名,……]){
	//方法体，该方法完成的功能代码
}
```

**<font style="color:rgb(77, 77, 77);">构造器的声明：</font>**

```plain
[修饰符] 构造器名([数据类型 参数名,……]){
  //构造器完成的功能代码
}
```

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029142196-17171041-8e91-4fb1-8c4e-56870fa38cde.png)

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注意：</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">①构造器名必须和类名一致  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">②构造器没有返回值类型  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">③任何类都含有构造器。如果没有显式地定义类的构造器，  
</font><font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">④则系统会为该类提供一个默认的无参的构造器。一旦在类中显式地定义了构造器，系统就不会再为这个类提供默认的构造器了。</font>

### <font style="color:rgb(79, 79, 79);">类的使用</font>
<font style="color:rgb(77, 77, 77);">类变量的声明：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">类名 对象名;</font>`<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">类对象的创建，赋值给变量：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">对象名 = new 构造器([参数列表]);</font>`<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029142406-2ed51681-e1b2-4b40-89ca-01d7563af2ab.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">对象属性的赋值：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">属性：对象名.属性名、对象名.属性名 = 数据;</font>`<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029142474-7f7b2198-a7a9-4eee-b2bf-f6a4395db19d.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">属性和方法的调用：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">属性：System.out.println(对象名.属性名);方法：对象名.方法名();</font>`<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029142595-9c052b32-b1fa-4adc-9dd9-5bf6084ffa56.png)

**<font style="color:rgb(77, 77, 77);">成员变量与局部变量：</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">成员变量：声明在类中方法体之外、可以有缺省值、可以使用修饰符。作用域：整个类</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">局部变量：声明在方法体或代码块中、没有缺省值、只能使用final修饰。作用域：当前方法体</font>

**<font style="color:rgb(77, 77, 77);">参数：参数的本质是特殊的局部变量，只能定义在方法的小括号中</font>**

### <font style="color:rgb(79, 79, 79);">重载</font>
**<font style="color:rgb(77, 77, 77);">方法的重载OverLoading：</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">同一个类中定义了多个方法名相同而参数不同的方法</font>

<font style="color:rgb(77, 77, 77);">重载在同一个类中，方法名相同，参数不同（参数的个数、顺序、类型不同）  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029142693-da47804e-5576-4076-b61f-d8da8c8ca4fd.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">构造器的重载：</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029142946-cf65e962-c14a-4be7-aba8-9efeaa7dcff5.png)

**<font style="color:rgb(77, 77, 77);">方法的返回值类型：</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">无返回值类型：void，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">return;//结束方法体</font>`
+ <font style="color:rgba(0, 0, 0, 0.75);">有返回值类型为：数据类型(基本数据类型、引用数据类型)，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">return 数据;//结束方法体，并且返回一条数据</font>`

### <font style="color:rgb(79, 79, 79);">关键字</font>
**<font style="color:rgb(77, 77, 77);">this关键字：</font>**

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">this是一种特殊的引用，指向当前对象</font>

**<font style="color:rgb(77, 77, 77);">this的两种使用方法：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">如果发生局部变量和成员变量命名冲突时，可以通过this.成员变量名的方式区分成员变量和局部变量。  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029142974-22109aa1-8da6-41bc-9253-8f211d4edeb9.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">一个构造方法中需要调用本类的另一个构造方法，可以通过this()的方式调用，但this()必须要书写在第一行。  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029143021-f604b689-fb4e-4725-b541-e466e39601b4.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">static关键字：</font>**

**<font style="color:rgb(77, 77, 77);">静态变量：</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">使用static修饰的成员变量叫做静态变量，静态变量和非静态变量的区别是：静态变量被所有的对象所共享，在内存中只有一个副本，它当且仅当在类初次加载时会被初始化。而非静态变量是对象所拥有的，在创建对象的时候被初始化，存在多个副本，各个对象拥有的副本互不影响。static成员变量的初始化顺序按照定义的顺序进行初始化。</font>

**<font style="color:rgb(77, 77, 77);">静态方法：</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">使用static修饰的成员方法叫做静态方法，静态方法可以不依赖于任何对象进行访问（对于静态方法来说，是没有this的），由于这个特性，在静态方法中不能访问类的非静态成员变量和非静态成员方法，因为非静态成员方法/变量都是必须依赖具体的对象才能够被调用。</font>

**<font style="color:rgb(77, 77, 77);">调用格式：</font>**`**<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">类名.静态变量名 ，类名.静态方法名()</font>**`

**<font style="color:rgb(77, 77, 77);">静态内部类（static 修饰类的话只能修饰内部类）：</font>**<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">静态内部类与非静态内部类之间存在一个最大的区别: 非静态内部类在编译完成之后会隐含地保存着一个引用，该引用是指向创建它的外围类，但是静态内部类却没有。没有这个引用就意味着：1. 它的创建是不需要依赖外围类的创建。2. 它不能使用任何外围类的非 static 成员变量和方法。</font>

**<font style="color:rgb(77, 77, 77);">静态代码块：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">是一个以static为前导的代码块，一般用于为类的工作做一些初始化工作，如初始化一些静态变量。一个类中可以有许多静态初始化块，并且它们可以出现在类体的任何地方。运行时系统会保证静态初始化块会按照它们在源代码中出现的顺序被调用</font>

<font style="color:rgb(77, 77, 77);">static块可以用来优化程序性能：因为它</font>**<font style="color:rgb(77, 77, 77);">只会在类加载的时候执行一次</font>**

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029143126-4ba6c141-d804-4057-9520-b10ab66c5764.png)

**<font style="color:rgb(77, 77, 77);">super关键字：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">super代表的是父类对象，</font>

**<font style="color:rgb(77, 77, 77);">使用方式：</font>**<font style="color:rgb(77, 77, 77);">  
</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">super.属性名、super.方法名();</font>`<font style="color:rgb(77, 77, 77);">用于在子类中调用父类被隐藏的同名实例变量  
</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">super([参数列表])</font>`<font style="color:rgb(77, 77, 77);">用于在子类的构造方法中调用父类的构造方法</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">每一个子类的构造方法在没有显示调用super()系统都会提供一个默认的super()，super()必须是构造器的第一条语句</font>

**<font style="color:rgb(77, 77, 77);">final关键字:</font>**

<font style="color:rgb(77, 77, 77);">final 关键字，意思是最终的、不可修改的，最见不得变化 ，用来修饰类、方法和变量，具有以下特点：</font>

+ <font style="color:rgba(0, 0, 0, 0.75);">修饰类：类不能继承，final 类中的所有成员方法都会被隐式的指定为 final 方法；</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">修饰符变量：该变量为常量，，如果是基本数据类型的变量，则其数值一旦在初始化之后便不能更改；如果是引用类型的变量，则在对其初始化之后便不能让其指向另一个对象。</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">修饰符方法：方法不能重写</font>

<font style="color:rgb(77, 77, 77);">说明：使用 final 方法的原因有两个。第一个原因是把方法锁定，以防任何继承类修改它的含义；第二个原因是效率。在早期的 Java 实现版本中，会将 final 方法转为内嵌调用。但是如果方法过于庞大，可能看不到内嵌调用带来的任何性能提升（现在的 Java 版本已经不需要使用 final 方法进行这些优化了）。类中所有的 private 方法都隐式地指定为 final。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029143628-fedd5a6b-9252-4d48-a859-e169caed18bb.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">参考：</font>**[**<font style="color:rgb(77, 77, 77);">https://gitee.com/SnailClimb/JavaGuide</font>**](https://gitee.com/SnailClimb/JavaGuide/blob/master/docs/java/basis/Java%E5%B8%B8%E8%A7%81%E5%85%B3%E9%94%AE%E5%AD%97%E6%80%BB%E7%BB%93.md)

**<font style="color:rgb(77, 77, 77);">访问修饰符</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">访问修饰符对成员变量和成员方法的访问限定  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029143772-89710cfc-a10a-459e-8231-d0ded3ade4f4.png)

---

## <font style="color:rgb(79, 79, 79);">Java的三大特性</font>
### <font style="color:rgb(79, 79, 79);">封装</font>
**<font style="color:rgb(77, 77, 77);">封装指隐藏对象的状态信息（属性），不允许外部对象直接访问对象的内部信息（private实现）。但是可以提供一些可以被外界访问的方法来操作属性。</font>**

**<font style="color:rgb(77, 77, 77);">将类中成员变量private，提供public的get和set方法来控制属性的存取动作，以保证对私有属性操作的安全性：</font>**<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029143847-247b7bc3-bf44-4362-b1e0-dde62598cdff.png)

### <font style="color:rgb(79, 79, 79);">继承</font>
<font style="color:rgb(77, 77, 77);">继承extends：多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，那么多个类无需再定义这些属性和行为，只要继承单独的那个类即可。多个类可以称为子类，单独这个类称为父类或者超类。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029143761-e025949d-7a9c-4e5e-8ed2-e9abc55d248b.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">基本语法：</font>**

```plain
[修饰符] class 子类名 extends 父类名{
   类体部分
}
```

<font style="color:rgb(77, 77, 77);">继承是使用已存在的类的定义作为基础建立新类的技术，新类的定义可以增加新的属性或方法（对父类进行扩展），也可以拥有父类的属性和方法，并且通过自己的方法再次实现父类的方法（重写）。通过使用继承，可以快速地创建新的类，可以提高代码的重用，程序的可维护性，节省大量创建新类的时间 ，提高我们的开发效率。  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029143950-9e5e94e1-03a4-4719-9b38-80391efa1d4b.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">Java只支持单继承，不支持多继承。一个类只能有一个父类，不可以有多个父类。Java支持多层继承(继承体系)。Java继承了父类非私有的成员变量和成员方法，但是请注意：子类是无法继承父类的构造方法的。</font>

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注意：不要仅为了获取其他类中某个功能而去继承 ，类与类之间要有所属(“is a” )关系</font>**

**<font style="color:rgb(77, 77, 77);">方法的重写：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">子类从父类继承的某个实例方法无法满足子类的功能需要时，需要在子类中对该实例方法进行重新实现，这样的过程称为重写，也叫做覆写、覆盖。</font>

<font style="color:rgb(77, 77, 77);">方法重写的前提：继承，子类的修饰符大于等于父类，方法名、参数列表、返回值类型必须相同  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029144136-9e1df11e-586e-4811-9394-c38e163800de.png)

### <font style="color:rgb(79, 79, 79);">多态</font>
<font style="color:rgb(77, 77, 77);">多态：一种事物的多种形态（多态的前提：继承、重写、向上转型）  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029144262-4d016b86-c805-465f-a00e-b1a50579454d.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">通过多态可以提高代码的可重用性，降低模块之间的耦合度。</font>

---

## <font style="color:rgb(79, 79, 79);">抽象类</font>
**<font style="color:rgb(77, 77, 77);">抽象类的概念：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">Java中可以定义没有方法体的方法，该方法的具体实现由子类完成，该方法称为抽象方法，包含抽象方法的类就是抽象类。如：Shape类计算周长和面积的方法无法确定，那么就可以将这样的方法声明为抽象的，以便在具体的子类中进行实现。</font>

**<font style="color:rgb(77, 77, 77);">抽象类的声明：</font>**<font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">[修饰符] abstract class 类名 [extends 父类名]{类体}</font>`<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">抽象方法的声明：</font>**<font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">[修饰符] abstract 返回值类型 方法名([参数列表]);</font>`<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">因为抽象方法无法确定具体执行的功能，所有抽象方法没有方法体，需要在小括号后加上分号  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029144487-c513bbcc-dad9-4efd-891d-dcda39d3e6cc.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">抽象类和普通类除了使用abstract修饰外和普通的类相似，抽象类中可以没有抽象方法，但是一旦某个有抽象方法，那么这个类必须被声明为抽象类。</font>

**<font style="color:rgb(77, 77, 77);">抽象类的使用：</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">因为抽象类不是一个具体的类，所以无法实例化，但是抽象类可以用于声明变量  
</font><font style="color:rgb(77, 77, 77);">抽象类可以被继承，在子类中实现抽象类的所有抽象方法，以达到抽象类的具体化  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029144395-99f0a05a-d372-4565-97f7-7751ade326ba.png)

---

## <font style="color:rgb(79, 79, 79);">接口</font>
<font style="color:rgb(77, 77, 77);">在Java中接口不仅仅是程序开发过程中“约定”，更是更加抽象化的抽象类。</font>

**<font style="color:rgb(77, 77, 77);">接口的声明语法：</font>**<font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">[修饰符] interface 接口名{[常量];[抽象方法];}</font>`<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029144485-b2670ea7-b283-44dc-9917-6f451850a217.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">接口实现的语法：</font>**<font style="color:rgb(77, 77, 77);"> </font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">[修饰符] class 类名 [extends 父类名] [implements 接口1,接口2,……]{类体部分}</font>`<font style="color:rgb(77, 77, 77);">  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029144683-6623a15c-524a-41e4-8ed7-363a2b6a6638.png)

<font style="color:rgb(77, 77, 77);">一个类可以实现多个接口，从而解决了Java单继承的缺点。  
</font>![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728029144736-41fc6c1b-25a9-47bc-99d3-869204d0de1c.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">接口的作用：</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">提高程序的重用性</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">提高程序的可扩展性</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">降低程序的耦合度</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">实现了多继承</font>

## <font style="color:rgb(79, 79, 79);">异常</font>
### <font style="color:rgb(79, 79, 79);">一、异常简介</font>
_<font style="color:rgb(77, 77, 77);">什么是异常？</font>_

<font style="color:rgb(77, 77, 77);">异常就是有异于常态，和正常情况不一样，有错误出错。在java中，阻止当前方法或作用域的情况，称之为异常。</font>

_<font style="color:rgb(77, 77, 77);">java中异常的体系是怎么样的呢？</font>_

<font style="color:rgb(77, 77, 77);">1.Java中的所有不正常类都继承于</font>[<font style="color:rgb(77, 77, 77);">Throwable类</font>](https://so.csdn.net/so/search?q=Throwable%E7%B1%BB&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">。Throwable主要包括两个大类，一个是Error类，另一个是Exception类；</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042839770-27a6dfb6-a7b8-4e45-ae9f-204c6fbdb34c.png)

<font style="color:rgb(77, 77, 77);">2.其中Error类中包括虚拟机错误和</font>[<font style="color:rgb(77, 77, 77);">线程死锁</font>](https://so.csdn.net/so/search?q=%E7%BA%BF%E7%A8%8B%E6%AD%BB%E9%94%81&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);">，一旦Error出现了，程序就彻底的挂了，被称为程序终结者；</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042839732-4d56443f-3b9f-43c1-a05e-6054b0ddabdb.png)

<font style="color:rgb(77, 77, 77);">3.Exception类，也就是通常所说的“异常”。主要指编码、环境、用户操作输入出现问题，Exception主要包括两大类，非检查异常（RuntimeException）和检查异常（其他的一些异常）</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042839772-a073a9c3-08e5-481a-b4a8-a03b6d2eebb9.png)

<font style="color:rgb(77, 77, 77);">4.RuntimeException异常主要包括以下四种异常（其实还有很多其他异常，这里不一一列出）：空指针异常、数组下标越界异常、类型转换异常、算术异常。RuntimeException异常会由java虚拟机自动抛出并自动捕获</font>**<font style="color:rgb(77, 77, 77);">（就算我们没写异常捕获语句运行时也会抛出错误！！）</font>**<font style="color:rgb(77, 77, 77);">，此类异常的出现绝大数情况是代码本身有问题应该从逻辑上去解决并改进代码。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042840065-732a7b73-5b88-4bb3-8317-78a2a59a7048.png)

<font style="color:rgb(77, 77, 77);">5.检查异常，引起该异常的原因多种多样，比如说文件不存在、或者是连接错误等等。跟它的“兄弟”RuntimeException运行异常不同，</font>**<font style="color:rgb(77, 77, 77);">该异常我们必须手动在代码里添加捕获语句来处理该异常</font>**<font style="color:rgb(77, 77, 77);">，这也是我们学习java异常语句中主要处理的异常对象。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042840361-5394d9c9-90db-4468-b11d-c71f11071434.png)

[<font style="color:rgb(77, 77, 77);">回到顶部</font>](https://www.cnblogs.com/hysum/p/7112011.html#_labelTop)

### <font style="color:rgb(79, 79, 79);">二、try-catch-finally语句</font>
<font style="color:rgb(77, 77, 77);">（1）try块：负责捕获异常，一旦try中发现异常，程序的控制权将被移交给catch块中的异常处理程序。</font>

**<font style="color:rgb(77, 77, 77);">【try语句块不可以独立存在，必须与 catch 或者 finally 块同存】</font>**

<font style="color:rgb(77, 77, 77);">（2）catch块：如何处理？比如发出警告：提示、检查配置、网络连接，记录错误等。执行完catch块之后程序跳出catch块，继续执行后面的代码。</font>

<font style="color:rgb(77, 77, 77);">【</font>**<font style="color:rgb(77, 77, 77);">编写catch块的注意事项：多个catch块处理的异常类，要按照先catch子类后catch父类的处理方式，因为会【就近处理】异常（由上自下）。</font>**<font style="color:rgb(77, 77, 77);">】</font>

<font style="color:rgb(77, 77, 77);">（3）finally：最终执行的代码，用于关闭和释放资源。</font>

<font style="color:rgb(77, 77, 77);">=======================================================================</font>

<font style="color:rgb(77, 77, 77);">语法格式如下：</font>

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042840268-443a281d-e0ce-437b-a3cc-e4c75071b7ef.gif)

```plain
try{
//一些会抛出的异常
}catch（Exception e）{
//第一个catch
//处理该异常的代码块
}catch（Exception e）{
//第二个catch，可以有多个catch
//处理该异常的代码块
}finally{
//最终要执行的代码
}
```

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042840264-1b30888c-0ba6-473c-9292-23f0d532b51d.gif)

<font style="color:rgb(77, 77, 77);">当异常出现时，程序将终止执行，交由异常处理程序（抛出提醒或记录日志等），异常代码块外代码正常执行。 try会抛出很多种类型的异常，</font>**<font style="color:rgb(77, 77, 77);">由多个catch块捕获多钟错误</font>**<font style="color:rgb(77, 77, 77);">。</font>

<font style="color:rgb(77, 77, 77);">多重异常处理代码块顺序问题：</font>**<font style="color:rgb(77, 77, 77);">先子类再父类</font>**<font style="color:rgb(77, 77, 77);">（顺序不对编译器会提醒错误），finally语句块处理最终将要执行的代码。</font>

<font style="color:rgb(77, 77, 77);">=======================================================================</font>

<font style="color:rgb(77, 77, 77);">接下来，我们用实例来巩固try-catch语句吧~</font>

<font style="color:rgb(77, 77, 77);">先看例子：</font>

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042840314-891e87c7-7f85-48d3-ba58-a7aeb22b4abc.gif)

```plain
1 package com.hysum.test;
 2 
 3 public class TryCatchTest {
 4     /**
 5      * divider:除数
 6      * result:结果
 7      * try-catch捕获while循环
 8      * 每次循环，divider减一，result=result+100/divider
 9      * 如果：捕获异常，打印输出“异常抛出了”，返回-1
10      * 否则：返回result
11      * @return
12      */
13     public int test1(){
14         int divider=10;
15         int result=100;
16         try{
17             while(divider>-1){
18                 divider--;
19                 result=result+100/divider;
20             }
21             return result;
22         }catch(Exception e){
23             e.printStackTrace();
24             System.out.println("异常抛出了！！");
25             return -1;
26         }
27     }
28     public static void main(String[] args) {
29         // TODO Auto-generated method stub
30         TryCatchTest t1=new TryCatchTest();
31         System.out.println("test1方法执行完毕！result的值为："+t1.test1());
32     }
33     
34 }
```

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042840592-38ea9e1e-5956-497f-a939-0cc254d430a2.gif)

<font style="color:rgb(77, 77, 77);">运行结果：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042840756-866e5f09-445c-4b21-996a-6fbf547e200f.png)

<font style="color:rgb(77, 77, 77);">结果分析：结果中的红色字抛出的异常信息是由e.printStackTrace()来输出的，它说明了这里我们抛出的异常类型是算数异常，后面还跟着原因：by zero（由0造成的算数异常），下面两行at表明了造成此异常的代码具体位置。</font>

<font style="color:rgb(77, 77, 77);">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></font>

<font style="color:rgb(77, 77, 77);">在上面例子中再加上一个test2()方法来测试finally语句的执行状况：</font>

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042840824-d31ec3bf-d330-4aa0-97c1-2743a5934c43.gif)

```plain
1     /**
 2      * divider:除数
 3      * result:结果
 4      * try-catch捕获while循环
 5      * 每次循环，divider减一，result=result+100/divider
 6      * 如果：捕获异常，打印输出“异常抛出了”，返回result=999
 7      * 否则：返回result
 8      * finally：打印输出“这是finally，哈哈哈！！”同时打印输出result
 9      * @return
10      */
11     public int test2(){
12         int divider=10;
13         int result=100;
14         try{
15             while(divider>-1){
16                 divider--;
17                 result=result+100/divider;
18             }
19             return result;
20         }catch(Exception e){
21             e.printStackTrace();
22             System.out.println("异常抛出了！！");
23             return result=999;
24         }finally{
25             System.out.println("这是finally，哈哈哈！！");
26             System.out.println("result的值为："+result);
27         }
28         
29     }
30     
31     
32     
33     public static void main(String[] args) {
34         // TODO Auto-generated method stub
35         TryCatchTest t1=new TryCatchTest();
36         //System.out.println("test1方法执行完毕！result的值为："+t1.test1());
37         t1.test2();
38         System.out.println("test2方法执行完毕！");
39     }
```

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042840850-b4e07c1d-2a68-4a48-b304-43c105f3b530.gif)

<font style="color:rgb(77, 77, 77);">运行结果：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042841034-1cd7b1ff-0065-4f59-a13c-e311c7a374ca.png)

<font style="color:rgb(77, 77, 77);">结果分析：我们可以从结果看出，finally语句块是在try块和catch块语句执行之后最后执行的。finally是在return后面的表达式运算后执行的（此时并没有返回运算后的值，而是先把要返回的值保存起来，管finally中的代码怎么样，返回的值都不会改变，仍然是之前保存的值），所以函数返回值是在finally执行前确定的；</font>

<font style="color:rgb(77, 77, 77);">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></font>

<font style="color:rgb(77, 77, 77);">这里有个有趣的问题，如果把上述中的test2方法中的finally语句块中加上return，编译器就会提示警告：finally block does not complete normally </font>

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042841129-98b4b86a-33c2-415c-970d-b226a2077adb.gif)

```plain
1 public int test2(){
 2         int divider=10;
 3         int result=100;
 4         try{
 5             while(divider>-1){
 6                 divider--;
 7                 result=result+100/divider;
 8             }
 9             return result;
10         }catch(Exception e){
11             e.printStackTrace();
12             System.out.println("异常抛出了！！");
13             return result=999;
14         }finally{
15             System.out.println("这是finally，哈哈哈！！");
16             System.out.println("result的值为："+result);
17             return result;//编译器警告
18         }
19         
20     }
```

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042841300-9b100580-2c39-49cf-9cdf-f3584045527f.gif)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042841513-cee9571f-95de-4d0d-b284-4393d0fdc2c3.png)

<font style="color:rgb(77, 77, 77);">分析问题: finally块中的return语句可能会覆盖try块、catch块中的return语句;如果finally块中包含了return语句，即使前面的catch块重新抛出了异常，则调用该方法的语句也不会获得catch块重新抛出的异常，而是会得到finally块的返回值，并且不会捕获异常。</font>

<font style="color:rgb(77, 77, 77);">解决问题：面对上述情况，其实更合理的做法是，既不在try block内部中使用return语句，也不在finally内部使用 return语句，而应该在 finally 语句之后使用return来表示函数的结束和返回。如：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042841433-c7084e18-bb6e-4fea-b964-c21bca995095.png)

<font style="color:rgb(77, 77, 77);">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></font>

**<font style="color:rgb(77, 77, 77);">总结：</font>**

<font style="color:rgb(77, 77, 77);">1、不管有木有出现异常或者try和catch中有返回值return，finally块中代码都会执行；</font>

<font style="color:rgb(77, 77, 77);">2、finally中最好不要包含return，否则程序会提前退出，返回会覆盖try或catch中保存的返回值。</font>

<font style="color:rgb(77, 77, 77);">3.  e.printStackTrace()可以输出异常信息。</font>

<font style="color:rgb(77, 77, 77);">4.  return值为-1为抛出异常的习惯写法。</font>

<font style="color:rgb(77, 77, 77);">5.  如果方法中try,catch,finally中没有返回语句，则会调用这三个语句块之外的return结果。</font>

<font style="color:rgb(77, 77, 77);">6.  finally 在try中的return之后 在返回主调函数之前执行。</font>

[<font style="color:rgb(77, 77, 77);">回到顶部</font>](https://www.cnblogs.com/hysum/p/7112011.html#_labelTop)

### <font style="color:rgb(79, 79, 79);">三、throw和throws关键字</font>
<font style="color:rgb(77, 77, 77);">java中的异常抛出通常使用throw和throws关键字来实现。</font>

<font style="color:rgb(77, 77, 77);">throw ----将产生的异常抛出，是抛出异常的一个</font>**<font style="color:rgb(77, 77, 77);">动作</font>**<font style="color:rgb(77, 77, 77);">。</font>

<font style="color:rgb(77, 77, 77);">一般会用于程序出现某种逻辑时程序员主动抛出某种特定类型的异常。如：  
</font><font style="color:rgb(77, 77, 77);">语法：throw (异常对象)，如：</font>

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042841541-474b93c0-d24d-41ac-87b1-feb069d50462.gif)

```plain
1 public static void main(String[] args) { 
2     String s = "abc"; 
3     if(s.equals("abc")) { 
4       throw new NumberFormatException(); 
5     } else { 
6       System.out.println(s); 
7     } 
8     //function(); 
9 }
```

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042841622-5a903fa4-7afd-4d99-9355-c2461515b695.gif)

<font style="color:rgb(77, 77, 77);">运行结果：</font>

```plain
Exception in thread "main" java.lang.NumberFormatException
at test.ExceptionTest.main(ExceptionTest.java:67)
```

<font style="color:rgb(77, 77, 77);">throws----声明将要抛出何种类型的异常（</font>**<font style="color:rgb(77, 77, 77);">声明</font>**<font style="color:rgb(77, 77, 77);">）。</font>

<font style="color:rgb(77, 77, 77);">语法格式：</font>

```plain
1 public void 方法名（参数列表）
2    throws 异常列表{
3 //调用会抛出异常的方法或者：
4 throw new Exception（）；
5 }
```

<font style="color:rgb(77, 77, 77);">当某个方法可能会抛出某种异常时用于throws 声明可能抛出的异常，然后交给上层调用它的方法程序处理。如：</font>

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042841875-63364964-bd63-4594-b647-65d2a7451271.gif)

```plain
1 public static void function() throws NumberFormatException{ 
 2     String s = "abc"; 
 3     System.out.println(Double.parseDouble(s)); 
 4   } 
 5     
 6   public static void main(String[] args) { 
 7     try { 
 8       function(); 
 9     } catch (NumberFormatException e) { 
10       System.err.println("非数据类型不能转换。"); 
11       //e.printStackTrace(); 
12     } 
13 }
```

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042841899-bc1399c5-188c-4049-a727-a79e0f27f5ab.gif)

**<font style="color:rgb(77, 77, 77);">throw与throws的比较</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">1、throws出现在方法函数头；而throw出现在函数体。  
</font><font style="color:rgb(77, 77, 77);">2、throws表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某种异常对象。  
</font><font style="color:rgb(77, 77, 77);">3、两者都是消极处理异常的方式（这里的消极并不是说这种方式不好），只是抛出或者可能抛出异常，但是不会由函数去处理异常，真正的处理异常由函数的上层调用处理。</font>

<font style="color:rgb(77, 77, 77);">来看个例子：</font>

<font style="color:rgb(77, 77, 77);">throws e1,e2,e3只是告诉程序这个方法可能会抛出这些异常，方法的调用者可能要处理这些异常，而这些异常e1，e2，e3可能是该函数体产生的。  
</font><font style="color:rgb(77, 77, 77);">throw则是明确了这个地方要抛出这个异常。如：</font>

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042841938-e3c5cab0-1874-41ab-b5c5-0d016bfe9e21.gif)

```plain
1 void doA(int a) throws (Exception1,Exception2,Exception3){
 2       try{
 3          ......
 4  
 5       }catch(Exception1 e){
 6        throw e;
 7       }catch(Exception2 e){
 8        System.out.println("出错了！");
 9       }
10       if(a!=b)
11        throw new Exception3("自定义异常");
12 }
```

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042842004-a83a4e39-9d7e-4459-af62-5508fa233805.gif)

<font style="color:rgb(77, 77, 77);">分析:  
</font><font style="color:rgb(77, 77, 77);">1.代码块中可能会产生3个异常，(Exception1,Exception2,Exception3)。  
</font><font style="color:rgb(77, 77, 77);">2.如果产生Exception1异常，则捕获之后再抛出，由该方法的调用者去处理。  
</font><font style="color:rgb(77, 77, 77);">3.如果产生Exception2异常，则该方法自己处理了（即System.out.println("出错了！");）。所以该方法就不会再向外抛出Exception2异常了，void doA() throws Exception1,Exception3 里面的</font>**<font style="color:rgb(77, 77, 77);">Exception2也就不用写了。因为已经用try-catch语句捕获并处理了。</font>**<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">4.Exception3异常是该方法的某段逻辑出错，程序员自己做了处理，在该段逻辑错误的情况下抛出异常Exception3，则该方法的调用者也要处理此异常。这里用到了自定义异常，该异常下面会由解释。</font>

<font style="color:rgb(77, 77, 77);">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></font>

<font style="color:rgb(77, 77, 77);">使用throw和throws关键字</font>**<font style="color:rgb(77, 77, 77);">需要注意</font>**<font style="color:rgb(77, 77, 77);">以下几点：</font>

<font style="color:rgb(77, 77, 77);">1.throws的异常列表可以是抛出一条异常，也可以是抛出多条异常，每个类型的异常中间用逗号隔开</font>

<font style="color:rgb(77, 77, 77);">2.方法体中调用会抛出异常的方法或者是先抛出一个异常：用throw new Exception（） throw写在方法体里，表示“抛出异常”这个动作。</font>

<font style="color:rgb(77, 77, 77);">3.如果某个方法调用了抛出异常的方法，那么必须添加try catch语句去尝试捕获这种异常， 或者添加声明，将异常抛出给更上一层的调用者进行处理</font>

<font style="color:rgb(77, 77, 77);">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>></font>

**<font style="color:rgb(77, 77, 77);">自定义异常</font>**

_<font style="color:rgb(77, 77, 77);">为什么要使用自定义异常，有什么</font>__**<font style="color:rgb(77, 77, 77);">好处</font>**__<font style="color:rgb(77, 77, 77);">？</font>_

<font style="color:rgb(77, 77, 77);">1.我们在工作的时候，项目是分模块或者分功能开发的 ,基本不会你一个人开发一整个项目，使用自定义异常类就</font>**<font style="color:rgb(77, 77, 77);">统一了对外异常展示的方式</font>**<font style="color:rgb(77, 77, 77);">。</font>

<font style="color:rgb(77, 77, 77);">2.有时候我们遇到某些校验或者问题时，</font>**<font style="color:rgb(77, 77, 77);">需要直接结束掉当前的请求</font>**<font style="color:rgb(77, 77, 77);">，这时便可以通过抛出自定义异常来结束，如果你项目中使用了SpringMVC比较新的版本的话有控制器增强，可以通过@ControllerAdvice注解写一个控制器增强类来拦截自定义的异常并响应给前端相应的信息。</font>

<font style="color:rgb(77, 77, 77);">3.自定义异常可以在我们项目中某些</font>**<font style="color:rgb(77, 77, 77);">特殊的业务逻辑</font>**<font style="color:rgb(77, 77, 77);">时抛出异常，比如"中性".equals(sex)，性别等于中性时我们要抛出异常，而Java是不会有这种异常的。系统中有些错误是符合Java语法的，但不符合我们项目的业务逻辑。</font>

<font style="color:rgb(77, 77, 77);">4.使用自定义异常继承相关的异常来抛出处理后的异常信息</font>**<font style="color:rgb(77, 77, 77);">可以隐藏底层的异常，这样更安全，异常信息也更加的直观。</font>**<font style="color:rgb(77, 77, 77);">自定义异常可以抛出我们自己想要抛出的信息，可以通过抛出的信息区分异常发生的位置，根据异常名我们就可以知道哪里有异常，根据异常提示信息进行程序修改。比如空指针异常NullPointException，我们可以抛出信息为“xxx为空”定位异常位置，而不用输出堆栈信息。</font>

_<font style="color:rgb(77, 77, 77);">说完了为什么要使用自定义异常，有什么好处，我们再来看看自定义异常的</font>__**<font style="color:rgb(77, 77, 77);">毛病</font>**__<font style="color:rgb(77, 77, 77);">：</font>_

<font style="color:rgb(77, 77, 77);">毋庸置疑，我们不可能期待JVM（Java虚拟机）自动抛出一个自定义异常，也不能够期待JVM会自动处理一个自定义异常。发现异常、抛出异常以及处理异常的工作必须靠编程人员在代码中利用异常处理机制自己完成。这样就相应的增加了一些开发成本和工作量，所以项目没必要的话，也不一定非得要用上自定义异常，要能够自己去权衡。</font>

_<font style="color:rgb(77, 77, 77);">最后，我们来看看怎么</font>__**<font style="color:rgb(77, 77, 77);">使用</font>**__<font style="color:rgb(77, 77, 77);">自定义异常：</font>_

<font style="color:rgb(77, 77, 77);">在 Java 中你可以自定义异常。编写自己的异常类时需要记住下面的几点。</font>

+ <font style="color:rgb(51, 51, 51);">所有异常都必须是 Throwable 的子类。</font>
+ <font style="color:rgb(51, 51, 51);">如果希望写一个检查性异常类，则需要继承 Exception 类。</font>
+ <font style="color:rgb(51, 51, 51);">如果你想写一个运行时异常类，那么需要继承 RuntimeException 类。</font>

<font style="color:rgb(77, 77, 77);">可以像下面这样定义自己的异常类：</font>

<font style="color:rgb(77, 77, 77);">class MyException extends Exception{ }</font>

<font style="color:rgb(77, 77, 77);">我们来看一个实例：</font>

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042842263-1aade370-3ca4-4375-9a77-0950dedb387e.gif)

```plain
1 package com.hysum.test;
 2 
 3 public class MyException extends Exception {
 4      /**
 5      * 错误编码
 6      */
 7     private String errorCode;
 8 
 9    
10     public MyException(){}
11     
12     /**
13      * 构造一个基本异常.
14      *
15      * @param message
16      *        信息描述
17      */
18     public MyException(String message)
19     {
20         super(message);
21     }
22 
23    
24 
25     public String getErrorCode() {
26         return errorCode;
27     }
28 
29     public void setErrorCode(String errorCode) {
30         this.errorCode = errorCode;
31     }
32 
33     
34 }
```

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042842357-2895c357-cc84-46cc-b3f7-40740a627eb6.gif)

<font style="color:rgb(77, 77, 77);">使用自定义异常抛出异常信息：</font>

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042842431-39f11424-3943-4995-83f5-0ca069abab46.gif)

```plain
1 package com.hysum.test;
 2 
 3 public class Main {
 4 
 5     public static void main(String[] args) {
 6         // TODO Auto-generated method stub
 7         String[] sexs = {"男性","女性","中性"};
 8                   for(int i = 0; i < sexs.length; i++){
 9                       if("中性".equals(sexs[i])){
10                           try {
11                             throw new MyException("不存在中性的人！");
12                         } catch (MyException e) {
13                             // TODO Auto-generated catch block
14                             e.printStackTrace();
15                         }
16                      }else{
17                          System.out.println(sexs[i]);
18                      }
19                 } 
20     }
21 
22 }
```

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042842474-30c9314d-1dc1-4e2a-bd13-04ad10a594a2.gif)

<font style="color:rgb(77, 77, 77);">运行结果：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042842872-19296a23-e743-4e3a-8449-7b922606bce1.png)

<font style="color:rgb(77, 77, 77);">就是这么简单，可以根据实际业务需求去抛出相应的自定义异常。</font>

[<font style="color:rgb(77, 77, 77);">回到顶部</font>](https://www.cnblogs.com/hysum/p/7112011.html#_labelTop)

### <font style="color:rgb(79, 79, 79);">四、java中的异常链</font>
<font style="color:rgb(77, 77, 77);">异常需要封装，但是仅仅封装还是不够的，还需要</font>**<font style="color:rgb(77, 77, 77);">传递异常</font>**<font style="color:rgb(77, 77, 77);">。</font>

<font style="color:rgb(77, 77, 77);">异常链是一种面向对象编程技术，指将捕获的异常</font>**<font style="color:rgb(77, 77, 77);">包装</font>**<font style="color:rgb(77, 77, 77);">进一个</font>**<font style="color:rgb(77, 77, 77);">新的异常</font>**<font style="color:rgb(77, 77, 77);">中并</font>**<font style="color:rgb(77, 77, 77);">重新抛出</font>**<font style="color:rgb(77, 77, 77);">的异常处理方式。原异常被保存为新异常的一个属性（比如cause）。这样做的意义是一个方法应该抛出定义在相同的抽象层次上的异常，但不会丢弃更低层次的信息。</font>

<font style="color:rgb(77, 77, 77);">我可以这样理解异常链：</font>

<font style="color:rgb(77, 77, 77);">把捕获的异常包装成新的异常，在新异常里添加原始的异常，并将新异常抛出，它们就像是链式反应一样，一个导致（cause）另一个。这样在最后的顶层抛出的异常信息就包括了最底层的异常信息。</font>

<font style="color:rgb(77, 77, 77);">》场景</font>

<font style="color:rgb(77, 77, 77);">比如我们的JEE项目一般都又三层：持久层、逻辑层、展现层，持久层负责与</font>[<font style="color:rgb(77, 77, 77);">数据库</font>](http://lib.csdn.net/base/mysql)<font style="color:rgb(77, 77, 77);">交互，逻辑层负责业务逻辑的实现，展现层负责UI数据的处理。</font>

<font style="color:rgb(77, 77, 77);">有这样一个模块：用户第一次访问的时候，需要持久层从user.xml中读取数据，如果该文件不存在则提示用户创建之，那问题就来了：如果我们直接把持久层的异常FileNotFoundException抛弃掉，逻辑层根本无从得知发生任何事情，也就不能为展现层提供一个友好的处理结果，最终倒霉的就是展现层：没有办法提供异常信息，只能告诉用户“出错了，我也不知道出了什么错了”—毫无友好性而言。</font>

<font style="color:rgb(77, 77, 77);">正确的做法是先封装，然后传递，过程如下：</font>

<font style="color:rgb(77, 77, 77);">1.把FileNotFoundException封装为MyException。</font>

<font style="color:rgb(77, 77, 77);">2.抛出到逻辑层，逻辑层根据异常代码（或者自定义的异常类型）确定后续处理逻辑，然后抛出到展现层。</font>

<font style="color:rgb(77, 77, 77);">3.展现层自行确定展现什么，如果管理员则可以展现低层级的异常，如果是普通用户则展示封装后的异常。</font>

<font style="color:rgb(77, 77, 77);">》示例</font>

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042842918-f9f2bdaf-c9a6-494e-a54d-d1289cf9980e.gif)

```plain
1 package com.hysum.test;
 2 
 3 public class Main {
 4     public void test1() throws RuntimeException{
 5         String[] sexs = {"男性","女性","中性"};
 6         for(int i = 0; i < sexs.length; i++){
 7             if("中性".equals(sexs[i])){
 8                 try {
 9                     throw new MyException("不存在中性的人！");
10                 } catch (MyException e) {
11                     // TODO Auto-generated catch block
12                     e.printStackTrace();
13                     RuntimeException rte=new RuntimeException(e);//包装成RuntimeException异常
14                     //rte.initCause(e);
15                     throw rte;//抛出包装后的新的异常
16                 }
17            }else{
18                System.out.println(sexs[i]);
19            }
20       } 
21     }
22     public static void main(String[] args) {
23         // TODO Auto-generated method stub
24         Main m =new Main();
25         
26         try{
27         m.test1();
28         }catch (Exception e){
29             e.printStackTrace();
30             e.getCause();//获得原始异常
31         }
32         
33     }
34 
35 }
```

![](https://cdn.nlark.com/yuque/0/2024/gif/46412986/1728042842867-34af57a4-5c14-4868-9d6e-99ce8e3b3512.gif)

<font style="color:rgb(77, 77, 77);">运行结果：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728042843317-39b17544-a8a2-465a-a7c6-509e978b30e9.png)

<font style="color:rgb(77, 77, 77);">结果分析：我们可以看到控制台先是输出了原始异常，这是由e.getCause()输出的；然后输出了e.printStackTrace()，在这里可以看到Caused by：原始异常和e.getCause()输出的一致。这样就是形成一个异常链。</font>**<font style="color:rgb(77, 77, 77);">initCause()的作用是包装原始的异常，当想要知道底层发生了什么异常的时候调用getCause()就能获得原始异常</font>**<font style="color:rgb(77, 77, 77);">。 </font>

<font style="color:rgb(77, 77, 77);">》建议</font>

<font style="color:rgb(77, 77, 77);">异常需要封装和传递，我们在进行系统开发的时候，不要“吞噬”异常，也不要“赤裸裸”的抛出异常，封装后在抛出，或者通过异常链传递，可以达到系统更健壮、友好的目的。</font>

### <font style="color:rgb(79, 79, 79);">五、结束语</font>
<font style="color:rgb(77, 77, 77);">java的异常处理的知识点杂而且理解起来也有点困难，我在这里给大家总结了以下几点使用java异常处理的时候，</font>**<font style="color:rgb(77, 77, 77);">良好的编码习惯：</font>**

<font style="color:rgb(77, 77, 77);">1、处理运行时异常时，采用逻辑去合理规避同时辅助try-catch处理</font>

<font style="color:rgb(77, 77, 77);">2、在多重catch块后面，可以加一个catch（Exception）来处理可能会被遗漏的异常</font>

<font style="color:rgb(77, 77, 77);">3、对于不确定的代码，也可以加上try-catch，处理潜在的异常</font>

<font style="color:rgb(77, 77, 77);">4、尽量去处理异常，切记只是简单的调用printStackTrace（）去打印</font>

<font style="color:rgb(77, 77, 77);">5、具体如何处理异常，要根据不同的业务需求和异常类型去决定</font>

<font style="color:rgb(77, 77, 77);">6、尽量添加finally语句块去释放占用的资源</font>

## 注解
### <font style="color:rgb(79, 79, 79);">一、概念</font>
#### <font style="color:rgb(79, 79, 79);">1.1. 什么是注解？</font>
<font style="color:rgb(77, 77, 77);">Java注解（Annotation），也叫</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">元数据</font>`<font style="color:rgb(77, 77, 77);">。一种代码级别的说明。它是JDK1.5及以后版本引入的一个特性，与类、接口、枚举是在同一个层次。它可以声明在</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">包、类、字段、方法、局部变量、方法参数</font>`<font style="color:rgb(77, 77, 77);">等的前面，用来对这些元素进行说明，注释。</font>

**<font style="color:rgb(77, 77, 77);">如果要对于元数据的作用进行分类，还没有明确的定义，不过我们可以根据它所起的作用，大致可分为三类：</font>**

+ <font style="color:rgba(0, 0, 0, 0.75);">① 编写文档：通过代码里标识的元数据生成文档【生成文档doc文档】</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">② 代码分析：通过代码里标识的元数据对代码进行分析【使用反射】</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">③ 编译检查：通过代码里标识的元数据让编译器能够实现基本的编译检查【Override】</font>

<font style="color:rgb(77, 77, 77);">注解是以‘</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@注解名</font>`<font style="color:rgb(77, 77, 77);">’在代码中存在的，根据注解参数的个数，我们可以将注解分为：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">标记注解</font>`<font style="color:rgb(77, 77, 77);">、</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">单值注解</font>`<font style="color:rgb(77, 77, 77);">、</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">完整注解</font>`<font style="color:rgb(77, 77, 77);">三类。它们都不会直接影响到程序的语义，只是作为注解（标识）存在，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">我们可以通过反射机制编程实现对这些元数据（用来描述数据的数据）的访问</font>`<font style="color:rgb(77, 77, 77);">。</font>

**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">首先一定要明白</font>**<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">注解他本身是没有任何作用的</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">，比如</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@RequestMapping</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">，在controller层</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@RequestMapping</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">基本上可以说是必见的，我们都知道他的作用是请求映射，通过他来设置请求的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">url</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">地址，举例：将</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@RequestMapping("config")</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">写在方法上，然后我们就可以通过</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">url</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">地址访问到这个方法了，但是记住这并不是</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@RequestMapping</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注解的功能，SpringMVC会通过反射将注解当中设置的属性值</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">config</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">拿到，然后将</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">url</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">和你声明注解的方法进行绑定。记住：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">注解只是用来标记，而这个注解真正的功能都是由框架通过反射来实现的</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">。</font>

#### <font style="color:rgb(79, 79, 79);">1.2. 什么是元数据？</font>
<font style="color:rgb(77, 77, 77);">元数据是一个非常广泛的概念，元数据的定义也非常简单，只要是</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">描述数据的数据都是元数据</font>`<font style="color:rgb(77, 77, 77);">。很简单，一个数字170，单看数据你肯定不知道这个数据代表什么，这就需要元数据支持，你才能明白数据代表的事实是什么。它可能是一个人的身高，也可能指一个人的体重，这需要数据对应的标题、单位等信息来描述这个数据，这些就是描述这个数据的元数据了</font>

#### <font style="color:rgb(79, 79, 79);">1.3. 注解的属性</font>
<font style="color:rgb(77, 77, 77);">注解的属性也叫做成员变量。注解只有成员变量，没有方法。注解的成员变量在注解的定义中以“无形参的方法”形式来声明，其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型。</font>

```plain
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    int id();
    String msg();
}
```

<font style="color:rgb(77, 77, 77);">上面代码定义了 TestAnnotation 这个注解中拥有 id 和 msg 两个属性。在使用的时候，我们应该给它们进行赋值。</font>

<font style="color:rgb(77, 77, 77);">赋值的方式是在注解的括号内以 value=”” 形式，多个属性之前用 ，隔开。</font>

```plain
@TestAnnotation(id=3,msg="hello annotation")
public class Test {
}
```

<font style="color:rgb(77, 77, 77);">需要注意的是，在注解中定义属性时它的类型必须是 8 种基本数据类型外加 类、接口、注解及它们的数组。</font>

<font style="color:rgb(77, 77, 77);">注解中属性可以有默认值，默认值需要用 default 关键值指定。比如：</font>

```plain
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    public int id() default -1;
    public String msg() default "Hi";
}
```

<font style="color:rgb(77, 77, 77);">TestAnnotation 中 id 属性默认值为 -1，msg 属性默认值为 Hi。</font>

### <font style="color:rgb(79, 79, 79);">二、根据【注解参数】 分类</font>
<font style="color:rgb(77, 77, 77);">根据注解参数的个数，我们可以将注解分为：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">标记注解</font>`<font style="color:rgb(77, 77, 77);">、</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">单值注解</font>`<font style="color:rgb(77, 77, 77);">、</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">完整注解</font>`<font style="color:rgb(77, 77, 77);">三类。</font>

#### <font style="color:rgb(79, 79, 79);">2.1. 标记注解</font>
<font style="color:rgb(77, 77, 77);">标记注解不包含</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">成员/元素</font>`<font style="color:rgb(77, 77, 77);">。它仅用于标记声明。</font>

<font style="color:rgb(77, 77, 77);">其语法为：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@AnnotationName()</font>`

+ <font style="color:rgba(0, 0, 0, 0.75);">由于这些注解不包含元素，因此不需要括号。例如：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Override</font>`

#### <font style="color:rgb(79, 79, 79);">2.2. 单元素注解</font>
<font style="color:rgb(77, 77, 77);">单个元素注解仅包含一个元素。</font>

<font style="color:rgb(77, 77, 77);">其语法为：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@AnnotationName(elementName = "elementValue")</font>`

+ <font style="color:rgba(0, 0, 0, 0.75);">如果只有一个元素，则习惯上将该元素命名为value：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@AnnotationName(value = "elementValue")</font>`
+ <font style="color:rgba(0, 0, 0, 0.75);">在这种情况下，也可以移除元素名称。元素名称默认为value：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@AnnotationName("elementValue")</font>`

#### <font style="color:rgb(79, 79, 79);">2.3. 多元素注解</font>
<font style="color:rgb(77, 77, 77);">这些注解包含多个用逗号分隔的元素。</font>

<font style="color:rgb(77, 77, 77);">其语法为：</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@AnnotationName(element1 = "value1", element2 = "value2")</font>`

### <font style="color:rgb(79, 79, 79);">三、根据【注解作用】分类</font>
#### <font style="color:rgb(79, 79, 79);">3.1. 预定义的注解</font>
<font style="color:rgb(77, 77, 77);">这几个注解都是</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">java.lang</font>`<font style="color:rgb(77, 77, 77);">包下的，也就是Java提供的基础注解，我们在使用的时候是不需要导包的！</font>

##### <font style="color:rgb(79, 79, 79);">3.1.1. @Deprecated</font>
<font style="color:rgb(77, 77, 77);">此注解可以用在方法，属性，类上，表示不推荐程序员使用，但是还可以使用，示例如下：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043357650-d4473542-3f72-47b3-8c5f-1f3c4b474a0b.png)

```plain
/**
 * 测试Deprecated注解
 * @author Administrator
 */
public class DeprecatedDemoTest {
    public static void main(String[]args) {
        // 使用DeprecatedClass里声明被过时的方法
        DeprecatedClass.DeprecatedMethod();
    }
}

class DeprecatedClass {
    @Deprecated
    public static void DeprecatedMethod() {
    }
}
```

##### <font style="color:rgb(79, 79, 79);">3.1.2. @Override</font>
<font style="color:rgb(77, 77, 77);">它的作用是对覆盖超类中方法的方法进行标记，如果被标记的方法并没有实际覆盖超类中的方法，则编译器会发出错误警告。</font>

```plain
public interface Test {
    public String getStr();
}

class TestImpl implements Test{

	// 假如返回参数和方法参数其中一个不一致，就会警告
    @Override
    public String getStr() {
        return null;
    }
}
```

##### <font style="color:rgb(79, 79, 79);">3.1.3. @SuppressWarnings</font>
<font style="color:rgb(77, 77, 77);">我们在写代码的时候，不论是导入的包，还是声明的对象，有时候会出现黄线，感觉就很难受！</font>

<font style="color:rgb(77, 77, 77);">@SuppressWarnings注解主要用在取消一些编译器产生的警告，警告对于运行代码实际上并没有影响，但是出于部分程序员具有洁癖的嗜好，通常会采用@SuppressWarnings来消除警告。</font>

**<font style="color:rgb(77, 77, 77);">示例一：警告如图所示</font>**

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043357656-db1086e4-d9fe-446e-ac04-5a138a6740d8.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">这只是一个service接口：</font>

```plain
public interface BannerService {
}
```

**<font style="color:rgb(77, 77, 77);">这时候我们在方法上加上@SuppressWarnings注解就可以消除这些警告的产生，注解的使用方式有三种：</font>**

1. <font style="color:rgba(0, 0, 0, 0.75);">@SuppressWarnings(“unchecked”) [^ 抑制单类型的警告]</font>
2. <font style="color:rgba(0, 0, 0, 0.75);">@SuppressWarnings(“unchecked”,“rawtypes”) [^ 抑制多类型的警告]</font>
3. <font style="color:rgba(0, 0, 0, 0.75);">@SuppressWarnings(“all”) [^ 抑制所有类型的警告]</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">通过源码分析可知@SuppressWarnings其注解目标为类、字段、函数、函数入参、构造函数和函数的局部变量。建议把注解放在警告发生的位置。</font>

**<font style="color:rgb(77, 77, 77);">消除警告：</font>**

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043357965-89f80a47-cf96-4598-a16e-d13d8b8c5b43.png)

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">这个警告是spring framerwork 4.0以后开始出现的，spring 4.0开始就不推荐使用属性注入，改为推荐构造器注入和setter注入。当然他只是推荐，如果我们想要消除警告也可以直接使用</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Resource</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">。尽管他推荐了，但是一般实际开发当中很少会使用构造器注入和setter注入。</font>

1. <font style="color:rgb(77, 77, 77);">@Autowired 是Spring提供的，@Resource 是J2EE提供的。</font>
2. <font style="color:rgb(77, 77, 77);">@Autowired与@Resource都可以用来装配bean，都可以写在字段或setter方法上</font>
3. <font style="color:rgb(77, 77, 77);">@Autowired默认按</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">类型</font>`<font style="color:rgb(77, 77, 77);">装配，默认情况下必须要求依赖对象存在，如果要允许null值，可以设置它的</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">required属性为false</font>`<font style="color:rgb(77, 77, 77);">。如果想使用名称装配可以结合</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Qualifier</font>`<font style="color:rgb(77, 77, 77);">注解进行使用。</font>
4. <font style="color:rgb(77, 77, 77);">@Resource，默认按照</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">名称</font>`<font style="color:rgb(77, 77, 77);">进行装配，名称可以通过name属性进行指定，如果没有指定name属性，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">当注解写在字段上时，默认取字段名进行名称查找</font>`<font style="color:rgb(77, 77, 77);">。如果注解写在setter方法上默认取属性名进行装配。</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">当找不到与名称匹配的bean时才按照类型进行装配</font>`<font style="color:rgb(77, 77, 77);">。但是需要注意的是，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">如果name属性一旦指定，就只会按照名称进行装配</font>`<font style="color:rgb(77, 77, 77);">。</font>

**<font style="color:rgb(77, 77, 77);">示例二：警告如图所示</font>**

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043358311-01df0d04-21dc-458b-a7eb-863a0527a125.png)

<font style="color:rgb(77, 77, 77);">通过添加</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@SuppressWarnings("unchecked")</font>`<font style="color:rgb(77, 77, 77);">来消除</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">unchecked</font>`<font style="color:rgb(77, 77, 77);">的警告，这个警告实际上主要是集合没有加泛型导致的！</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043358521-9b2a0acb-b7dc-46cb-88df-057065864207.png)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043358797-dee052ca-c409-4259-b388-ca946982fea7.png)

##### <font style="color:rgb(79, 79, 79);">3.1.4. @SafeVarargs</font>
<font style="color:rgb(77, 77, 77);">在声明具有模糊类型（比如：泛型）的可变参数的构造函数或方法时，Java编译器会报</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">unchecked</font>`<font style="color:rgb(77, 77, 77);">警告。鉴于这些情况，如果程序员断定声明的构造函数和方法的主体不会对其varargs参数执行潜在的不安全的操作，可使用</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@SafeVarargs</font>`<font style="color:rgb(77, 77, 77);">进行标记，这样的话，Java编译器就不会报unchecked警告。</font>

**<font style="color:rgb(77, 77, 77);">使用前提：</font>**

1. <font style="color:rgba(0, 0, 0, 0.75);">方法必须是由</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">static或者final修饰的方法</font>`<font style="color:rgba(0, 0, 0, 0.75);">！</font>
2. <font style="color:rgba(0, 0, 0, 0.75);">只能用于标记构造函数和方法</font>
3. <font style="color:rgba(0, 0, 0, 0.75);">只能用在可变长参数的方法上</font>

```plain
@SafeVarargs
public static <T> T useVarargs(T... args) {  
    return args.length > 0 ? args[0] : null;  
} 
```

##### <font style="color:rgb(79, 79, 79);">3.1.5. @FunctionalInterface</font>
<font style="color:rgb(77, 77, 77);">被@FunctionalInterface注解标记的类型表明这是一个</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">函数接口</font>`<font style="color:rgb(77, 77, 77);">。从概念上讲，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">函数接口只有一个抽象方法</font>`<font style="color:rgb(77, 77, 77);">。也就是一旦不满足函数接口，就会报错，比如他有两个抽象方法。</font>

<font style="color:rgb(77, 77, 77);">@FunctionalInterface注解，只能用于接口类。其实，它的应用范围更小，只能应用于接口类型。</font>

```plain
@FunctionalInterface
public interface Test {
    public String getStr();
}
```

#### <font style="color:rgb(79, 79, 79);">3.2. 元注解</font>
<font style="color:rgb(77, 77, 77);">以下的注解都来源于</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">java.lang.annotation</font>`<font style="color:rgb(77, 77, 77);">，描述数据的数据都是</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">元数据</font>`<font style="color:rgb(77, 77, 77);">，描述注解的注解都是</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">元注解</font>`<font style="color:rgb(77, 77, 77);">！也就是这些注解只能用在</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">修饰注解</font>`<font style="color:rgb(77, 77, 77);">上，不能使用在其他地方，比如方法、类等等！</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">@Native注解除外，他的使用范围是FIELD(字段、枚举的常量)，但是@Native也是在</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">java.lang.annotation</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">包下！</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043358906-0f828acb-3ea3-49e3-aa60-2b736f5926a1.png)

##### <font style="color:rgb(79, 79, 79);">3.2.1. @Retention</font>
<font style="color:rgb(77, 77, 77);">注解按生命周期来划分可分为3类：</font>

+ <font style="color:rgba(0, 0, 0, 0.75);">RetentionPolicy.SOURCE：注解只保留在源文件，当Java文件编译成class文件的时候，注解被遗弃；也就是编译时有效。</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">RetentionPolicy.CLASS：注解被保留到class文件，但jvm加载class文件时候被遗弃，这是默认的生命周期；加载时被抛弃。</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">RetentionPolicy.RUNTIME：注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；一直有效！</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">lombok可以通过@Data注解省去get set 方法，实际上@Data的生命周期就是RetentionPolicy.SOURCE，他是通过注解来标记这个方法要生成get set方法，然后在编译的时候直接会生成get set。生成过后，就被抛弃了。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043358879-7d9519b4-6884-40d9-a30d-140cdc582107.png)

##### <font style="color:rgb(79, 79, 79);">3.2.2. @Documented</font>
`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Documented</font>`<font style="color:rgb(77, 77, 77);">和</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Deprecated</font>`<font style="color:rgb(77, 77, 77);">注解长得有点像，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Deprecated</font>`<font style="color:rgb(77, 77, 77);">是用来标注某个类或者方法不建议再继续使用，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Documented</font>`<font style="color:rgb(77, 77, 77);">只能用在注解上，如果一个注解@B，被</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Documented</font>`<font style="color:rgb(77, 77, 77);">标注，那么被@B修饰的类，生成文档时，会显示@B。如果@B没有被</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Documented</font>`<font style="color:rgb(77, 77, 77);">标注，最终生成的文档中就不会显示@B。这里的生成文档指的JavaDoc文档！</font>

`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Deprecated</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注解基本上所有框架自定义的注解都会添加，所谓javadoc其实就是JDK给我们提供的一个生成文档的工具！</font>

<font style="color:rgb(77, 77, 77);">由于篇幅问题，@Documented详解请看这篇文章：</font>[<font style="color:rgb(77, 77, 77);">https://blog.csdn.net/weixin_43888891/article/details/126981711</font>](https://blog.csdn.net/weixin_43888891/article/details/126981711)

##### <font style="color:rgb(79, 79, 79);">3.2.3. @Target</font>
<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">@Target：@Target只能用在注解上，指定修饰的注解的使用范围</font>

+ <font style="color:rgba(0, 0, 0, 0.75);">@Target(ElementType.TYPE) —— 接口、类、枚举、注解</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">@Target(ElementType.FIELD) —— 字段、枚举的常量</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">@Target(ElementType.METHOD) —— 方法</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">@Target(ElementType.PARAMETER) —— 方法参数</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">@Target(ElementType.CONSTRUCTOR) —— 构造函数</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">@Target(ElementType.LOCAL_VARIABLE) —— 局部变量</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">@Target(ElementType.ANNOTATION_TYPE) —— 注解</font>
+ <font style="color:rgba(0, 0, 0, 0.75);">@Target(ElementType.PACKAGE) —— 包</font>

<font style="color:rgb(77, 77, 77);">比如</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Target({ElementType.TYPE, ElementType.METHOD})</font>`<font style="color:rgb(77, 77, 77);">，就代表着@RequestMapping可以用在 接口、类、枚举、注解上、还可以用在方法上！</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043359140-df130eb6-2aa1-43e7-959e-6f3d441f589a.png)

##### <font style="color:rgb(79, 79, 79);">3.2.4. @Inherited</font>
<font style="color:rgb(77, 77, 77);">如果一个类用上了@Inherited修饰的注解，那么其子类也会继承这个注解。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">当用了</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Inherited</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">修饰的注解的@Retention是</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">RetentionPolicy.RUNTIME</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">，则增强了继承性，在反射中可以获取得到</font>

**<font style="color:rgb(77, 77, 77);">代码示例：</font>**

<font style="color:rgb(77, 77, 77);">1.首先自定义一个注解使用</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Inherited</font>`<font style="color:rgb(77, 77, 77);">修饰，然后这个注解用来修饰到父类上</font>

```plain
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ATable {
    public String name() default "";
}
```

<font style="color:rgb(77, 77, 77);">2.这个注解带不带@Inherited都可以，我们主要用来修饰子类</font>

```plain
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface BTable {
    public String name() default "";
}
```

<font style="color:rgb(77, 77, 77);">2.定义一个父类跟一个子类，然后在父类上用上我们自定义的@ATable注解</font>

```plain
@ATable
public class Super {
    public static void main(String[] args) {
        Class<Sub> clazz = Sub.class;
        System.out.println("============================AnnotatedElement===========================");
        // 获取自身和父级带有@Inherited修饰的注解。如果@ATable未加@Inherited修饰，则获取的只是自身的注解而无法获取父级修饰的@ATable注解
        System.out.println(Arrays.toString(clazz.getAnnotations()));
        System.out.println("------------------");
    }
}
@BTable
class Sub extends Super {
}
```

<font style="color:rgb(77, 77, 77);">3.这个是@ATable带有@Inherited修饰的 运行结果。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043359547-7909aaef-a887-4179-8010-2b1f9056c960.png)<font style="color:rgb(77, 77, 77);">  
</font><font style="color:rgb(77, 77, 77);">4.这个是没有用@Inherited修饰的 运行结果。</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043359778-57a4e5cd-2f73-4d8f-a022-120b8cdb5820.png)

##### <font style="color:rgb(79, 79, 79);">3.2.5. @Repeatable</font>
<font style="color:rgb(77, 77, 77);">@Repeatable 注解是用于声明其它类型注解的元注解，来表示这个声明的注解是可重复的。</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Repeatable的值是另一个注解，其可以通过这个另一个注解的值来包含这个可重复的注解</font>`<font style="color:rgb(77, 77, 77);">。</font>

**<font style="color:rgb(77, 77, 77);">代码示例：</font>**

<font style="color:rgb(77, 77, 77);">1.自定义Value注解</font>

```plain
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Values.class)
public @interface Value {
    String value() default "value";
}
```

<font style="color:rgb(77, 77, 77);">2.自定义Values 注解</font>

```plain
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Values {
    Value[] value();
}
```

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">其中，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Value</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注解上的元注解</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Repeatable</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">中的值，使用了</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Values</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注解，</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Values</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注解中包含的值类型是一个</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Value</font>`<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">注解的数组！这就解释了官方文档中@Repeatable中值的使用。</font>

<font style="color:rgb(77, 77, 77);">3.测试</font>

```plain
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationClass {

    @Value("hello")
    @Value("world")
    public void test(String var1, String var2) {
        System.out.println(var1 + " " + var2);
    }

    public static void main(String[] args) {
        Method[] methods = AnnotationClass.class.getMethods();
        for (Method method : methods){
            if (method.getName().equals("test")) {
                Annotation[] annotations = method.getDeclaredAnnotations();
                System.out.println(annotations.length);
                System.out.println(method.getName() + " = " + Arrays.toString(annotations));
            }
        }
    }
}
```

<font style="color:rgb(77, 77, 77);">4.运行结果</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043360095-af3101b1-9912-4a25-83c5-80870a040ffa.png)

<font style="color:rgb(77, 77, 77);">5.假如Value注解没有使用@Repeatable修饰，编译器会报错，是不允许出现注解重复的</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043360152-63a99113-138e-41fc-97bc-8c6bb33b2ff7.png)<font style="color:rgb(77, 77, 77);">  
</font>**<font style="color:rgb(77, 77, 77);">注意事项：</font>**

1. <font style="color:rgba(0, 0, 0, 0.75);">@Repeatable 所声明的注解，其元注解@Target的使用范围要比@Repeatable的值声明的注解中的@Target的范围要大或相同，否则编译器错误，显示@Repeatable值所声明的注解的元注解@Target不是@Repeatable声明的注解的@Target的子集</font>
2. <font style="color:rgba(0, 0, 0, 0.75);">@Repeatable注解声明的注解的元注解@Retention的周期要比@Repeatable的值指向的注解的@Retention得周期要小或相同。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">周期长度为 SOURCE(源码) < CLASS (字节码) < RUNTIME(运行)</font>

##### <font style="color:rgb(79, 79, 79);">3.2.6. @Native</font>
<font style="color:rgb(77, 77, 77);">@Native注解修饰成员变量，则表示这个变量可以被本地代码引用，常常被代码生成工具使用。对于 @Native 注解不常使用，了解即可！</font>

#### <font style="color:rgb(79, 79, 79);">3.3. 自定义注解</font>
1. <font style="color:rgba(0, 0, 0, 0.75);">修饰符： 访问修饰符必须为public,不写默认为pubic；</font>
2. <font style="color:rgba(0, 0, 0, 0.75);">关键字： 关键字为@interface；</font>
3. <font style="color:rgba(0, 0, 0, 0.75);">注解名称： 注解名称为自定义注解的名称，使用时还会用到；</font>
4. <font style="color:rgba(0, 0, 0, 0.75);">注解内容： 注解中内容，对注解的描述。</font>

<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">我们自定义一个注解，然后这个注解可以在entity当中的set方法上初始化值。只是一个简单案例，供大家参考学习！</font>

<font style="color:rgb(77, 77, 77);">第一步：自定义</font>`<font style="color:rgb(199, 37, 78);background-color:rgb(249, 242, 244);">@Init</font>`<font style="color:rgb(77, 77, 77);">注解</font>

```plain
@Documented
@Inherited
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})  //可以在字段、枚举的常量、方法
@Retention(RetentionPolicy.RUNTIME)
public @interface Init {
    String value() default "";
}
```

<font style="color:rgb(77, 77, 77);">第二步：创建User类</font>

```plain
public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    @Init("louis")
    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    @Init("22")
    public User setAge(String age) {
        this.age = age;
        return this;
    }
}
```

<font style="color:rgb(77, 77, 77);">第三步：创建User的工厂类，所谓工厂类就是专门为了生产User对象</font>

```plain
import java.lang.reflect.Method;

public class UserFactory {
    public static User create() {
        User user = new User();
        // 获取User类中所有的方法（getDeclaredMethods也行）
        Method[] methods = User.class.getMethods();
        try {
            for (Method method : methods) {
                // 判断方法上是否存在Init注解，存在就返回true，否则返回false
                if (method.isAnnotationPresent(Init.class)) {
                    // 此方法返回该元素的注解在此元素的指定注释类型（如果存在），否则返回null
                    Init init = method.getAnnotation(Init.class);
                    // 如果Method代表了一个方法 那么调用它的invoke就相当于执行了它代表的这个方法,在这里就是给set方法赋值
                    method.invoke(user, init.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return user;
    }
}
```

<font style="color:rgb(77, 77, 77);">第四步：测试</font>

```plain
public static void main(String[] args) {
    User user = UserFactory.create();
    user.setAge("30");
    System.out.println(user.getName());
    System.out.println(user.getAge());
}
```

<font style="color:rgb(77, 77, 77);">第五步：运行结果，我们并没有设置User的name属性，只是在User类的 set方法 添加了一个注解。输出结果如下：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043360378-88739d18-ee7f-4287-9f44-b7452cf6d038.png)

### <font style="color:rgb(79, 79, 79);">四、反射</font>
<font style="color:rgb(85, 86, 102);background-color:rgb(238, 240, 244);">JAVA机制反射是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。Java注解一旦离开了反射就什么都不是！！！</font>

#### <font style="color:rgb(79, 79, 79);">4.1. 反射常用到的API</font>
<font style="color:rgb(77, 77, 77);">1.只能拿到public方法（包括继承的类或接口的方法）</font>

```plain
public Method[] getMethods()
```

<font style="color:rgb(77, 77, 77);">2.getDeclaredMethods返回 Method 对象的一个数组，这些对象反映此 Class 对象表示的类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。</font>

```plain
public Method[] getDeclaredMethods()
```

<font style="color:rgb(77, 77, 77);">3.在Class对象和Method对象是都存在isAnnotationPresent这个方法的，作用是判断它是否应用了某个注解</font>

```plain
public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {}
```

<font style="color:rgb(77, 77, 77);">4.通过 getAnnotation() 方法来获取 Annotation 对象。</font>

```plain
public <A extends Annotation> A getAnnotation(Class<A> annotationClass) {}
```

<font style="color:rgb(77, 77, 77);">5.或者是 getAnnotations() 方法，获取所有的注解</font>

<font style="color:rgb(77, 77, 77);">如果获取到的 Annotation 如果不为 null，则就可以调用它们的属性方法了。</font>

```plain
public Annotation[] getAnnotations() {}
```

<font style="color:rgb(77, 77, 77);">6.获取到Annotation之后，就可以通过annotationType获取注解的class结构信息，有了class信息就可以获取注解的变量名，等等</font>

```plain
Class<? extends Annotation> annotationType();
```

<font style="color:rgb(77, 77, 77);">7.getParameterAnnotations ：返回表示按照声明顺序对此 Method 对象所表示方法的形参进行注释的那个数组的数组</font>

```plain
public Annotation[][] getParameterAnnotations();
```

#### <font style="color:rgb(79, 79, 79);">4.2. 读取类上的注解</font>
```plain
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    public int id() default -1;

    public String msg() default "Hi";
}
```

```plain
import java.lang.reflect.Method;

@TestAnnotation(id = 222,msg = "awdawd")
public class Test {
    public static void main(String[] args) {
        Method[] declaredMethods1 = TestAnnotation.class.getDeclaredMethods();
        for (Method meth : declaredMethods1) {
            System.out.println("注解的变量名为：" + meth.getName());
        }

        // 首先判断Test类上是否使用了TestAnnotation注解
        boolean hasAnnotation = Test.class.isAnnotationPresent(TestAnnotation.class);
        if (hasAnnotation) {
            // 获取注解,这个相当于是真正的拿到注解了，只有获取到这个才能获取到注解当中设置的值
            TestAnnotation testAnnotation = Test.class.getAnnotation(TestAnnotation.class);
            System.out.println("id:" + testAnnotation.id());
            System.out.println("msg:" + testAnnotation.msg());
        }
    }
}
```

<font style="color:rgb(77, 77, 77);">输出结果：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043360431-7b76b930-c6b3-4953-8725-705bf1d2e14a.png)

#### <font style="color:rgb(79, 79, 79);">4.3. 读取方法上的注解</font>
```plain
public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    @Init("louis")
    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    @Init("22")
    public User setAge(String age) {
        this.age = age;
        return this;
    }
}
```

```plain
//读取注解信息
public class ReadAnnotationInfoTest {
    public static void main(String[] args) throws Exception {
        // 测试AnnotationTest类，得到此类的类对象
        Class c = Class.forName("com.gzl.cn.springbootnacos.my.User");
        // 获取该类所有声明的方法
        Method[] methods = c.getDeclaredMethods();
        // 声明注解集合
        Annotation[] annotations;
        // 遍历所有的方法得到各方法上面的注解信息
        for (Method method : methods) {
            // 获取每个方法上面所声明的所有注解信息
            annotations = method.getDeclaredAnnotations();
            System.out.println("方法名为：" + method.getName());

            if (method.isAnnotationPresent(Init.class)){
                Init annotation = method.getAnnotation(Init.class);
                System.out.println("注解设置的value值为：" + annotation.value());
            }

            for (Annotation an : annotations) {
                System.out.println("其上面的注解为：" + an.annotationType().getSimpleName());
                // 获取注解class对象
                Class<? extends Annotation> aClass = an.annotationType();
                // 通过class对象获取他的所有属性方法
                Method[] meths = aClass.getDeclaredMethods();
                // 遍历每个注解的所有变量
                for (Method meth : meths) {
                    System.out.println("注解的变量名为：" + meth.getName());
                }
            }
        }
    }
}
```

<font style="color:rgb(77, 77, 77);">输出结果：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043360619-4c0beb68-827f-4449-880d-32cdb0443e52.png)

#### <font style="color:rgb(79, 79, 79);">4.4. 读取字段上的注解</font>
```plain
public class User {
    @Init("张三")
    private String name;
    @Init("33")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
```

```plain
public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        user.setAge("111");
        user.setName("www");

        Class<User> userClass = User.class;
        Field[] fields = userClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("属性名称是：" + field.getName());
            Init annotation = field.getAnnotation(Init.class);
            System.out.println("注解的value值是：" + annotation.value());
            // 字段是私有的想要获取就需要将Accessible设置为true，否则报错
            field.setAccessible(true);
            Object o = field.get(user);
            System.out.println("user对象的属性值是：" + o);
            System.out.println();
        }
    }
```

<font style="color:rgb(77, 77, 77);">输出的结果：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043360828-59926449-2640-40b0-98dd-081583514858.png)

#### <font style="color:rgb(79, 79, 79);">4.5. 读取方法参数注解</font>
```plain
@RequestMapping(value = "/get", method = RequestMethod.GET)
@ResponseBody
public boolean get(@RequestParam("username") String usname) {
    return useLocalCache;
}
```

```plain
public static void main(String[] args) throws NoSuchMethodException {
    Class<ConfigController> configControllerClass = ConfigController.class;
    // 获取get方法，第一个参数是方法名，第二个是参数类型
    Method get = configControllerClass.getDeclaredMethod("get", String.class);
    // 方法上可能有多个参数，每个参数上可能有多个注解，所以是二维数组
    // annotations[0][0]表示第1个参数的第1个注解
    // annotations[0][1]表示第1个参数的第2个注解
    Annotation[][] annotations = get.getParameterAnnotations();

    for (int i = 0; i < annotations.length; i++) {
        for (int j = 0; j < annotations[i].length; j++) {
            if (annotations[i][j] instanceof RequestParam) {
                RequestParam myParam1 = (RequestParam) annotations[i][j];
                System.out.println(myParam1.value());
            }
        }
    }
}
```

<font style="color:rgb(77, 77, 77);">输出结果：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043360926-869e89b6-6425-498f-b308-89d101d8641a.png)

#### <font style="color:rgb(79, 79, 79);">4.6. 注解配合枚举使用</font>
<font style="color:rgb(77, 77, 77);">@RequestMapping当中method属性就是使用的枚举。</font>

```plain
@RequestMapping(value = "/get", method = RequestMethod.GET)
@ResponseBody
public boolean get(@RequestParam("username") String usname) {
    return useLocalCache;
}
```

```plain
public static void main(String[] args) throws NoSuchMethodException {
    Class<ConfigController> configControllerClass = ConfigController.class;
    // 获取get方法，第一个参数是方法名，第二个是参数类型
    Method get = configControllerClass.getDeclaredMethod("get", String.class);
    RequestMapping annotation = get.getAnnotation(RequestMapping.class);
    RequestMethod[] method = annotation.method();
    RequestMethod requestMethod = method[0];
    switch (requestMethod) {
        case GET:
            System.out.println("get请求");
            break;
        case POST:
            System.out.println("post请求");
            break;
    }
}
```

<font style="color:rgb(77, 77, 77);">输出结果：</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728043361179-ece38408-d0e7-4a24-8e58-a94319899b07.png)



## main
![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1720957247048-ed4de4aa-6f54-4e04-a3c8-80e9ee2bb277.png)

