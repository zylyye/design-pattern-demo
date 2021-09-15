package org.erlong.pattern.command;

// 命令接收者
public class ReceiverWorker {

    public void arriveCompanyInTime() {
        System.out.println("arrive company at 11 o'clock");
    }

    public void openComputerPolitely() {
        System.out.println("wire up the modern computer, push the power on button rudely.");
    }

    public void closeComputerEasily() {
        System.out.println("unplug the power directly!");
    }

    public void leaveCompanyUnWilling() {
        System.out.println("pick up bag and leave company's door, singing the modern song~");
    }
}
