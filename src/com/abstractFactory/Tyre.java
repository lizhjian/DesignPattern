package com.abstractFactory;

public interface Tyre {
   void revolve();
}
class LuxuryTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("不易磨损");
    }
}
class LowTyre implements Tyre{
    @Override
    public void revolve() {
        System.out.println("易磨损");
    }
}
