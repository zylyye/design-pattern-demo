package org.erlong.pattern.bridge;

// 汽车
public abstract class Car {

    private Transmission transmission;

    public abstract void run();

    // 设置变速箱（自动/手动）
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

}
