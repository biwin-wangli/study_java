package com.biwin.designpattern.structuralpattern.proxy.staticproxy;

/**
 * @Description 真实对象，它知道如何执行实际的几何计算
 * @auther wangli
 * @create 2019-10-09 15:15
 */
public class GeometryBean implements GeometryCalculatorBean {
    @Override
    public double calculateCircleCircumference(Circle circle) {
        return 0.1f;
    }
}
