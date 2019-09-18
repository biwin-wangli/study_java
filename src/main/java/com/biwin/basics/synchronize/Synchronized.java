package com.biwin.basics.synchronize;

/**
 * @Description Synchronized是Java中解决并发问题的一种最常用的方法，也是最简单的一种方法。Synchronized的作用主要有三个：
 * 1.确保线程互斥的访问同步代码
 * 2.保证共享变量的吸怪能够及时可见
 * 3.有效解决重排序问题
 * Java中每一个对象都可以作为锁，这是Synchronized实现同步的基础。
 *
 * 该类为普通同步方法，锁是当前实例对象
 *      Java中每个对象都有一个锁或者称为监视器，当访问某个对象的synchronized方法时，表示将该对象上锁，而不仅仅
 *     是为该方法上锁。这样如果一个对象的synchronized方法被某个线程执行时，其他线程无法访问该对象的任何synchronized方法（但是可以
 *     调用其他非synchronized的方法）。直至该synchronized方法执行完。
 * @auther wangli
 * @create 2019-09-18 22:51
 */
public class Synchronized {
    public synchronized void method1() {
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }

    public synchronized void method2() {
        System.out.println("Method 2 start");
        try {
            System.out.println("Method 2 execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end");
    }

    public static void main(String[] args) {
        final Synchronized test = new Synchronized();

        new Thread(new Runnable() {
            @Override
            public void run() {
                test.method1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                test.method2();
            }
        }).start();
    }
}

