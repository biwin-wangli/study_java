package com.biwin.designpattern.behavioralpattern.memento;

/**
 * @Description 备忘录测试
 * @auther wangli
 * @create 2019-10-08 12:22
 */
public class MementoTest {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveState());
        originator.setState("State #3");
        careTaker.add(originator.saveState());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.restoreState(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.restoreState(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
