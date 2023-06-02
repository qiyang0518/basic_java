package com.syn;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork02
{
    public static void main(String[] args)
    {
        Bank bank = new Bank();
        Person person1 = new Person(bank);
        Person person2 = new Person(bank);
        Thread thread1 = new Thread(person1);
        thread1.setName("小明");
        Thread thread2 = new Thread(person2);
        thread2.setName("小红");
        thread1.start();
        thread2.start();
    }
}

@SuppressWarnings({"all"})
class Bank
{
    private int deposit = 10000;
    boolean loop = true;
    int times = 0;

    public void withdraw()
    {
        while(loop)
        {
            synchronized(this)
            {
                if(this.getDeposit() < 1000)
                {
                    this.setLoop(false);
                    System.out.println("余额不足请充值");
                    break;
                }
                System.out.println("用户:" + Thread.currentThread().getName() + "取款ing");
                System.out.println("余额:" + deposit + "取款:" + 1000 + "剩余余额:"
                        + (deposit - 1000) + "取款次数:" + (times + 1));
                deposit -= 1000;
                times++;
                try
                {
                    Thread.sleep(1000 * 2);
                } catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }

        }
    }

    public int getDeposit()
    {
        return deposit;
    }

    public void setDeposit(int deposit)
    {
        this.deposit = deposit;
    }

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
}


@SuppressWarnings({"all"})
class Person implements Runnable
{
    Bank bank;

    public Person(Bank bank)
    {
        this.bank = bank;
    }

    @Override
    public synchronized void run()
    {
        System.out.println(Thread.currentThread().getName() + "前往银行取款:");
        while(bank.isLoop())
        {
            bank.withdraw();
        }
    }
}
