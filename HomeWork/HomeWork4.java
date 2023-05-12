package com.HomeWork;
/**
 * @author 齐阳
 * @version 1.0
 */
//匿名内部类
//new ICalculator()
//        {
//@Override
//public String work(String a1,String a2)
//        {
//        return a1 + a2;
//        }
//        },"How"," are you?");
public class HomeWork4
{
    public static void main(String[] args)
    {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new ICalculator()
        {
            @Override
            public String work(String a1,String a2)
            {
                return a1 + a2;
            }
        },"How"," are you?");
    }
}

interface ICalculator
{
    public String work(String a1,String a2);
}

class Cellphone
{
    public void testWork(ICalculator iCalculator,String a1,String a2)
    {
        String result = iCalculator.work(a1,a2);
        System.out.println("返回值\n" + result);
    }
}
