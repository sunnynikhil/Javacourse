/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class first1 {
    
    public static long getFirstOneUtil(int a[],long l,long h)
    {
       long mid=0;
       while(l<=h)
       {
           mid = (l+h)/2;
           if(a[(int)mid]==1)
           {
               if(a[(int)(mid-1)]!=1)
                   return mid;
               else
                   h=mid-1;
           }
           else
               l=mid+1;
           
       }
       return -1;
    }
    public static long getFirstOne(int a[],long n)
    {
        if(a[0]==1)
            return 0;
        if(a[(int)n-1]==0)
            return -1;
        return getFirstOneUtil(a,0,n-1);
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 long n = in.nextLong();
         int a[] = new int[(int)n];
         for(long i=0;i<n;i++)
             a[(int)i]=in.nextInt();
         System.out.println(getFirstOne(a,n));
         
	 
	 }
	 }
    
}
