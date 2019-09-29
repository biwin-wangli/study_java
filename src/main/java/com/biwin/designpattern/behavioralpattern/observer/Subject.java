package com.biwin.designpattern.behavioralpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 被观察者
 * @auther wangli
 * @create 2019-09-29 17:24
 */
public class Subject {

    //记录所有的观察者对象
    private List<Observer> observers = new ArrayList<Observer>();
    //需要观察或者监控的某个值的变化
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
