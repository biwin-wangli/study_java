package com.biwin.designpattern.creattionalpattern.singleton;

/**
 * @Description 同步锁单例模式
 * @auther wangli
 * @create 2019-09-19 00:11
 */
public class SyncSingleton {

    private static SyncSingleton syncSingleton;

    private SyncSingleton(){}
    //静态同步方法
    public static synchronized SyncSingleton getInstance() {
        if(null == syncSingleton){
            syncSingleton = new SyncSingleton();
        }
        return syncSingleton;
    }
}

class SyncSingleton2{
    private static SyncSingleton2 syncSingleton2;

    private SyncSingleton2(){}

    public static SyncSingleton2 getInstance(){
        //同步代码块
        synchronized (SyncSingleton2.class){
            if(null == syncSingleton2){
                syncSingleton2 = new SyncSingleton2();
            }
        }
        return syncSingleton2;
    }
}
