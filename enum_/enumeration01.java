package com.enum_;
/**
 * @author 齐阳
 * @version 1.0
 */
public class enumeration01
{
    public static void main(String[] args)
    {
        Season season = new Season("春天","1");
        Season season1 = new Season("夏天","2");
        Season season2 = new Season("秋天","3");
        Season season3 = new Season("冬天","4");
        System.out.println(season1.getName());
    }
}

class  Season
{
    private String name;
    private String desc;

    public Season(String name,String desc)
    {
        this.name = name;
        this.desc = desc;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }
}
