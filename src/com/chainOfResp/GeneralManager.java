package com.chainOfResp;

public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void setNextLeader(Leader nextLeader) {
        super.setNextLeader(nextLeader);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDDays()<30){
            System.out.println("员工"+request.getEmpName()+"请假"+request.getLeaveDDays()+"理由"+request.getReason());
            System.out.println("总经理"+this.name+"审批通过");
        }else{
            System.out.println("莫非这个人想辞职，请假这么多天");
        }
    }
}
