package com.memento;

public class Client {
    public static void main(String[] args) {
        CareTake careTake = new CareTake();
        Emp emp = new Emp("李志坚",18,900);
        System.out.println("第一次打印"+emp.getName()+"----"+emp.getAge()+"---"+emp.getSalary());

        //emp.memento()是把emp赋值到匿名备忘录中  再把匿名备忘录设置到负责人中
        careTake.setMemento(emp.memento());  //做了一次备份
        emp.setAge(38);
        emp.setSalary(1000);
        emp.setName("小明");
        System.out.println("第二次打印"+emp.getName()+"----"+emp.getAge()+"---"+emp.getSalary());
        emp.revovery(careTake.getMemento());
        System.out.println("第三次打印"+emp.getName()+"----"+emp.getAge()+"---"+emp.getSalary());

    }
}
