# <font style="color:rgb(34, 34, 38);">java中的Lock锁</font>
## **<font style="color:rgb(79, 79, 79);">一. 概述</font>**
**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">Lock 是</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);"> </font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">java.util.concurrent.locks</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);"> </font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">包 下的接口，Lock 实现提供了比 synchronized 关键字 更广泛的锁操作，它能以更优雅的方式处理线程同步问题。Lock提供了比synchronized更多的功能。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">1.Lock和ReadWriteLock是两大锁的根接口，</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">Lock代表实现类是ReentrantLock（可重入锁），ReadWriteLock（读写锁）的代表实现类是ReentrantReadWriteLock</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">2.Lock 接口支持那些语义不同（</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">重入、公平等</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">）的锁规则，可以在非阻塞式结构的上下文（包括 hand-over-hand 和锁重排算法）中使用这些规则。  
  
</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">3.ReadWriteLock 接口以类似方式定义了一些</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">读取者可以共享而写入者独占的锁</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">。此包只提供了一个实现</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);"> </font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">ReentrantReadWriteLock</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">4 .Lock是</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">可重入锁</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">，</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">可中断锁</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">，可以实现</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">公平锁</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">和</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">读写锁</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">，写</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">锁为排它锁，读锁为共享锁</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">。ReentrantLock也是一种排他锁 </font>**

## **<font style="color:rgb(79, 79, 79);">二.synchronized 与 Lock 的区别</font>**
**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">1.synchronized是关键字，是JVM层面的，而Lock是一个接口，是JDK提供的API。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">2.当一个线程获取了synchronized锁，其他线程便只能一直等待直至占有锁的线程释放锁。当发生以下情况之一线程才会释放锁：  
</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">a.占有锁的线程执行完了该代码，然后释放对锁的占有。  
</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">b.占有锁线程执行发生异常，此时JVM会让线程自动释放锁。  
</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">c.占有锁线程进入 WAITING 状态从而释放锁，例如在该线程中调用wait()方法等。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">但是如果占有锁的线程由于要等待IO或者因为其他原因（比如调用sleep方法）而使线程阻塞了，但是又没有释放锁，那么线程就只能一直等待，那么这时我们可能需要一种可以不让线程无期限的等待下去的方法，比如只等待一定的时间（tryLock(long time, TimeUnit unit)或者能被人为中断lockInterrup0tibly()，这种情况我们需要Lock。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">3.当多个线程读写文件时，读操作和写操作会发生冲突现象，写操作和写操作也会发生冲突现象，但是读操作和读操作不会发生冲突现象，但是如果采用synchronized进行同步的话，就会导致当多个线程都只是进行读操作时也只有获取锁的线程才能进行读操作，其他线程只能等待锁释放后才能读，Lock则可以实现当多个线程都只是进行读操作时，线程之间不会发生冲突，例如：ReentrantReadWriteLock()。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">4.可以通过Lock得知线程有没有成功获取到锁 (例如：ReentrantLock) ，但这个是synchronized无法办到的。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">5.锁属性上的区别：synchronized是不可中断锁和非公平锁，ReentrantLock可以进行</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">中断操作</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">并别可以控制是否是</font>****<font style="color:rgb(124, 121, 229);background-color:rgb(238, 240, 244);">公平锁</font>****<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">6.synchronized能锁住方法和代码块，而Lock只能锁住代码块。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">7.synchronized无法判断锁的状态，而Lock可以知道线程有没有拿到锁。</font>**

**<font style="color:rgb(51, 153, 234);background-color:rgb(238, 240, 244);">8.在性能上来说，如果竞争资源不激烈，两者的性能是差不多的，而当竞争资源非常激烈时，此时Lock的性能要远远优于synchronized。</font>**

## **<font style="color:rgb(79, 79, 79);">三.Lock接口</font>**
**<font style="color:rgb(51, 153, 234);">Lock是一个接口，接口的实现类有</font>****<font style="color:rgb(51, 153, 234);"> </font>****<font style="color:rgb(124, 121, 229);">ReentrantLock</font>****<font style="color:rgb(51, 153, 234);">和内部类</font>****<font style="color:rgb(124, 121, 229);">ReentrantReadWriteLock.ReadLock</font>****<font style="color:rgb(51, 153, 234);">,</font>****<font style="color:rgb(51, 153, 234);"> </font>****<font style="color:rgb(124, 121, 229);">ReentrantReadWriteLock.WriteLock,该章节所描述的皆为 ReentrantLock</font>**

