package org.erlong.pattern.singleton.eager;

/**
 * 饿汉式
 * 优点：初始化速度快，线程安全
 * 缺点：提前实例化占用资源
 */
public class SingletonEager {

    private static final Object instance = new Object();

    public static Object getInstance() {
        return instance;
    }
}
