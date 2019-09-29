package com.biwin.designpattern.behavioralpattern.command;

/**
 * @Description 库存类
 * @auther wangli
 * @create 2019-09-29 15:34
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
