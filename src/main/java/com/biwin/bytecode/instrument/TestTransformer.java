package com.biwin.bytecode.instrument;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

/**
 * @author: wangli
 * @date: 2022/2/18 16:03
 */
public class TestTransformer implements ClassFileTransformer {

  @Override
  public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
      ProtectionDomain protectionDomain, byte[] classfileBuffer)
      throws IllegalClassFormatException {
    System.out.println("Transforming " + className);

    try {
      ClassPool cp = ClassPool.getDefault();
      CtClass cc = cp.get("com.biwin.bytecode.instrument.Base");
      CtMethod cm = cc.getDeclaredMethod("process");
      cm.insertBefore("{ System.out.println(\"start\");}");
      cm.insertAfter("{ System.out.println(\"end\");}");
      return cc.toBytecode();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
