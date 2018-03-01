package com.abstractFactory;

import com.factorymethod.Car;

public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
