package com.generics;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generi_04
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.fly("飞机",100);
        car.run();
    }
}

@SuppressWarnings({"all"})
class Car
{
    public <T,R> void run()
    {
    }

    public <T,R> void fly(T t,R r)
    {

    }
}


