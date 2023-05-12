package com.SingleDemo_;
public class singleDemo01
{
    public static void main(String[] args)
    {

    }
}
class GirlFriend
{
    private String name;
    private static GirlFriend gf = new GirlFriend("翠花");
    private GirlFriend(String name)
    {
        this.name = name;
    }
    public static GirlFriend getInstance()
    {
        return  gf;
    }
}
