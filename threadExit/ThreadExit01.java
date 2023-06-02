package com.threadExit;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ThreadExit01
{
    public static void main(String[] args) throws InterruptedException
    {
        T t1 = new T();
        Thread thread = new Thread(t1);
        thread.start();
        //main主线程控制T1线程终止
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello World");
        Thread.sleep(1000 * 60);
        if(t1.getCount() == 50)
        {
            System.out.println(t1.getCount());
            t1.setLoop(false);
        }
//        t1.setLoop(false);
        System.out.println("T1线程结束...");
    }
}

@SuppressWarnings({"all"})
class T extends Thread
{
    int count = 0;
    boolean loop = true;

    @Override
    public void run()
    {
        while(loop)
        {
            try
            {
                Thread.sleep(50);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("T运行中..." + count++);
        }
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public boolean isLoop()
    {
        return loop;
    }

    public void setLoop(boolean loop)
    {
        this.loop = loop;
    }
}
