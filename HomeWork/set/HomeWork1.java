package com.HomeWork.set;
import java.util.*;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HomeWork1
{
    public static void main(String[] args)
    {
        List list = new ArrayList();
        list.add(new News("新闻一:新馆确诊病例超千万,数百万印度教信徒赴恒河\"圣浴\"引民众担忧"));
        list.add(new News("新闻二:男子突然想起2个月前掉的鱼还在网兜里,捞起一看赶紧放生"));
        System.out.println(list);
        list.sort(new Comparator()                              //按标题字数逆序输出
        {
            @Override
            public int compare(Object o1,Object o2)
            {
                return ((String)(((News) o1).getTitle())).length() - ((String)(((News) o2).getTitle())).length();                   //先将Object转News,后获取标题,比较标题长度
            }
        });
        System.out.println("=======按标题字数到序排序=======");
        System.out.println(list);
        System.out.println("=======对标题处理后顺序排序结果如下========");
        Iterator iterator = list.iterator();                                //利用迭代器,对list遍历
        while(iterator.hasNext())
        {
            Object next = iterator.next();
            News temp = (News) next;                                //将节点转成News,便于后续对标题裁剪
            if(temp.getTitle() == null)
            {
                System.out.println("标题为空!");
            }
            else
            {
                String formatStr = temp.getTitle().substring(0,15);
                System.out.println(formatStr + "...");
            }
        }
//        list.sort(new Comparator()
//        {
//            @Override
//            public int compare(Object o1,Object o2)
//            {
//                return ((String) o1).length() - ((String) o2).length();
//
//            }
//        });

    }
}
@SuppressWarnings({"all"})
class News
{
    private String title;
    private String content;
    //    private int no;


    public News(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    @Override
    public String toString()
    {
        //        return "\t\t\t\t" + title + "\n\t" + content;
        return "\t\t\t\t" + title;
    }
    public void formatStr(String str)
    {
        if(str == null)
        {
            System.out.println("标题为空!");

        }
        else
        {
            StringBuffer sb = new StringBuffer(str);
        }
    }
}
