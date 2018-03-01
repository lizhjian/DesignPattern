package com.singleton;

/**
 * 单例模式 饿汉模式
 */
public class SingletonDemo1 {

    //初始化时就立即加载
    private static  SingletonDemo1 singletonDemo1 = new SingletonDemo1();

    //私有构造器
    private SingletonDemo1(){

    }
    //线程安全 不需要同步代码块
    public  static SingletonDemo1 getInstance(){
        return  singletonDemo1;
    }


}
