package org.erlong.pattern.observer;

import java.util.List;

public interface Subject {

    // 注册观察者
    void registerObserver(Observer observer);

    // 移除观察者
    void removeObserver(Observer observer);

    // 触发通知所有观察者
    void notifyAllObserver();
}
