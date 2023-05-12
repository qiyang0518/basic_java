package com.set;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet03
{
    public static void main(String[] args)
    {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("张三",23));
        hashSet.add(new Employee("李四",42));
        hashSet.add(new Employee("张三",23));
        System.out.println(hashSet);
    }
}
@SuppressWarnings({"all"})
class Employee
{
    private String name;
    private int age;

    public Employee(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {return true;}
        if(o == null || getClass() != o.getClass())
        {return false;}
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name,employee.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name,age);
    }

    @Override
    public String toString()
    {
        return "name=" + name + "\t\tage=" + age ;
    }
}