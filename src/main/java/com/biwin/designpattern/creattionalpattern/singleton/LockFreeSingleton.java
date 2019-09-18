package com.biwin.designpattern.creattionalpattern.singleton;

/**
 * @Description 无锁的线程安全单例模式
 * @auther wangli
 * @create 2019-09-19 00:11
 */
public class LockFreeSingleton {

    private static final LockFreeSingleton singleton = new LockFreeSingleton();

    private LockFreeSingleton(){
        System.out.println("Singleton is Instantiated.");
    }

    public static synchronized LockFreeSingleton getInstance(){
        return singleton;
    }

    public void doSomething(){
        System.out.println("Something is Done.");
    }

}
