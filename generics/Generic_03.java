package com.generics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic_03
{
    public static void main(String[] args)
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("小明",20000,new MyDate(2000,9,21)));
        employees.add(new Employee("小王",9000,new MyDate(2005,1,13)));
        employees.add(new Employee("汪洋",190000,new MyDate(1999,11,28)));
        employees.add(new Employee("汪洋",190000,new MyDate(1990,11,28)));
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext())
        {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
        System.out.println("===========进行排序========");
        employees.sort(new Comparator<Employee>()
        {
            @Override
            public int compare(Employee o1,Employee o2)
            {
                if(!(o1 instanceof Employee && o2 instanceof Employee))
                {
                    return 0;
                }
                if(o1.getName() == o2.getName())
                {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
                else
                {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        System.out.println(employees);
    }
}

@SuppressWarnings({"all"})
class Employee
{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name,double sal,MyDate birthday)
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

    public double getSal()
    {
        return sal;
    }

    public void setSal(double sal)
    {
        this.sal = sal;
    }

    public MyDate getBirthday()
    {
        return birthday;
    }

    public void setBirthday(MyDate birthday)
    {
        this.birthday = birthday;
    }

    @Override
    public String toString()
    {
        return "Employee: " + "name=" + name + "\t\tsal=" + sal + "\t\t\tbirthday=" + birthday + "\n";
    }
}

@SuppressWarnings({"all"})
class MyDate implements Comparable<MyDate>
{
    private int year;
    private int month;
    private int day;

    public MyDate(int year,int month,int day)
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
        return year + "-" + month + "-" + day;
    }

    @Override
    public int compareTo(MyDate o)
    {
        if(year > ((o.getYear())))
        {
            return o.getYear() - year;
        }
        else if(year < (o.getYear()))
        {
            return year - o.getYear();
        }
        else
        {
            if(month > o.getMonth())
            {
                return month - o.getMonth();
            }
            else if(month < o.getMonth())
            {
                return -(month - o.getMonth());
            }
            else
            {
                if(day > o.getDay())
                {
                    return day - o.getDay();
                }
                else if(day < o.getDay())
                {
                    return -(day - o.getDay());
                }
                else
                {
                    return 0;
                }
            }
        }
    }
}
