package com.command;
/*
命令的调用者和发起者
 */
public class Invoke {
    //一条命令
    private  Command command;
    public Invoke(Command command) {
        this.command = command;
    }
    public void call(){
        //父类引用指向子类实例
        command.execute();
    }


}
