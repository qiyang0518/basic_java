package com.Exception;

/**
 * @author 齐阳
 * @version 1.0
 */
public class exception1
{
    public static void main(String[] args)
    {
        try
        {
            AAA aaa = new AAA();
            aaa.A1();
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class AAA
{
    public int a = 0;
    public int b = 10;

    public void A1()
    {
        System.out.println("a=" + b / a);
    }
}