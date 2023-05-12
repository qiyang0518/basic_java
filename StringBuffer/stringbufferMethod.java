package com.StringBuffer;
/**
 * @author 齐阳
 * @version 1.0
 */
public class stringbufferMethod
{
    public static void main(String[] args)
    {
        StringBuffer stringBuffer = new StringBuffer("hell000o");
        stringBuffer.append('a');               //hell000oa
        System.out.println(stringBuffer);
        stringBuffer.delete(2,4);               //he000oa
        System.out.println(stringBuffer);
        stringBuffer.replace(2,3,"bb");
        System.out.println(stringBuffer);
        stringBuffer.insert(3,"666");
        System.out.println(stringBuffer);


    }
}
