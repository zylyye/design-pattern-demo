package org.erlong.pattern.singleton.lazy;

/**
 * 懒汉式，静态内部类实现
 * 优点：懒加载，线程安全，实现简单
 */
public class SingletonInnerClass {

    // getInstance() 方法被调用时才会加载该类
    private static class SingletonHolder {
        private static final Object INSTANCE = new Object();
    }

    public static Object getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
