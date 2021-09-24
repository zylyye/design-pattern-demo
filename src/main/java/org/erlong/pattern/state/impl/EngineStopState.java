package org.erlong.pattern.state.impl;

import org.erlong.pattern.state.Car;
import org.erlong.pattern.state.State;

// 熄火状态
public class EngineStopState implements State {

    private Car car;

    public EngineStopState(Car car) {
        this.car = car;
    }

    @Override
    public void startEngine() {
        System.out.println("engine start successful");
        car.setState(car.getEngineStartState());
    }

    @Override
    public void engageGear() {
        System.out.println("the car is not started");
    }

    @Override
    public void accelerate() {
        System.out.println("nothing will happen");
    }

    @Override
    public void brake() {
        System.out.println("nothing will happen");
    }

    @Override
    public void stopEngine() {
        System.out.println("are you ok?");
    }
}
