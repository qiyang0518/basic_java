package com.tank;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Draw01 extends JFrame
{
    private MyPanel mp = null;

    public static void main(String[] args)
    {
        Draw01 draw01 = new Draw01();
    }

    public Draw01()
    {
        //初始化面板
        mp = new MyPanel();
        //把面板添加到窗口
        this.add(mp);
        //设置面板大小
        this.setSize(400,300);
        //点击窗口×,程序退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置面板是否可视化
        this.setVisible(true);
    }
}
@SuppressWarnings({"all"})
class MyPanel extends JPanel
{
    @Test
    public void paint(Graphics g)
    {
        super.paint(g);
        //g.drawOval(10,10,100,100);
        //画直线
        //g.drawLine(10,10,100,100);
        //填充颜色
        //g.setColor(Color.BLUE);
        //画矩形
        //g.fillRect(10,10,100,100);
        //画圆
        //g.fillOval(10,10,100,100);
        //画图片
        //1、获取图片
        /**
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/pic.jpg"));
        g.drawImage(image,10,10,1080,608,this);
         */
        /**
        //画字符串
        g.setColor(Color.CYAN);
        g.setFont(new Font("楷书",Font.BOLD,50));
        //设置的100，100为字符串的左下角
        g.drawString("北京欢迎你",100,100);
         */
        //坦克模型
        int x = 100;
        int y = 10;
        g.setColor(Color.CYAN);
        g.fillRect(x,y,10,60);    //左臂
        g.fillRect(x + 10,y + 10,20,40);        //身体
        g.fillRect(x + 30,y,10,60);         //右臂
        g.fillRect(x + 19,y ,2,30);        //坦克臂
        g.setColor(Color.blue);
        g.fillOval(x + 10,y + 20,20,20);
    }
}
