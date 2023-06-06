package com.file.properties;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Properties01
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("mysql.properties"));
        String line = "";
        boolean loop = true;
        while((line = bufferedReader.readLine()) != null && loop)
        {
            String[] split = line.split("=");
//            System.out.println(split[0] + "值是:" + split[1]);
                if(split[0].equals("ip"))
                {
                    System.out.println(split[0] + "值为:" + split[1]);
                    loop = false;
                    break;
                }

        }
        bufferedReader.close();
    }
}
