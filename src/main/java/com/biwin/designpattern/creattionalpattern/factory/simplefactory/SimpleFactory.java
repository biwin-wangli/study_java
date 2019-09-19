package com.biwin.designpattern.creattionalpattern.factory.simplefactory;

/**
 * @Description 简单工厂模式-工厂类
 * @auther wangli
 * @create 2019-09-19 14:33
 */
public class SimpleFactory {

    private Product product;

    public Product createProduct(String type){
        if("A".equals(type)){
            product = new ProductA();
        }else if("B".equals(type)){
            product = new ProductB();
        }
        return product;
    }

}

class SimpleFactoryTest{
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        factory.createProduct("A");
        factory.createProduct("B");
    }
}
