package com.generics.improve;
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
        //ArrayList<Dog>:表示存放至ArrayList中的数据类型为Dog,加入其它类型会报错
        //在遍历的时候可以直接取出Dog,并不会报错
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("大黄",2));
        arrayList.add(new Dog("旺财",3));
        arrayList.add(new Dog("小白",4));
//        arrayList.add(new Cat("招财",6));
        for(Dog dog :arrayList)
        {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext())
        {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}

@SuppressWarnings({"all"})
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


@SuppressWarnings({"all"})
class Cat
{
    private String name;
    private int age;

    public Cat(String name,int age)
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