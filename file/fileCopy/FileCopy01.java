package com.file.fileCopy;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileCopy01
{
    public static void main(String[] args)
    {

    }

    @Test
    public void copy() throws IOException
    {
//        String filePath = null;
        String filePath = "D:\\Test\\mecha.jpg";
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入需要复制的文件地址:");
//        filePath = scanner.next();
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] buffer = new byte[1024];
        int readeLen = 0;
        try
        {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream("D:\\Test\\copy");
            while((readeLen = fileInputStream.read(buffer)) != -1)
            {
                fileOutputStream.write(buffer,0,readeLen);
            }
            System.out.println("文件拷贝完成~");
        } catch(IOException e)
        {
            e.printStackTrace();
        } finally
        {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }
}

