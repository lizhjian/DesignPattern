package com.chainOfResp;

public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void setNextLeader(Leader nextLeader) {
        super.setNextLeader(nextLeader);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDDays()<10){
            System.out.println("员工"+request.getEmpName()+"请假"+request.getLeaveDDays()+"理由"+request.getReason());
            System.out.println("经理"+this.name+"审批通过");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.handleRequest(request);
            }
        }
    }
}
