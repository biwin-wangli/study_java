package com.biwin.designpattern.creattionalpattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 深克隆示例
 *      这样就完成了深度拷贝，两种对象互为独立，属于单独对象。
 * @auther wangli
 * @create 2019-09-29 10:09
 */
public class Person implements Cloneable {
    private String name;
    private String sex;
    private List<String> list;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }
    //可能会抛出不支持克隆异常，原因是没有实现Cloneable接口
    @Override
    protected Person clone(){
        try{
            Person person = (Person) super.clone();
            List<String> newList = new ArrayList();

            for(String str : this.list){
                newList.add(str);
            }
            person.setList(newList);
            return person;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
