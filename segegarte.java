/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class segegarte {
    public static void segregateEvenOdd(int[] a,int n)
    {
        int l=0,h=n-1,even=0;
        while(l<h)
        {
            while(a[l]%2==0 && l<h)
            {
                even++;
                l++;
            }
            while(a[h]%2==1 && l<h)
                h--;
            if(l<h)
            {
                int tmp =a[h];
                a[h]=a[l];
                a[l]=tmp;
                l++;
                h--;
            }
        }
        
        Arrays.sort(a,0,l);
        Arrays.sort(a, l+1+1, n);
        
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
	 Arrays.sort(a);
         segregateEvenOdd(a,n);
	 for(int i=0;i<n;i++)
	         System.out.print(a[i]+" ");

	 System.out.println();  
	 }
	 }
}
