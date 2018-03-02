package com.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.bookTicket();
        proxy.collectMoney();
        proxy.signConctract();
        proxy.sing();
    }
}
