package org.erlong.pattern.state;

public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        // 点火
        car.startEngine();
        // 加速测试
        car.accelerate();
        // 挂挡
        car.engageGear();
        // 加速
        car.accelerate();
        // 熄火测试
        car.stopEngine();
        // 刹车
        car.brake();
        // 熄火
        car.stopEngine();
    }

}
