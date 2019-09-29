package com.biwin.designpattern.behavioralpattern.observer;

/**
 * @Description  观察者测试类
 * @auther wangli
 * @create 2019-09-29 17:25
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
