package com.Inner;
public class A
{
    public static void main(String[] args)
    {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring()
            {
                System.out.println("懒猪起床了!");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring()
            {
                System.out.println("小伙伴上课了~");
            }
        });
    }
}

