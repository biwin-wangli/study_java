package com.biwin.designpattern.structuralpattern.adapter;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-09 11:16
 */
public class AdapterPatternTest {

    public static void main(String[] args) {
        USBDevice adapter = new PS2ToUSBAdapter(new PS2Keyboard());
        adapter.plugInto(new USBPort());
    }

}
