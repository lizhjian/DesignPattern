package com.decorate;

public class Client {

    public  static  void  main(String[] args){
        //通过super进行功能追加
        Car car = new Car();
        car.move();
        System.out.println("增加功能，飞");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("增加功能，水中游");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
    }
}
