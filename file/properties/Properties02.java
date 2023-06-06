package com.file.properties;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Properties02
{
    public static void main(String[] args) throws IOException
    {
        Properties properties = new Properties();                           //创建配置文件读取类
        properties.load(new FileReader("mysql.properties"));        //加载指定路径的配置文件
        System.out.println(properties.getProperty("ip"));                   //获取指定键的值
        properties.setProperty("用户名","小王");                              //新增键值对
        properties.list(System.out);
        properties.store(new FileWriter("mysql2.properties"),"注释");         //新增配置文件
    }
}
