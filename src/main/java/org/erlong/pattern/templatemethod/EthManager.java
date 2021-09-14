package org.erlong.pattern.templatemethod;

public class EthManager extends InternetManager{

    @Override
    public boolean hasPassword() {
        return false;
    }

    @Override
    public String getConnectPoint() {
        return "eth0";
    }

    @Override
    public String readPassword() {
        return null;
    }

    @Override
    public void connect(String connectPoint, String password) {
        System.out.println("connect to eth0 with DHCP");
    }
}
