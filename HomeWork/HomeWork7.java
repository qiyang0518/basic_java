package com.HomeWork;
/**
 * @author 齐阳
 * @version 1.0
 */
public class HomeWork7
{
    public static void main(String[] args)
    {
        MobileCar mobileCar = new MobileCar(60);
        mobileCar.getAir().flow();
        MobileCar mobileCar1 = new MobileCar(-1);
        mobileCar1.getAir().flow();
    }
}

class MobileCar             //汽车类
{
    private double temperature;     //私有属性温度

    public MobileCar(double temperature)        //构造器
    {
        this.temperature = temperature;
    }

    class Air               //成员内部类Air
    {
        public  void flow()     //内部类方法flow,根据汽车内温度控制空调的功能
        {
            if(temperature > 40.00)     //当车内温度大于40°,空调开启制冷功能
            {System.out.println("制冷功能开启~");}
            else if(temperature < 0.00)     //当车内温度小于0°,空调制热功能开启
            {
                System.out.println("制热功能开启~");
            }
            else            //当车内温度介于0°-40°之间,关闭空调
            {
                System.out.println("温度正常,空调已关闭~");
            }
        }

    }

    public Air getAir()     //获取内部类方法
    {
        return new Air();       //返回内部类Air()
    }
}