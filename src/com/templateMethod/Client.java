package com.templateMethod;

/**
 * 模板模式
 */

public class Client {
    public static void main(String[] args) {
         BankTemplateMethod bankTemplateMethod = new Drawmoney();
         bankTemplateMethod.process();
         //匿名内部类方法
        BankTemplateMethod bankTemplateMethod1 = new BankTemplateMethod() {
            @Override
            public void trasact() {
                System.out.println("存好多的钱");
            }
        };
        bankTemplateMethod1.process();
    }
}
//
class  Drawmoney  extends BankTemplateMethod{
    @Override
    public void trasact() {
        System.out.println("我要取款");
    }
}