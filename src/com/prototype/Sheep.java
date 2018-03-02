package com.prototype;

/**
 * 原型模式
 */
public class Sheep  implements Cloneable{

    private String sname;
    private String birthday;

    //重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用object对象的调用方法
        Object object = super.clone();

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

    public Sheep(String sname, String birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
