package org.erlong.pattern.bridge.impl;

import org.erlong.pattern.bridge.Car;
import org.erlong.pattern.bridge.Transmission;

public class BenCar extends Car {

    private Transmission transmission;

    @Override
    public void run() {
        System.out.println("Ben");
    }

}
