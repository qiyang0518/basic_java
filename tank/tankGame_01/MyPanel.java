package com.tank.tankGame_01;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MyPanel extends JPanel
{
    //定义坦克
    Hero hero = null;

    public MyPanel()
    {
        //初始化坦克
        hero = new Hero(100,100);
    }

    @Test
    public void paint(Graphics g)
    {
        super.paint(g);
        //填充矩形,颜色默认黑色
        g.fillRect(0,0,1000,750);
        //画坦克-封装方法
        drawTank(hero.getX(),hero.getY(),g,0,0);
    }

    //编写方法,画坦克

    /**
     * @param x         坦克的左上角x坐标
     * @param y         坦克的左上角y坐标
     * @param g         画笔
     * @param direction 坦克方向
     * @param type      坦克类型
     */
    public void drawTank(int x,int y,Graphics g,int direction,int type)
    {
        switch(type)
        {
            case 0:    //我方坦克,向上
                g.setColor(Color.CYAN);
                break;
            case 1:    //敌方坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克的方向绘制坦克
        switch(direction)
        {
            case 0:
                g.fill3DRect(x,y,10,60,false);                      //坦克左臂
                g.fill3DRect(x + 30,y,10,60,false);              //坦克右臂
                g.fill3DRect(x + 10,y + 10,20,40,false);      //坦克矩形
                g.fillOval(x + 10,y + 20,20,20);                    //坦克圆形
                g.drawLine(x + 20,y + 30,x + 20,y);                        //坦克炮筒
        }

    }
}
