package com.treeset;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class TreeSet_
{
    public static void main(String[] args)
    {
//        TreeSet treeSet = new TreeSet();
        //
        //        treeSet.add("12");
        //        treeSet.add("41");
        //        treeSet.add("32");
        //        treeSet.add("25");
        TreeSet treeSet = new TreeSet(new Comparator()
        {
            @Override
            public int compare(Object o1,Object o2)
            {
//                return ((String) o2).compareTo((String) o1);
                                                        return ((String) o2).length() - ((String) o1).length();
            }
        });
        treeSet.add("ba");
        treeSet.add("cba");
        treeSet.add("tom");
        treeSet.add("aaaaaa");

        System.out.println(treeSet);
        //自定义比较,传入一个比较器

        System.out.println(treeSet);
    }
}
