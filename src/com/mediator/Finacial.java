package com.mediator;

public class Finacial implements Department {
    private  Mediator mediator;

    public Finacial(Mediator mediator) {
        super();
        this.mediator = mediator;
        //将当前对象注册到中介
        mediator.reigster("finacial",this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，钱太多了怎么花");
    }

    @Override
    public void selfAction() {
        System.out.println("数钱");
    }
}
