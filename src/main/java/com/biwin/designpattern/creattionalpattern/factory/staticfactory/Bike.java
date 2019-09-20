package com.biwin.designpattern.creattionalpattern.factory.staticfactory;

/**
 * @Description 自行车
 * @auther wangli
 * @create 2019-09-20 9:44
 */
public class Bike extends Vehicle {
    @Override
    void driven() {
        System.out.println("Bike is run");
    }

}
