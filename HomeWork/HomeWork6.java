package com.HomeWork;
/**
 * @author 齐阳
 * @version 1.0
 */
//接口,饿汉式工厂模型
public class HomeWork6
{
    public static void main(String[] args)
    {
        Person person = new Person("唐僧",new Horse());
        person.common();//一般情况下
        person.passRiver();//过河情况下
        person.common();//一般情况下
        person.passRiver();//过河情况下
        person.passFireMountain();//过火焰山情况下

    }
}

interface Vehicles              //建立交通工具接口
{
    void work();                //内置方法
}

class Horse implements Vehicles     //Horse 实现Vehicles接口及内置方法
{
    public void work()
    {
        System.out.println("正在乘坐白龙马~");
    }
}

class Boat implements Vehicles      //Boat 实现Vehicles接口及内置方法
{
    public void work()
    {
        System.out.println("船只行驶中~");
    }
}

class Plane implements Vehicles
{
    public void work()
    {
        System.out.println("飞机正在飞行~");
    }
}

class Person                            //人物类
{
    private String name;                //人物名
    private Vehicles vehicles;          //私有vehicles接口

    public Person(String name,Vehicles vehicles)        //Person构造方法
    {
        this.name = name;               //指定人物名为name
        this.vehicles = vehicles;       //指定接口为vehicles
    }

    public void passRiver()             //设置过河方法(只能使用Vehicles = Boat)
    {
        if(!(vehicles instanceof Boat)) //判断不是船,且不为空
        {
            vehicles = VehiclesFactory.getBoat();       //不是船,且不为空,建立Boat

        }
        vehicles.work();                   //Boat运行中
    }

    public void common()                   //人物平常使用vehicles,默认为Horse
    {
        if(!(vehicles instanceof Horse))          //不为Horse,且不为空
        {
            vehicles = VehiclesFactory.getHorse();      //将vehicles设置Horse

        }
        vehicles.work();            //Horse接口工作中
    }

    public void passFireMountain()                   //人物平常使用vehicles,默认为Horse
    {
        if(!(vehicles instanceof Plane))          //不为Plane,且不为空
        {
            vehicles = VehiclesFactory.getPlane();      //将vehicles设置Plane

        }
        vehicles.work();            //Plane接口工作中
    }

}

class VehiclesFactory           //Vehicles接口工厂类
{
    private static Horse horse = new Horse();

    private VehiclesFactory() {};       //饿汉式工厂模型(在使用前建立工厂)

    public static Horse getHorse()      //公共静态返回Horse接口的getHorse方法()
    {
        return horse;         //返回Horse()类
    }

    public static Boat getBoat()        //公共静态返回Boat接口的getBoat方法()
    {
        return new Boat();          //返回Boat()
    }

    public static Plane getPlane()        //公共静态返回Plane接口的getPlane方法()
    {
        return new Plane();          //返回Plane()
    }

}