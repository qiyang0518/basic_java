package com.threadUse;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
//1、当一个类继承了Thread类,该类就可以当作线程使用
//2、重写run方法,自定义业务逻辑
//3、run Thread类实现了Runnable接口的run方法
public class ThreadUse01
{
    public static void main(String[] args) throws InterruptedException
    {
        //.start(),默认执行一次.run(),如果直接调用run(),则只是单线程
        new Cat().start();
        System.out.println("主线程继续执行\t" + Thread.currentThread().getName());
        for(int i = 0;i < 8;i++)
        {
            System.out.println("主线程执行次数" + i);
            Thread.sleep(1000);
        }
    }
}
@SuppressWarnings({"all"})
class Cat extends Thread
{
    @Override
    //重写run方法,写上自己的业务逻辑
    public void run()
    {
        int times = 0;
        while(true)
        {
            System.out.println("小猫喵喵叫~");
            //线程休眠1s
            times++;
            try
            {
                Thread.sleep(100);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            if(times == 5)
            {
                break;
            }
        }

    }
}