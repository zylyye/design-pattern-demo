package org.erlong.pattern.singleton.lazy;

/**
 * 懒汉式
 * 优点：延迟加载，节约资源
 * 缺点：线程不安全
 */
public class SingletonLazy {

    private static Object instance;

    public static Object getInstance() {
        if (instance == null) {
            instance = new Object();
        }
        return instance;
    }
}
