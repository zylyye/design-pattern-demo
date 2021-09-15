package org.erlong.pattern.command.impl;

import org.erlong.pattern.command.Command;
import org.erlong.pattern.command.ReceiverWorker;

public class CommandWorkOff implements Command {

    private ReceiverWorker worker;

    public CommandWorkOff(ReceiverWorker worker) {
        this.worker = worker;
    }

    @Override
    public void execute() {
        // 轻轻地关闭电脑
        worker.closeComputerEasily();
        // 不情愿地离开公司
        worker.leaveCompanyUnWilling();
    }
}
