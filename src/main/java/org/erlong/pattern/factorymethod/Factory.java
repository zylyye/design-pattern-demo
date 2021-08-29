package org.erlong.pattern.factorymethod;


public abstract class Factory {

    public abstract Product getProduct();

    public void doSth() {
        Product product = getProduct();
    }
}
