package com.properties;
import java.util.Properties;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Properties_
{
    public static void main(String[] args)
    {
        Properties properties = new Properties();
        properties.put(1,"1");
        properties.put(2,"2");
        properties.put(3,"3");
        System.out.println(properties);
        properties.remove(1);
        System.out.println(properties);
    }
}
