package com.flyweight;

//享元类
public interface ChessFlyWeight {
    void setColor(String c);
    String getColor();
    void  display(Coordinate coordinate);
}

class ConcreateChess implements ChessFlyWeight {

    private String color;

    public ConcreateChess(String color) {
        super();
        this.color = color;
    }
    @Override
    public void setColor(String c){
        this.color = c;
    }
    public  String getColor(){
        return color;
    }
    public  void  display(Coordinate coordinate){
        System.out.println("棋子颜色"+color);
        System.out.println("位置"+ coordinate.getX()+"--"+coordinate.getY());
    }

}
