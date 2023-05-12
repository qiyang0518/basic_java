package com.Wrapper;
import java.util.Arrays;

/**
 * @author 齐阳
 * @version 1.0
 */
public class Wrapper01
{
    public static void main(String[] args)
    {
//        Double d = 100.0d;
//        Double d2 = 100d;
//        System.out.println(d);
//        System.out.println(d2);
        int[] ints = {1,2,3};
        int[] dest = new int [3] ;
        System.arraycopy(ints,1,dest,2,1);
        System.out.println(Arrays.toString(dest));
      }

}
