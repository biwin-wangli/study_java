package com.biwin.designpattern.behavioralpattern.nullobject;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 16:20
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
    
}
