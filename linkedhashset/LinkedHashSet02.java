package com.linkedhashset;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author 齐阳
 * @version 1.0
 */
public class LinkedHashSet02
{
    public static void main(String[] args)
    {
        Car car = new Car(12200000,"本田");
        Car car2 = new Car(22200000,"奔驰");
        Car car3 = new Car(44200000,"玛莎拉蒂");
        Car car4 = new Car(44200000,"玛莎拉蒂");
        Set Set = new LinkedHashSet();
        Set.add(car);
        Set.add(car2);
        Set.add(car3);
        System.out.println(Set);
    }
}
class Car
{
    private double price;
    private String name;

    public Car(double price,String name)
    {
        this.price = price;
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return  price + "\t\t" + name;
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
    public boolean equals(Object o)
    {
        if(this == o)
        {return true;}
        if(o == null || getClass() != o.getClass())
        {return false;}
        Car car = (Car) o;
        return Double.compare(car.price,price) == 0 && Objects.equals(name,car.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(price,name);
    }
}