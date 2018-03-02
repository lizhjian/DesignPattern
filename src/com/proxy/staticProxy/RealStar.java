package com.proxy.staticProxy;

public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("真实面谈");
    }

    @Override
    public void signConctract() {
        System.out.println("真实签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("真实订票");
    }

    @Override
    public void sing() {
        System.out.println("真实唱歌");
    }

    @Override
    public void collectMoney() {
        System.out.println("真实收钱");
    }
}
