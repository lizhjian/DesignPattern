package com.adapter;

/**
 * 使用组合  与被适配对象
 */

public class Adapter2 implements Target {

    private  Adaptee adaptee;
    @Override
    public void handleReq() {
        adaptee.request();
    }

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
