/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class firstandlastoccurances {
    public static void firstandlast(int n,int x,int[] a)
    {
        int first=-1,last=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=x)
                continue;
            if(first==-1)
                first=i;
            last=i;
        }
        if(first!=-1)
            System.out.print(first+" "+last);
        else
            System.out.print("-1");
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
         int x = in.nextInt();
         int[] a = new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         firstandlast(n,x,a);
         System.out.println();
	 
	 }
	 }
}
