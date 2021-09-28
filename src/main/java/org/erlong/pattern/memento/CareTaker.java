package org.erlong.pattern.memento;

public class CareTaker {

    private Memento state;

    public void saveState(Memento state) {
        this.state = state;
    }

    public Memento retrieveState() {
        return this.state;
    }

}
