package com.tank.tankGame_01;
import javax.swing.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TankGame_01 extends JFrame
{
    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args)
    {
        TankGame_01 tankGame01 = new TankGame_01();
    }
    public TankGame_01()
    {
        mp = new MyPanel();
        //游戏的绘图区域
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
