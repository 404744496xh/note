package 多线程;

import java.util.concurrent.locks.ReentrantLock;

class Bank implements Runnable{ //这里是实现Runnable接口也可以继承Thread类，，，，jdk5后可以实现Callable接口，或者Future接口（重写call方法）
   public int ticket=100;
    private ReentrantLock lock=new ReentrantLock();
//    为什么定义Lock要在这
//    因在于，insert方法中的lock变量是局部变量，每个线程执行该方法时都会保存一个副本，
//            那么理所当然每个线程执行到lock.lock ()处获取的是不同的锁，所以就不会发生冲突。
    private static Bank instance=null;
    private Bank(){}//单例模式
    //获取Bank对象
    public static Bank getBank() {
        //第一种：不推荐（慢)
        //        synchronized (instance) {
        //            if (instance == null) {
        //                instance = new Bank();
        //            }
        //        }
        //       return instance;
        //第二种（推荐
        if(instance==null)
            synchronized (Bank.class) {
                instance = new Bank();
            }
        return instance;
    }

    @Override
    public void run() {
        while(true){
 //           synchronized (Bank.class){//这里是同步代码块也可以用同步方法    还可以用Lock
                lock.lock();
                if(ticket<=0) break;
                //睡眠增加出错几率
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    System.out.println(Thread.currentThread().getName()+"------"+ticket);
                    ticket--;
                    lock.unlock();
                }
            }

//        }
    }
}
