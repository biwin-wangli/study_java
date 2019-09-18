package com.biwin.designpattern.creattionalpattern.singleton;

public class SyncSingleton {

    private static SyncSingleton syncSingleton;

    private SyncSingleton(){}

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
        synchronized (SyncSingleton2.class){
            if(null == syncSingleton2){
                syncSingleton2 = new SyncSingleton2();
            }
        }
        return syncSingleton2;
    }
}
