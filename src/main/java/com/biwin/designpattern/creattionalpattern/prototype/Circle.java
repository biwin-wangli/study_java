package com.biwin.designpattern.creattionalpattern.prototype;

/**
 * @Description  圆形
 * @auther wangli
 * @create 2019-09-25 19:55
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
