package com.biwin.designpattern.behavioralpattern.state;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 13:56
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