```java
public interface Lock {
    void lock();
    
    void lockInterruptibly() throws InterruptedException;

    boolean tryLock();
    
    boolean tryLock(long time, TimeUnit unit) throws InterruptedException;
    
    void unlock();
    
    Condition newCondition();
}
```

**<font style="color:rgb(51, 153, 234);">其中 lock()、tryLock()、tryLock(long time, TimeUnit unit)和lockInterruptibly()是用来获取锁的，unLock()方法是用来释放锁的 。</font>**

### **<font style="color:rgb(124, 121, 229);">1. lock()</font>**
**<font style="color:rgb(229, 121, 182);">用来获取锁。如果锁已被其他线程获取，则进行等待。采用Lock，必须主动去释放锁，并且在发生异常时，不会自动释放锁。因此一般来说，使用Lock必须在try{}catch{}块中进行，并且将释放锁的操作放在finally块中进行，以保证锁一定被被释放，防止死锁的发生。</font>**

```java
private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();
        try{
            System.out.println("获取锁成功！！");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("释放锁成功");
            lock.unlock();
        }
    }
```

### **<font style="color:rgb(124, 121, 229);">2. tryLock()：</font>**
**<font style="color:rgb(229, 121, 182);">用来尝试获取锁，但是该方法是有返回值的，如果获取成功，则返回true，如果获取失败（即锁已被其他线程获取），则返回false，也就说这个方法无论如何都会立即返回，在拿不到锁时也不会一直在那等待。</font>**<font style="color:rgb(77, 77, 77);">  
</font>

```plain
private static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        if(lock.tryLock()) {
            try{
                System.out.println("成功获取锁！！");
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                lock.unlock();
            }
        }else {
            System.out.println("未获取锁，先干别的");
        }
    }
```

### **<font style="color:rgb(124, 121, 229);">3. tryLock(long time, TimeUnit unit)</font>**
**<font style="color:rgb(229, 121, 182);">和tryLock()方法是类似的，只不过区别在于这个方法在拿不到锁时会等待一定的时间，在时间期限之内如果还拿不到锁，就返回false。如果如果一开始拿到锁或者在等待期间内拿到了锁，则返回true。</font>**

```plain
private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        try{
            if(lock.tryLock(5000, TimeUnit.MILLISECONDS)) {
                System.out.println("成功获取锁！！");
            }else {
                System.out.println("未获取锁，先干别的");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }
```

### **<font style="color:rgb(124, 121, 229);">4.lockInterruptibly()</font>**
**<font style="color:rgb(229, 121, 182);">当通过这个方法去获取锁时，如果线程正在等待获取锁，则这个线程能够响应中断，即中断线程的等待状态。也就说，当两个线程同时通过lock.lockInterruptibly()想获取某个锁时，假若此时线程A获取到了锁，而线程B只有在等待，那么对线程B调用threadB.interrupt()方法能够中断线程B的等待过程。</font>**

```plain
package ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
    
        Test test = new Test();
        MyThread a = new MyThread(test);
        MyThread b = new MyThread(test);
        
        a.start();
        b.start();

        b.interrupt();
    }
    
    public void insert(Thread thread) throws InterruptedException {
    
        //注意：如果需要正确中断等待锁的线程，必须将获取锁放在外面，然后将InterruptedException抛出
        lock.lockInterruptibly();
        try {
            System.out.println(thread.getName() + "得到了锁");
            Thread.sleep(3000);
        } finally {
            lock.unlock();
            System.out.println(thread.getName() + "释放了锁");
        }
    }

    static class MyThread extends Thread {
    
        private Test test;
        public MyThread(Test test) {
            this.test = test;
        }
        
        @Override
        public void run() {
            try {
                test.insert(Thread.currentThread());
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被中断");
            }
        }
    }
}
```

**<font style="color:rgb(124, 121, 229);">注意：</font>****<font style="color:rgb(229, 121, 182);">当一个线程获取了锁之后，是不会被interrupt()方法中断的。因为单独调用interrupt()方法不能中断正在运行过程中的线程，只能中断阻塞过程中的线程。因此当通过lockInterruptibly()方法获取某个锁时，如果不能获取到，只有进行等待的情况下，才可以响应中断。而用synchronized修饰的话，当一个线程处于等待某个锁的状态，是无法被中断的，只能一直等待下去。</font>**

