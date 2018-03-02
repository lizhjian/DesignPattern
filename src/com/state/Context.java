package com.state;

public class Context  {
    private State state;

   /* public Context(State state) {
        this.state = state;
    }*/

    public void setState(State s){
        System.out.println("修改状态");
        state =s;

        state.handle();

    }
}
