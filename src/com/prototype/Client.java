package com.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep01 = new Sheep("多利羊","2007");

        System.out.println(sheep01.getSname());
        try{
            Sheep sheep02 = (Sheep) sheep01.clone();
            sheep02.setSname("多利羊   ----");
            System.out.println(sheep02.getSname());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }



    }
}
