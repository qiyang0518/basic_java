package com.StringBuffer;
import java.util.Scanner;
/**
 * @author 齐阳
 * @version 1.0
 */
public class StringBufferexercise
{
    public static void main(String[] args)
    {

    //
    //        do
    //        {
    //            System.out.println("请输入产品名:");
    //            Scanner scanner = new Scanner(System.in);
    //
    //        } while(true);
    //        String product = scanner.next();
    //
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入产品名:");
        String product = scanner.next();
        System.out.println("请输入价格:");
        String price = scanner.next();
        StringBuffer sb =new  StringBuffer(price);
        for(int i = sb.indexOf(".") - 3; i > 0; i -= 3)
        {
            sb = sb.insert(i,",");
        }
        System.out.println(sb);

    }
}
