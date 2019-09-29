package com.biwin.designpattern.behavioralpattern.observer;

/**
 * @Description 观察者抽象
 * @auther wangli
 * @create 2019-09-29 17:24
 */
public abstract class Observer {

    //被观察者对象
    protected Subject subject;

    //被观察者产生变化时，触发的方法
    public abstract void update();
}
