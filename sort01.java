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
public class sort01 {
    public static void getSorted(int a[],int n)
    {
        int l =0,h=n-1;
        while(l<=h)
        {
            if(a[l]==0)
            {
                l++;
                continue;
            }
            if(a[h]==1)
            {
                h--;
                continue;
            }
            a[l++]=0;
            a[h--]=1;
        }
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
         int a[]= new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         getSorted(a,n);
         for(int i=0;i<n;i++)
             System.out.print(a[i]+" ");
         System.out.println();
	 
	 }
	 }
}
