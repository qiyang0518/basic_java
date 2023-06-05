package com.file.objectInputStream;
import java.io.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class ObjectInputStream_
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        String filePath = "C:\\Users\\xml\\Desktop\\Test\\file.dat";
        ObjectInputStream objectInputStream = null;
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(filePath);
        objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readInt());
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readUTF());
        System.out.println(objectInputStream.readObject());
        objectInputStream.close();
    }
}
