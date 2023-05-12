package com.set;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author 齐阳
 * @version 1.0
 */
public class HashSet05
{
    public static void main(String[] args)
    {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee1("milan",1800,new MyDate1(2000,10,22)));
        hashSet.add(new Employee1("smith",1800,new MyDate1(2000,10,22)));
        hashSet.add(new Employee1("milan",1800,new MyDate1(2000,10,20)));
        for(Object o : hashSet)
        {
            System.out.println(o);
        }
    }
}

class Employee1
{
    private String name;
    private int sal;
    private MyDate1 birthday;

    public Employee1(String name,int sal,MyDate1 birthday)
    {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSal()
    {
        return sal;
    }

    public void setSal(int sal)
    {
        this.sal = sal;
    }

    public MyDate1 getBirthday()
    {
        return birthday;
    }

    public void setBirthday(MyDate1 birthday)
    {
        this.birthday = birthday;
    }

    @Override
    public String toString()
    {
        return "Employee1{" + "name='" + name + '\'' + ", sal=" + sal + ", birthday=" + birthday + '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {return true;}
        if(o == null || getClass() != o.getClass())
        {return false;}
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name,employee1.name) && Objects.equals(birthday,employee1.birthday);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name,birthday);
    }
}

class MyDate1
{
    private int year;
    private int month;
    private int day;

    public MyDate1(int year,int month,int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    @Override
    public String toString()
    {
        return "MyDate{" + "year=" + year + ", month=" + month + ", day=" + day + '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {return true;}
        if(o == null || getClass() != o.getClass())
        {return false;}
        MyDate1 myDate1 = (MyDate1) o;
        return year == myDate1.year && month == myDate1.month && day == myDate1.day;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(year,month,day);
    }
}

