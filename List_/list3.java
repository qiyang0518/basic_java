package com.List_;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
public class list3
{
    public static void main(String[] args)
    {
        @SuppressWarnings({"all"})
        List al = new ArrayList();                                          //创建列表
        al.add(new Books("红楼梦",123,"qwe"));             //向列表中添加三个Book对象
        al.add(new Books("西游记",1213,"asd"));
        al.add(new Books("水浒传",12123,"zxc"));
        System.out.println("======打印如下======");
        Iterator iterator = al.iterator();                                  //遍历列表
        while(iterator.hasNext())
        {
            Object info = iterator.next();
            System.out.println(info.toString());
        }
        System.out.println("\n\n");
        System.out.println("====按价格顺序排序====");
        Books temp = new Books();                                            //价格顺序排序方式一,暂存Book对象
        for(int i = 0;i < al.size() - 1;i++)                               //冒泡排序对价格排序
        {
            for(int j = 0;j < al.size() - i - 1;j++)
            {
                Books book1 = (Books) al.get(i);                             //对al进行向下转型转为Book对象
                Books book2 = (Books) al.get(j);
                /*
                方式一:
                 */
                if(book1.getPrice() > book2.getPrice())                     //如果book1价格大于book2价格,book1后移
                {
                    temp = book1;
                    book1 = book2;
                    book2 = temp;
                }
//                /*
//                交换方式二:
//                 */
//                if(book1.getPrice() > book2.getPrice())               //如果book1价格大于book2价格,book1后移
//                {
//                 al.set(j,book2);                                     //运用set方法实现Book对象交换
//                 al.set(j + 1,book1);
//                }
            } Iterator ite = al.iterator();
            while(ite.hasNext())                                        //对列表进行遍历
            {
                i++;
                Object object = ite.next();
                System.out.println(object.toString());
                System.out.println(i);
            }
        }
    }
}

class Books
{
    private String name;
    private double price;
    private String author;

    public Books()
    {}

    @Override
    public String toString()
    {
        return "名称:" + name + "\t\t价格:" + price + "\t\t作者:" + author;
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

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Books(String name,double price,String author)
    {
        this.name = name;
        this.price = price;
        this.author = author;
    }
}