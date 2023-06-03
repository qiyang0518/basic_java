package com.file;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CreateFile01
{
    public static void main(String[] args)
    {

    }

    @Test
    public void create01() throws IOException
    {
        String pathName = "C:\\Users\\xml\\Desktop\\Test\\file.doc";
        File file = new File(pathName);
        file.createNewFile();
        System.out.println("文件创建成功~");
    }

    @Test
    public void create02() throws IOException
    {
        File file = new File("C:\\Users\\xml\\Desktop\\Test");
        File file1 = new File(file,"file.doc");
        file1.createNewFile();
        System.out.println("文件创建成功~");
    }

    @Test
    public void create03() throws IOException
    {
        String pathName = "C:\\Users\\xml\\Desktop\\Test";
        File file = new File(pathName,"file.doc");
        file.createNewFile();
        System.out.println("文件创建成功~");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.isFile());
        System.out.println(file.getTotalSpace());
    }
}
