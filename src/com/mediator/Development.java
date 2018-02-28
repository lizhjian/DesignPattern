package com.mediator;

public class Development implements Department {
    private  Mediator mediator;

    public Development(Mediator mediator) {
        super();
        this.mediator = mediator;
        //将当前对象注册到中介
        mediator.reigster("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作");
    }
}
