package com.memento;

/**
 * 负责人类
 * 负责管理备忘录对象
 */
public class CareTake {
   private EmpMemento memento;

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
