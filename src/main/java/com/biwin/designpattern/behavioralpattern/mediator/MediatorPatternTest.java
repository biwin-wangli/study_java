package com.biwin.designpattern.behavioralpattern.mediator;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-30 14:38
 */
public class MediatorPatternTest {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }

}
