package com.biwin.designpattern.structuralpattern.proxy.staticproxy;

/**
 * @Description  静态代理
 *
 * 总结：其实这里做的事情无非就是，创建一个代理类SingerProxy，继承了ISinger接口并实现了其中的方法。只不过这种实现特意包含了目标
 * 对象的方法，正是这种特征使得看起来像是“扩展”了目标对象的方法。假使代理对象中只是简单地对sing方法做了另一种实现而没有包含目标
 * 对象的方法，也就不能算作代理模式了。所以这里的包含是关键。
 *
 * 缺点：这种实现方式很直观也很简单，但其缺点是代理对象必须提前写出，如果接口层发生了变化，代理对象的代码也要进行维护。如果能在运
 * 行时动态地写出代理对象，不但减少了一大批代理类的代码，也少了不断维护的烦恼，不过运行时的效率必定受到影响。这种方式就是接下来的
 * 动态代理。
 *
 * @auther wangli
 * @create 2019-10-09 15:04
 */
public class ProxyPatternTest {

    public static void main(String[] args) {
        GeometryCalculatorBean circle = GeometryCalculatorBeanFactory.REMOTE_PROXY.makeGeometryCalculator();
        System.out.printf("Circle diameter %f\n", circle.calculateCircleCircumference(new Circle()));
    }
}