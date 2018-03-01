package com.observer;

public class ConcreteSubject extends  Subject{

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //某一个玩家的血了变化了通知所有观察者
        this.notifyAllObservers();
    }

    //血量
    private int state;


}
