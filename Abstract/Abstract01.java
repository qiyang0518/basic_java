package com.Abstract;
public class Abstract01
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("大黄");
        dog.eat();

    }
}

abstract class Animal
{
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public abstract void eat();
}
class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }

    public void eat()
    {
        System.out.println(getName() + "在啃骨头" );
    }
}