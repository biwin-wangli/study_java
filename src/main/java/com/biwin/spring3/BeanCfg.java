package com.biwin.spring3;

/**
 * @Description  Spring3.0 配置文件基础知识
 * @auther wangli
 * @create 2019-09-07 16:26
 */
public class BeanCfg {

    /**
     * Spring配置文件中 默认支持注入JavaBean，供容器进行管理
     *
     * 配置文件一般可以直接通过value和ref的形式为指定ID的bean注入其他对象或值。
     *
     * p命名空间：同样为装配属性
     * eg: <bean id="test" class="com.biwin.spring3.xxx"
     *          p:song="fighting"
     *          p:instrument-ref="saxophone"/>
     * p:song: p为spring的命名空间名， song为要为xxx类注入的属性名
     * p:instrument-ref: p同样为spring命名空间名， instrument-ref中的instrument为属性名，ref代表注入的是对象
     *
     * Bean 注入 集合的方式有一下几种：
     * <list></list>
     *      eg:<bean id="test" class="com.biwin.spring3.xxx">
     *              <property name="instrument">
     *                  <list>
     *                      <ref bean="a"/>
     *                      <ref bean="b"/>
     *                      <ref bean="c"/>
     *                  </list>
     *              </property>
     *         </bean>
     *
     * <set></set>
     *      eg:<bean id="test" class="com.biwin.spring3.xxx">
     *              <property name="instrument">
     *                  <set>
     *                      <ref bean="a"/>
     *                      <ref bean="b"/>
     *                      <ref bean="c"/>
     *                  </set>
     *              </property>
     *         </bean>
     *
     * <map></map>
     *       eg:<bean id="test" class="com.biwin.spring3.xxx">
     *               <property name="instrument">
     *                   <map>
     *                       <entry key="a" value-ref="a" />
     *                       <entry key="b" value-ref="b"/>
     *                       <entry key="c" value-ref="c"/>
     *                   </map>
     *               </property>
     *          </bean>
     *
     * <props></props>
     *      eg:<bean id="test" class="com.biwin.spring3.xxx">
     *               <property name="instrument">
     *                   <props>
     *                       <prop key="a">a</prop>
     *                       <prop key="b">b</prop>
     *                       <prop key="c">c</prop>
     *                   </props>
     *               </property>
     *          </bean>
     *
     * 如果需要装配空值：需要用<null/>来注明
     * eg: <property name="someNonNullProperty"><null/></property>
     *
     *
     * Spring的自动装配的4中类型
     * 1.byName:把与Bean的属性具有相同名字（或者ID）的其他Bean自动装配到Bean的对应属性中。如果没有跟属性的名字想匹配的Bean，则该属性不进行装配。
     * 2.byType:把与Bean的属性具有相同类型的其他Bean自动装配到Bean的对应属性中。如果没有跟属性的类型相匹配的Bean，则该属性不被装配。
     * 3.constructor:把与Bean的构造器入参具有相同类型的其他Bean自动装配到Bean构造器的对应入参中。
     * 4.autodetect:首先尝试先了解下如何使用属性的名字来自动装配Bean的属性。
     */
}
