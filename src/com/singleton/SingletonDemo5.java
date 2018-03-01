package com.singleton;

/**
 * 枚举模式(没有懒加载模式)
 * 天然线程安全
 */
public enum  SingletonDemo5 {

    INSTANCE;
    //添加自己想要的操作
    public  void singletonOperation(){

    }

}
