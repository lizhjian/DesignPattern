package com.singleton;

/**
 * 静态内部类  只有真正用的时候才加载内部类,是懒加载  而且线程安全
 */
public class SingletonDemo4 {


    private  static  class SingletonClassInstance{
        private static  final  SingletonDemo4 instance = new SingletonDemo4();
    }

    private  static  SingletonDemo4 instance = new SingletonDemo4();

    private SingletonDemo4() {

    }

    public static  SingletonDemo4 getInstance(){
        return SingletonClassInstance.instance;
    }

}
