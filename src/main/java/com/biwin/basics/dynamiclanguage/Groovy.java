package com.biwin.basics.dynamiclanguage;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;

import java.io.IOException;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-17 14:34
 */
public class Groovy {

    private static final Binding binding = new Binding();

    /**
     * 普通运算表达式
     * 表达式一般为推导式，判断式等，不建议执行想关联的Groovy脚本
     * @param expression
     * @return
     */
    public static String calculateShell(String expression){
        GroovyShell shell = new GroovyShell(binding);
        return shell.evaluate(expression).toString();
    }

    /**
     * 可以结合GroovyScriptEngine执行多个关联的Groovy脚本
     * @param path
     * @param params
     * @throws IOException
     * @throws ResourceException
     * @throws ScriptException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void execGroovys(String path, int params) throws IOException, ResourceException, ScriptException, IllegalAccessException, InstantiationException {
        GroovyScriptEngine groovyScriptEngine = new GroovyScriptEngine(path);
        Class script = groovyScriptEngine.loadScriptByName("CycleDemo.groovy");
        Script instance = (Script) script.newInstance();
        instance.invokeMethod ("cycle",new Object[]{params});
    }

    public static void main(String[] args) throws ResourceException, InstantiationException, IllegalAccessException, ScriptException, IOException {
        System.out.println(calculateShell("3-2.99"));
        execGroovys("src\\main\\java\\com\\biwin\\basics\\dynamiclanguage", 100);
    }



}
