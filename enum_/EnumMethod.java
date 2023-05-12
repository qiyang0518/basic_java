package com.enum_;
/**
 * @author 齐阳
 * @version 1.0
 */
public class EnumMethod
{
    public static void main(String[] args)
    {

    }
}

enum Week
{
    Monday("星期一"),Tuesday("星期二"),Wednesday("星期三"),Thusday("星期四"),Friday("星期五"),Saturday("星期六"),Sunday("星期天");

    private String name;

    Week(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}