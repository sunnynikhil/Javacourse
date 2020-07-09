/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class sorttwounsortedarrays {
    
    public static void mergetwoarrays(int a[],int b[],int n,int m)
     {
         ArrayList<Integer> set = new ArrayList<>();
         for(int i=0;i<n;i++)
           set.add(a[i]);
         for(int i=0;i<m;i++)
           set.add(b[i]);
        Collections.sort(set);
        for(Integer x : set)
            System.out.print(x+" ");
     }
	public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int m = in.nextInt();
	 int a[] = new int[n];
	 int b[] = new int[m];
	 for(int i=0;i<n;i++)
	    a[i]=in.nextInt();
	 for(int i=0;i<m;i++)
	    b[i]=in.nextInt();
	 mergetwoarrays(a,b,n,m);
	 System.out.println();
	 }
	 }
    
}
