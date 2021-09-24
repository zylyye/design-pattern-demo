package org.erlong.pattern.state.impl;

import org.erlong.pattern.state.Car;
import org.erlong.pattern.state.State;

public class StoppedState implements State {

    private Car car;

    public StoppedState(Car car) {
        this.car = car;
    }

    @Override
    public void startEngine() {
        System.out.println("I am started already");
    }

    @Override
    public void engageGear() {
        System.out.println("I am engaged gear already");
    }

    @Override
    public void accelerate() {
        System.out.println("go go go");
        car.setState(car.getRunningState());
    }

    @Override
    public void brake() {
        System.out.println("I will not do that cause I am not running");
    }

    @Override
    public void stopEngine() {
        System.out.println("I will do that as soon as I can");
        car.setState(car.getEngineStopState());
    }
}
