package com.biwin.designpattern.behavioralpattern.command;

/**
 * @Description 销售库存
 * @auther wangli
 * @create 2019-09-29 15:38
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