### **<font style="color:rgb(124, 121, 229);">5.Condition接口和newCondition()方法</font>**
**<font style="color:rgb(229, 121, 182);">synchronized关键字与wait()和notify/notifyAll()方法相结合可以实现等待/通知机制，ReentrantLock类也可以借助于Condition接口与newCondition()方法。</font>**

**<font style="color:rgb(229, 121, 182);">synchronized关键字在使用notify/notifyAll()方法进行通知时，被通知的线程是由JVM选择的，使用ReentrantLock类结合Condition实例可以实现“选择性通知”。</font>**

**<font style="color:rgb(229, 121, 182);">synchronized关键字就相当于整个Lock对象中只有一个Condition实例，所有的线程都注册在该一个实例上。如果执行notifyAll()方法的话就会通知所有处于等待状态的线程，这样会造成很大的效率问题，而Condition可以实现多路通知功能也就是在一个Lock对象中可以创建多个Condition实例（即对象监视器），线程对象可以注册在指定的Condition中，Condition实例的signalAll()方法 只会唤醒注册在该Condition实例中的所有等待线程。从而可以有选择性的进行线程通知，在调度线程上更加灵活。</font>**

```plain
//使当前线程在接到信号或被中断之前一直处于等待状态。
    void await();

    //使当前线程在接到信号、被中断或到达指定等待时间之前一直处于等待状态。
    boolean await(long time, TimeUnit unit);

    //使当前线程在接到信号、被中断或到达指定等待时间之前一直处于等待状态。
    long awaitNanos(long nanosTimeout);

    //使当前线程在接到信号之前一直处于等待状态。
    void awaitUninterruptibly();

    //使当前线程在接到信号、被中断或到达指定最后期限之前一直处于等待状态。
    boolean awaitUntil(Date deadline);

    //唤醒一个等待线程。
    void signal();

    //唤醒所有等待线程。
    void signalAll();
```

#### **<font style="color:rgb(124, 121, 229);">5.1 Condition实现等待/通知机制</font>**
**<font style="color:rgb(229, 121, 182);">当调用 await() 语句后，线程将被阻塞，必须执行完signal()所在的try语句块之后才释放锁，condition.await()后的语句才能被执行。</font>**<font style="color:rgb(77, 77, 77);">  
</font>

```plain
package ReentrantLockTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread a = new MyThread(service);
        
        a.start();
        Thread.sleep(3000);
        service.signal();
    }

    static public class MyService {
    
        private Lock lock = new ReentrantLock();
        public Condition condition = lock.newCondition();

        public void await() {
            lock.lock();
            try {
                System.out.println("准备调用condition.await()方法，将该线程阻塞");
                condition.await();
                System.out.println("已调用condition.await()方法，此时已被 signal() 方法唤醒");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void signal() {
            lock.lock();
            try {
                System.out.println("准备调用condition.signal()方法");
                condition.signal();
                Thread.sleep(3000);
                System.out.println("已调用condition.signal()方法，去唤醒 await() 方法");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }


    static public class MyThread extends Thread {

        private MyService service;

        public MyThread(MyService service) {
            this.service = service;
        }

        @Override
        public void run() {
            service.await();
        }
    }
}
```

**<font style="color:rgb(134, 202, 94);">输出：</font>**

```plain
准备调用condition.await()方法，将该程序阻塞


准备调用condition.signal()方法

已调用condition.signal()方法，去唤醒 await() 方法

已调用condition.await()方法，此时已被 signal() 方法唤醒
```

#### **<font style="color:rgb(124, 121, 229);">5.2 多个Condition实例实现等待/通知机制</font>**
**<font style="color:rgb(229, 121, 182);">一个Lock对象中可以创建多个Condition实例，调用某个实例的signalAll()方法 只会唤醒注册在该Condition实例中的所有等待线程。</font>**

```plain
package ReentrantLockTest;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA() {
        lock.lock();
        try {
            System.out.println("准备调用conditionA.await()方法，将该线程阻塞");
            conditionA.await();
            System.out.println(" awaitA 已被唤醒");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        lock.lock();
        try {
            System.out.println("准备调用conditionB.await()方法，将该线程阻塞");
            conditionB.await();
            System.out.println(" awaitB 已被唤醒");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalA() {
        lock.lock();
        try {
            System.out.println("准备唤醒 conditionA 下的所有线程");
            conditionA.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalB() {
        lock.lock();
        try {
            System.out.println("准备唤醒 conditionB 下的所有线程");
            conditionB.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
```

