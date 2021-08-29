package org.erlong.pattern.abstractfactory;

public class Consumer {

    public static void main(String[] args) {
        Computer computer = new MacComputer();
        computer.run();
    }
}
