package java1;
import java.util.Scanner;
public class Main {
       /*
    java语法规则（有一些规则是不能破坏的，一旦这么说了，就必须这么做！）：
        java中有一条这样的规则：
            方法体中的代码必须遵循自上而下顺序依次逐行执行（亘古不变的语法！）
        java中海油一条语法规则：
            return语句一旦执行，整个方法必须结束（亘古不变的语法！）
     */
    public static void test1() {
        Scanner sc=new Scanner(System.in);//如果把System.in改为file类就是从文件读
        //多态
        A a0=new B();//向上转型
        a0.run();
        B b0=(B)a0;//向下转型
        P p0=new C();   C c0= (C) p0;//接口也可以
        A a=new A();
        B<String> b=new B();
        C c=new C();
        //O o=new O(); 会报错抽象类不能，new；（接口同里）
        O o=new O(){
            @Override
            public void pp() {
            }
        };//可以用匿名子类继承来改写，接口同理（匿名实现类）
        a.mm.out();
    }

    public static void main(String[] args) {
            test1();
    }
}
/*
A为B的父类
P,Q是接口      O是抽象类
C是P,Q接口的实现
 */


/*
- 内部类就是在一个类的内部再定义一个类，比如：A类中定义一个B类，那么B类相对于A类来说就是一个内部类，而A类相对B类来说就是外部类了。
- 成员内部类
- 静态内部类
- 局部内部类
- 匿名内部类
 */
