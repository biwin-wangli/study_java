package com.biwin.designpattern.behavioralpattern.chainofresponsibility;

import groovy.grape.GrapeIvy;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-29 11:10
 */
public class ConcreteHandlerA extends Handler {
    @Override
    void handlerRequest(String request) {
        if(canHandler(request)){
            //code to handle the request
            System.out.println("a is run");
        }else{
            successor.handlerRequest(request);
        }
    }

    public boolean canHandler(String request){
        return false;
    }
}
