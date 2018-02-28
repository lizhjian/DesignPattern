package com.mediator;

//中间者
public interface Mediator {

    void reigster(String dname ,Department d);

    void  command(String dname);

}
