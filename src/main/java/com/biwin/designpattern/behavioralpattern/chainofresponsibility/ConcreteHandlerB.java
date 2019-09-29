package com.biwin.designpattern.behavioralpattern.chainofresponsibility;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-29 11:10
 */
public class ConcreteHandlerB extends Handler {
    @Override
    void handlerRequest(String request) {
        if(canHandler(request)){
            //code to handle the request
            System.out.println("b is run");
        }else{
            successor.handlerRequest(request);
        }
    }

    public boolean canHandler(String request){
        return true;
    }
}
