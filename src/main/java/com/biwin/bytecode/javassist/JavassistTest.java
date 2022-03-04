package com.biwin.bytecode.javassist;

import java.io.IOException;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;

/**
 * @author: wangli
 * @date: 2022/2/18 15:30
 */
public class JavassistTest {

  public static void main(String[] args)
      throws NotFoundException, CannotCompileException, IOException, InstantiationException, IllegalAccessException {
    Base b = new Base();

    ClassPool cp = ClassPool.getDefault();
    CtClass cc = cp.get("com.biwin.bytecode.javassist.Base");

    CtMethod cm = cc.getDeclaredMethod("process");
    cm.insertBefore("{ System.out.println(\"start\");}");
    cm.insertAfter("{ System.out.println(\"end\");}");
    Class<?> c = cc.toClass();
//    cc.writeFile("/Users/wangli/Base");
    Base h = (Base) c.newInstance();
    h.process();

  }

}
