package com.HomeWork;
/**
 * @author 齐阳
 * @version 1.0
 */
public class HomeWork1
{
    public static void main(String[] args)
    {
        Car car = new Car();            //-9    red
        Car car1 = new Car(100);    //100    red
        System.out.println(car);
        System.out.println(car1);
    }
}
class Car
{
    double price = 10;
    static String color = "white";
    public String toString()
    {
        return price + "\t" + color;
    }
    public Car()
    {
        this.price = -9;
        this.color = "red";
    }
    public Car(double price)
    {
        this.price = price;
    }
}