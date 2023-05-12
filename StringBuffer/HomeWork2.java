package com.StringBuffer;
import javax.print.attribute.standard.JobOriginatingUserName;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Date;

/**
 * @author 齐阳
 * @version 1.0
 */
public class HomeWork2
{
    public static void main(String[] args)
    {
        Email email = new Email("212",213112,"2721893@qq.com");
        email.register();

    }
}

class Email
{
    private String UserName;
    private int PassWord;
    private String emails;

    public Email()
    {
    }

    public Email(String userName,int passWord,String email)
    {
        UserName = userName;
        PassWord = passWord;
        this.emails = email;
    }

    public String getUserName()
    {
        return UserName;
    }

    public void setUserName(String userName)
    {
        UserName = userName;
    }

    public int getPassWord()
    {
        return PassWord;
    }

    public void setPassWord(int passWord)
    {
        PassWord = passWord;
    }

    public String getEmail()
    {
        return emails;
    }

    public void setEmail(String email)
    {
        this.emails = email;
    }

    public void register()
    {
        /*
        题目要求
        用户名长度2-4
        密码长度6
        邮箱中包含@和.并且@在.前面

        思路分析:
        1、方法名:register
         */
        LocalDateTime registerTime = LocalDateTime.now();
        Email email = new Email();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名(长度2-4):");
        email.UserName = scanner.next();
        if(!(email.UserName.length() >= 2 && email.UserName.length() <= 4))
        {
            if(email.UserName.length() < 2)
            {
                throw new RuntimeException("用户名长度小于2,请重新输入用户名(长度2-4)");
            }
            else
            {
                throw new RuntimeException("用户名长度大于4,请重新输入用户名(长度2-4)");
            }

        }
        System.out.println("请输入密码(长度6位):");
        try
        {
            email.PassWord = scanner.nextInt();
        } catch(Exception e)
        {
            if(e.getMessage() == "NumberFormatException")
            {
                System.out.println("密码格式错误!");
            }
        }
        String passWord = Integer.toString(email.getPassWord());
        if(!(passWord.length() == 6 && isDigital(passWord)))
        {
            //            if(email.UserName.length() < 6)
            //            {
            //                throw new RuntimeException("密码长度小于6,请重新设置(长度6):");
            //            }
            //            else
            //            {
            //                throw new RuntimeException("用户名长度大于4,请重新输入用户名(长度2-4):");
            //            }
            throw new RuntimeException("密码长度要求为6,格式全为数字");

        }

        System.out.println("请输入邮箱:");
        email.emails = scanner.next();

        if(!(email.UserName.length() >= 2 && email.UserName.length() <= 4 && passWord.length() == 6))
        {
            System.out.println("出现异常情况!");
        }
        else
        {
            System.out.println("注册成功!");
            System.out.println("用户名:" + email.getUserName() + "\n邮箱:" + email.getEmail() + "\n注册时间:" + registerTime);
        }
    }

    public static boolean isDigital(String str)
    {
        char[] chars = str.toCharArray();
        for(int i = 0;i < chars.length;i++)
        {
            if(!(chars[i] < '0' || chars[i] < '9'))
            {
                return false;
            }

        }
        return true;
    }
}
