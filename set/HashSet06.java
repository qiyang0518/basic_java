package com.set;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author 齐阳
 * @version 1.0
 */
public class HashSet06
{
    public static void main(String[] args)
    {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee2("张三",5000,new MyDate2(1999,1,8)));
        hashSet.add(new Employee2("李四",9000,new MyDate2(2004,6,12)));
        hashSet.add(new Employee2("张三",5000,new MyDate2(1999,1,8)));
        System.out.print(hashSet);
    }
}

class Employee2
{
    private String name;
    private int sal;
    private MyDate2 birthday;

    public Employee2(String name,int sal,MyDate2 birthday)
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

    public MyDate2 getBirthday()
    {
        return birthday;
    }

    public void setBirthday(MyDate2 birthday)
    {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {return true;}
        if(o == null || getClass() != o.getClass())
        {return false;}
        Employee2 employee2 = (Employee2) o;
        return Objects.equals(name,employee2.name) && Objects.equals(birthday,employee2.birthday);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name,birthday);
    }

    @Override
    public String toString()
    {
        return "name:" + name + "\t\t" +  "sal:" + sal + "\t\tbirthday:" + birthday + "\n";
    }
}

class MyDate2
{
    private int year;
    private int month;
    private int day;

    public MyDate2(int year,int month,int day)
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
    public boolean equals(Object o)
    {
        if(this == o)
        {return true;}
        if(o == null || getClass() != o.getClass())
        {return false;}
        MyDate2 myDate2 = (MyDate2) o;
        return year == myDate2.year && month == myDate2.month && day == myDate2.day;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(year,month,day);
    }

    @Override
    public String toString()
    {
        return  year + "-" + month + "-" + day ;
    }
}