package com.abstractFactory;

/**
 * 抽象工厂模式
 */
public class Client {
    public static void main(String[] args) {
        //好车工厂
        CarFactory factory = new LuxuryCarFactory();
        //好引擎
        Engine engine = factory.createEngine();
        engine.run();
        engine.start();
    }
}
