package com.strategy;

public class OldCustomerFewStrategy implements Strategy{
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("老用户打九折");
        return standardPrice*0.9;
    }
}
