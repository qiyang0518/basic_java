package com.generics;
import org.junit.jupiter.api.Test;

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
    }
    @Test
    public void TestList()
    {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("001",new User(1,19,"小明"));
        userDAO.save("002",new User(2,20,"小王"));
        userDAO.save("003",new User(3,23,"小俞"));
        List<User> list = userDAO.list();
        System.out.println(list);
        userDAO.delete("001");
        System.out.println("======删除001======");
        list  = userDAO.list();
        System.out.println(list);
    }

}

@SuppressWarnings({"all"})
class DAO<T>          //创建DAO类,规定T泛型
{
    private Map<String,T> map = new HashMap<>();            //创建私有属性Map,键值对泛型<键:String,值:T泛型>,编译类型Map,运行类型HashMap

    public DAO()                   //无参构造器
    {}

    public DAO(Map<String,T> map)       //有参构造器
    {
        this.map = map;
    }

    public void save(String id,T entity)            //将传入的元素规定id,和指定泛型存入Map
    {
        map.put(id,entity);             //调用map的put方法存入元素信息
    }

    public T get(String id)             //根据id获取对应元素,规定获取T类型元素
    {
        return map.get(id);
    }

    public void update(String id,T entity)          //对元素进行更新,指定id,和元素
    {
        map.put(id,entity);
    }

    public List<T> list()               //遍历元素,并将元素传入至列表
    {
        //方法一:
        //        return (List)map.values();
        //方法二:
        List<T> list = new ArrayList<>();           //创建列表,用于存入各元素
        Set<String> keySet = map.keySet();          //获取所有的元素索引值集合
        for(String key : keySet)                    //根据索引值获取对应元素,并将元素传入至列表中
        {
            list.add(get(key));
        }
        return list;                                //返回列表
    }

    public void delete(String id)                   //删除操作
    {
        map.remove(id);
    }
}

@SuppressWarnings({"all"})
class User                                          //创建用户类
{
    private int id;                                 //id属性
    private int age;                                //年龄属性
    private String name;                            //姓名属性

    public User(int id,int age,String name)         //有参构造器
    {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
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

    @Override
    public String toString()
    {
        return "id=" + id + "\tage=" + age + "\tname=" + name;
    }
}

