package com.biwin.designpattern.structuralpattern.proxy;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-09 15:16
 */
public enum GeometryCalculatorBeanFactory {

    LOCAL {
        public GeometryCalculatorBean makeGeometryCalculator() {
            return new GeometryBean();
        }
    },
    REMOTE_PROXY {
        public GeometryCalculatorBean makeGeometryCalculator() {
            try {
                return new GeometryBeanProxy();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return null;
        }
    };

    public abstract GeometryCalculatorBean makeGeometryCalculator();
}
