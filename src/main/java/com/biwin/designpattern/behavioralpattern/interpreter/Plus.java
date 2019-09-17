package com.biwin.designpattern.behavioralpattern.interpreter;

/**
 * @Description 运算表达式的加法
 * @auther wangli
 * @create 2019-09-16 14:21
 */
public class Plus implements Expression {
    Expression left;
    Expression right;

    public Plus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public float interpret() {
        return left.interpret() + right.interpret();
    }
}
