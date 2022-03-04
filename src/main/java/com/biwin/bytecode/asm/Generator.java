package com.biwin.bytecode.asm;

import java.io.File;
import java.io.FileOutputStream;
import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;

/**
 * @author: wangli
 * @date: 2022/2/18 15:03
 */
public class Generator {

  public static void main(String[] args) throws Exception {
    //读取
    ClassReader classReader = new ClassReader("com/biwin/bytecode/asm/Base");
    ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
    //处理
    ClassVisitor classVisitor = new MyClassVisitor(classWriter);
    classReader.accept(classVisitor, ClassReader.SKIP_DEBUG);
    byte[] data = classWriter.toByteArray();
    //输出
    File f = new File("target/classes/com/biwin/bytecode/asm/Base.class");
    FileOutputStream fout = new FileOutputStream(f);
    fout.write(data);
    fout.close();
    System.out.println("now generator cc success!!!!!");
  }

}
