package org.erlong.pattern.singleton.lazy;

/**
 * 懒汉式，双重检查
 * 优点：懒加载，线程安全，同步开销小
 * 缺点：实现稍繁琐
 */
public class SingletonLazyDoubleCheck {

    private volatile static Object instance;

    public static Object getInstance() {
        if (instance == null) {
            // 初始化时才加锁检查，避免第一次重复初始化
            synchronized (SingletonLazyDoubleCheck.class) {
                if (instance == null) {
                    instance = new Object();
                }
            }
        }
        return instance;
    }
}
