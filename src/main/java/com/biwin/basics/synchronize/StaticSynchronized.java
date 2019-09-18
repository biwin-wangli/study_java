package com.biwin.basics.synchronize;

/**
 * @Description 该类为静态同步方法，锁是当前class对象
 *      当调用一个对象的静态synchronized方法时，它锁定的并不是synchronized方法所在的对象，而是synchronized
 *     方法所在对象对应的Class对象。这样，其他线程就不能调用该类的其他静态synchronized方法了，但是可以调用非静态的synchronized方法。
 * @auther wangli
 * @create 2019-09-18 23:47
 */
public class StaticSynchronized {

    public static synchronized void method1() {
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }

    public static synchronized void method2() {
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
        final StaticSynchronized test = new StaticSynchronized();
        final StaticSynchronized test2 = new StaticSynchronized();

        new Thread(new Runnable() {
            @Override
            public void run() {
                test.method1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                test2.method2();
            }
        }).start();
    }
}
