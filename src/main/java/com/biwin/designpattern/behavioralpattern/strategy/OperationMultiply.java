package com.biwin.designpattern.behavioralpattern.strategy;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 15:27
 */
public class OperationMultiply implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

}
