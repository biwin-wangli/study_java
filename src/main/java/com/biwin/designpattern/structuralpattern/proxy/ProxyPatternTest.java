package com.biwin.designpattern.structuralpattern.proxy;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-09 15:04
 */
public class ProxyPatternTest {

    public static void main(String[] args) {
        GeometryCalculatorBean circle = GeometryCalculatorBeanFactory.REMOTE_PROXY.makeGeometryCalculator();
        System.out.printf("Circle diameter %f\n", circle.calculateCircleCircumference(new Circle()));
    }
}
