package org.erlong.pattern.command.impl;

import org.erlong.pattern.command.Command;
import org.erlong.pattern.command.ReceiverWorker;

public class CommandWorkOn implements Command {

    private ReceiverWorker worker;

    public CommandWorkOn(ReceiverWorker worker) {
        this.worker = worker;
    }

    @Override
    public void execute() {
        // 准时到达公司
        worker.arriveCompanyInTime();
        // 礼貌乖巧地打开电脑
        worker.openComputerPolitely();
    }
}
