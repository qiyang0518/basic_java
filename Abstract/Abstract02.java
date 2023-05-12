package com.Abstract;
public class Abstract02
{

}
abstract class Employee
{
    private String name;
    private int no;
    private double salary;

    public Employee(String name,int no,double salary)
    {
        this.name = name;
        this.no = no;
        this.salary = salary;
    }
    public abstract void work();
}
class  Manager extends Employee
{
    private double bonus;

    public Manager(String name,int no,double salary,double bonus)
    {
        super(name,no,salary);
        this.bonus = bonus;
    }

    @Override
    public void work()
    {
        System.out.println("经理工作中~");
    }
}
class CommonEmployee extends Employee
{
    public CommonEmployee(String name,int no,double salary)
    {
        super(name,no,salary);
    }

    @Override
    public void work()
    {
        System.out.println("普通员工工作中~");
    }
}
