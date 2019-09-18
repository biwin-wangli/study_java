## Synchronized(同步)
首先，解释一下synchronized作用

Synchronized挂件自的作用一词概括就是：线程同步。它可以用来吸怪对象中的方法，将对象加锁。相当于不管哪一个线程A每次运行到这个方法
时，都要检查有没有其他正在用这个方法的线程B（或者C D等），有的话要等正在使用这个方法的线程B（或者C D）运行完这个方法后再运行此线
程A，没有的话，直接运行。

然后，讲讲Synchronized语法

Synchronized关键词包括两种用法：`synchronized方法`和`synchronized块`。

Synchronized方法（又称同步方法）：如下

    public synchronized void accessVal(int newVal);
    
同步方法又分为两种：`普通同步方法`和`静态同步方法`。

- 普通同步方法
    
    锁的是当前实例对象。Java中每个对象都有一个锁或者称为监视器，当访问某个对象的synchronized方法时，表示将该对象上锁，而不仅仅
    是为该方法上锁。这样如果一个对象的synchronized方法被某个线程执行时，其他线程无法访问该对象的任何synchronized方法（但是可以
    调用其他非synchronized的方法）。直至该synchronized方法执行完。
    
[参考代码](Synchronized.java)
    
- 静态同步方法

    锁的是当前类的class对象。当调用一个对象的静态synchronized方法时，它锁定的并不是synchronized方法所在的对象，而是synchronized
    方法所在对象对应的Class对象。这样，其他线程就不能调用该类的其他静态synchronized方法了，但是可以调用非静态的synchronized方法。

[参考代码](StaticSynchronized.java)

Synchronized块：锁的是括号里面的对象。如下

    synchronized（syncObject）{
        //允许访问控制的代码
    }

[参考代码](SynchronizedCode.java)
   
synchronized方法和synchronized同步代码块的区别：

- synchronized同步代码块只是锁定了该代码块，代码块外面的代码还是可以被访问的。
- synchronized方法是粗粒度的并发控制，某一个时刻只能有一个线程执行该synchronized方法。
- synchronized同步代码块是细粒度的并发控制，只会将块中的代码同步，代码块之外的代码可以被其他线程同时访问。

下面来说一下synchronized(this)和synchronized(obj)的区别：
synchronized(this)中this指调用该方法的引用对象，obj则可以为任意 引用对象；
Java语法规定，任何线程执行同步方法、同步代码块 之前，必须先获取对应的监视器。JAVA的synchronized()方法类似于操作系统概念中的互斥
内存块，在JAVA中的Object类型中，都是带有一个内存锁的，在有线程获取该内存锁后，其它线程无法访问该内存，从而实现JAVA中简单的同步、
互斥操作。明白这个原理，就能理解为什么synchronized(this)与synchronized(static XXX)的区别了，synchronized就是针对内存区块申请
内存锁，<strong>this关键字代表类的一个对象，所以其内存锁是针对相同对象的互斥操作，而static成员属于类专有，其内存空间为该类所有成员共有，
这就导致synchronized()对static成员加锁，相当于对类加锁，也就是在该类的所有成员间实现互斥，在同一时间只有一个线程可访问该类的实
例。</strong>如果只是简单的想要实现在JAVA中的线程互斥，明白这些基本就已经够了。但如果需要在线程间相互唤醒的话就需要借助Object.wait(), 
Object.nofity()了。

synchronized(class)很特别，它会让另一个线程在任何需要获取class做为monitor的地方等待．class与this做为不同的监视器可以同时使用，不存在一个线程获取了class，另一个线程就不能获取该class的一切实例．

根据下面的代码自行修改,分别验证下面的几种情况：

synchronized(class)
synchronized(this)
－＞线程各自获取monitor，不会有等待．
synchronized(this)
synchronized(this)
－＞如果不同线程监视同一个实例对象，就会等待，如果不同的实例，不会等待．
synchronized(class)
synchronized(class)
－＞如果不同线程监视同一个实例或者不同的实例对象，都会等待．

扩展：[Synchronized底层原理](https://www.cnblogs.com/mingyao123/p/7424911.html)

