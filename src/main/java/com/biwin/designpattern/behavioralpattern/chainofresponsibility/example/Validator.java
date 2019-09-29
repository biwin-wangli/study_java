package com.biwin.designpattern.behavioralpattern.chainofresponsibility.example;

/**
 * @Description 用于后端的逻辑判断
 * @auther wangli
 * @create 2019-09-03 13:35
 */
public abstract class Validator {

    /**
     * 执行验证逻辑
     */
    public abstract void check(ValidatorChain chain, Object... obj) ;

}


