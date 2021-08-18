package org.erlong.pattern.singleton.lazy;

/**
 * 懒汉式
 * 优点：延迟加载节约资源，线程安全
 * 缺点：整个方法加锁，同步开销大，性能低
 */
public class SingletonLazyThreadSafe {

    private static Object instance;

    public static synchronized Object getInstance() {
        if (instance == null) {
            instance = new Object();
        }
        return instance;
    }

}
