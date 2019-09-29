package com.biwin.designpattern.behavioralpattern.interpreter;

import java.util.Stack;

/**
 * @Description 运算表达式的执行器
 * @auther wangli
 * @create 2019-09-16 14:23
 */
public class EvaluatorTest {

    public float evaluate(String expression){
        Stack<Expression> stack = new Stack<>();
        float result = 0;
        for(String token : expression.split(" ")){
            if(isOperator(token)){
                Expression expr = null;
                if(token.equals("+")){
                    expr = stack.push(new Plus(stack.pop(), stack.pop()));
                }else if(token.equals("-")){
                    expr = stack.push(new Minus(stack.pop(), stack.pop()));
                }
                if(null != expr){
                    result = expr.interpret();
                    stack.push(new Number(result));
                }
            }
            if(isNumber(token)){
                stack.push(new Number(Float.parseFloat(token)));
            }
        }
        return result;
    }

    private boolean isNumber(String token){
        try{
            Float.parseFloat(token);
            return true;
        }catch (NumberFormatException nan){
            return false;
        }
    }

    private boolean isOperator(String token){
        if(token.equals("+") || token.equals("-")){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        EvaluatorTest eval = new EvaluatorTest();
        System.out.println(eval.evaluate("2 3 +"));
        System.out.println(eval.evaluate("4 3 -"));
        System.out.println(eval.evaluate("4 3 - 2 +"));
    }
}