```plain
package ReentrantLockTest;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        LockTest lockTest = new LockTest();
        ThreadA a = new ThreadA(lockTest);
        
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(lockTest);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        lockTest.signalA();
    }

    static public class ThreadA extends Thread {

        private LockTest lockTest;
        public ThreadA(LockTest lockTest) {
            this.lockTest = lockTest;
        }

        @Override
        public void run() {
            lockTest.awaitA();
        }
    }

    static public class ThreadB extends Thread {
        private LockTest lockTest;
        public ThreadB(LockTest lockTest) {
            this.lockTest = lockTest;
        }

        @Override
        public void run() {
            lockTest.awaitB();
        }

    }

}
```

**<font style="color:rgb(134, 202, 94);">输出： </font>**

```csharp
准备调用conditionA.await()方法，将该线程阻塞
准备调用conditionB.await()方法，将该线程阻塞
准备唤醒 conditionA 下的所有线程
 awaitA 已被唤醒
```

## **<font style="color:rgb(79, 79, 79);">四.ReadWriteLock接口</font>**
```java
public interface ReadWriteLock {
    
    // 读锁
    Lock readLock();

    // 写锁
    Lock writeLock();
}
```

**<font style="color:rgb(229, 121, 182);">ReentrantLock是一种排他锁，同一时刻只允许一个线程访问，</font>****<font style="color:rgb(124, 121, 229);">ReadWriteLock</font>****<font style="color:rgb(229, 121, 182);"> </font>****<font style="color:rgb(229, 121, 182);">接口的实现类</font>****<font style="color:rgb(229, 121, 182);"> </font>****<font style="color:rgb(124, 121, 229);">ReentrantReadWriteLock</font>****<font style="color:rgb(229, 121, 182);"> </font>****<font style="color:rgb(229, 121, 182);">读写锁提供了两个方法：</font>****<font style="color:rgb(124, 121, 229);">readLock()和writeLock()</font>****<font style="color:rgb(229, 121, 182);">用来获取读锁和写锁，也就是说将文件的读写操作分开，分成2个锁来分配给线程，从而使得多个线程可以同时进行读操作。</font>**

**<font style="color:rgb(229, 121, 182);">读写锁维护了两个锁，一个是读操作相关的锁也称为共享锁，一个是写操作相关的锁也称为排他锁。通过分离读锁和写锁，其并发性比一般排他锁有了很大提升。</font>**

**<font style="color:rgb(229, 121, 182);">多个读锁之间不互斥，读锁与写锁互斥，写锁与写锁互斥（只要出现写操作的过程就是互斥的）。在没有线程进行写操作时，进行读取操作的多个线程都可以获取读锁，而进行写入操作的线程只有在获取写锁后才能进行写操作。即多个线程可以同时进行读取操作，但是同一时刻只允许一个线程进行写入操作。</font>**

### **<font style="color:rgb(124, 121, 229);">1.读锁</font>**
```plain
package ReentrantLockTest;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockTest {

    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    public static void main(String[] args) {
        final ReentrantReadWriteLockTest test = new ReentrantReadWriteLockTest();
        new Thread() {
            public void run() {
                test.get(Thread.currentThread());
            }
        }.start();
        new Thread() {
            public void run() {
                test.get(Thread.currentThread());
            }
        }.start();
    }
    
    public void get(Thread thread){

        reentrantReadWriteLock.readLock().lock();
        try {
            for (int i=0;i<10;i++){
                System.out.println(thread.getName() + "正在进行读操作");
                Thread.sleep(1000);
            }
            System.out.println(thread.getName() + "读操作完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }
}
```

**<font style="color:rgb(134, 202, 94);">输出：</font>**

```plain
Thread-0正在进行读操作
Thread-1正在进行读操作
Thread-1正在进行读操作
Thread-0正在进行读操作
Thread-1正在进行读操作
Thread-0正在进行读操作
Thread-1正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-1正在进行读操作
Thread-1正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-1正在进行读操作
Thread-1正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-1正在进行读操作
Thread-0正在进行读操作
Thread-1正在进行读操作
Thread-1读操作完毕
Thread-0读操作完毕
```

**<font style="color:rgb(134, 202, 94);">多个线程可以同时获得读锁</font>**

