package com.biwin.designpattern.behavioralpattern.observer;

/**
 * @Description 八进制观察者
 * @auther wangli
 * @create 2019-09-29 17:25
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
