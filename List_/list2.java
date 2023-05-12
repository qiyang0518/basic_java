package com.List_;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 齐阳
 * @version 1.0
 */
public class list2
{
    public static void main(String[] args)
    {
        List al = new ArrayList();
        al.add("Hello");
        al.add(3);
        al.add("张三");
        al.add("李四");
        al.add("王五");
        al.add("赵六");
        al.add("五七");
        al.add("起八");
        al.add("西九");
        al.add("进士");
        System.out.println("原列表" + al);
        al.add(1,"赵一曼");
        System.out.println("索引1位置,添加:赵一曼" + al);
        System.out.println("获取索引为4的元素" + al.get(4));
        System.out.println(al.remove(5));
        System.out.println("去除索引为5的元素:" + al);
        System.out.println(al.set(6,"张若虚"));
        System.out.println("替换索引为6的元素为张若虚:" + al);
        System.out.println("========");
        for(Object list : al)
        {
            System.out.println(list);
        }

    }
}
