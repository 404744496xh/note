package java1;
//继承 (this super) 重写
class B<tt> extends A{//<>是泛型(里面只能填引用类型)
    int a=99;
    int b;//可以对父类的属性扩充
    tt t;//定义“tt”型的变量（泛型的使用）
    ma jj=new ma();//显然内部类也能继承
    //重写方法
    /*注意：
    1.方法名必须相同
    2.参数列表必须相同
    3.修饰符：范围可以扩大（如把private扩大成public）
    4.抛出的异常：范围，可以被缩小，但不能扩大
    - 子类的方法和父类必须一致，方法体不能相同
     */
    public void run(){
        a=7;//继承过来实例变量的改写
        System.out.println(a);
        super.a--;
        System.out.println(super.a);
    }//静态方法不能重写

    //
    public  B(){
        super();//super是指父类对象本身，只有在继承才能用
        // 如果是象这样调用构造器则必须在第一行，只能有一个
        //不能与this（构造方法)一起
        System.out.println("构造方法不会继承");
    }
    public B(int j){
        this();//this本身调用者为这个对象,
        // 如果是象这样调用构造器则必须在第一行，只能有一个
        //不能与super（构造方法)一起
        //如果有n个构造方法，那只能在n-1个里面有这个
    }

    public void eat(int b,int...c){//...是不定参数个数，也就是动态的参数个数（类型一样）
        this.run(); //this可以通过.调用本类的方法，属性
        this.b=b;   //this可以区分属性和形参（this.b是本类的属性，b是传过来的行参）
        System.out.println(super.a); //super可以通过.调用父类的方法，属性
        super.a--;
        for(int i=0;i<c.length;i++)
        System.out.print(c[i]);
        System.out.println();
        super.run();
    }
}