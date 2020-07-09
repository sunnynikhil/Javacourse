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
public class pairsum {
    
    public static int getSumCount(int a[],int n,int sum)
    {
        int count=0;
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(a[i]+a[j]==sum)
                    count++;
        return count;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
         int sum= in.nextInt();
         int a[] = new int[n];
         for(int i=0;i<n;i++)
	    a[i]=in.nextInt();
         System.out.println(getSumCount(a,n,sum));
	 }
	 }
}
