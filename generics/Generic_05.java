package com.generics;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic_05
{
    public static void main(String[] args)
    {
        Apple<String,Integer,Double> apple = new Apple<String,Integer,Double>();
        apple.fly(10);
        apple.fly(new Pig());
    }
}
@SuppressWarnings({"all"})
class Apple<T,R,M>
{
    public <E> void fly(E e)
    {
        System.out.println(e.getClass().getSimpleName());                   //返回运行类型
    }
//    public void eat(U u) {}
    public void run(M m) {}
}

class Pig {}
