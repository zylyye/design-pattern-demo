package org.erlong.pattern.observer.impl;

import org.erlong.pattern.observer.Observer;

// 观察者 - 湿度显示器
public class HumidityDisplay implements Observer {

    @Override
    public void onUpdate(double temperature, double humidity, double pressure) {
        System.out.println("current humidity: " + humidity);
    }
}
