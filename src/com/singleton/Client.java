package com.singleton;

public class Client {
    public static void main(String[] args) {
        System.out.println(SingletonDemo1.getInstance());
        System.out.println(SingletonDemo2.getInstance());
        System.out.println(SingletonDemo4.getInstance());
        System.out.println(SingletonDemo5.INSTANCE);
    }
}
