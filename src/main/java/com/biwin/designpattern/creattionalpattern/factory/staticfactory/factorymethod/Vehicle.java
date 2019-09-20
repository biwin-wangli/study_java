package com.biwin.designpattern.creattionalpattern.factory.staticfactory.factorymethod;

/**
 * @Description 汽车抽象基类
 * @auther wangli
 * @create 2019-09-20 9:42
 */
public abstract class Vehicle {

    public abstract void driven();

    public String size;

    public String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
