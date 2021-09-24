package org.erlong.pattern.state.impl;

import org.erlong.pattern.state.Car;
import org.erlong.pattern.state.State;

public class RunningState implements State {

    private Car car;

    public RunningState(Car car) {
        this.car = car;
    }

    @Override
    public void startEngine() {
        System.out.println("what happened?");
    }

    @Override
    public void engageGear() {
        System.out.println("I am running...");
    }

    @Override
    public void accelerate() {
        System.out.println("fine");
    }

    @Override
    public void brake() {
        System.out.println("the car will stopped as you like");
        car.setState(car.getStoppedState());
    }

    @Override
    public void stopEngine() {
        System.out.println("please stop the car first");
    }
}
