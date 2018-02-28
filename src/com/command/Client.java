package com.command;

//命令模式
public class Client {
    public static void main(String[] args) {
        //中间量                         执行者
        Command c = new ConcreteCommand(new Receiver());
        //调用者
        Invoke i = new Invoke(c);
        i.call();
    }
}
