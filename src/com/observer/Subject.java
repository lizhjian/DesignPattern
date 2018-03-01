package com.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * 容器 存放观察者对象
 */
//主题对象/目标对象
public class Subject {
    protected List<Observer> list = new ArrayList<Observer>();

    public  void  registerObserver(Observer obs){
        list.add(obs);
    }
    public void removeObserver(Observer obs){
        list.add(obs);
    }

    //通知所有观察者更新状态  把observer理解为游戏玩家的显示器
    public void notifyAllObservers(){
        for (Observer observer:list){
            observer.update(this);
        }
    }
}
