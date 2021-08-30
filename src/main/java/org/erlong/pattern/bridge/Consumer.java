package org.erlong.pattern.bridge;

import org.erlong.pattern.bridge.impl.AutoTransmission;
import org.erlong.pattern.bridge.impl.BenCar;

public class Consumer {

    public static void main(String[] args) {
        Car benAutoCar = new BenCar();
        // 自动挡的 Ben 汽车
        benAutoCar.setTransmission(new AutoTransmission());
    }

}
