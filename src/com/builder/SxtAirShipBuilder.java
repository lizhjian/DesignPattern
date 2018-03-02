package com.builder;

/**
 * 某型号飞船
 */

public class SxtAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine buildEngine() {
        System.out.println("构建自主发动机");
        return new Engine("自主发动机");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建自主轨道舱");
        return new OrbitalModule("自主轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建自主逃逸塔");
        return new EscapeTower("自主逃逸塔");
    }
}
