package com.generics;
import com.set.HashSet_;

import java.util.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic02
{
    public static void main(String[] args)
    {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("小明",12));
        hashSet.add(new Student("王洋",19));
        hashSet.add(new Student("西域",16));
        for(Student student :hashSet)
        {
            System.out.println(student);
        }

        System.out.println("================HashMap===========");
        HashMap<String,Student> hashMap = new HashMap<String,Student>();
        hashMap.put("小明",new Student("小明",12));
        hashMap.put("王洋",new Student("王洋",19));
        hashMap.put("西域",new Student("西域",16));
        Set<Map.Entry<String,Student>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String,Student>> iterator = entries.iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String,Student> entry = iterator.next();
            System.out.println(entry);
        }
    }
}

class Student
{
    private String name;
    private int age;

    public Student(String name,int age)
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
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}