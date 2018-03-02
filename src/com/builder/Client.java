package com.builder;

/**
 * 建造者模式
 */
public class Client {
    public static void main(String[] args) {

        AirShipDirector airShipDirector = new SxtAirShipDirector(new SxtAirShipBuilder());
        //装配者调用方法生成飞船
       AirShip airShip = airShipDirector.directAirShip();
        System.out.println(airShip.getEngine().getName());
    }
}
