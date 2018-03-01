package com.memento;

/**
 * 源发器类
 */
public class Emp {
   private String name;
    private int age;
    private double salary;

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //进行备份
    public EmpMemento memento(){
        return new EmpMemento(this);
    }
    //数据恢复。恢复成指定备忘录的值  传哪个恢复哪个
    public  void  revovery(EmpMemento empMemento){
        this.name = empMemento.getName();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();

    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}
