package com.file.objectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ObjectOutputStream_
{
    public static void main(String[] args) throws IOException
    {
        String filePath = "C:\\Users\\xml\\Desktop\\Test\\file.dat";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream oos = null;
        fileOutputStream = new FileOutputStream(filePath);
        oos = new ObjectOutputStream(fileOutputStream);
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeUTF("Hello World!");
        oos.writeObject(new byte[18]);
        oos.close();
    }
}
