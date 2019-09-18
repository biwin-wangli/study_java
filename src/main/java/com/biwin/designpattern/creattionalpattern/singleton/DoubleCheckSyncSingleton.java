package com.biwin.designpattern.creattionalpattern.singleton;

public class DoubleCheckSyncSingleton {

    private static DoubleCheckSyncSingleton singleton;

    private DoubleCheckSyncSingleton(){}

    public static DoubleCheckSyncSingleton getInstance(){
        if(null == singleton){
            synchronized (DoubleCheckSyncSingleton.class){
                if(null == singleton){
                    singleton = new DoubleCheckSyncSingleton();
                }
            }
        }
        return singleton;
    }
}
