package org.erlong.pattern.mediator;

// 中介者 mediator，负责调用 chatRoom 与 chatServer
public class Mediator {

    private ChatRoom chatRoom;

    private ChatServer chatServer;

    public Mediator(ChatRoom chatRoom, ChatServer chatServer) {
        this.chatRoom = chatRoom;
        this.chatServer = chatServer;
    }

    public void sendMsg(User user, String msg) {
        // 上传至服务器
        chatServer.pushMsg(user, msg);
        // 在聊天室展示
        chatRoom.showMessage(user, msg);
    }
}
