package com.threadUse;
/**
 * @author 齐阳
 * @version 1.0
 * 通过实现Runnable实践线程
 */
@SuppressWarnings({"all"})
public class ThreadUse02
{
    public static void main(String[] args)
    {
        //使用了静态代理(设计模式)
        Thread thread = new Thread(new Dog());
        thread.start();

    }
}
@SuppressWarnings({"all"})
class Dog implements Runnable
{
    int count = 0;
    public void run()
    {
        while(true)
        {
            count++;
            System.out.println("小狗旺旺叫~" + count + Thread.currentThread().getName());
            try
            {
                Thread.sleep(100);
            } catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            if(count == 10)
            {
                break;
            }
        }
    }
}