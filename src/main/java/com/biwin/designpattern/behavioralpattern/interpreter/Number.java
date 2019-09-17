package com.biwin.designpattern.behavioralpattern.interpreter;

/**
 * @Description 需要执行表达式的数字
 * @auther wangli
 * @create 2019-09-16 14:20
 */
public class Number implements Expression {

    private float number;
    public Number(float number){
        this.number = number;
    }

    @Override
    public float interpret() {
        return number;
    }
}
