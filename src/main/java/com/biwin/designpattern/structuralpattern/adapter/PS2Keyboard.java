package com.biwin.designpattern.structuralpattern.adapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description PS/2的键盘
 * @auther wangli
 * @create 2019-10-09 11:47
 */
public class PS2Keyboard implements PS2Device {
    public final List<Wire> wires = Arrays.asList(
            new Wire(_5V),
            new Wire(WHITE),
            new Wire(GREEN),
            new Wire(BLACK),
            new Wire(BLUE),
            new Wire(GND));

    public List<Wire> getWires() {
        return Collections.unmodifiableList(wires);
    }

    public void printWiresConnectionsToRight() {
        for(Wire wire : wires)
            wire.printWireConnectionsToRight();
    }
}
