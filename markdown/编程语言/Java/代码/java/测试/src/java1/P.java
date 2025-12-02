package java1;
//接口（就是类的蓝图）final
interface P{
    public static final int a = 0;//属性默认是 public static final要有初值
    //final是常量修饰符
    public default void mm(){
        System.out.println("默认方法p");
    }
    public static void uu(){
        System.out.println("静态方法");
    }
    public abstract void ss();//方法默认是public abstract（抽象方法）
}
interface Q{
    public abstract void ff();
}