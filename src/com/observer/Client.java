package com.observer;

/**
 * 观察者模式
 * 一个目标机
 * 4个从机
 * 主机更新状态后通知从机更新 从机更新自己的状态
 */
public class Client {
    public static void main(String[] args) {
        //目标对象 游戏机主
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //4个游戏玩家
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();
        ObserverA obs4 = new ObserverA();

        concreteSubject.registerObserver(obs1);
        concreteSubject.registerObserver(obs2);
        concreteSubject.registerObserver(obs3);
        concreteSubject.registerObserver(obs4);

        concreteSubject.setState(3000);
    }
}