### **<font style="color:rgb(124, 121, 229);">2.读写互斥</font>**
```java
package ReentrantLockTest;



 



import java.util.concurrent.locks.ReentrantReadWriteLock;



 



public class ReentrantReadWriteLockTest {



 



    public static void main(String[] args) {



        LockTest lockTest = new LockTest();



 



        ReadThread readThread = new ReadThread(lockTest);



        ReadThread readThread2 = new ReadThread(lockTest);



        WriteThread writeThread = new WriteThread(lockTest);



        ReadThread readThread3 = new ReadThread(lockTest);



        readThread.start();



        readThread2.start();



        writeThread.start();



 



        try {



            Thread.sleep(1000);



        } catch (InterruptedException e) {



            e.printStackTrace();



        }



        readThread3.start();



    }



 



 



    static public class LockTest {



        private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();



 



        public void read(Thread thread) {



            lock.readLock().lock();



            try {



                for (int i=0;i<5;i++){



                    System.out.println(thread.getName() + "正在进行读操作");



                    Thread.sleep(1000);



                }



                System.out.println(thread.getName() + "读操作完毕");



            } catch (Exception e) {



                e.printStackTrace();



            } finally {



                lock.readLock().unlock();



            }



        }



 



        public void write(Thread thread) {



            lock.writeLock().lock();



            try {



                for (int i=0;i<5;i++){



                    System.out.println(thread.getName() + "正在进行写操作");



                    Thread.sleep(1000);



                }



                System.out.println(thread.getName() + "写操作完毕");



            } catch (InterruptedException e) {



                e.printStackTrace();



            } finally {



                lock.writeLock().unlock();



            }



        }



    }



 



    static public class ReadThread extends Thread {



        private LockTest lockTest;



 



        public ReadThread(LockTest lockTest) {



            this.lockTest = lockTest;



        }



 



        @Override



        public void run() {



            lockTest.read(Thread.currentThread());



        }



    }



 



 



    static public class WriteThread extends Thread {



        private LockTest lockTest;



 



        public WriteThread(LockTest lockTest) {



            this.lockTest = lockTest;



        }



 



        @Override



        public void run() {



            lockTest.write(Thread.currentThread());



        }



    }



}
```

**<font style="color:rgb(134, 202, 94);">输出：</font>**

```plain
Thread-0正在进行读操作



Thread-1正在进行读操作



Thread-0正在进行读操作



Thread-1正在进行读操作



Thread-1正在进行读操作



Thread-0正在进行读操作



Thread-1正在进行读操作



Thread-0正在进行读操作



Thread-0正在进行读操作



Thread-1正在进行读操作



Thread-1读操作完毕



Thread-0读操作完毕



Thread-2正在进行写操作



Thread-2正在进行写操作



Thread-2正在进行写操作



Thread-2正在进行写操作



Thread-2正在进行写操作



Thread-2写操作完毕



Thread-3正在进行读操作



Thread-3正在进行读操作



Thread-3正在进行读操作



Thread-3正在进行读操作



Thread-3正在进行读操作



Thread-3读操作完毕
```

**<font style="color:rgb(134, 202, 94);">由此可以看出，读锁可以共享，写锁只有在所有读锁释放后才能执行，但是当写锁在阻塞和获取过程中，之后的读锁也会阻塞，需要等到写锁释放后才能获取。</font>**



---

## [乐观锁](https://so.csdn.net/so/search?q=%E4%B9%90%E8%A7%82%E9%94%81&spm=1001.2101.3001.7020)和悲观锁
**悲观锁**

`悲观锁`对应于生活中悲观的人，悲观的人总是想着事情往坏的方向发展。

