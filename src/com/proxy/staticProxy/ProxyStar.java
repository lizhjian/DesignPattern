package com.proxy.staticProxy;

public class ProxyStar implements Star {
    private  Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("代理面谈");
    }

    @Override
    public void signConctract() {
        System.out.println("代理签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("代理订票");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("代理收钱");
    }
}
