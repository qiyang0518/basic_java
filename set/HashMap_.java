package com.set;
/**
 * @author 齐阳
 * @version 1.0
 */
public class HashMap_
{
    public static void main(String[] args)
    {
        //模拟Hash Map
        Node[] table = new Node[16];            //创建一个容量为16的节点数组
        System.out.println(table);
        Node john = new Node("John",null);          //创建一个John节点
        table[2] = john;                       //节点数据索引为2的位置放入John节点
        System.out.println(table);
        Node jack = new Node("jack",null);          //创建Jack节点
        john.next = jack;                      //将John的指针指向Jack
        Node smith = new Node("Smith",null);
        jack.next = smith;
        System.out.println(table);
    }
}
class Node      //节点类.包含内容和下一个指针
{
    Object item;        //存放数据
    Node next;          //指向下一个节点

    public Node(Object item,Node next)          //节点类的有参构造器
    {
        this.item = item;
        this.next = next;
    }
}
