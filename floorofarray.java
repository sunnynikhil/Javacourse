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
public class floorofarray {
 
    public static long getPostion(long a[],long n,long k)
    {
        long l=0,h=n-1,mid=0;
        if(a[0]>k)
            return -1;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(a[(int)mid+1]>k && a[(int)mid]<=k)
                return mid;
            else if(a[(int)mid]>k)
            {
                
                h=mid-1;
            }
            else
                l=mid+1;
            
                
        }
       return mid;
    }
	public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	     long n = in.nextLong();
	     long key = in.nextLong();
         long a[] = new long[(int)n];
         for(int i=0;i<n;i++)
             a[i]=in.nextLong();
         System.out.println(getPostion(a,n,key));
	 }
	 }
}
