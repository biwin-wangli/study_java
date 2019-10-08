package com.biwin.designpattern.behavioralpattern.state;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 13:56
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
