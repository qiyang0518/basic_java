package com.threadUse;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThreadUse04
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread1 = new Thread(new Process1());
        Thread thread2 = new Thread(new Process2());
        thread1.start();
        thread2.join(1000 * 5);
        thread2.start();

    }
}

@SuppressWarnings({"all"})
class Process1 extends Thread
{
    @Override
    public void run()
    {
        int num = 1;
        while(true)
        {
            System.out.println("hi" + num++);
            try
            {
                Thread.sleep(1000);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            if(num == 10)
            {
                System.out.println("Process1停止执行,Process2执行ing");
                break;
            }

        }
    }
}

@SuppressWarnings({"all"})
class Process2 implements Runnable
{
    @Override
    public void run()
    {
        int num = 0;
        while(true)
        {
            try
            {
                Thread.sleep(1000);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Hello World" + num++);
            if(num == 10)
            {
                break;
            }
        }
    }
}
