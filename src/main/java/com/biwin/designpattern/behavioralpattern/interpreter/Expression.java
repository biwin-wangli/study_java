package com.biwin.designpattern.behavioralpattern.interpreter;
import java.text.Normalizer;
import java.text.Format;
/**
 * @Description 运算表达式接口
 * @auther wangli
 * @create 2019-09-16 14:19
 */
public interface Expression {

    public float interpret();
}
