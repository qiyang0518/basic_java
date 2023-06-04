package com.file.bufferReader;
import java.io.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class BufferReader_
{
    public static void main(String[] args) throws IOException
    {
        String filePath = "C:\\Users\\xml\\Desktop\\Test\\file.txt";
        BufferedReader bufferReader = null;
        BufferedWriter bufferedWriter = null;
        int readLen = 0;
        byte[] buffer = new byte[8];
        String line;
        try
        {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
            bufferReader = new BufferedReader(new FileReader(filePath));
            bufferedWriter.write(filePath);
            bufferedWriter.newLine();
            bufferedWriter.write("为什么上面代码没有添加至文件？");
            bufferedWriter.newLine();
            //按行读取,返回为null,时文件读取完毕
            while((line = bufferReader.readLine()) != null)
            {
                System.out.println(line);
            }
            System.out.println("读取完毕~");
        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } finally
        {
            bufferReader.close();
            bufferedWriter.close();
        }
    }
}


