package com.chainOfResp;

/**
 * 封装请假的基本信息
 */
public class LeaveRequest {
    private String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getLeaveDDays() {
        return leaveDDays;
    }

    public void setLeaveDDays(int leaveDDays) {
        this.leaveDDays = leaveDDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    private int leaveDDays;
    private String reason;

    public LeaveRequest(String empName, int leaveDDays, String reason) {
        this.empName = empName;
        this.leaveDDays = leaveDDays;
        this.reason = reason;
    }

}
