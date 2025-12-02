package java1;
//实现接口
class C implements P,Q{//可以不止实现一个接口（这样可以达到多继承的效果）
    public void ss(){                   //必须实现接口的所有方法（或者被抽象类实现依然还是抽象方法）
        System.out.println("方法实现P");
    }
    public void ff(){
        System.out.println("方法实现Q");
    }
    public void mm(){
        System.out.println("改写默认方法（不改写也可）");
        P.super.mm();//调用接口的默认方法
    }
}