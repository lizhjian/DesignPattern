package com.builder;

/**
 * 装配者
 */

public class SxtAirShipDirector implements  AirShipDirector {
    //装配者要调用构建者
    private AirShipBuilder airShipBuilder;

    public SxtAirShipDirector(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = airShipBuilder.buildEngine();
        OrbitalModule orbitalModule = airShipBuilder.buildOrbitalModule();
        EscapeTower escapeTower = airShipBuilder.builderEscapeTower();
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);
        return ship;
    }
}
