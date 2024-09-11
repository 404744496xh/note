# 线程安全（二）Lock 什么是Lock线程锁？与synchronized区别在哪？Lock锁是如何实现等待通知的？如何实现线程顺序执行

[](https://blog.csdn.net/qq_39150049/article/details/112652288)

上一章我们提到synchronized使用的几个案例，它们特性是这样的。

| 序号 | 获取锁的线程释放锁的两种情况： | 
| -- | -- |
| 1 | 获取锁的线程执行完了该代码块，然后线程释放对锁的占有. | 
| 2 | 线程执行发生异常，此时JVM会让线程自动释放锁。 | 
| 如果获取锁的线程由于要等待IO或者其他原因（比如调用sleep方法）被阻塞了，但是又没有释放锁，其他线程便只能干巴巴地等待，这十分影响程序执行效率。因此就需要有一种机制可以不让等待的线程一直无期限地等待下去（比如只等待一定的时间或者能够响应中断），通过Lock就可以办到。通过Lock可以知道线程有没有成功获取到锁。这个是synchronized无法办到的。 |   | 
| 总结一下 |   | 
| （1）Lock |   | 
| （2）Lock和synchronized有一点非常大的不同，采用synchronized |   | 


| 特性 | 描述 | 
| -- | -- |
| 尝试非阻塞地获取锁 | 当前线程尝试获取锁，如果这一时刻锁没有被其他线程获取到，则成功获取并持有锁 | 
| 能被中断地获取锁 | 获取到锁的线程能够响应中断，当获取到锁的线程被中断时，中断异常将会被抛出，同时锁会被释放 | 
| 超时获取锁 | 在指定的截止时间之前获取锁， 超过截止时间后仍旧无法获取则返回 | 


| 方法名称 | 描述 | 
| -- | -- |
| void lock() | 获得锁。如果锁不可用，则当前线程将被禁用以进行线程调度，并处于休眠状态，直到获取锁。 | 
| void lockInterruptibly() | 获取锁，如果可用并立即返回。如果锁不可用，那么当前线程将被禁用以进行线程调度，并且处于休眠状态，和lock()方法不同的是在锁的获取中可以中断当前线程（相应中断。 | 
| Condition newCondition() | 获取等待通知组件，该组件和当前的锁绑定，当前线程只有获得了锁，才能调用该组件的wait()方法，而调用后，当前线程将释放锁。 | 
| boolean tryLock() | 只有在调用时才可以获得锁。如果可用，则获取锁定，并立即返回值为true；如果锁不可用，则此方法将立即返回值为false 。 | 
| boolean tryLock(long time, TimeUnit unit) | 超时获取锁，当前线程在一下三种情况下会返回： 1. 当前线程在超时时间内获得了锁；2.当前线程在超时时间内被中断；3.超时时间结束，返回false. | 
| void unlock() | 释放锁。 | 
| 由于在前面讲到如果采用Lock，必须 |   | 


```javascript
Lock lock = ...;
lock.lock();
try{
    //处理任务
}catch(Exception ex){
     
}finally{
    lock.unlock();   //释放锁
}
123456789
```

tryLock()方法是

tryLock(long time, TimeUnit unit)方法和tryLock()方法是类似的，只不过区别在于这个方法在拿不到锁时会

　　所以，一般情况下通过tryLock来获取锁时是这样使用的：

```javascript
Lock lock = ...;
if(lock.tryLock()) {
     try{
         //处理任务
     }catch(Exception ex){
         
     }finally{
         lock.unlock();   //释放锁
     } 
}else {
    //如果不能获取锁，则直接做其他事情
}
123456789101112
```

lockInterruptibly()方法比较特殊，当通过这个方法去获取锁时，如果线程

由于lockInterruptibly()的声明中抛出了异常，所以lock.lockInterruptibly()必须放在try块中或者在调用lockInterruptibly()的方法外声明抛出InterruptedException。

因此lockInterruptibly()一般的使用形式如下：

```javascript
public void method() throws InterruptedException {
    lock.lockInterruptibly();
    try {  
     //.....
    }
    finally {
        lock.unlock();
    }  
}
123456789
```

当一个线程获取了锁之后，是不会被interrupt()方法中断的。

ReentrantLock，意思是“可[重入锁](https://so.csdn.net/so/search?q=%E9%87%8D%E5%85%A5%E9%94%81&spm=1001.2101.3001.7020)”。ReentrantLock是唯一实现了Lock接口的类，并且ReentrantLock提供了

**构造方法：**

| 方法名称 | 描述 | 
| -- | -- |
| ReentrantLock() | 创建一个 ReentrantLock的实例。 | 
| ReentrantLock(boolean fair) | 创建一个特定锁类型（公平锁【ture】/非公平【false】的ReentrantLock的实例 | 
| ReentrantLock类常见方法(不包括接口中的方法)： |   | 


| 方法名称 | 描述 | 
| -- | -- |
| int getHoldCount() | 查询当前线程保持此锁定的个数，也就是调用lock()方法的次数。 | 
| protected Thread getOwner() | 返回当前拥有此锁的线程，如果不拥有，则返回 null | 
| protected Collection getQueuedThreads() | 返回包含可能正在等待获取此锁的线程的集合 | 
| int getQueueLength() | 返回等待获取此锁的线程数的估计。 | 
| protected Collection getWaitingThreads(Condition condition) | 返回包含可能在与此锁相关联的给定条件下等待的线程的集合。 | 
| int getWaitQueueLength(Condition condition) | 返回与此锁相关联的给定条件等待的线程数的估计。 | 
| boolean hasQueuedThread(Thread thread) | 查询给定线程是否等待获取此锁。 | 
| boolean hasQueuedThreads() | 查询是否有线程正在等待获取此锁。 | 
| boolean hasWaiters(Condition condition) | 查询任何线程是否等待与此锁相关联的给定条件 | 
| boolean isFair() | 如果此锁的公平设置为true，则返回 true 。 | 
| boolean isHeldByCurrentThread() | 查询此锁是否由当前线程持有。 | 
| boolean isLocked() | 查询此锁是否由任何线程持有。 | 


```javascript
public class TestReentrantLock1 {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public static void main(String[] args)  {
        final TestReentrantLock1 test = new TestReentrantLock1();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
    }

    public void insert(Thread thread) {
        Lock lock = new ReentrantLock();    //注意这个地方
        lock.lock();
        try {
            System.out.println(thread.getName()+"得到了锁");
            for(int i=0;i<1000;i++) {
                arrayList.add(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            System.out.println(thread.getName()+"释放了锁");
            lock.unlock();
        }
    }
}
12345678910111213141516171819202122232425262728293031323334
```

**执行结果**

```javascript
Thread-0得到了锁
Thread-1得到了锁
Thread-0释放了锁
Thread-1释放了锁
1234
```

我们会看到这样的执行结果，如果结果不是这样的，可以把循环加长一些就可以看到效果了。这是因为每个线程都new出了一个锁，因此他们互不影响，没有满足[线程安全](https://so.csdn.net/so/search?q=%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A8&spm=1001.2101.3001.7020)的需求。

```javascript
public class TestReentrantLock2 {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Lock lock = new ReentrantLock();    //注意这个地方
    public static void main(String[] args)  {
        final TestReentrantLock2 test = new TestReentrantLock2();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
    }

    public void insert(Thread thread) {
        lock.lock();
        try {
            System.out.println(thread.getName()+"得到了锁");
            for(int i=0;i<1000;i++) {
                arrayList.add(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            System.out.println(thread.getName()+"释放了锁");
            lock.unlock();
        }
    }
}
12345678910111213141516171819202122232425262728293031323334
```

**执行结果**

```javascript
Thread-0得到了锁
Thread-0释放了锁
Thread-1得到了锁
Thread-1释放了锁
1234
```

当Lock申明为类属性的时候，两个线程只创建一个锁，因此是同一把锁，可以满足线程安全的需求。

```javascript
public class TestReentrantLock3 {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Lock lock = new ReentrantLock();    //注意这个地方
    public static void main(String[] args)  {
        final TestReentrantLock3 test = new TestReentrantLock3();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();

        new Thread(){
            public void run() {
                test.insert(Thread.currentThread());
            };
        }.start();
    }

    public void insert(Thread thread) {
        if(lock.tryLock()) {
            try {
                System.out.println(thread.getName()+"得到了锁");
                for(int i=0;i<100000;i++) {
                    arrayList.add(i);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }finally {
                System.out.println(thread.getName()+"释放了锁");
                lock.unlock();
            }
        } else {
            System.out.println(thread.getName()+"获取锁失败");
        }
    }
}
12345678910111213141516171819202122232425262728293031323334353637
```

**执行结果**

```javascript
Thread-0得到了锁
Thread-1获取锁失败
Thread-0释放了锁
123
```

这个例程可以看到，线程1在尝试获取锁的时候由于，线程0正在使用，因此尝试失败了。

```javascript
public class TestReentrantLock4 {
    private Lock lock = new ReentrantLock();
    public static void main(String[] args)  {
        TestReentrantLock4 test = new TestReentrantLock4();
        MyThread thread1 = new MyThread(test);
        MyThread thread2 = new MyThread(test);
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.interrupt();
    }

    public void insert(Thread thread) throws InterruptedException{
        lock.lockInterruptibly();   //注意，如果需要正确中断等待锁的线程，必须将获取锁放在外面，然后将InterruptedException抛出
        try {
            System.out.println(thread.getName()+"得到了锁");
            long startTime = System.currentTimeMillis();
            for(    ;     ;) {
                if(System.currentTimeMillis() - startTime >= 3999)
                    break;
                //插入数据
            }
        }
        finally {
            System.out.println(Thread.currentThread().getName()+"执行finally");
            lock.unlock();
            System.out.println(thread.getName()+"释放了锁");
        }
    }
}

class MyThread extends Thread {
    private TestReentrantLock4 test = null;
    public MyThread(TestReentrantLock4 test) {
        this.test = test;
    }
    @Override
    public void run() {

        try {
            test.insert(Thread.currentThread());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"被中断");
        }
    }
}
123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051
```

**执行结果**

```javascript
Thread-0得到了锁
Thread-1被中断
Thread-0执行finally
Thread-0释放了锁
1234
```

ReentrantLock（排他锁）具有完全互斥排他的效果，即同一时刻只允许一个线程访问，这样做虽然虽然保证了实例变量的线程安全性，但效率非常低下。ReadWriteLock接口就是为了解决这个问题。

读写锁维护了两个锁，一个是读操作相关的锁也成为共享锁，一个是写操作相关的锁 也称为排他锁。通过分离读锁和写锁，其并发性比一般排他锁有了很大提升。

| 方法名称 | 描述 | 
| -- | -- |
| Lock readLock() | 共享锁，可以多个线程同时读 | 
| Lock writeLock() | 互斥锁，有一个线程在写，其他线程不能写也不能读，只能等待 | 
| 也就是说将文件的读写操作分开，分成2个锁来分配给线程，从而使得多个线程可以同时进行读操作。 |   | 


ReentrantReadWriteLock实现了上面讲的ReadWriteLock接口

| 特性 | 说明 | 
| -- | -- |
| 公平性选择 | 支持非公平（默认）和公平的锁获取方式，吞吐量上来看还是非公平优于公平 | 
| 重进入 | 该锁支持重进入，以读写线程为例：读线程在获取了读锁之后，能够再次获取读锁。而写线程在获取了写锁之后能够再次获取写锁也能够同时获取读锁 | 
| 锁降级 | 遵循获取写锁、获取读锁再释放写锁的次序，写锁能够降级称为读锁 | 


```javascript
/**
 * 两个读共享锁
 */
public class ReadRead {
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    public static void main(String[] args)  {
        final ReadRead test = new ReadRead();
        new Thread(){
            public void run() {
                test.get(Thread.currentThread());
            };
        }.start();

        new Thread(){
            public void run() {
                test.get(Thread.currentThread());
            };
        }.start();
    }
    public void get(Thread thread) {
        rwl.readLock().lock();
        try {
            long start = System.currentTimeMillis();

            while(System.currentTimeMillis() - start <= 1) {
                System.out.println(thread.getName()+"正在进行读操作");
            }
            System.out.println(thread.getName()+"读操作完毕");
        } finally {
            rwl.readLock().unlock();
        }
    }
}
123456789101112131415161718192021222324252627282930313233
```

**此时打印的结果为（每次结果不同）：**

```javascript
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-1正在进行读操作
Thread-0正在进行读操作
Thread-1正在进行读操作
Thread-1正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-0正在进行读操作
Thread-1正在进行读操作
Thread-1正在进行读操作
Thread-1正在进行读操作
Thread-1正在进行读操作
Thread-1正在进行读操作
Thread-1读操作完毕
Thread-0正在进行读操作
Thread-0读操作完毕
1234567891011121314151617181920212223242526
```

说明thread1和thread2在同时进行读操作。这样就大大提升了读操作的效率。

不过要注意的是，如果有一个线程已经占用了

如果有一个线程已经占用了

synchronized关键字与 

在使用notify/notifyAll()方法进行通知时，被通知的线程是由JVM选择的，使用ReentrantLock类结合Condition实例可以实现“

而synchronized关键字就相当于整个Lock对象中

| 方法名称 | 描述 | 
| -- | -- |
| void await() | 相当于Object类的wait方法 | 
| boolean await(long time, TimeUnit unit) | 相当于Object类的wait(long timeout)方法 | 
| signal() | 相当于Object类的notify方法 | 
| signalAll() | 相当于Object类的notifyAll方法 | 


```javascript
public class UseSingleConditionWaitNotify {
public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
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
            System.out.println(" await时间为" + System.currentTimeMillis());
            condition.await();
            System.out.println("这是condition.await()方法之后的语句，condition.signal()方法之后我才被执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void signal() throws InterruptedException {
        lock.lock();
        try {
            System.out.println("signal时间为" + System.currentTimeMillis());
            condition.signal();
            Thread.sleep(3000);
            System.out.println("这是condition.signal()方法之后的语句");
        } finally {
            lock.unlock();
        }
    }
}
static public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service) {
        super();
        this.service = service;
    }
    @Override
    public void run() {
        service.await();
    }
}
}
1234567891011121314151617181920212223242526272829303132333435363738394041424344454647
```

执行结果

```
await时间为1612080501270
signal时间为1612080504272
这是condition.signal()方法之后的语句
这是condition.await()方法之后的语句，condition.signal()方法之后我才被执行
1234
```

可以看到，await()方法和signal()方法实现了与wait()、notify()同样的功能。

**注意：**

```javascript
public class UseMoreConditionWaitNotify {
    public static void main(String[] args) throws InterruptedException {
        MyserviceMoreCondition service = new MyserviceMoreCondition();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll_A();
    }
    static public class ThreadA extends Thread {
        private MyserviceMoreCondition service;
        public ThreadA(MyserviceMoreCondition service) {
            super();
            this.service = service;
        }
        @Override
        public void run() {
            service.awaitA();
        }
    }
    static public class ThreadB extends Thread {
        private MyserviceMoreCondition service;
        public ThreadB(MyserviceMoreCondition service) {
            super();
            this.service = service;
        }
        @Override
        public void run() {
            service.awaitB();
        }
    }

}
123456789101112131415161718192021222324252627282930313233343536
```

MyserviceMoreCondition

```javascript
public class MyserviceMoreCondition {
    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();
    public void awaitA() {
        lock.lock();
        try {
            System.out.println("begin awaitA时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("  end awaitA时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void awaitB() {
        lock.lock();
        try {
            System.out.println("begin awaitB时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("  end awaitB时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void signalAll_A() {
        lock.lock();
        try {
            System.out.println("  signalAll_A时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }
    public void signalAll_B() {
        lock.lock();
        try {
            System.out.println("  signalAll_B时间为" + System.currentTimeMillis()
                    + " ThreadName=" + Thread.currentThread().getName());
            conditionB.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253
```

执行结果

```javascript
begin awaitA时间为1612084608495 ThreadName=A
begin awaitB时间为1612084608512 ThreadName=B
signalAll_A时间为1612084611512 ThreadName=main
end awaitA时间为1612084611512 ThreadName=A
1234
```

从结果上可以看出只有A线程被唤醒了。明显的signalAll()与notifyAll()不一样，它没有唤醒全部wait()的线程。

线程的交叉调用可能产生死锁，因此所有线程按顺序使用锁的话，是可以避免死锁的。但是实际上不这么做，因为这需要知道所有需要排序的锁，且对团队协作开发带来很大的难度。

```javascript
public class ConditionSeqExec {
    volatile private static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    final private static Condition conditionA = lock.newCondition();
    final private static Condition conditionB = lock.newCondition();
    final private static Condition conditionC = lock.newCondition();
    public static void main(String[] args) {
        Thread threadA = new Thread() {
            public void run() {
                try {
                    lock.lock();
                    //如果nextPrintWho不为1就等待
                    while (nextPrintWho != 1) {
                        conditionA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.print("ThreadA " + (i + 1)+"       " );
                    }
                    System.out.println();
                    nextPrintWho = 2;
                    //通知conditionB实例的线程运行
                    conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread threadB = new Thread() {
            public void run() {
                try {
                    lock.lock();
                    //如果nextPrintWho不为2就等待
                    while (nextPrintWho != 2) {
                        conditionB.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.print("ThreadB " + (i + 1)+"       " );
                    }
                    System.out.println();
                    nextPrintWho = 3;
                    //通知conditionC实例的线程运行
                    conditionC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread threadC = new Thread() {
            public void run() {
                try {
                    lock.lock();
                    //如果nextPrintWho不为3就等待
                    while (nextPrintWho != 3) {
                        conditionC.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.print("ThreadC " + (i + 1)+"       " );
                    }
                    System.out.println();
                    nextPrintWho = 1;
                    //通知conditionA实例的线程运行
                    conditionA.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];
        for (int i = 0; i < 5; i++) {
            aArray[i] = new Thread(threadA);
            bArray[i] = new Thread(threadB);
            cArray[i] = new Thread(threadC);
            aArray[i].start();
            bArray[i].start();
            cArray[i].start();
        }
    }
}
1234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253545556575859606162636465666768697071727374757677787980818283848586
```

运行结果

```javascript
ThreadA 1       ThreadA 2       ThreadA 3       
ThreadB 1       ThreadB 2       ThreadB 3       
ThreadC 1       ThreadC 2       ThreadC 3       
ThreadA 1       ThreadA 2       ThreadA 3       
ThreadB 1       ThreadB 2       ThreadB 3       
ThreadC 1       ThreadC 2       ThreadC 3       
ThreadA 1       ThreadA 2       ThreadA 3       
ThreadB 1       ThreadB 2       ThreadB 3       
ThreadC 1       ThreadC 2       ThreadC 3       
ThreadA 1       ThreadA 2       ThreadA 3       
ThreadB 1       ThreadB 2       ThreadB 3       
ThreadC 1       ThreadC 2       ThreadC 3       
ThreadA 1       ThreadA 2       ThreadA 3       
ThreadB 1       ThreadB 2       ThreadB 3       
ThreadC 1       ThreadC 2       ThreadC 3   
123456789101112131415
```

可以看到这样就实现了，线程按A->B->C->A的顺序依次执行

Lock锁分为：公平锁 和 非公平锁。

**公平锁**

**非公平锁**

```javascript
/**
 * 根据ReentrantLock创建时给定不同的参数
 */
public class FairorNofairLock {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service(true);//true为公平锁，false为非公平锁
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("★线程" + Thread.currentThread().getName()
                        + "运行了");
                service.serviceMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
    static public class Service {
        private ReentrantLock lock;
        public Service(boolean isFair) {
            super();
            lock = new ReentrantLock(isFair);
        }
        public void serviceMethod() {
            lock.lock();
            try {
                System.out.println("ThreadName=" + Thread.currentThread().getName()
                        + "获得锁定");
            } finally {
                lock.unlock();
            }
        }

    }
}
12345678910111213141516171819202122232425262728293031323334353637383940
```

**使用公平锁时的结果**

```javascript
★线程Thread-0运行了
★线程Thread-4运行了
ThreadName=Thread-0获得锁定
★线程Thread-1运行了
★线程Thread-2运行了
★线程Thread-3运行了
★线程Thread-7运行了
★线程Thread-9运行了
★线程Thread-8运行了
★线程Thread-6运行了
ThreadName=Thread-4获得锁定
ThreadName=Thread-1获得锁定
★线程Thread-5运行了
ThreadName=Thread-2获得锁定
ThreadName=Thread-3获得锁定
ThreadName=Thread-7获得锁定
ThreadName=Thread-9获得锁定
ThreadName=Thread-8获得锁定
ThreadName=Thread-6获得锁定
ThreadName=Thread-5获得锁定
1234567891011121314151617181920
```

可以看到线程开启的顺序时

0-4-1-2-3-7-9-8-6-5

获得锁的顺序也是

0-4-1-2-3-7-9-8-6-5

**使用非公平锁时的结果**

```javascript
★线程Thread-0运行了
ThreadName=Thread-0获得锁定
★线程Thread-4运行了
★线程Thread-1运行了
ThreadName=Thread-4获得锁定
ThreadName=Thread-1获得锁定
★线程Thread-2运行了
★线程Thread-3运行了
ThreadName=Thread-2获得锁定
★线程Thread-6运行了
ThreadName=Thread-6获得锁定
★线程Thread-5运行了
ThreadName=Thread-5获得锁定
★线程Thread-9运行了
ThreadName=Thread-9获得锁定
ThreadName=Thread-3获得锁定
★线程Thread-7运行了
ThreadName=Thread-7获得锁定
★线程Thread-8运行了
ThreadName=Thread-8获得锁定
1234567891011121314151617181920
```

很明显线程开启的顺序和获得锁定的顺序不一致。

如果锁具备可重入性，则称作为可重入锁。像synchronized和ReentrantLock都是可重入锁，可重入性实际上表明了锁的分配机制：基于线程的分配，而不是基于方法调用的分配。举个简单的例子，当一个线程执行到某个synchronized方法时，比如说method1，而在method1中会调用另外一个synchronized方法method2，此时线程不必重新去申请锁，而是可以直接执行方法method2。

```javascript
class Demo{
    public synchronized void method1() {
        method2();
    }
    public synchronized void method2() {
         //........
    }
}
12345678
```

上述代码中的两个方法method1和method2都用synchronized修饰了，假如某一时刻，线程A执行到了method1，此时线程A获取了这个对象的锁，而由于method2也是synchronized方法，假如synchronized不具备可重入性，此时线程A需要重新申请锁。但是这就会造成一个问题，因为线程A已经持有了该对象的锁，而又在申请获取该对象的锁，这样就会线程A一直等待永远不会获取到的锁。