package com.file.reader;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Reader01
{
    public static void main(String[] args)
    {

    }

    @SuppressWarnings({"all"})
    @Test
    public void read() throws IOException, InterruptedException
    {
        FileReader fileReader = null;                                   //创建FileReader,设置为null,扩大范围
        String filePath = "C:\\Users\\xml\\Desktop\\Test\\file.txt";    //文件路径
        char[] buffer = new char[8];                                    //设置读取指定大小字符数组
        int fileData = 0;
        int readLen = 0;
        try
        {
            fileReader = new FileReader(filePath);
            while((fileData = fileReader.read()) != -1)
            //            while((readLen = fileReader.read(buffer)) != -1)
            {
                //                System.out.print(new String(buffer,0,readLen));
                System.out.print((char) fileData);
                //                Thread.sleep(1000 * 2);
            }
            System.out.println("文件读取完毕~");
        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } finally
        {
            fileReader.close();
        }
    }

    @Test
    public void readFile02()
    {
        String filePath = "C:\\Users\\xml\\Desktop\\Test\\file.txt";
        FileReader fileReader = null;

        int readLen = 0;
        char[] buf = new char[8];
        //1. 创建FileReader对象
        try
        {
            fileReader = new FileReader(filePath);
            //循环读取 使用read(buf), 返回的是实际读取到的字符数
            //如果返回-1, 说明到文件结束
            while((readLen = fileReader.read(buf)) != -1)
            {
                System.out.print(new String(buf,0,readLen));
            }

        } catch(IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if(fileReader != null)
                {
                    fileReader.close();
                }
            } catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void readFile01()
    {
        String filePath = "C:\\Users\\xml\\Desktop\\Test\\file.txt";
        FileReader fileReader = null;
        int data = 0;
        //1. 创建FileReader对象
        try
        {
            fileReader = new FileReader(filePath);
            //循环读取 使用read, 单个字符读取
            while((data = fileReader.read()) != -1)
            {
                System.out.print((char) data);
            }

        } catch(IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if(fileReader != null)
                {
                    fileReader.close();
                }
            } catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
