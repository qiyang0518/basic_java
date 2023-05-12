package com.HomeWork;
/**
 * @author 齐阳
 * @version 1.0
 */
public class HomeWork2
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.shout();
        dog.shout();
    }
}

abstract class Animal
{
   public abstract void shout();
}

class Cat extends Animal
{
    public void shout()
    {
        System.out.println("猫会喵喵叫~");
    }
}

class Dog extends Animal
{
    public void shout()
    {
        System.out.println("狗会汪汪叫~");
    }
}
