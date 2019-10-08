package com.biwin.designpattern.behavioralpattern.visitor;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 17:55
 */
public class VisitorPatternTest{

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
