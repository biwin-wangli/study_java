package com.biwin.designpattern.behavioralpattern.visitor;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 17:03
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
