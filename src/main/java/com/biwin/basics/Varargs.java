package com.biwin.basics;

import java.util.Date;
import java.util.TimeZone;

/**
 * @Description 可变参数应用
 * @auther wangli
 * @create 2019-08-21 17:36
 */
public class Varargs {

    public static void method(String a, String[] b, String c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void methodA(String a, String c, String... b){
        method(a, b, c);
    }

    public static void main(String[] args) {
        methodA("","", "1", "2", "3");
    }
}
