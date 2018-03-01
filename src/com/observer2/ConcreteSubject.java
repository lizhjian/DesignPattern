package com.observer2;

import java.util.Observable;
//目标对象状态
public class ConcreteSubject extends Observable {
   private int state;

    public int getState() {
        return state;
    }

    public void  setState(int s){
       //目标状态发生变化
       state  = s;
       //表示目标对象已经做了更改
       setChanged();
       //通知所有的观察者
       notifyObservers(state);
    }

}
