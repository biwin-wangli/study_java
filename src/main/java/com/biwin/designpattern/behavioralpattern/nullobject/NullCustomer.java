package com.biwin.designpattern.behavioralpattern.nullobject;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 16:20
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }

}
