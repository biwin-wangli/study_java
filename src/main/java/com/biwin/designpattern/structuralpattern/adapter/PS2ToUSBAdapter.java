package com.biwin.designpattern.structuralpattern.adapter;

import java.util.List;

/**
 * @Description PS/2转USB适配器
 * @auther wangli
 * @create 2019-10-09 11:47
 */
public class PS2ToUSBAdapter implements USBDevice {

    private PS2Device device;

    public PS2ToUSBAdapter(PS2Device device) {
        this.device = device;
    }

    public void plugInto(USBPort port) {
        List<Wire> ps2wires = device.getWires();
        Wire wireRed = getWireWithNameFromList(PS2Device._5V, ps2wires);
        Wire wireWhite = getWireWithNameFromList(PS2Device.WHITE, ps2wires);
        Wire wireGreen = getWireWithNameFromList(PS2Device.GREEN, ps2wires);
        Wire wireBlack = getWireWithNameFromList(PS2Device.GND, ps2wires);

        port.wireRed.linkLeftTo(wireRed);
        port.wireWhite.linkLeftTo(wireWhite);
        port.wireGreen.linkLeftTo(wireGreen);
        port.wireBlack.linkLeftTo(wireBlack);

        device.printWiresConnectionsToRight();
    }

    private Wire getWireWithNameFromList(String name, List<Wire> ps2wires) {
        return ps2wires.stream()
                .filter(x -> name.equals(x.getName()))
                .findAny()
                .orElse(null);
    }
}
