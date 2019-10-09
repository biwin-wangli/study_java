package com.biwin.designpattern.structuralpattern.proxy;

/**
 * @Description 代理对象。值得注意的是代理对象没有业务逻辑，它在建立起一个句柄后，会将业务请求委托给真实对象来处理。
 * @auther wangli
 * @create 2019-10-09 15:15
 */
public class GeometryBeanProxy implements GeometryCalculatorBean {

    private GeometryCalculatorBean bean;

    public GeometryBeanProxy() throws Exception {
        bean = doJNDILookup("remote://localhost:4447", "user", "password");
    }

    private GeometryCalculatorBean doJNDILookup(
            final String urlProvider, final String securityPrincipal, final String securityCredentials)
            throws Exception {
        System.out.println("Do JNDI lookup for bean");
        Thread.sleep(123);//simulate JNDI load for the remote location
        return GeometryCalculatorBeanFactory.LOCAL.makeGeometryCalculator();
    }

    public double calculateCircleCircumference(Circle circle) {
        return bean.calculateCircleCircumference(circle);
    }
}
