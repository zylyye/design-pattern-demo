package org.erlong.pattern.observer;

import org.erlong.pattern.observer.impl.HumidityDisplay;
import org.erlong.pattern.observer.impl.PressureDisplay;
import org.erlong.pattern.observer.impl.TempDisplay;
import org.erlong.pattern.observer.impl.WeatherInspector;

public class Client {

    public static void main(String[] args) {
        WeatherInspector weatherInspector = new WeatherInspector();
        Observer tempDisplay = new TempDisplay();
        Observer humidityDisplay = new HumidityDisplay();
        Observer pressureDisplay = new PressureDisplay();
        // 注册观察者
        weatherInspector.registerObserver(tempDisplay);
        weatherInspector.registerObserver(humidityDisplay);
        weatherInspector.registerObserver(pressureDisplay);
        // 更新 subject 状态
        weatherInspector.set(36D, 10D, 13D);
    }

}
