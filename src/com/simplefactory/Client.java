package com.simplefactory;

public class Client {
    public static void main(String[] args) {
        //原始模式要依赖很多资源
        /*Car c1 = new Audi();
        Car c2 = new Byd();
        c1.run();
        c2.run();*/

        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");

        c1.run();
        c2.run();


    }
}
