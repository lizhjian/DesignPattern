package com.chainOfResp;

public class Director extends Leader {
    public Director(String name) {
        //如果父类有无参的构造方法，可以不写，默认会自己调的，但如果父类没有无参的构造方法，
        // 必须手动调用一个有参的构造方法，否则报错
        super(name);

    }

    @Override
    public void setNextLeader(Leader nextLeader) {
        super.setNextLeader(nextLeader);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
          if(request.getLeaveDDays()<3){
              System.out.println("员工"+request.getEmpName()+"请假"+request.getLeaveDDays()+"理由"+request.getReason());
              System.out.println("主任"+this.name+"审批通过");
          }else{
              if(this.nextLeader!=null){
                  this.nextLeader.handleRequest(request);
              }
          }
    }
}
