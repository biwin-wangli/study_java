package com.biwin.designpattern.creattionalpattern.prototype;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-25 19:55
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
