package com.file.homeWork;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork01
{
    public static void main(String[] args) throws IOException
    {
        String cateloge = "mytemp";
        File file = new File(cateloge);
        String filePath = "mytemp\\Hello.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int readeLen = 0;
        byte[] buffer = new byte[8];
        /**
        if(!file.exists())
        {
            file.mkdir();
        }
        else if(!(new File("mytemp\\Hello.txt")).exists())
        {
            new File("mytemp\\Hello.txt").createNewFile();
            fileInputStream = new FileInputStream("mytemp\\Hello.txt");
            fileOutputStream = new FileOutputStream("mytemp\\Hello.txt");
            if((readeLen = fileInputStream.read(buffer)) != -1)
            {
                fileOutputStream.write(Integer.parseInt("Hello World"));
            }
        }
        while((readeLen = fileInputStream.read(buffer)) != -1)
        {
            System.out.println(new String(buffer,0,readeLen));
        }
        if(fileInputStream != null)
        {
            fileInputStream.close();
        }
        if(fileOutputStream != null)

        {
            fileOutputStream.close();
        }
         */
    }
}
