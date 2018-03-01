package com.observer;

//实际游戏玩家的显示器
public class ObserverA implements Observer {
    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    //和目标对象的state保持一致  即当前玩家显示器显示的对象的血量
    private  int myState;

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

}
