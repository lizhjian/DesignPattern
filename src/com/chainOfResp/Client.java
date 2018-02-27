package com.chainOfResp;

/*责任链模型*/
/*可以在客户端直接设置上下级关系。一级一级往下找*/
/*适用场景*/
public class Client {
    public static void main(String[] args) {

        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        //组织责任列表
        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假操作
        LeaveRequest leaveRequest = new LeaveRequest("TOM",9,"回英国");
        a.handleRequest(leaveRequest);
    }
}
