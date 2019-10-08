package com.biwin.designpattern.behavioralpattern.memento;

/**
 * @Description 备忘录
 * @auther wangli
 * @create 2019-10-08 11:50
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
