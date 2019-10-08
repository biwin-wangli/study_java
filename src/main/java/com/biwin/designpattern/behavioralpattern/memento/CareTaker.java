package com.biwin.designpattern.behavioralpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 管理者
 * @auther wangli
 * @create 2019-10-08 11:51
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }


}
