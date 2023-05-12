package com.StringBuffer;
/**
 * @author 齐阳
 * @version 1.0
 * 指定字符串范围反转
 * 思路:
 * 1、将字符串转换为char(可以任意改变字符内容)
 * 2、反转过程
 * 两个光标分别指向下标和上标(下表内的字符进行反转)
 * 每次移动光标,上标-1，下标+1
 * 停止反转下标>=上标
 * 3、返回反转结果(new String(chars))
 *
 * 异常情况处理思路(!(所有正确的情况))
 * 列出所有正确的情况后在进行取反(缺点:无法获得具体异常原因,需进一步逐一分析)
 */
public class HomeWork
{
    public static void main(String[] args)
    {
        String strings = "djjahka";
        try
        {
            strings = reserve(strings,1,1);     //dajjhka
        } catch(Exception e)
        {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("===交换后===");
        System.out.println("测试:" + strings);
    }

    public static String reserve(String str,int start,int end)
    {
        //        char[] stringBuffers = new char[str.length()];
        //        StringBuffer stringBuffer = new StringBuffer(str);              //str->StringBuffer
        //        StringBuffer reverseStr = stringBuffer.reverse();               //将StringBuffer进行翻转
        //        System.out.println("反转后的字符串:" + reverseStr);
        //        StringBuffer deleteStr2 = reverseStr.deleteCharAt(str.length() - end - 1);       //删除end-start长度的字符串
        //        System.out.println("删除头部后的字符串:" + deleteStr2);
        //        StringBuffer stringBuffer1 = deleteStr2.delete(end,);
        //        System.out.println("删除尾部后的字符串:" + stringBuffer1);           //目标值为:khajj
        //        String s = stringBuffer1.toString();
        //        StringBuffer deleteStr = stringBuffer.replace(start,start + 1,s);
        //        System.out.println('1');
        //        System.out.println(deleteStr);

        if(!(str != null && start >= 0 && end > start && end < str.length()))
        {
            System.out.println("出现异常!");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for(int i = start, j = end;i < j;i++,j--)
        {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);


    }
}