package com.biwin.designpattern.creattionalpattern.factory.staticfactory.upgrade;

/**
 * @Description 汽车抽象基类
 * @auther wangli
 * @create 2019-09-20 9:42
 */
public abstract class Vehicle {

    abstract void driven();

    abstract Vehicle newInstance();

}
