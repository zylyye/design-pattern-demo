package org.erlong.pattern.observer.impl;

import org.erlong.pattern.observer.Observer;
import org.erlong.pattern.observer.Subject;

import java.util.ArrayList;
import java.util.List;

// 主题(Subject) - 天气监测站
public class WeatherInspector implements Subject {

    List<Observer> observers = new ArrayList<>();

    // 温度
    private double temperature;

    // 湿度
    private double humidity;

    // 压力
    private double pressure;

    public void set(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 通知所有观察者更新
        notifyAllObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        observers.forEach(o -> o.onUpdate(temperature, humidity, pressure));
    }
}
