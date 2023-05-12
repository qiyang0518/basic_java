package com.Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 齐阳
 * @version 1.0
 */
public class HomeWork
{
    public static void main(String[] args)
    {
        Book[] books = new Book[4];                                     //创建一个长度为4的Book类数组
        books[0] = new Book("红楼梦新版",110);                   //给数组赋初值
        books[1] = new Book("水浒传学生版",99);
        books[2] = new Book("西游记",123);
        books[3] = new Book("学习Java从入门到入土",100);
        Arrays.sort(books,new Comparator() {                           //按价格顺序排序,调用Comparator接口
            @Override
            public int compare(Object o1,Object o2)                    //定义compare方法
            {
                Book i1 = (Book) o1;
                Book i2 = (Book) o2;
                double PriceVal = i1.getPrice() - i2.getPrice();
                if(PriceVal > 0)
                {
                    return 1;
                }
                else if(PriceVal < 0)
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        });
        Comparator comparator;
        Arrays.sort(books,new Comparator() {                           //按书名长度顺序排序,调用Comparator接口
            @Override
            public int compare(Object o1,Object o2)                    //定义compare方法
            {
                Book i1 = (Book) o1;
                Book i2 = (Book) o2;
                int BookLength = (i1.getName()).length() - (i2.getName()).length();
                if(BookLength > 0)
                {
                    return 1;
                }
                else if(BookLength < 0)
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
}

class Book
{
    private String name;
    private double price;

    public Book(String name,double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Book{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
