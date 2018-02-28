package com.command;

/**
 * 命令模式
 */

public interface Command {
    void execute();
}
//命令实现类
//中间量
class ConcreteCommand implements  Command{
    private  Receiver receiver;//命令的真正执行者

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
