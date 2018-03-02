package com.prototype;

public class Client02 {
    public static void main(String[] args) {
        Sheep02 sheep01 = new Sheep02("多利羊","2007");

        System.out.println(sheep01.getSname());
        try{
            Sheep02 sheep02 = (Sheep02) sheep01.clone();
            sheep02.setSname("少利羊   ----");
            System.out.println(sheep02.getSname());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }



    }
}
