
import java.time.LocalDate;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Objects;


/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class HashSet04
{
    public static void main(String[] args)
    {
        HashSet hashSet = new HashSet();
        hashSet.add(new employee("张三",5000,new MyDate(1999,1,8)));
        hashSet.add(new employee("李四",9000,new MyDate(2004,6,12)));
        hashSet.add(new employee("张三",5000,new MyDate(1999,1,8)));
    }
}

class employee
{
    private String name;
    private double sal;
    private MyDate birthDay;

    public employee(String name,double sal,MyDate birthDay)
    {
        this.name = name;
        this.sal = sal;
        this.birthDay = birthDay;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSal()
    {
        return sal;
    }

    public void setSal(double sal)
    {
        this.sal = sal;
    }

    public MyDate getBirthDay()
    {
        return birthDay;
    }

    public void setBirthDay(MyDate birthDay)
    {
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {return true;}
        if(o == null || getClass() != o.getClass())
        {return false;}
        employee employee = (employee) o;
        return Objects.equals(name,employee.name) && Objects.equals(birthDay,employee.birthDay);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name,birthDay);
    }

    @Override
    public String toString()
    {
        return name + "\t\t" + sal + "\t\t" + birthDay + "\n";
    }
}

class MyDate
{
    private int year;
    private int month;
    private int day;

    public MyDate(int year,int month,int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }


    @Override
    public String toString()
    {
        return year + "-" + month + "-" + day;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {return true;}
        if(o == null || getClass() != o.getClass())
        {return false;}
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(year,month,day);
    }
}