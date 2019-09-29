package com.biwin.designpattern.behavioralpattern.observer;

/**
 * @Description  十六进制观察者
 * @auther wangli
 * @create 2019-09-29 17:25
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
