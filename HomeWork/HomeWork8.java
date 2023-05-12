package com.HomeWork;
/**
 * @author 齐阳
 * @version 1.0
 */
public class HomeWork8
{
    public static void main(String[] args)
    {
        Colour green = Colour.GREEN;
        green.show();
        switch(green)
        {
            case YELLOW:
                System.out.println("匹配到黄色~");
                break;
            case GREEN:
                System.out.println("匹配到绿色~");
                break;
            case RED:
                System.out.println("匹配到红色~");
                break;
            case BLUE:
                System.out.println("匹配到蓝色~");
                break;
            default:
                System.out.println("未匹配对应颜色~");
        }
    }
}

interface ImyInterface
{
    public void show();
}

enum Colour implements ImyInterface
{
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Colour(int redValue,int greenValue,int blueValue)
    {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public void show()
    {
        System.out.println("属性值为:" + redValue + "," + greenValue + "," + blueValue);
    }

}
