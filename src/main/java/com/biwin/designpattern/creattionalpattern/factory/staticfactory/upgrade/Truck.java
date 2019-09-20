package com.biwin.designpattern.creattionalpattern.factory.staticfactory.upgrade;

/**
 * @Description 卡车
 * @auther wangli
 * @create 2019-09-20 9:45
 */
public class Truck extends Vehicle {
    @Override
    void driven() {
        System.out.println("Truck is run");
    }

    @Override
    Vehicle newInstance() {
        return new Truck();
    }
}
