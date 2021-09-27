package org.erlong.pattern.mediator;

public class User {

    private String name;

    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void sendMsg(String msg) {
        this.mediator.sendMsg(this, msg);
    }
}
