package com.codeblock_;
public class codeblock01
{
    public static void main(String[] args)
    {
        Movie movie = new Movie("唐",50.0,"张三");
    }
}
class Movie
{
    private String name;
    private double price;
    private String director;
    {
        System.out.println("电影放映开始!");
        System.out.println("正在播放~");
        System.out.println("电影放映结束!");
    }
    public Movie(String name,double price)
    {
        this.name = name;
        this.price = price;
    }

    public Movie(String name,double price,String director)
    {
        this.name = name;
        this.price = price;
        this.director = director;
    }

    public Movie(String name)
    {
        this.name = name;
    }
}
