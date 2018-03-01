package com.factorymethod;

/**
 * 工厂方法模式  每个对应的类都增加对应的工厂
 * 增加新的类就是扩展 不需要修改已有代码
 */
public interface CarFactory {
   Car  createCar();
}
