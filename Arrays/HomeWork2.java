package com.Arrays;
import java.util.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork2
{
    public static void main(String[] args)
    {
        Map map = new HashMap();
        map.put("jack",650);
        map.put("jack",1200);
        map.put("smith",2900);
        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {

            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("=======toString========");
        map.put("jack",2600);
        Set set = map.keySet();
        for(Object key : set)
        {
            map.put(key,(Integer)map.get(key) + 100);
        }
        System.out.println(map);
        System.out.println("========遍历=======");
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while(iterator1.hasNext())
        {
            Map.Entry next = (Map.Entry)iterator1.next();
            System.out.println(next);
        }
        System.out.println("=======遍历所有工资=======");
        Collection values = map.values();
        for(Object value : values)
        {
            System.out.println("工资为:" + value);

        }

    }
}

class employee
{
    private String name;
    private double sal;

    public employee(String name,double sal)
    {
        this.name = name;
        this.sal = sal;
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

    @Override
    public String toString()
    {
        return "name=" + name + "\t\tsal=" + sal ;
    }
}