package com.biwin.designpattern.behavioralpattern.interpreter;

/**
 * @Description 运算表达式中的减法
 * @auther wangli
 * @create 2019-09-16 14:22
 */
public class Minus implements Expression {
    Expression left;
    Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float interpret() {
        return right.interpret() - left.interpret();
    }
}
