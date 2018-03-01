package com.strategy;

public class NewCustomerFewStrategy implements Strategy{
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("普通用户不打折");
        return standardPrice*1;
    }
}
