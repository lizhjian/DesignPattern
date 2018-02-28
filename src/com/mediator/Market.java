package com.mediator;

public class Market implements Department {
    private  Mediator mediator;

    public Market(Mediator mediator) {
        super();
        this.mediator = mediator;
        //将当前对象注册到中介
        mediator.reigster("market",this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，项目承接的进度，需要资金支持");
        mediator.command("finacial");
    }

    @Override
    public void selfAction() {
        System.out.println("出去跑项目");
    }
}
