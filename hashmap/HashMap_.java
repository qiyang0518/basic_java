package com.hashmap;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashMap_
{
    public static void main(String[] args)
    {
        Map Map = new HashMap();
        Map.put(1,"1");
        Map.put(2,"2");
        Map.put(3,"3");
        Map.put(3,"4");
        Set set = Map.entrySet();
        for(Object  o : set)
        {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry);
        }
        System.out.println(Map);
        System.out.println("test-github");
        
        
    }
}
