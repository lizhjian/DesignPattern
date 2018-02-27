package com.iterator;

/**
 * 迭代器模式  使用内部类实现 将Object加入到list中  在内部类中操作list
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMyAggregate concreteMyAggregate = new ConcreteMyAggregate();
        concreteMyAggregate.addObject("aa");
        concreteMyAggregate.addObject("bb");
        concreteMyAggregate.addObject("cc");
        concreteMyAggregate.addObject("dd");
        MyIterator iterator = concreteMyAggregate.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
