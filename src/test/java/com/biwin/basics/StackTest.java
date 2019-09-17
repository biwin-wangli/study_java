package com.biwin.basics;

import java.util.Stack;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-17 10:02
 */
public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        for(stack.iterator(); stack.size()>0; stack.iterator().hasNext()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.peek());
    }
}
