package com.biwin.designpattern.behavioralpattern.strategy;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 15:26
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

}
