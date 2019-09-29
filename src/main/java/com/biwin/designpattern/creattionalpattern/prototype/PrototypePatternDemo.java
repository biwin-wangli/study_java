package com.biwin.designpattern.creattionalpattern.prototype;

/**
 * @Description  浅克隆示例
 *      这就是浅度克隆，当被克隆的类中有引用对象（String或Integer等包装类型除外）时，克隆出来的类中的引用变量存储的还是之前的内
 *      存地址，也就是说克隆与被克隆的对象是同一个。这样的话两个对象共享了一个私有变量，所有人都可以改，是一个种非常不安全的方式，
 *      在实际项目中使用还是比较少的。
 * @auther wangli
 * @create 2019-09-25 19:56
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        System.out.println("source:" + ShapeCache.getShapeOld("1").hashCode() + ",clone:" + clonedShape.hashCode());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        System.out.println("source:" + ShapeCache.getShapeOld("2").hashCode() + ",clone:" + clonedShape2.hashCode());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        System.out.println("source:" + ShapeCache.getShapeOld("3").hashCode() + ",clone:" + clonedShape3.hashCode());
    }
}
