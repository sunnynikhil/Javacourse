/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
import static javacourse.minimumsumlist.push;
import static javacourse.occuranceofanumber.countfrequent;
public class Kadanesalgo {
    public static int maxofsubarray(int a[])
    {
        int min=Integer.MIN_VALUE,max=0;
        for(int i=0;i<a.length;i++)
        {
            max=max+a[i];
            if(min<max)
                min=max;
            if(max<0)
                max=0;
        }
        return min;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(maxofsubarray(a));
           
    }
}
