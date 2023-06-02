package com.event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BallMove extends JFrame
{
    MyPanel mp = null;

    public static void main(String[] args)
    {
        BallMove ballMove = new BallMove();
    }

    public BallMove()
    {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        //窗口JFram对象可以监听键盘事件:可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
@SuppressWarnings({"all"})
//面板,画小球
//KeyListener:监听器,监听键盘事件
class MyPanel extends JPanel implements KeyListener
{
    //为了让小球可以移动,把左上角的坐标设置成变量
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        //默认黑色
        g.fillOval(x,y,20,20);
    }

    //有字符输出,方法被触发
    @Override
    public void keyTyped(KeyEvent e)
    {

    }


    //按键,方法被触发
    @Override
    public void keyPressed(KeyEvent e)
    {
        //根据用户按下的不同键,来处理小球的移动(上下左右)
        //键盘的每一个键对应着一个键值
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {y++;}          //向下移动    KeyEvent.VK_DOWN向下得箭头对应的code
        else if(e.getKeyCode() == KeyEvent.VK_UP) {y--;}       //向上移动
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {x++;}    //向右移动
        else if(e.getKeyCode() == KeyEvent.VK_LEFT) {x--;}     //向左移动
        /**
         * 斜向移动(未实现)
         else if(e.getKeyCode() == KeyEvent.VK_DOWN && e.getKeyCode() == KeyEvent.VK_RIGHT) {x++;y++;}   //下右移动
         else if(e.getKeyCode() == KeyEvent.VK_DOWN && e.getKeyCode() == KeyEvent.VK_LEFT) {x--;y++;}    //下左移动
         else if(e.getKeyCode() == KeyEvent.VK_DOWN && e.getKeyCode() == KeyEvent.VK_RIGHT) {x--;y--;}   //上左移动
         else if(e.getKeyCode() == KeyEvent.VK_DOWN && e.getKeyCode() == KeyEvent.VK_RIGHT) {x++;y--;}   //上右移动
         */
        //面板重绘
        this.repaint();
    }

    //松键,方法被触发
    @Override
    public void keyReleased(KeyEvent e)
    {

    }
}