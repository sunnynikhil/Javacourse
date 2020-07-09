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
public class leastavg {
    public static void getLeastAvg(int a[],int n,int k)
    {
        int min=0;
        int sum=0;
        int res=(int) Math.pow(2, (int)(Math.log(n)/Math.log(2)));
        for(int i=0;i<k;i++)
        {
            sum+=a[i];
        }
        int start =1;
        min=sum;
        for(int i=k;i<n;i++)
        {
            sum-=a[i-k];
            sum+=a[i];
            if(min>sum)
            {
                start=i-k+2;
               
                min=sum;
                
            }
        }
        System.out.println(start+" "+(start+k-1));
    
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int k = in.nextInt();
         int a[] = new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         getLeastAvg(a,n,k);
	 }
	 }
}
