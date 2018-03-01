package com.singleton;

/**
 * 懒汉模式
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
