package 多线程;
////多线程，线程安全
//测试 Thread 类的常用方法：
//        1.start()：启动当前线程，执行当前线程的 run()。
//        2.run()：通常需要重写 Thread 类中的此方法，将创建的线程要执行的
//        操作声明在此方法中。
//        3.currentThread()：静态方法，返回当前代码执行的线程。
//        4.getName()：获取当前线程的名字。
//        5.setName()：设置当前线程的名字。
//        6.yield()：释放当前 CPU 的执行权。
//        7.join()：在线程 a 中调用线程 b 的 join(), 此时线程 a 就进入阻塞状态，
//        直到线程 b 完全执行完以后，线程 a 才结束阻塞状态。
//        8.stop()：已过时。当执行此方法时，强制结束当前线程。
//        9.sleep(long millitime)：让当前线程“睡眠”指定时间的 millitime 毫秒。
//        在指定的 millitime 毫秒时间内，当前线程是阻塞状态的。
//        10.isAlive()：返回 boolean，判断线程是否还活着。

public class Main {
    public static void main(String[] args) {
        Bank test=Bank.getBank();
        Thread test1=new Thread(test);
        Thread test2=new Thread(test);
        Thread test3=new Thread(test);

        test1.setName("窗口1");
        test2.setName("窗口2");
        test3.setName("窗口3");

        test1.start();
        test2.start();
        test3.start();
        System.out.println("aaaaaa");
    }
}
