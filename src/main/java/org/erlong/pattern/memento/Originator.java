package org.erlong.pattern.memento;

public class Originator {

    private String state;

    public Memento createSnapshot() {
        return new Memento(this.state);
    }

    public void restoreFromSnapshot(Memento state) {
        this.setState(state.getState());
    }

    public void setState(String state) {
        this.state = state;
    }

    public void showState() {
        System.out.println("current state: " + this.state);
    }
}
