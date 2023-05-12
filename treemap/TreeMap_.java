package com.treemap;
import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TreeMap_
{
    public static void main(String[] args)
    {
//        TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1,Object o2)
            {
//                return ((String) o1).compareTo((String) o2);
                return ((String) o2).length() - ((String) o1).length();
            }
        });

        treeMap.put("1","1");
        treeMap.put("6","6");
        treeMap.put("3","3");
        treeMap.put("4","4");
        treeMap.put("5","5");
        System.out.println(treeMap);
    }
}
