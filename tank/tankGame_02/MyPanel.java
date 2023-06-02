package com.tank.tankGame_02;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})

//为了监听键盘事件,实现KeyListener
public class MyPanel extends JPanel implements KeyListener
{
    //定义坦克
    Hero hero = null;                       //创建我方坦克(hero继承了Tank)
    //定义敌方坦克,放入到Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankNum = 3;
    public MyPanel()                        //定义面板
    {
        //初始化坦克
        hero = new Hero(100,100);      //坦克的初始位置
        hero.setSpeed(10);                  //自定义坦克移动速率
        //初始化敌方坦克
        for(int i = 0;i < enemyTankNum;i++)
        {
            //创建敌方坦克对象,调用setDirection
            //将敌方坦克加入Vector
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1),0);
            enemyTank.setDirection(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Test
    public void paint(Graphics g)
    {
        super.paint(g);
        //填充矩形,颜色默认黑色
        g.fillRect(0,0,1000,750);
        //画坦克-封装方法
        //        drawTank(hero.getX(),hero.getY(),g,0,0);
        //        drawTank(hero.getX() + 80,hero.getY(),g,0,0);
        //        drawTank(hero.getX() + 160,hero.getY(),g,0,0);
        drawTank(hero.getX(),hero.getY() + 200,g,hero.getDirection(),1);

        //画出敌方坦克,遍历Vector
        for(int i = 0;i < enemyTanks.size();i++)
        {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirection(),0);
        }

    }

    public void drawEnemy() {}
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
        //根据坦克的方向,绘制对应方向的坦克
        //direction:表示方向,0(向上),1(向右),2(向下),3(向左)
        switch(direction)
        {
            case 0:     //方向向上
                g.fill3DRect(x,y,10,60,false);                      //坦克左臂
                g.fill3DRect(x + 30,y,10,60,false);              //坦克右臂
                g.fill3DRect(x + 10,y + 10,20,40,false);      //坦克矩形
                g.fillOval(x + 10,y + 20,20,20);                    //坦克圆形
                g.drawLine(x + 20,y + 30,x + 20,y);                        //坦克炮筒
                break;
            case 1:     //方向向右
                g.fill3DRect(x - 10,y + 10,60,10,false);       //坦克左臂
                g.fill3DRect(x - 10,y + 40,60,10,false);       //坦克右臂
                g.fill3DRect(x,y + 20,40,20,false);               //坦克矩形
                g.fillOval(x + 10,y + 20,20,20);                     //坦克圆形
                g.drawLine(x + 20,y + 30,x + 50,y + 30);                 //坦克炮筒
                break;
            case 2:     //方向向下
                g.fill3DRect(x,y,10,60,false);                      //坦克右臂
                g.fill3DRect(x + 30,y,10,60,false);              //坦克左臂
                g.fill3DRect(x + 10,y + 10,20,40,false);      //坦克矩形
                g.fillOval(x + 10,y + 20,20,20);                    //坦克圆形
                g.drawLine(x + 20,y + 30,x + 20,y + 60);                //坦克炮筒
                break;
            case 3:     //方向向左
                g.fill3DRect(x - 10,y + 10,60,10,false);       //坦克右臂
                g.fill3DRect(x - 10,y + 40,60,10,false);       //坦克左臂
                g.fill3DRect(x,y + 20,40,20,false);               //坦克矩形
                g.fillOval(x + 10,y + 20,20,20);                     //坦克圆形
                g.drawLine(x + 20,y + 30,x - 10,y + 30);                 //坦克炮筒
            default:
                System.out.println("暂时没有处理");
        }

    }

    @Override
    public void keyTyped(KeyEvent e)
    {

    }

    //处理WASD(坦克移动方向键)按下的情况
    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_W)
        {
            //按W键,方向向上
            hero.setDirection(0);
            hero.moveUp();
        }
        else if(e.getKeyCode() == KeyEvent.VK_D)
        {
            //按D键,方向向右
            hero.setDirection(1);
            hero.moveRight();
        }
        else if(e.getKeyCode() == KeyEvent.VK_S)
        {
            //按S键,方向向下
            hero.setDirection(2);
            hero.moveDown();
        }
        else if(e.getKeyCode() == KeyEvent.VK_A)
        {
            //按A键,方向向左
            hero.setDirection(3);
            hero.moveLeft();
        }
        //面板重绘
        this.repaint();
//        for(int i = 0;i < hero.getSpeed() * 2;i++)
//        {
//            this.repaint();
//        }

    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }

    public int getEnemyTankNum()
    {
        return enemyTankNum;
    }

    public void setEnemyTankNum(int enemyTankNum)
    {
        this.enemyTankNum = enemyTankNum;
    }
}
