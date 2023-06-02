package com.tank.tankGame_02;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Tank
{
    private int x;      //坦克横坐标
    private int y;      //坦克纵坐标
    private int direction;      //坦克方向0(上)1(右)2(下)3(左)
    int speed = 5;     //坦克移动速率

    //坦克向上右下左(speed移动速率)
    public void moveUp() { y -= speed;}

    public void moveRight() {x += speed;}

    public void moveDown() {y += speed;}

    public void moveLeft() {x -= speed;}

    public int getSpeed() {return speed;}

    public void setSpeed(int speed) {this.speed = speed;}

    public int getDirection() {return direction;}

    public void setDirection(int direction) {this.direction = direction;}

    public Tank(int x,int y)
    {this.x = x;this.y = y; }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}

