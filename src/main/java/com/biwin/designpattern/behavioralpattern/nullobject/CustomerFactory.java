package com.biwin.designpattern.behavioralpattern.nullobject;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 16:20
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
