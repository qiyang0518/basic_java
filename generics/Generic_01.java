package com.generics;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic_01
{
    public static void main(String[] args)
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("大黄",2));
        arrayList.add(new Dog("旺财",3));
        arrayList.add(new Dog("小白",4));
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext())
        {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

class Dog
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
        return "Dog{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}