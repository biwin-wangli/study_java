package com.biwin.designpattern.behavioralpattern.command;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-29 15:39
 */
public class CommandPatternTest {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        //命令模式的精髓
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
