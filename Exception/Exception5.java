package com.Exception;
import java.util.Scanner;

/**
 * @author 齐阳
 * @version 1.0
 */
public class Exception5
{
    public static void main(String[] args)
    {
        //        Scanner scanner = new Scanner(System.in);
        //        int num1;
        //        int num2;
        //        System.out.println("请输入第一个整数:");
        //        num1 = Integer.parseInt(scanner.next());
        //        System.out.println("请输入第二个整数:");
        //        num2 = Integer.parseInt(scanner.next());

        try
        {
            if(args.length != 2)            //(直接在测试框内输入测试数据)如果输入长度不为2,抛出数组索引越界异常
            {
                throw new ArrayIndexOutOfBoundsException("参数个数不符!");
            }
            int num1 = Integer.parseInt(args[0]);               //将输入的字符转换为int型
            int num2 = Integer.parseInt(args[1]);               //将输入的字符转换为int型
            double res = cal(num1 ,num2);                       //调用cal()计算结果
            System.out.println("计算结果是:" + res);              //输出结果
        } catch(ArrayIndexOutOfBoundsException e)               //捕获数组越界异常,并返回异常信息
        {
            System.out.println(e.getMessage());
        } catch(NumberFormatException e)                //捕获数字格式异常,输出提示信息
        {
            System.out.println("参数格式不正确,请输入整数!");
        }catch(ArithmeticException e)                   //捕获算数异常,输出提示信息
        {
            System.out.println("出现除0异常!");
        }
    }

    public static int cal(int num1,int num2)                //除法运算
    {
        int num3 = num1 / num2;
        return num3;                //返回结果

    }
}

