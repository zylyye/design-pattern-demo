package org.erlong.pattern.mediator;

// 中介者 Mediator
public class ChatRoom {

    public void showMessage(User user, String msg) {
        System.out.println(user.getName() + ": " + msg);
    }

}
