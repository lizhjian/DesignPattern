package com.abstractFactory;

public interface Engine {
    void run();
    void start();
}
//好发动机
class LuxuryEngine implements Engine{
    @Override
    public void run() {
        System.out.println("转的快");
    }

    @Override
    public void start() {
        System.out.println("启动快");
    }
}
//差发动机
class LowEngine implements Engine{
    @Override
    public void run() {
        System.out.println("转的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}
