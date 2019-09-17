package com.biwin.basics;

/**
 * @Description
 * @auther wangli
 * @create 2019-08-23 10:57
 */
public class Eqauls {

    /**
     * Java 中的eqauls 与 == 的区别？
     * Java 中的 == 默认情况下均是比较内存的首地址。
     * equals是由公共父类中继承的判断方法而已，我们可以从Object类中看到，实际的调用代码任然为 ==
     * public boolean equals(Object obj) {
     *    return (this == obj);
     * }
     *
     * 也就是说，Java 默认的 eqauls方法与==的<strong>作用</strong>实际上是一致的。
     * 注意：说的是作用一致。
     *
     * 但这两者还是有本质的区别：
     * == 是判断内存的首地址是否相同，也就变相的判断了对象地址是否相同。
     * eqauls 是Java中的用于判断是否两个对象是否相同的方法名（函数名）。各个子类都可以重写判断规则。
     *
     * 但还有一类面试题为：如果两个对象eqauls相同，但却可有不同的hashCode，对不对？
     * 关于这个问题：由于无法查看Object的HashCode函数内容，但是Java是这样规定的，如果两个对象eqauls相同，那么他们的HashCode
     *      一定相同，但是HashCode相同的两个对象，不一定是同一个对象。
     *
     * 关于如何重写eqauls方法？
     * equals方法介绍：
     * 自反性（x.equals(x)必须返回true）
     * 对称性（x.equals(y)返回true时，y.equals(x)也必须返回true）
     * 传递性（x.equals(y)和y.equals(z)都返回true时，x.equals(z)也必须返回true）
     * 一致性（当x和y引用的对象信息没有被修改时，多次调用x.equals(y)应该得到同样的返回值），
     * 而且对于任何非null值的引用x，x.equals(null)必须返回false。
     *
     * 实现高质量的equals方法的诀窍包括：
     * 使用==操作符检查”参数是否为这个对象的引用”；
     * 使用instanceof操作符检查”参数是否为正确的类型”；
     * 对于类中的关键属性，检查参数传入对象的属性是否与之相匹配；
     * 编写完equals方法后，问自己它是否满足对称性、传递性、一致性；
     * 重写equals时总是要重写hashCode；
     * 不要将equals方法参数中的Object对象替换为其他的类型，在重写时不要忘掉@Override注解。
     */

    Integer a = new Integer(1);
    Integer b = Integer.valueOf("1");
    int c = 1;

    String str1 = new String("1");
    String str2 = new String("1");
    String str3 = "1";




    public static void main(String[] args) {
        Eqauls eqauls = new Eqauls();
        /**
         * Integer自己会进行部分值的缓存，从-128至127，可以查阅Integer.valueOf方法。
         */
        //由于new为构造器，未走IntegerCache.cache 和 valueOf 各自产生的是两个对象，且未进行缓存，内存地址肯定不一致，所以值为false
        System.out.println(eqauls.a == (eqauls.b));
        //因为调用的eqauls方法，由于Integer重写了eqauls方法，只进行值判断所以为true
        System.out.println(eqauls.b.equals(eqauls.a));
        /**
         * 以下两个方法涉及到Java中的自动装箱和拆箱。最终依然判断数值是否相等
         */
        System.out.println(eqauls.a.equals(eqauls.c));
        System.out.println(eqauls.b.equals(eqauls.c));
        System.out.println("_______________________________");
        System.out.println(eqauls.str1 == (eqauls.str2));
        System.out.println(eqauls.str1.equals(eqauls.str2));
    }

}
