package com.biwin.spring3;

/**
 * @Description Spring3.0 SpEL(Spring Expression Language)
 *      SpEL是一种强大、简洁的装配Bean的方式，它通过运行期执行的表达式将值转配到Bean的属性和构造器参数中。
 * @auther wangli
 * @create 2019-09-07 16:42
 */
public class SpEL {
    /**
     * SpEL拥有许多特性，包括：
     * 1.使用Bean的ID来引用Bean；
     * 2.调用方法和访问对象的属性；
     * 3.对值进行算术、关系和逻辑运算；
     * 4.正则表达式匹配；
     * 5.集合操作。
     *
     * 使用方式：“#{}”
     *  eg: #{5}, #{'String'}, #{false}, #{Object.property}, #{Object.method()}
     *  Object为bean的Id，property是Object的属性，Method()是Object的方法。
     *
     *  如何判断Object是否为空？ 使用“?.”
     *  eg: #{Object?.property}
     *
     *  如何引用常量或静态方法？ 使用“T()”
     *  eg: #{T(java.lang.Math).PI}、#{T(java.lang.Math).random()}
     *
     * ****************************************
     *  使用SpEL进行算术运算：
     *  运算符类型       运算符                                                    示例
     *  算术运算         +(可以数字加，也可以文字加)、-、*、/、%(求余)、^(乘方)      #{1 + 1}
     *  关系运算         <、>、==、<=、>=、lt、gt、eq、le、ge                      #{1 > 2}
     *  逻辑运算         and、or、not/!(取反)、|                                  #{1 and 2}
     *  条件运算         ?:(ternary)、?:(Elvis)                                  #{1 == 1 ? 1: 0}
     *  正则表达式       matches                                                 #{email matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]*\\.com'}
     * ****************************************
     *
     *
     * SpEL集合筛选：
     * 首先需要使用<util:list>配置一个对象的集合，如下：
     * <util:list id="cities">
     *     <bean class="com.biwin.spring3.city" p:name="chengdu" p:population="610000"/>
     *     <bean class="com.biwin.spring3.city" p:name="mianyang" p:population="611000"/>
     *     <bean class="com.biwin.spring3.city" p:name="santai" p:population="611100"/>
     * </util:list>
     *
     * <util:properties>可以在Spring中加载properties配置文件，如下：
     * <util:properties id="settings" location="classpath:settings.properties"/>
     * 除了使用properties访问声明集合中的属性，Spring还为SpEL创造了两种特殊的选择属性的方式：systemEnvironment和systemProperties。
     * #{systemEnvironment['HOME']}
     *
     *
     * 1.访问集合成员，使用“[]”
     * #{cities[2]}、#{cities['chengdu']}
     *
     * 2.查询集合成员，使用“.?[]”,类似增加过滤条件；使用“.^[]”，从集合中查询出第一个匹配项；使用".$[]"，从集合中查询出最后一个匹配项。
     * #{cities.?[population gt 1000000]}
     *
     * 3.投影集合，大致意思为比如基于上面的Cities集合，生成一个只有成名名称的集合。使用“.![]”。
     * #{cities.![name]}、#{cities.![name + ',' + state]}
     *
     * 4.可以对集合进行查询和投影运算。
     * #{cities.?[population gt 100000].![name + ',' + state]}
     */
}
