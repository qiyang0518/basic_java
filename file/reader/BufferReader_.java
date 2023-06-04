package com.file.reader;
public class BufferReader_ extends Reader_
{
    private Reader_ reader_;

    public BufferReader_(Reader_ reader_)
    {
        this.reader_ = reader_;
    }

    //多次读取文件
    public void readFiles(int num)
    {
        for(int i = 0;i < num;i++)
        {
            reader_.readFile();
        }
    }

    //批量处理字符串
    public void readStrings(int num)
    {
        for(int i = 0;i < num;i++)
        {
            reader_.readString();
        }

    }
}
