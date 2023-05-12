package com.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
public class Collection_
{
    public static void main(String[] args)
    {
        @SuppressWarnings({"all"})
        List arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        List al = new ArrayList();

        al.add(new Dog("大黄",2));
        al.add(new Dog("旺财",3));
        al.add(new Dog("小白",4));
        for(Object dog : al)                //Object:创建的对象      al:存放对象的列表
        {
            System.out.println(dog);
        }
        System.out.println("使用iterator迭代器的遍历");
        Iterator iterator = al.iterator();          //al自带迭代器iterator
        while(iterator.hasNext())
        {
            Object dog =  iterator.next();
            System.out.println(dog);
        }

    }
}
class  Dog
{
    private String name;
    private int age;

    public Dog(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return  "name=" + name +" age=" + age;
    }
}
