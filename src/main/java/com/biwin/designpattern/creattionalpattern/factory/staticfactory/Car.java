package com.biwin.designpattern.creattionalpattern.factory.staticfactory;

/**
 * @Description 小汽车
 * @auther wangli
 * @create 2019-09-20 9:42
 */
public class Car extends Vehicle {
    @Override
    void driven() {
        System.out.println("Car is run");
    }

}
