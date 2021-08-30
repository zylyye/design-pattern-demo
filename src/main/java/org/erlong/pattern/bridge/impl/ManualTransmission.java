package org.erlong.pattern.bridge.impl;

import org.erlong.pattern.bridge.Transmission;

public class ManualTransmission implements Transmission {
    @Override
    public void gear() {
        System.out.println("manual");
    }
}
