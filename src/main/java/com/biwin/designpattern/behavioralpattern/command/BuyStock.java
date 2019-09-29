package com.biwin.designpattern.behavioralpattern.command;

/**
 * @Description  入库库存
 *
 * 该类与SellStock可以共同作为类图中的 ConcreteCommand
 * @auther wangli
 * @create 2019-09-29 15:37
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
