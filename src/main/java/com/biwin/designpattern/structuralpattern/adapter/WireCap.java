package com.biwin.designpattern.structuralpattern.adapter;

/**
 * @Description WireCap类模型，顾名思义，表示每条线的两个末端。默认情况下，所有线都是宽泛松散的，因此需要一个钟方法来表示这一点。
 * 通过使用Null对象模式可以达到需要-LooseCap是我们的null对象（一个空替换，它不会抛出空指针异常）
 * @auther wangli
 * @create 2019-10-09 11:31
 */
public class WireCap {
    WireCap link = WireCap.LooseCap;
    private Wire wire;

    public static WireCap LooseCap = new WireCap(null);

    public WireCap(Wire wire) {
        this.wire = wire;
    }

    public void addLinkTo(WireCap link) {
        this.link = link;
    }

    public Wire getWire() {
        return wire;
    }

    public String toString() {
        if (link.equals(WireCap.LooseCap))
            return "WireCap belonging to LooseCap";
        return "WireCap belonging to " + wire + " is linked to " + link.getWire();
    }

    public WireCap getLink() {
        return link;
    }
}
