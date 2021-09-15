package org.erlong.pattern.command;

import org.erlong.pattern.command.impl.CommandWorkOff;
import org.erlong.pattern.command.impl.CommandWorkOn;

public class ClientBoss {

    public static void main(String[] args) {
        // 录用一个打工人
        ReceiverWorker worker = new ReceiverWorker();
        // 教会上下班两种操作
        Command workOnCommand = new CommandWorkOn(worker);
        Command workOffCommand = new CommandWorkOff(worker);
        // 分配给小头头
        InvokerManager manager = new InvokerManager();
        manager.setWorkOnCommand(workOnCommand);
        manager.setWorkOffCommand(workOffCommand);
        // 开工
        manager.workOn();
        // 下班
        manager.workOff();
    }
}
