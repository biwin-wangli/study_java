package com.biwin.designpattern.behavioralpattern.observer;

/**
 * @Description  二进制观察者
 * @auther wangli
 * @create 2019-09-29 17:24
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
