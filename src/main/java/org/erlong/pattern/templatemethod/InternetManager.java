package org.erlong.pattern.templatemethod;

public abstract class InternetManager {

    // 是否需要密码
    public abstract boolean hasPassword();

    // 确定连接点
    public abstract String getConnectPoint();

    // 读取连接密码
    public abstract String readPassword();

    // 连接网络
    public abstract void connect(String connectPoint, String password);

    // 开启网络
    public void startNetWork() {
        String password = null;
        // 连接需要密码时，读取密码
        if (hasPassword()) {
            password = readPassword();
        }
        // 连接点
        String connectPoint = getConnectPoint();
        // 开始连接网络
        connect(connectPoint, password);
    }
}
