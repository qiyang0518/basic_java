package com.hashmap;
import java.util.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork01
{
    public static void main(String[] args)
    {
        Map Map = new HashMap();
        Map.put(1,new Employee("张三",10000,1));
        Map.put(3,new Employee("赵六",30000,3));
        Map.put(2,new Employee("李四",20000,2));

        System.out.println(Map);
        System.out.println("========使用keySet的迭代器,跟对应的key输出对象信息========");
        Set keyset = Map.keySet();                      //先将所有元素的key值放到keyset集合中
        Iterator iterator = keyset.iterator();          //keyset本质是Set类,可以使用迭代器进行遍历
        while(iterator.hasNext())
        {

            Employee e = (Employee) iterator.next();              //对迭代器进行递增

            if(e.getSal() > 18000)
            {
                System.out.println(e);           //根据对应的key值输出相应对象的信息

            }
        }

        System.out.println("======keySet使用增强循环,Map.get(key)转型比较输出对象信息======");
        for(Object key : keyset)                //再通过对应的Key值取出相应的values
        {
            Employee e = (Employee) Map.get(key);                               //Map.get(key)获取用Object存放Employee类的对象,再将找到的Object向下转型为Employee
            if(e.getSal() > 18000)
            {
                System.out.println(e.toString());
            }

        }
        System.out.println("======使用Map存储器Entryset,在对Entry进行转型,转为Employee======");
        Set entrySet = Map.entrySet();                              //将Map的存储器取出,在对存储器进行遍历.
        for(Object entry : entrySet)
        {
            Employee e = (Employee) (((Map.Entry) entry).getValue());                               //将存储器转为单个存储单元(Entry),在对存储单元提取value值,
            //并对value进行向下转型(Employee类型),比较Employee的sal值
            if(e.getSal() > 18000)
            {
                //                System.out.println("工资大于18000人员信息如下:");
                System.out.println(e.toString());
            }
            //            else
            //            {
            //                System.out.println("工资小于18000人员信息如下:");
            //                System.out.println(e.toString());
            //            }

        }
        System.out.println("========工资大于18000======");
        Collection values = Map.values();                   //获取所有对象的value值,并收集至Collection中
        for(Object value : values)                         //使用增强for对Collection进行遍历
        {
            Employee e = (Employee) value;                  //将value转成Employee类型,value是Object类，此时values为Collection类,是所有Employee的集合
            if(e.getSal() > 18000)
            {
                System.out.println(e.toString());
            }
        }
        System.out.println("======5======");
        Iterator iterator1 = Map.values().iterator();
        //        Collection values1 = (Collection) iterator1;
        while(iterator1.hasNext())
        {
            Object obj = iterator1.next();
            Employee e = (Employee) obj;
            if(e.getSal() > 18000)
            {
                System.out.println(e.toString());
            }

        }


    }
}
@SuppressWarnings({"all"})
class Employee
{
    private String name;
    private double sal;
    private int id;

    public Employee(String name,double sal,int id)
    {
        this.name = name;
        this.sal = sal;
        this.id = id;
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

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return name + "\t\t" + sal + "\t\t" + id;
    }
}
