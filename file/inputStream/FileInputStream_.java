package com.file.inputStream;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileInputStream_
{
    public static void main(String[] args)
    {

    }

    @Test
    public void read01() throws IOException, InterruptedException
    {
        FileInputStream fileInputStream = null;                         //定义文件输入流
        String fileName = "C:\\Users\\xml\\Desktop\\Test\\file.txt";    //文件绝对路径
        int fileContent;                                                //获取文件读取的字符数(文件为空或至文件末尾返回-1)
        byte[] buffer = new byte[4];                                   //创建字节数组(大小16)
        int readLen = 0;                                                //读取文件返回字节长度
        try
        {

            fileInputStream = new FileInputStream(fileName);
            try
            {
                //(fileContent = fileInputStream.read():单个字节读取效率低
//                while((fileContent = fileInputStream.read()) != -1)
                while((readLen = fileInputStream.read(buffer)) != -1)
                {
//                    System.out.print((char) fileContent + "\t");      //转成字符
                    System.out.println(new String(buffer,0,readLen));
                    Thread.sleep(1000 * 2);
                }
            } catch(IOException e)
            {
                e.printStackTrace();
            }
        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } finally
        {
            fileInputStream.close();
        }

    }
}
