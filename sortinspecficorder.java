/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;

/**
 *
 * @author oyo
 */
public class sortinspecficorder {
    public static void sort(int a[],int n)
    {
        for(int i=0;i<n;i++)
            if((a[i]& 1)!=0)
                a[i]*=-1;
        Arrays.sort(a);
         for(int i=0;i<n;i++)
            if((a[i]& 1)!=0)
                a[i]*=-1;
        
        for(int i=0;i<n;i++)
             System.out.print(a[i]+" ");
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
         sort(a,n);
         System.out.println();
         
	 }
	 }
}
