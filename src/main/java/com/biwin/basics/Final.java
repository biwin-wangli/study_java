package com.biwin.basics;

/**
 * @Description 根据程序上下文环境，Java关键字final有“这是无法改变的”或者“终态的”含义，它可以修饰非抽象类、非抽象类成员方法和变量。
 * 你可能出于两种理解而需要阻止改变：设计或效率。
 *  <p>
 *      1.final类不能被继承，没有子类，final类中的方法默认是final的。
 *      2.final方法不能被子类的方法覆盖，但可以被继承。
 *      3.final成员变量表示常量，只能被赋值一次，赋值后值不再改变。
 *      4.final不能用于修饰构造方法。
 *  </p>
 *  注意：父类的private成员方法是不能被子类方法覆盖的，因此private类型的方法默认是final类型的。
 * @auther wangli
 * @create 2019-08-10 15:53
 */
public class Final {
    /**
     * 一个永不改变的编译时常量。
     * 一个在运行时被初始化的值，而之后无法被改变；
     * 一个既是static又是final的域：是一段不能改变的存储空间；
     *
     * 基本数据类型（int、double、char...）运用final时，使数值恒定不变；
     * 对象引用运用final时，final使得引用恒定不变，引用内部的数据若不是final型，可以进行修改。
     * 数组类型运用final时，final使得数组引用恒定不变，数组内部的数据若不是final型，可以进行修改。
     *
     * final指明数据为一个常量，恒定无法修改；
     * static指明数据只占用一份存储区域；
     */
    public final static String str = "";


    public static void main(String[] args) {
        Final f = new Final();
        //f.str = "123";  Cannot assign a value to final variable 'str'

    }
}
