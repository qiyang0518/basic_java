package com.threadUse.ticket;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class SellTicket
{
    public static void main(String[] args)
    {
        //存在问题:if语句被穿透
        SellTicket01 sellTicket01 = new SellTicket01();
        Thread thread1 = new Thread(sellTicket01);
        Thread thread2 = new Thread(sellTicket01);
        Thread thread3 = new Thread(sellTicket01);
        //        Thread thread1 = new Thread(new SellTicket01());
        //        Thread thread2 = new Thread(new SellTicket01());
        //        Thread thread3 = new Thread(new SellTicket01());
        //        new Thread(sellTicket02).start();   //第一个线程
        //        new Thread(sellTicket02).start();   //第一个线程
        //        new Thread(sellTicket02).start();   // 第一个线程
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

@SuppressWarnings({"all"})
class SellTicket01 extends Thread
{
    private static int ticketNum = 100;

    public void sell()
    {

    }
    public synchronized void run()
    {
        while(true)
        {
            if(ticketNum <= 0)
            {
                System.out.println("售票结束...");
                break;
            }
            else
            {
                //休眠50ms
                try
                {
                    Thread.sleep(50);
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println("窗口:" + Thread.currentThread().getName() + "\t剩余票数:" + --ticketNum);
        }
    }
}

@SuppressWarnings({"all"})
class SellTicket02 implements Runnable
{
    private static int ticketNum = 100;

    public void run()
    {
        while(true)
        {
            if(ticketNum <= 0)
            {
                System.out.println("售票结束...");
                break;
            }
            else
            {
                //休眠50ms
                try
                {
                    Thread.sleep(50);
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println("窗口:" + Thread.currentThread().getName() + "\t剩余票数:" + --ticketNum);
        }
    }
}
