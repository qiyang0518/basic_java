package com.cpu;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Cpu
{
    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑Cpu数量
        int cup = runtime.availableProcessors();
        System.out.println("Cpu数量:" + cup);
    }
}
