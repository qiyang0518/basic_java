package com.file.reader;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public abstract class Reader_
{
    public void readFile() {};
    public void readString() {};
}

class FileReader_ extends Reader_
{
    public void readFile()
    {
        System.out.println("读取文件~");
    }
}

class StringReader_ extends Reader_
{
    public void readString()
    {
        System.out.println("读取字符串·~");
    }
}

