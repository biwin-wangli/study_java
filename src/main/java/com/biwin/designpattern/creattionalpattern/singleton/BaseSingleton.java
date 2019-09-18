package com.biwin.designpattern.creattionalpattern.singleton;

/**
 * @Description 基础单例模式
 * @auther wangli
 * @create 2019-09-18 15:58
 */
public class BaseSingleton {

    private static BaseSingleton singleton;

    private BaseSingleton(){}

    public static BaseSingleton getInstance(){
        if(null == singleton) {
            singleton = new BaseSingleton();
        }
        return singleton;
    }

    public void doSomething(){
        System.out.println("Something is Done.");
    }

}

/**
 * 测试调用
 */
class BaseSingletonTest{
    public static void main(String[] args) {
        BaseSingleton.getInstance().doSomething();
    }
}
