package com.biwin.designpattern.creattionalpattern.factory.staticfactory.factorymethod;

/**
 * @Description 超跑小汽车
 * @auther wangli
 * @create 2019-09-20 17:51
 */
public class SportCar extends Vehicle{

    @Override
    public void driven() {
        System.out.println("SportCar is run, color:" + (null==getColor()? "default": getColor()));
    }

}
