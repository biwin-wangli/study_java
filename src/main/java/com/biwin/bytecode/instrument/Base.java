package com.biwin.bytecode.instrument;

import java.lang.management.ManagementFactory;

/**
 * @author: wangli
 * @date: 2022/2/18 15:58
 */
public class Base {

  public static void main(String[] args) {
    String name = ManagementFactory.getRuntimeMXBean().getName();
    String s = name.split("@")[0];

    System.out.println("pid:" + s);
    while (true) {
      try {
        Thread.sleep(5000L);
      } catch (InterruptedException e) {
        break;
      }
      process();
    }
  }

  public static void process() {
    System.out.println("process");
  }

}
