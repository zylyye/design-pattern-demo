package org.erlong.pattern.strategy;

public class Seller {

    private Costable type;

    public Seller(Costable type) {
        this.type = type;
    }

    public double buy(int num) {
        return type.cost(num);
    }
}
