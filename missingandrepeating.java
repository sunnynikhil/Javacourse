/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class missingandrepeating {
    public static void missingandrepeating(long a[],long n)
    {
        long sq = (n*(n+1))/2;
        long sq2 = (n*(n+1)*(2*n+1))/6;
        for(long i=0;i<a.length;i++)
        {
            sq-=a[(int)i];
            sq2-=a[(int)i]*a[(int)i];
        }
        long missing = (sq+sq2/sq)/2;
        long repeating = missing-sq;
        System.out.print(repeating+" "+missing);
        
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 long n = in.nextLong();
         long[] a = new long[(int)n];
         for(long i=0;i<n;i++)
             a[(int)i]=in.nextLong();
         missingandrepeating(a,n);
         System.out.println();
	 
	 }
	 }
}
