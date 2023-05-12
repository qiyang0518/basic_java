package com.HomeWork;
/**
 * @author 齐阳
 * @version 1.0
 */
public class Frock
{
    private int serialNumber;
    private static int currentNum = 100000;
    public static int getNextNum()
    {
        currentNum += 100;
        return currentNum;
    }

    public Frock()
    {
        serialNumber = getNextNum();
    }

    public Frock(int currentNum)
    {
        this.currentNum = getNextNum();
    }

    public int getSerialNumber()
    {
        return serialNumber;
    }

}
class TestFrock
{
    public static void main(String[] args)
    {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock2.getNextNum());
    }
}