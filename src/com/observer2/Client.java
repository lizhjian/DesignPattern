package com.observer2;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //创建观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();
        ObserverA obs4 = new ObserverA();
        ObserverA obs5 = new ObserverA();
        //将观察者添加到同期里面
        concreteSubject.addObserver(obs1);
        concreteSubject.addObserver(obs2);
        concreteSubject.addObserver(obs3);
        concreteSubject.addObserver(obs4);
        concreteSubject.addObserver(obs5);
        //改变目标状态
        concreteSubject.setState(3000);
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
        System.out.println(obs4.getMyState());
        System.out.println(obs5.getMyState());
        concreteSubject.setState(1000);
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
        System.out.println(obs4.getMyState());
        System.out.println(obs5.getMyState());
    }
}
