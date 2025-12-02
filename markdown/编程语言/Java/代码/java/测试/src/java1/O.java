package java1;
//抽象类
abstract class O{
    int a;//可以有属性
    public void ss(){}//可以有普通方法
    public abstract void pp();//可以有抽象方法（没有方法体，只是规范），
    //注：抽象方法只能在接口和抽象类中
    //抽象方法不能new需要子类继承改写
}