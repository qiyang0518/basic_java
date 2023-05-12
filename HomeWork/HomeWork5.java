package com.HomeWork;
/**
 * @author 齐阳
 * @version 1.0
 */


/*问题:局部内部类,无法运行(已解决)
  产生原因:在局部内部类中,未创建内部类对象,从而无法调用内部类中的方法
  若内部类变量与全局变量重名如何解决？
  {
  原则:就近原则
  使用全局变量可采用类名.this.变量名[
  }
  * */
public class HomeWork5
{
    public static void main(String[] args)
    {
        new A().f2();
    }
}

class AA
{
    public String NAME = "Hello";

    public void f1()
    {
        class B
        {

            private final String NAME = "小李";

            public void Show()
            {
                System.out.println("Name=" + NAME);
            }
        }
        B b = new B();
        b.Show();
    }
}

class A
{
    public void f2()
    {
        class B
        {

            private final String NAME = "小李";
            public void show ()
            {
                System.out.println("Name=" + NAME);

            }
            public String Print()
            {
                return NAME;
            }
        }
        B b = new B();
        b.show();
        System.out.println(b.Print());
    }
}