package com.biwin.designpattern.creattionalpattern.factory.staticfactory.factorymethod;

/**
 * @Description 大型家用车
 * @auther wangli
 * @create 2019-09-20 17:51
 */
public class SedanCar extends Vehicle {
    @Override
    public void driven() {
        System.out.println("SedanCar is run, color:" + getColor());
    }
}
