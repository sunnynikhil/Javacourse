/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import static javacourse.zerosumsubarray10.getzerosum;

/**
 *
 * @author oyo
 */
public class continousarray {
    public static boolean continousOrNot(int[] a,int n)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
            set.add(a[i]);
        int[] list = new int[set.size()];
        int i=0;
        for(Integer x : set)
            list[i++]=x;
        for(i=0;i<set.size()-1;i++)
            if(!set.contains(list[i]+1))
                return false;
        return true;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int a[] = new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         if(continousOrNot(a,n))
         {
           System.out.println("Yes");
         }
         else
         {
             System.out.println("No");
	 }
         }
	 }
}
