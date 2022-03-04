package com.biwin.bytecode.instrument;

import java.lang.instrument.Instrumentation;

/**
 * @author: wangli
 * @date: 2022/2/18 16:06
 */
public class TestAgent {

  public static void agentmain(String args, Instrumentation inst) {
    inst.addTransformer(new TestTransformer(), true);
    try {
      inst.retransformClasses(Base.class);
      System.out.println("agent load Done.");
    } catch (Exception e) {
      System.out.println("agent load faild!");
    }
  }

}
