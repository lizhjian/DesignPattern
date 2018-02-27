package com.decorate;

public interface ICar {
    //汽车能移动
    void move();
}

class Car implements ICar {
    @Override
   public void move(){
        System.out.println("陆地跑");
    }
}

//装饰器
class  SupCar implements ICar {
    private ICar car;
    public SupCar(ICar car){
        super();
        this.car = car;
    }
    @Override
    public void  move(){
        car.move();
    }
}

class  FlyCar extends SupCar {
    public FlyCar(ICar car){
        super(car);
    }
    public void  fly(){
        System.out.println("天上飞");
    }
    @Override
    public void move(){
        super.move();
        fly();
    }
}

class  WaterCar extends SupCar {
    public WaterCar(ICar car){
        super(car);
    }
    public void  swim(){
        System.out.println("手中游");
    }
    @Override
    public void move(){
        super.move();
        swim();
    }
}