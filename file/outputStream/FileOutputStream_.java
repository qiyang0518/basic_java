package com.file.outputStream;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileOutputStream_
{
    public static void main(String[] args)
    {

    }

    FileOutputStream fileOutputStream = null;

    @Test
    public void write() throws IOException
    {
        String filePath = "C:\\Users\\xml\\Desktop\\Test\\file02.txt";
        try
        {
            //覆盖创建方式
            //追加创建方式:new FileOutputStream(filePath,true)
            fileOutputStream = new FileOutputStream(filePath,true);
            //str.getBytes():字符串转为字节数组
            for(int i = 0;i < filePath.length();i++)
            {
                char charAt = filePath.charAt(i);
                fileOutputStream.write(charAt);
            }

        } catch(IOException e)
        {
            e.printStackTrace();
        } finally
        {
            fileOutputStream.close();
        }

    }
}