举个生活中的例子，假设厕所只有一个坑位了，[悲观锁](https://so.csdn.net/so/search?q=%E6%82%B2%E8%A7%82%E9%94%81&spm=1001.2101.3001.7020)上厕所会第一时间把门反锁上，这样其他人上厕所只能在门外等候，这种状态就是「阻塞」了。

回到代码世界中，一个共享数据加了悲观锁，那线程每次想操作这个数据前都会假设其他线程也可能会操作这个数据，所以每次操作前都会上锁，这样其他线程想操作这个数据拿不到锁只能阻塞了。

![20210606232504-2021-06-06-23-25-04](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131396533-7aa07d8b-cdd4-43c9-b09a-38be20f6fb6e.png)

在 Java 语言中 `synchronized` 和 `ReentrantLock`等就是典型的悲观锁，还有一些使用了 synchronized 关键字的容器类如 `HashTable` 等也是悲观锁的应用。

**乐观锁**

`乐观锁` 对应于生活中乐观的人，乐观的人总是想着事情往好的方向发展。

举个生活中的例子，假设厕所只有一个坑位了，乐观锁认为：这荒郊野外的，又没有什么人，不会有人抢我坑位的，每次关门上锁多浪费时间，还是不加锁好了。你看乐观锁就是天生乐观！

回到代码世界中，乐观锁操作数据时不会上锁，在更新的时候会判断一下在此期间是否有其他线程去更新这个数据。

![20210606232434-2021-06-06-23-24-35](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131396674-7751a40f-059e-4fac-b3dc-565fc0b718ec.png)

乐观锁可以使用`版本号机制`和`CAS算法`实现。在 Java 语言中 `java.util.concurrent.atomic`包下的原子类就是使用CAS 乐观锁实现的。

**两种锁的使用场景**

悲观锁和乐观锁没有孰优孰劣，有其各自适应的场景。

乐观锁适用于写比较少（冲突比较小）的场景，因为不用上锁、释放锁，省去了锁的开销，从而提升了吞吐量。

如果是写多读少的场景，即冲突比较严重，线程间竞争激励，使用乐观锁就是导致线程不断进行重试，这样可能还降低了性能，这种场景下使用悲观锁就比较合适。

## 独占锁和共享锁
**独占锁**

`独占锁`是指锁一次只能被一个线程所持有。如果一个线程对数据加上排他锁后，那么其他线程不能再对该数据加任何类型的锁。获得独占锁的线程即能读数据又能修改数据。

![20210606232544-2021-06-06-23-25-45](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131396586-f84fd2fd-2b9f-47ca-8d08-52e8d906d5b9.png)

JDK中的`synchronized`和`java.util.concurrent(JUC)`包中Lock的实现类就是独占锁。

**共享锁**

`共享锁`是指锁可被多个线程所持有。如果一个线程对数据加上共享锁后，那么其他线程只能对数据再加共享锁，不能加独占锁。获得共享锁的线程只能读数据，不能修改数据。

![20210606232612-2021-06-06-23-26-13](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131396705-a92fe62b-8449-4963-82a5-f997377530d9.png)

在 JDK 中 `ReentrantReadWriteLock` 就是一种共享锁。

## 互斥锁和[读写锁](https://so.csdn.net/so/search?q=%E8%AF%BB%E5%86%99%E9%94%81&spm=1001.2101.3001.7020)
**互斥锁**

`互斥锁`是独占锁的一种常规实现，是指某一资源同时只允许一个访问者对其进行访问，具有唯一性和排它性。

![20210606232634-2021-06-06-23-26-35](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131396680-44d8b392-f3ea-46f9-b77f-0970c9d80780.png)

互斥锁一次只能一个线程拥有互斥锁，其他线程只有等待。

**读写锁**

`读写锁`是共享锁的一种具体实现。读写锁管理一组锁，一个是只读的锁，一个是写锁。

读锁可以在没有写锁的时候被多个线程同时持有，而写锁是独占的。写锁的优先级要高于读锁，一个获得了读锁的线程必须能看到前一个释放的写锁所更新的内容。

读写锁相比于互斥锁并发程度更高，每次只有一个写线程，但是同时可以有多个线程并发读。

![20210606232658-2021-06-06-23-26-59](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131397268-8eddfd4f-b413-4741-ad9c-a95ff0a57bc8.png)

在 JDK 中定义了一个读写锁的接口：`ReadWriteLock`

```plain
public interface ReadWriteLock {    /**     * 获取读锁     */    Lock readLock();     /**     * 获取写锁     */    Lock writeLock();}
```

`ReentrantReadWriteLock` 实现了`ReadWriteLock`接口，具体实现这里不展开，后续会深入源码解析。

## 公平锁和非公平锁
**公平锁**

`公平锁`是指多个线程按照申请锁的顺序来获取锁，这里类似排队买票，先来的人先买，后来的人在队尾排着，这是公平的。

![20210606232716-2021-06-06-23-27-17](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131397268-59e2d7d9-d399-4a82-a8a4-2f4d851ccb08.png)

在 java 中可以通过构造函数初始化公平锁

```plain
/*** 创建一个可重入锁，true 表示公平锁，false 表示非公平锁。默认非公平锁*/Lock lock = new ReentrantLock(true);
```

**非公平锁**

`非公平锁`是指多个线程获取锁的顺序并不是按照申请锁的顺序，有可能后申请的线程比先申请的线程优先获取锁，在高并发环境下，有可能造成优先级翻转，或者饥饿的状态（某个线程一直得不到锁）。

![20210606232737-2021-06-06-23-27-38](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131397344-344c17ff-f3e8-425d-8e54-9b45e82eab9c.png)

在 java 中 synchronized 关键字是非公平锁，ReentrantLock默认也是非公平锁。

```plain
/*** 创建一个可重入锁，true 表示公平锁，false 表示非公平锁。默认非公平锁*/Lock lock = new ReentrantLock(false);
```

## 可[重入锁](https://so.csdn.net/so/search?q=%E9%87%8D%E5%85%A5%E9%94%81&spm=1001.2101.3001.7020)
`可重入锁`又称之为`递归锁`，是指同一个线程在外层方法获取了锁，在进入内层方法会自动获取锁。

![20210606232755-2021-06-06-23-27-56](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131397405-55fae201-3c27-43e3-b260-528c6d8efe34.png)

对于Java ReentrantLock而言, 他的名字就可以看出是一个可重入锁。对于Synchronized而言，也是一个可重入锁。

敲黑板：可重入锁的一个好处是可一定程度避免死锁。

以 synchronized 为例，看一下下面的代码：

```plain
public synchronized void mehtodA() throws Exception{ // Do some magic tings mehtodB();} public synchronized void mehtodB() throws Exception{ // Do some magic tings}
```

上面的代码中 methodA 调用 methodB，如果一个线程调用methodA 已经获取了锁再去调用 methodB 就不需要再次获取锁了，这就是可重入锁的特性。如果不是可重入锁的话，mehtodB 可能不会被当前线程执行，可能造成死锁。

## 自旋锁
`自旋锁`是指线程在没有获得锁时不是被直接挂起，而是执行一个忙循环，这个忙循环就是所谓的自旋。

![20210606232809-2021-06-06-23-28-09](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131397367-551b285b-132a-41a4-ba91-e3f35bbb0103.png)

自旋锁的目的是为了减少线程被挂起的几率，因为线程的挂起和唤醒也都是耗资源的操作。

如果锁被另一个线程占用的时间比较长，即使自旋了之后当前线程还是会被挂起，忙循环就会变成浪费系统资源的操作，反而降低了整体性能。因此自旋锁是不适应锁占用时间长的并发情况的。

在 Java 中，`AtomicInteger` 类有自旋的操作，我们看一下代码：

```plain
public final int getAndAddInt(Object o, long offset, int delta) {    int v;    do {        v = getIntVolatile(o, offset);    } while (!compareAndSwapInt(o, offset, v, v + delta));    return v;}
```

CAS 操作如果失败就会一直循环获取当前 value 值然后重试。

另外自适应自旋锁也需要了解一下。

在JDK1.6又引入了自适应自旋，这个就比较智能了，自旋时间不再固定，由前一次在同一个锁上的自旋时间以及锁的拥有者的状态来决定。如果虚拟机认为这次自旋也很有可能再次成功那就会次序较多的时间，如果自旋很少成功，那以后可能就直接省略掉自旋过程，避免浪费处理器资源。

## 分段锁
`分段锁` 是一种锁的设计，并不是具体的一种锁。

分段锁设计目的是将锁的粒度进一步细化，当操作不需要更新整个数组的时候，就仅仅针对数组中的一项进行加锁操作。

![20210606232830-2021-06-06-23-28-31](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131397982-592dc6ee-b935-4de6-84c9-3c75c435dae7.png)

在 Java 语言中 CurrentHashMap 底层就用了分段锁，使用Segment，就可以进行并发使用了。

## 锁升级（无锁|偏向锁|轻量级锁|重量级锁）
JDK1.6 为了提升性能减少获得锁和释放锁所带来的消耗，引入了4种锁的状态：`无锁`、`偏向锁`、`轻量级锁`和`重量级锁`，它会随着多线程的竞争情况逐渐升级，但不能降级。

**无锁**

`无锁`状态其实就是上面讲的乐观锁，这里不再赘述。

**偏向锁**

Java偏向锁(Biased Locking)是指它会偏向于第一个访问锁的线程，如果在运行过程中，只有一个线程访问加锁的资源，不存在多线程竞争的情况，那么线程是不需要重复获取锁的，这种情况下，就会给线程加一个偏向锁。

偏向锁的实现是通过控制对象`Mark Word`的标志位来实现的，如果当前是`可偏向状态`，需要进一步判断对象头存储的线程 ID 是否与当前线程 ID 一致，如果一致直接进入。

**轻量级锁**

当线程竞争变得比较激烈时，偏向锁就会升级为`轻量级锁`，轻量级锁认为虽然竞争是存在的，但是理想情况下竞争的程度很低，通过`自旋方式`等待上一个线程释放锁。

**重量级锁**

如果线程并发进一步加剧，线程的自旋超过了一定次数，或者一个线程持有锁，一个线程在自旋，又来了第三个线程访问时（反正就是竞争继续加大了），轻量级锁就会膨胀为`重量级锁`，重量级锁会使除了此时拥有锁的线程以外的线程都阻塞。

升级到重量级锁其实就是互斥锁了，一个线程拿到锁，其余线程都会处于阻塞等待状态。

在 Java 中，synchronized 关键字内部实现原理就是锁升级的过程：无锁 --> 偏向锁 --> 轻量级锁 --> 重量级锁。这一过程在后续讲解 synchronized 关键字的原理时会详细介绍。

## 锁优化技术（锁粗化、锁消除）
**锁粗化**

`锁粗化`就是将多个同步块的数量减少，并将单个同步块的作用范围扩大，本质上就是将多次上锁、解锁的请求合并为一次同步请求。

举个例子，一个循环体中有一个代码同步块，每次循环都会执行加锁解锁操作。

```plain
private static final Object LOCK = new Object(); for(int i = 0;i < 100; i++) {    synchronized(LOCK){        // do some magic things    }}
```

经过`锁粗化`后就变成下面这个样子了：

```plain
 synchronized(LOCK){     for(int i = 0;i < 100; i++) {        // do some magic things    }}
```

**锁消除**

`锁消除`是指虚拟机编译器在运行时检测到了共享数据没有竞争的锁，从而将这些锁进行消除。

举个例子让大家更好理解。

```plain
public String test(String s1, String s2){    StringBuffer stringBuffer = new StringBuffer();    stringBuffer.append(s1);    stringBuffer.append(s2);    return stringBuffer.toString();}
```

上面代码中有一个 test 方法，主要作用是将字符串 s1 和字符串 s2 串联起来。

test 方法中三个变量s1, s2, stringBuffer， 它们都是局部变量，局部变量是在栈上的，栈是线程私有的，所以就算有多个线程访问 test 方法也是线程安全的。

我们都知道 StringBuffer 是线程安全的类，append 方法是同步方法，但是 test 方法本来就是线程安全的，为了提升效率，虚拟机帮我们消除了这些同步锁，这个过程就被称为`锁消除`。

```plain
StringBuffer.class // append 是同步方法public synchronized StringBuffer append(String str) {    toStringCache = null;    super.append(str);    return this;}
```

## 一张图总结：
Java 并发编程的知识非常多，同时也是 Java 面试的高频考点，面试官必问的，需要学习 Java 并发编程其他知识的小伙伴可以去下载『[阿里师兄总结的Java知识笔记 总共 283 页，超级详细](https://mp.weixin.qq.com/s?__biz=MzIwODI1OTk1Nw==&mid=502841004&idx=1&sn=059dab6b76cbbc50eabd39566ee5ce28&chksm=0f09c0b6387e49a099b9c55d37e112f2049309f2a895a314f0a362e9ce5fb248ad4caafd50e8#rd)』。

前面讲了 Java 语言中各种各种的锁，最后再通过六个问题统一总结一下：

![Java中那些眼花缭乱的锁-2021-06-16-23-19-40](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728131397934-129cc13e-4c50-452c-8963-cc27b8ce1d77.png)

> 作者：雷小帅
>
> 推荐一个Github 开源项目，[『Java八股文』Java面试套路](http://coderleixiaoshuai.gitee.io/java-eight-part/)，Java进阶学习，打破内卷拿大厂Offer，升职加薪！
>
> 作者简介：
>
> ☕读过几年书：华中科技大学硕士毕业；  
😂浪过几个大厂：华为、网易、百度……  
😘一直坚信技术能改变世界，愿保持初心，加油技术人！
>
> 微信搜索公众号【爱笑的架构师】，关注这个对技术有追求且有趣的打工人。
>

