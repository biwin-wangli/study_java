package com.biwin.designpattern.creattionalpattern.factory.staticfactory.upgrade;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-20 11:00
 */
public class Bike extends Vehicle {
    @Override
    void driven() {
        System.out.println("Bike is run");
    }

    @Override
    Vehicle newInstance() {
        return new Bike();
    }
}
