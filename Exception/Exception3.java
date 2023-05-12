package com.Exception;
import java.util.Scanner;

/**
 * @author 齐阳
 * @version 1.0
 */
public class Exception3
{
    public static void main(String[] args)
    {

        Scanner myScanner = new Scanner(System.in);             //创建Scanner对象,键盘输入
        int num = 0;                //创建num,用于接收转型后的键盘输入值
        String inputStr = "";               //接收键盘输入值
        while(true)             //无限循环

        {
            System.out.println("请输入一个整数:");
            inputStr = myScanner.next();                //接收键盘输入
            try
            {
                num = Integer.parseInt(inputStr);          //将输入值转为整数型,可以转则结束语句,反之,执行catch语句(捕获异常)
                break;
            } catch(NumberFormatException e)                //捕获异常
            {
                System.out.println("对不起,你输入的不是一个整数!");
            }
        }
        System.out.println("你输入的数是:" + num);
    }
}


