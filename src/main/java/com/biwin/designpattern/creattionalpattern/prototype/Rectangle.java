package com.biwin.designpattern.creattionalpattern.prototype;

/**
 * @Description  长方形
 * @auther wangli
 * @create 2019-09-25 19:54
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}