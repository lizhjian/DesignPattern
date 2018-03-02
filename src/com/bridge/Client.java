package com.bridge;

/**
 * 桥接模式
 * 组合的方式
 * Laptop2(xxx)  xxx为具体型号品牌
 */
public class Client {
    public static void main(String[] args) {
        Computer2 computer2 = new Laptop2(new Lenovo());
        computer2.sale();
    }
}
