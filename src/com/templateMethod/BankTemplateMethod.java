package com.templateMethod;

public abstract class BankTemplateMethod {
    public  void takeNumber(){
        System.out.println("取号排队");
    }
    //办理业务
    public  abstract void trasact();

    public void evaluate(){
        System.out.println("反馈评分");
    }
    //模板方法
    public final void process(){
         this.takeNumber();
         this.trasact();
    }
}
