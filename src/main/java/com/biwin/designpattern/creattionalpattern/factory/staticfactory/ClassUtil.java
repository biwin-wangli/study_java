package com.biwin.designpattern.creattionalpattern.factory.staticfactory;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 获取指定类的所有子类
 * @auther wangli
 * @create 2019-09-20 10:35
 */
public class ClassUtil {
    /**
     * 获取路径下所有的子类或接口现实类
     *
     * @param cls
     * @return
     * @throws ClassNotFoundException
     */
    public static List<Class<?>> getAllClass(Class<?> cls) throws ClassNotFoundException {
        List<Class<?>> clazzs = new ArrayList<Class<?>>();
        for (Class<?> cl : getClazzs(cls)) {
            if (cls.isAssignableFrom(cl) && !cls.equals(cl)) {
                clazzs.add(cl);
            }
        }
        return clazzs;
    }

    /**
     * 取得当路径下所有的子类
     *
     * @param cls
     * @return
     * @throws ClassNotFoundException
     */
    public static List<Class<?>> getClazzs(Class<?> cls) throws ClassNotFoundException {
        String pk = cls.getPackage().getName();
        String path = pk.replace(".", "/");
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL url = classLoader.getResource(path);
        return getClazzs(new File(url.getFile()), pk);
    }

    /**
     * 迭代查找类
     *
     * @param dir
     * @param pk
     * @return
     * @throws ClassNotFoundException
     */
    public static List<Class<?>> getClazzs(File dir, String pk) throws ClassNotFoundException {
        List<Class<?>> clazzs = new ArrayList<Class<?>>();
        if (!dir.exists()) {
            return clazzs;
        }
        for (File file : dir.listFiles()) {
            if (file.toString().contains(".svn")) {
                continue;
            }
            if (file.isDirectory()) {
                clazzs.addAll(getClazzs(file, pk + "." + file.getName()));
            }
            String name = file.getName();
//            System.out.println("file:" + name);
            if (name.endsWith(".class")) {
                clazzs.add(Class.forName(pk + "." + name.substring(0, (name.length() - 6))));
            }
        }
        return clazzs;
    }
}
