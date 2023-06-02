package com.syn;
import java.util.Scanner;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork01
{
    public static void main(String[] args) throws InterruptedException
    {
        T t = new T();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(new T2(t));
        thread1.start();
        thread2.start();
    }
}
@SuppressWarnings({"all"})
class T extends Thread
{
    private static boolean loop = true;
    int times = 0;

    public boolean isLoop()
    {
        return loop;
    }

    public void setLoop(boolean loop)
    {
        this.loop = loop;
    }

    public int getTimes()
    {
        return times;
    }

    public void setTimes(int times)
    {
        this.times = times;
    }

    @Override
    public void run()
    {


        while(loop)
        {
            //            System.out.println("输出1-100的随机整数:" + (int)((Math.random() + 1) * 10) + "执行次数:" + times++);
            System.out.println("输出1-100的随机整数:" + (int) ((Math.random() * 100 + 1)));
            try
            {
                Thread.sleep(1000 * 5);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            /**
             if(times >= 100)
             {
             break;
             }
             */
        }
    }
}

@SuppressWarnings({"all"})
class T2 extends Thread
{
    private T t;

    public T2(T t)
    {
        this.t = t;
    }

    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("请在下方输入方Q:");
            String str = scanner.next();
            if(str.equals("Q"))
            {
                t.setLoop(false);
                System.out.println("T线程结束~");
                break;
            }
            try
            {
                Thread.sleep(50 * 2);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}