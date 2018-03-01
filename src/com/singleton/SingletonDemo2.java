package com.singleton;

/**
 * 懒汉模式  资料利用效率高 但是调用效率低 多线程调用时要等待
 */
public class SingletonDemo2 {

    private  static  SingletonDemo2 singletonDemo2 =null;

    private SingletonDemo2() {
    }
    public static synchronized  SingletonDemo2 getInstance(){
        if(singletonDemo2==null){
            singletonDemo2= new SingletonDemo2();
        }
        return  singletonDemo2;
    }
}
