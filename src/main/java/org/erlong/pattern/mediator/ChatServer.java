package org.erlong.pattern.mediator;

public class ChatServer {

    public void pushMsg(User user, String msg) {
        System.out.println(String.format("push to server, user: %s, msg: %s", user.getName(), msg));
    }
}
