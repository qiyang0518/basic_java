package com.file.outputStream;
import java.io.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BufferOutputStream_
{
    public static void main(String[] args) throws IOException
    {
        String scrFilePath = "C:\\Users\\xml\\Desktop\\Test\\mecha.jpg";         //源文件地址
        String destFilePath = "D:\\Test\\copy\\file2.jpg";                       //目标文件地址

        BufferedOutputStream bufferedOutputStream = null;                       //创建处理输出流
        BufferedInputStream bufferedInputStream = null;                         //创建处理输入流
        FileInputStream fileInputStream = new FileInputStream(scrFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(destFilePath,true);
        byte[] buffer = new byte[1024];                                         //缓存区
        int rendLen = 0;                                                        //动态读取长度
        try
        {
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            while((rendLen = bufferedInputStream.read(buffer)) != -1 )
            {
                System.out.println(new String(buffer,0,rendLen));
            }
            System.out.println("文件读取完毕~");
            //读取指定长度字符数组,将读取长度返回给readLen,读取至文件尾部返回-1
            while((rendLen = bufferedInputStream.read(buffer)) != -1)
            {
                //写入文件,根据返回的读取长度,将缓存区buffer指定部分存入目标地址文件
                bufferedOutputStream.write(buffer,0,rendLen);
            }
            System.out.println("文件复制完成~");
        } catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            bufferedInputStream.close();
            bufferedOutputStream.close();
        }
    }
}
