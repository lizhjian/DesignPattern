package com.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFactory {
    //xiangyuanchi
    private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

    public static ChessFlyWeight getChess(String color){
        if(map.get(color)!=null){
            return  map.get(color);
        }else{
            ChessFlyWeight chessFlyWeight = new ConcreateChess(color);
            map.put(color,chessFlyWeight);
            return  chessFlyWeight;
        }
    }
}
