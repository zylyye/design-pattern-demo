package org.erlong.pattern.state.impl;

import org.erlong.pattern.state.Car;
import org.erlong.pattern.state.State;

// 引擎启动状态
public class EngineStartState implements State {

    private Car car;

    public EngineStartState(Car car) {
        this.car = car;
    }

    @Override
    public void startEngine() {
        System.out.println("engine is already started");
    }

    @Override
    public void engageGear() {
        System.out.println("engage gear successful");
        // 切换到已挂挡状态
        car.setState(car.getGearEngagedState());
    }

    @Override
    public void accelerate() {
        System.out.println("you should engage gear in advance");
    }

    @Override
    public void brake() {
        System.out.println("the car stopped successful");
        car.setState(car.getStoppedState());
    }

    @Override
    public void stopEngine() {
        System.out.println("engine stopped successful");
        car.setState(car.getEngineStopState());
    }
}
