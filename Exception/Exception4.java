package com.Exception;
/**
 * @author 齐阳
 * @version 1.0
 */
public class Exception4
{
    public static void main(String[] args)
    {
        int age = 22;
        if(!(age >= 18 && age <= 120))
        {
            throw new AgeException("年龄需要在18-120");
        } System.out.println("年龄输入正确!");
    }
}

class AgeException extends RuntimeException
{
    public AgeException(String message)
    {
        super(message);
    }
}
