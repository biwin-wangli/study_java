package com.biwin.designpattern.structuralpattern.adapter;

/**
 * @Description 根据USB规范，USB端口一共有四条线-用于数据传输的5V红色、绿色和白色线，以及用于接地的黑色线。
 * @auther wangli
 * @create 2019-10-09 11:35
 */
public class USBPort {

    public final Wire wireRed = new Wire("USB Red5V");
    public final Wire wireWhite = new Wire("USB White");
    public final Wire wireGreen = new Wire("USB Green");
    public final Wire wireBlack = new Wire("USB Black");
}
