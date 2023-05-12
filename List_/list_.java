package com.List_;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
public class list_
{
    public static void main(String[] args)
    {
        List List = new ArrayList();
        List.add("张三丰");
        List.add("张无忌");
        List.add(1,"李白");
        System.out.println(List);
        System.out.println(List.indexOf("李白"));
        System.out.println(List.indexOf("王维"));
    }
}
