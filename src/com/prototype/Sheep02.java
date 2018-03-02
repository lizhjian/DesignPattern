package com.prototype;

/**
 * 原型模式（深复制）
 */
public class Sheep02 implements Cloneable{

    private String sname;
    private String birthday;

    //重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用object对象的调用方法
        Object object = super.clone();



        //添加如下代码实现深复制
        Sheep02 sheep = (Sheep02)object;
      //  sheep.birthday =this.birthday.clone();

        return object;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getBirthday() {
        return birthday;
    }

    public Sheep02(String sname, String birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
