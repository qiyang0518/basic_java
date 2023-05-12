package com.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 齐阳
 * @version 1.0
 */
public class ldtTest
{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss E");
        String format = dateTimeFormatter.format(now);
        System.out.println(format);
    }
}
