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
public class productarray {
    public static void productArray(int a[],int n)
    {
        int p=1;
        for(int i=0;i<n;i++)
            p=p*a[i];
        for(int i=0;i<n;i++)
            a[i]=p/a[i];
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
         productArray(a,n);
         for(int i=0;i<n;i++)
             System.out.print(a[i]+" ");
         System.out.println();
	 }
	 }
}
