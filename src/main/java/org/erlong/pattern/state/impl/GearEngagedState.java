package org.erlong.pattern.state.impl;

import org.erlong.pattern.state.Car;
import org.erlong.pattern.state.State;

public class GearEngagedState implements State {

    private Car car;

    public GearEngagedState(Car car) {
        this.car = car;
    }

    @Override
    public void startEngine() {
        System.out.println("the car's engine is started already!");
    }

    @Override
    public void engageGear() {
        System.out.println("okay, try again");
    }

    @Override
    public void accelerate() {
        System.out.println("running!");
        car.setState(car.getRunningState());
    }

    @Override
    public void brake() {
        System.out.println("the car is stopped already!");
        car.setState(car.getStoppedState());
    }

    @Override
    public void stopEngine() {
        System.out.println("ok, it's fine");
        car.setState(car.getEngineStopState());
    }
}
