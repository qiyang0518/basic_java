package com.file.writer;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PublicKey;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class FileWriter01
{
    public static void main(String[] args)
    {

    }

    @Test
    public void writer() throws IOException
    {
        String filePath = "C:\\Users\\xml\\Desktop\\Test\\file.txt";
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter(filePath);
//            fileWriter.write('H');
            fileWriter.write("Hello World!",0,3);
//            fileWriter.write('H');
            //            while()
        } catch(IOException e)
        {
            e.printStackTrace();
        } finally
        {
            fileWriter.close();
        }
    }
}
