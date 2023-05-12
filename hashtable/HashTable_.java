package com.hashtable;
import java.util.Hashtable;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashTable_
{
    public static void main(String[] args)
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put(1,"1");
        hashtable.put(2,"2");
        hashtable.put(3,"3");
        hashtable.put(4,"4");
        hashtable.put(3,"3");
        System.out.println(hashtable);
        hashtable.replace(1,"5");
        System.out.println(hashtable);

    }
}
