package com.biwin.basics.dynamiclanguage;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;

/**
 * @Description 执行JavaScript脚本语言，但是在执行双精度的加减乘除会出现精度丢失问题
 *      所以如果利用JavaScript执行脚本语言时，尽量避免执行双精度的算术运算
 * @auther wangli
 * @create 2019-09-17 14:34
 */
public class JavaScriptEngine {

    private static final ScriptEngineManager scriptEngineManager = new ScriptEngineManager();

    private static final ScriptEngine engine;

    static {
        engine = scriptEngineManager.getEngineByName("JavaScript");
    }

    public static String calculateShell(String expression) throws ScriptException {
        return engine.eval(expression).toString();
    }

    public static void main(String[] args) throws ScriptException {
        System.out.println(calculateShell("3-2"));
        System.out.println(calculateShell("30-2"));
        //双精度 的算术运算会存在精度丢失问题
        System.out.println(calculateShell("3-2.99"));
        System.out.println(calculateShell("30-5.99"));

        boolean conditionResult = (boolean) engine.eval("6.80 >=2");
        System.out.println(conditionResult);
    }

}
