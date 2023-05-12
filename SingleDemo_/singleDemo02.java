package com.SingleDemo_;
public class singleDemo02
{
    public static void main(String[] args)
    {

    }
}

class Cat
{
    private String name;
    private static Cat cat;

    private Cat(String name)
    {
        this.name = name;
    }
    public static Cat getInstance()
    {
        if (cat == null)
        {
            cat = new Cat("花花");
        }
        return cat;
    }
}
