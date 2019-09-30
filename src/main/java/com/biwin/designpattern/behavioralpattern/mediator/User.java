package com.biwin.designpattern.behavioralpattern.mediator;

/**
 * @Description  参与聊天的用户
 * @auther wangli
 * @create 2019-09-30 14:38
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    /**
     * 加入聊天室的用户发表言论时，交由聊天室进行显示
     */
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
