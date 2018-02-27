package com.chainOfResp;

/**
 * 抽象类
 */
public abstract class Leader {
   protected String name;
   protected Leader nextLeader;//责任链后即对象

    public Leader(String name){
        super();
        this.name = name;
    }
    //设定责任链后继对象
    public void setNextLeader(Leader nextLeader){
       this.nextLeader = nextLeader;
    }
    //处理方法 抽象方法
    public abstract void  handleRequest(LeaveRequest request);

}
