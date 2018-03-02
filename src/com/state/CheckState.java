package com.state;

public class CheckState implements State {
    @Override
    public void handle() {
        System.out.println("已预定");
    }
}
