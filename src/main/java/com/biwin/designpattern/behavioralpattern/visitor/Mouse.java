package com.biwin.designpattern.behavioralpattern.visitor;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 17:53
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
