package org.erlong.pattern.command;

// 请求者（命令下发者）
public class InvokerManager {

    private Command workOnCommand;

    private Command workOffCommand;

    public void setWorkOnCommand(Command workOnCommand) {
        this.workOnCommand = workOnCommand;
    }

    public void setWorkOffCommand(Command workOffCommand) {
        this.workOffCommand = workOffCommand;
    }

    // 开工啦
    public void workOn() {
        workOnCommand.execute();
    }

    // 下班啦
    public void workOff() {
        workOffCommand.execute();
    }
}
