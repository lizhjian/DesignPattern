package com.state;

public class BookState implements State{
    @Override
    public void handle() {
        System.out.println("已预定");
    }
}
