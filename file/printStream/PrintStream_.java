package com.file.printStream;
import java.io.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class PrintStream_
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Hello World!");
        System.setOut(new PrintStream("C:\\Users\\xml\\Desktop\\Test\\file.txt"));
        new PrintWriter(new FileWriter("C:\\Users\\xml\\Desktop\\Test\\file.txt")).print("Hello World!");
    }
}
