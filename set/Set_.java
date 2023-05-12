package com.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 齐阳
 * @version 1.0
 */
public class Set_
{
    public static void main(String[] args)
    {
        Set set = new HashSet();
        set.add("1");
        set.add("1");
        set.add("1");
        System.out.println(set);
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
