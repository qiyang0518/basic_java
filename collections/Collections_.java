package com.collections;
import java.util.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Collections_
{
    public static void main(String[] args)
    {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("5");
        list.add("5");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("reverse" + list);
        Collections.sort(list,new Comparator()
        {
            @Override
            public int compare(Object o1,Object o2)
            {
                return ((String) o1).compareTo((String) o2);
            }
        });
        System.out.println(list);

    }
}
