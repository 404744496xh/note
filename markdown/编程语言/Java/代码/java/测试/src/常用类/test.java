package 常用类;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface test{
//    注解的属性也叫做成员变量。
//    注解只有成员变量，没有方法。
//    注解的成员变量在注解的定义中以“无形参的方法”形式来声明，其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型。
    int id();
    String name();
}
