package com.codeblock_;
public class codeblock02
{
    public static void main(String[] args)
    {
        System.out.println(AA.getName());
        System.out.println(AA.getName());
        AA aa = new AA();
    }
}
class AA
{
    private static String name;
    private int age;

    public AA()
    {
    }

    static
    {
        System.out.println("正在调用静态代码块~");
    }
    {
        System.out.println("普通代码块！");
    }
    public AA(int age)
    {
        this.age = age;
    }

    public static String getName()
    {
        return name;
    }

    public static void setName(String name)
    {
        AA.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}