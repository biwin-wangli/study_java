package com.biwin.designpattern.behavioralpattern.visitor;


/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 17:52
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
