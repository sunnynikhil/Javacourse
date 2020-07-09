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
public class getMinLenght {
    public static int getMinLenght(int a[],int n,int x)
    {
        int end=0,start=0,min_len=Integer.MAX_VALUE,cur_sum=0;
        while(end<n)
        {
            while(cur_sum<=x && end<n)
                cur_sum+=a[end++];
            while(cur_sum>x && start<n)
            {
                if(end-start<min_len)
                    min_len=end-start;
                cur_sum-=a[start++];
            }
        }
        return min_len;
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
	 int[] a = new int[n];
	 for(int i=0;i<n;i++)
	   a[i]=in.nextInt();
	 System.out.println(getMinLenght(a,n,k));  
	 }
	 }
}
