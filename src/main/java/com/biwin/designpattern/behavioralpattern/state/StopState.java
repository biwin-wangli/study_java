package com.biwin.designpattern.behavioralpattern.state;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 13:56
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
