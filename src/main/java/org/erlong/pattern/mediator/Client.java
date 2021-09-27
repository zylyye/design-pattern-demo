package org.erlong.pattern.mediator;

public class Client {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        ChatServer chatServer = new ChatServer();
        Mediator mediator = new Mediator(chatRoom, chatServer);
        User userA = new User("A", mediator);
        User userB = new User("B", mediator);
        userA.sendMsg("hello");
        userB.sendMsg("Hey");
    }

}
