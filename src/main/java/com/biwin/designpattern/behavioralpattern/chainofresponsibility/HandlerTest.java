package com.biwin.designpattern.behavioralpattern.chainofresponsibility;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-29 11:14
 */
public class HandlerTest {

    //由于只有两个具体处理器，所以只需要将a的后置处理器b，引入a即可。
    public static Handler getHandlerChain(){
        ConcreteHandlerA a = new ConcreteHandlerA();
        ConcreteHandlerB b = new ConcreteHandlerB();
        a.setSuccessor(b);
        return a;
    }

    public static void main(String[] args) {
        getHandlerChain().handlerRequest("test");
    }
}
