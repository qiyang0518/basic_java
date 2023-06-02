package com.tank.tankGame_02;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class EnemyTank extends Tank
{

    int num = 3;

    /**
    public void TankNum(int num)
    {
        num = getNum();
        for(int i = 0;i < num;i++)
        {

        }
    }*/
    public EnemyTank(int x,int y)
    {
        super(x,y);
    }

    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

}
