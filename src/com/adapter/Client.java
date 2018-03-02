package com.adapter;
//适配器模型
/**
 * 客户端类
 * (相当于笔记本)
 */

public class Client {
    public void test1(Target target){
        target.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
//        Target t= new Adapter();
        Target t = new Adapter2(adaptee);
        client.test1(t);
    }
}
