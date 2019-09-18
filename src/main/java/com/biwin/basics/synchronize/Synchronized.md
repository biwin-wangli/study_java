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

[Synchronized底层原理](https://www.cnblogs.com/mingyao123/p/7424911.html)

