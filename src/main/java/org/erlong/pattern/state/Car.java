package org.erlong.pattern.state;

import org.erlong.pattern.state.impl.*;

public class Car {

    private State engineStartState;

    private State engineStopState;

    private State gearEngagedState;

    private State runningState;

    private State stoppedState;

    // 当前状态
    private State currentState;

    public Car() {
        engineStartState = new EngineStartState(this);
        engineStopState = new EngineStopState(this);
        gearEngagedState = new GearEngagedState(this);
        runningState = new RunningState(this);
        stoppedState = new StoppedState(this);
        // 初始状态是熄火状态
        currentState = engineStopState;
    }

    public State getEngineStartState() {
        return engineStartState;
    }

    public State getEngineStopState() {
        return engineStopState;
    }

    public State getGearEngagedState() {
        return gearEngagedState;
    }

    public State getRunningState() {
        return runningState;
    }

    public State getStoppedState() {
        return stoppedState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    // 点火
    public void startEngine() {
        this.currentState.startEngine();
    }

    // 挂挡
    public void engageGear() {
        this.currentState.engageGear();
    }

    // 加速
    public void accelerate() {
        this.currentState.accelerate();
    }

    // 刹车
    public void brake() {
        this.currentState.brake();
    }

    // 熄火
    public void stopEngine() {
        this.currentState.stopEngine();
    }
}
