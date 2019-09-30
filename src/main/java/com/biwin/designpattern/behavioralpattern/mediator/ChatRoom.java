package com.biwin.designpattern.behavioralpattern.mediator;

import java.util.Date;

/**
 * @Description 聊天室，相当与一个中介者
 * @auther wangli
 * @create 2019-09-30 14:37
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }

}
