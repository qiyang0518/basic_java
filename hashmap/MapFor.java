package com.hashmap;
import java.util.*;

/**
 * @author 齐阳
 * @version 1.0
 */
public class MapFor
{
    public static void main(String[] args)
    {
        Map map = new HashMap();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        map.put(5,5);
        map.put(6,6);
        map.put(7,7);
        System.out.println(map);
        Set Set = map.keySet();
        for(Object obj : Set)
        {
            System.out.println(Set);
        }
        System.out.println("========");
        Iterator iterator = Set.iterator();
        while(iterator.hasNext())
        {
            Object next =  iterator.next();
            System.out.print(next + "\t");
        }
        System.out.println("========");
        Collection values = map.values();
        for(Object o : values)
        {
            System.out.println(values);
        }

    }
}
