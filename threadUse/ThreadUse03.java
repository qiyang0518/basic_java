package com.threadUse;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThreadUse03
{
    public static void main(String[] args)
    {
        Thread thread1 = new Thread(new T1());
        thread1.start();
        Thread threa2 = new Thread(new T2());
        threa2.start();
    }
}
@SuppressWarnings({"all"})
class T1 implements Runnable
{

    int count = 0;

    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Hello" + count++ + Thread.currentThread().getName());
            try
            {
                Thread.sleep(1000);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            if(count == 70)
            {
                break;
            }
        }

    }
}

@SuppressWarnings({"all"})
class T2 implements Runnable
{

    int count = 0;

    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("\tWorld" + count++ + Thread.currentThread().getName());
            try
            {
                Thread.sleep(1000);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            if(count == 70)
            {
                break;
            }
        }

    }
}
