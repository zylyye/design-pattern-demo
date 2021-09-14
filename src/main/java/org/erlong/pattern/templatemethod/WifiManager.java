package org.erlong.pattern.templatemethod;

public class WifiManager extends InternetManager {
    @Override
    public boolean hasPassword() {
        return true;
    }

    @Override
    public String getConnectPoint() {
        return "AP001";
    }

    @Override
    public String readPassword() {
        return "12345678";
    }

    @Override
    public void connect(String connectPoint, String password) {
        System.out.println("connect to AP001 identified by 12345678");
    }
}
