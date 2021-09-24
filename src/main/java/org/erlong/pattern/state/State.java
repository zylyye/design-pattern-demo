package org.erlong.pattern.state;

public interface State {

    // 启动引擎
    void startEngine();

    // 挂挡
    void engageGear();

    // 加速
    void accelerate();

    // 刹车
    void brake();

    // 关闭引擎
    void stopEngine();
}
