package com.Exception;
/**
 * @author 齐阳
 * @version 1.0
 */
public class Exception02
{}


    class ExceptionHomeWork
    {
        public static int method()
        {
            int i = 1;
            try
            {

                i++;                //i = 2
                String[] names = new String[3];
                if(names[1].equals("tom"))              //返回空指针异常
                {
                    System.out.println(names[1]);
                }
                else
                {
                    names[3] = "123";
                }
                return 1;
            } catch(ArrayIndexOutOfBoundsException e)
            {
                return 2;
            } catch(NullPointerException e)             //捕获空指针异常
            {
                return ++i;             //i = 3,被暂存至temp = 3,只执行了++i,没有执行return,等finally语句执行完后在执行return
            } finally
            {
                ++i;                //没有return,i = 4
                System.out.println("i=" + i);
            }

        }


        public static void main(String[] args)
        {

            System.out.println(method());

        }
    }