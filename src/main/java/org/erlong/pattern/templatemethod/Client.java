package org.erlong.pattern.templatemethod;

public class Client {

    public static void main(String[] args) {
        // 以太网
        InternetManager eth = new EthManager();
        // wifi
        InternetManager wifi = new WifiManager();
        eth.startNetWork();
        wifi.startNetWork();
    }
}
