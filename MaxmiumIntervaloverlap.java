/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class MaxmiumIntervaloverlap {
    
    public static void getMaxmiumIntervals(int a[],int b[],int n)
    {
        int count=1,max=-1;
        Arrays.sort(a);
        Arrays.sort(b);
        int min_index=a[0];
        int next =a[1];
        int i=1,j=0;
        while(i<n && j<n)
        {
            if(a[i]<=b[j])
            {
                count++;
                if(max<count)
                {
                    max=count;
                    min_index=a[i];
                }
                i++;
            }
            else
            {
                count--;
                j++;
            }
        }
        System.out.println(max+" "+min_index);
        
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
         int[] b = new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         for(int i=0;i<n;i++)
             b[i]=in.nextInt();
         getMaxmiumIntervals(a,b,n);
	 
	 }
	 }
}
