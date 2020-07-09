/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class zerosumsubarray10 {
    public static boolean getzerosum(int a[],int n)
    {
        HashSet<Integer> set = new HashSet<>();
        int s=0;
        for(int i=0;i<n;i++)
        {
            s=s+a[i];
            if(set.contains(s))
                return true;
            else
                set.add(s);
        }
        return false;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int a[] = new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         if(getzerosum(a,n))
         {
           System.out.println("Yes");
         }
         else
         {
             System.out.println("No");
	 }
         }
	 }
}
