package com.biwin.designpattern.behavioralpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  具体的执行器
 *
 * 该类可以作为类图中的 Receiver
 * @auther wangli
 * @create 2019-09-29 15:38
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
