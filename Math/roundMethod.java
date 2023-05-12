package com.Math;
import java.util.Scanner;

/**
 * @author 齐阳
 * @version 1.0
 */
public class roundMethod
{
    public static void main(String[] args)
    {
        //取2-7的整数(int)(2 + Math.random() * 6)
        //取a - b的整数:
        //公式:(int)(a + Math.random() *(b - a + 1))
        //random随机生成0-1的小数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入范围下限:");
        double minNum = scanner.nextDouble();
        System.out.println("请输入范围上限:");
        double maxNum = scanner.nextDouble();
        double goalNum = Math.random() * 10;
        if(goalNum >= minNum && goalNum <= maxNum)
        {
            System.out.println((int)goalNum);
        }
        else
        {
            boolean tmp = false;
            int times = 0;
            while(!tmp)
            {
                times++;
                double goalNum2 = Math.random() * 10;
                tmp = goalNum2 >= minNum && goalNum2 <= maxNum;
                System.out.println((int)goalNum2 + "执行次数" + times);
            }
        }
    }
}
