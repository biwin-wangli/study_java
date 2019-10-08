package com.biwin.designpattern.behavioralpattern.memento;

/**
 * @Description 需要保存状态的对象
 * @auther wangli
 * @create 2019-10-08 11:47
 */
public class Originator {


    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState(){
        return new Memento(state);
    }

    public void restoreState(Memento memento){
        state = memento.getState();
    }


}
