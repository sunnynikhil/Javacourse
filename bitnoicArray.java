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
public class bitnoicArray {
    public static int getMax(int a[],int n)
    {
        int l=0,h=n-1,mid=0;
        while(l<=h)
                {
                   if(l==h)
                       return a[l];
                    mid =(l+h)/2;
                   if(a[mid]>a[mid+1])
                       h=mid;
                   else
                       l=mid+1;
                       
                }
        return a[mid];
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int[] a = new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         System.out.println(getMax(a,n));
	 }
	 }
    
}
