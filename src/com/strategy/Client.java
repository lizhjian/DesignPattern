package com.strategy;

/**
 * 策略模式
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new OldCustomerFewStrategy();
        Context context = new Context(strategy);
        context.printPrice(998);
    }
}
