package com.codeblock_;
public class codeblock03
{
    public static void main(String[] args)
    {
        System.out.println(Person.a);
        System.out.println(Person.a);
    }
}
class Person
{
    public static int a;
    static
    {
        a = 100;
        System.out.println("静态代码块调用！");
    }
}
