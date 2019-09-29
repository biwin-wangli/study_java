package com.biwin.designpattern.behavioralpattern.chainofresponsibility;

/**
 * @Description 抽象的处理器
 * @auther wangli
 * @create 2019-09-29 11:09
 */
public abstract class Handler {

    abstract void handlerRequest(String request);

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
