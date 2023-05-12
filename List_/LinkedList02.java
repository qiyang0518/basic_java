package com.List_;
import java.util.LinkedList;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LinkedList02
{
    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.remove();
        System.out.println(linkedList);

    }
}
