package com.biwin.basics;

/**
 * @Description
 * @auther wangli
 * @create 2019-08-23 11:57
 */
public class Char {

    /**
     * char存储大小为2个字符，8位，值存储范围为-128 - 127
     * 关于char 为什么能表示 -128 ，需要谈到计算机中的原码、反码、补码。
     *
     * 1000 0000 原码：表示+0
     * 0000 0000 原码：表示-0
     *
     * 原码：即代表最高位表示符号位。
     * 反码：及原码除最高位其余位取反。
     *      规定：正数的反码与原码相同，负数的反码是除去原码的符号位，其余位取反。
     * 补码：主要为了解决 +0 和 -0的问题，只需要存在0即可。
     *      规定：正数的补码是其本身，负数的补码为其反码加一
     *
     * char 与 unsigned char 的区别：
     *  默认 unsigned char 为无符号，值是0000 0000 至 1111 1111之间，即在0-255之间，
     *  char 代表有符号，最高位代表正负，0 即为正数，1 即为负数；所以char的取值范围应当在-127 至 127。
     *  但通常书上均提有char的取值范围应当在-128 - 127之间， 那-128怎么来的呢？由此引申出奇葩为。
     *
     * 再学习下计算的数据存储形式，计算机内部是以2进制进行存储数值，无符号整数会用全部为来存储，有符号的整数，最高位当做符号位 ，其余为表示数值，这样貌似合理， 却带来一个麻烦。当执行加发运算时
     *   0000 0001      1
     * + 0000 0001      1
     * ------------
     *   0000 0010      2    执行正常
     *
     *
     *  当执行减法运算时，1-1的执行过程：计算机在执行 -1 时，会默认转换为1+(-1)
     *    0000 0001        1
     *  + 1000 0001       -1
     *  ------------
     *    1000 0010       -2   执行异常
     *
     *  1-1 = -2？明显不属于正常运算结果，由此引申出反码，我们再看看通过反码来运算：
     *  -1 的反码：1111 1110
     *    0000 0001        1
     *  + 1111 1110       -1反码
     *  ------------
     *    1111 1111
     *
     *  再转换为原码：1000 0000，即-0。于是解决了减法运算的问题。但是反过头来看0的原码： 0000 0000的十进制为+0，现在产生了+0， -0,两个0，实际上值均为0。
     *
     *  为了解决+0，-0的问题，又引申出补码，我们再看看通过补码来运算：
     *  -1 的补码：1111 1111
     *    0000 0001        1
     *  + 1111 1111       -1补码
     *  ------------
     *  1 0000 0000
     *  char最多存储8位，该运算结果会自动丢弃最高位，即结果为 0000 0000 = 0，运算正常。
     *
     *  https://blog.csdn.net/u011424682/article/details/77963748
     */


    public static void main(String[] args) {
        char fristchar = "123".charAt(0);
        System.out.println(fristchar);
    }
}
