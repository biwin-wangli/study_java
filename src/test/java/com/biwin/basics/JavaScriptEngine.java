package com.biwin.basics;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-17 11:14
 */
public class JavaScriptEngine {

    public static void main(String[] args) throws ScriptException {
        String expr = "price - 2.99".replace("price", "3");
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        BigDecimal couponTotal = BigDecimal.ZERO;
//        System.out.println(engine.eval(expr));
        String result = engine.eval(expr).toString();
        System.out.println(result);
        couponTotal = new BigDecimal(result).setScale(2, BigDecimal.ROUND_HALF_EVEN);

        System.out.println(couponTotal);
    }
}
