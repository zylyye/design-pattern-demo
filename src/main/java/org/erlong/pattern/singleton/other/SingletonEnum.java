package org.erlong.pattern.singleton.other;

/**
 * 枚举实现的单例
 * 优点：枚举单例可以避免反射攻击、序列化攻击
 * 缺点：与饿汉式类似，实例化时机由虚拟机决定
 */
public enum SingletonEnum {

    // 枚举单例
    INSTANCE;

    public static void doSomething() {
        // do something here
    }
}
