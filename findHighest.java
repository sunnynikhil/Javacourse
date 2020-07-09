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
public class findHighest {
    public static int findHighestUtil(int a[],int l,int h)
    {
        int mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
                return a[mid];
            else if(a[mid]>a[mid-1] && a[mid]<a[mid+1])
                l=mid+1;
            else
                h=mid-1;
                
        }
        return a[mid];
    }
    public static int findHighest(int a[],int n)
    {
        if(a[n-1]>a[n-2])
            return a[n-1];
        if(a[0]>a[1])
            return a[0];
        return findHighestUtil(a,0,n-1);
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
         int[] a =  new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         System.out.println(findHighest(a,n));
	 
	 }
	 }
    
}
