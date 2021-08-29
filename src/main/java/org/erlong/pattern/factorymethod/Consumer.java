package org.erlong.pattern.factorymethod;

import org.erlong.pattern.factorymethod.impl.FactoryImpl;

public class Consumer {

    public static void main(String[] args) {
        FactoryImpl factory = new FactoryImpl();
        factory.doSth();
    }

}
