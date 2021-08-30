package org.erlong.pattern.bridge.impl;

import org.erlong.pattern.bridge.Transmission;

public class AutoTransmission implements Transmission {

    @Override
    public void gear() {
        System.out.println("auto");
    }

}
