package com.strategy;

/**
 * 用来管理算法
 * 负责和具体的策略交互
 */
public class Context {
    private  Strategy strategy; //当前采用的算法
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
   //可以通过set方法注入
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public  void printPrice(double s){
        System.out.println("您该报价" +strategy.getPrice(s));
    }
}
