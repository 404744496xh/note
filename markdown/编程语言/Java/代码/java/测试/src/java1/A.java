package java1;
//类的结构 重载  instanceof
class A{//其实自己定义的类都是继承与Object类
    public int a=90;//实例变量（属性）
    {a=6;
        System.out.println("构造代码块");
    }
    static {
//        a=3;这里会报错因为a不是静态的，在代码块加载的时候还没有生成a变量
        System.out.println("静态带码块");//static是随着类的加载而加载会比上面的构造代码块快运行
    }
    //上面二个代码块也可以继承
    ma mm=new ma();//创建内部类

    public void run(){
        System.out.println("方法1"+a);
    }
    //方法重载（即改变形参列表）
    public void run(int a){
        System.out.println("方法重载");
    }

    public A(){
        System.out.println("无参构造器");//构造器不写默认为空参
    }
    //构造方法也能重载
    public A(int a){
        System.out.println("有参构造器");
    }

    public final boolean equal(Object c){//写一个判断二个本类对象是否相等，其中形参是用了多态（所有类的父类是Object）
        if(c==this){
            return true;
        }
        if(c instanceof A){//instanceof是为了测试左边的对象，是不是右边的类（可以是父类）的实例   就是左边能不能转换为右边的类型
            //如果不是在一个继承树下会报错
            A ob=(A)c;    //向下转型(多态的用法）
            if(this.a==ob.a){//判断属性是否相等（本类只有一个属性）
                return true;
            }
        }
        return false;
    }

    //内部类
    class ma{
        public void out(){
//            a=111;
            System.out.println(a);
        }
    }
}