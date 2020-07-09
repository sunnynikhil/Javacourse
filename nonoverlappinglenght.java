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
public class nonoverlappinglenght {
    
    public static int getLengthNonOverlapping(int a[],int n,int k)
    {
        int count=0;
        int i=0,ans=0;
        int flag=0;
        for(i=0;i<n;)
        {
            count=0;
            flag=0;
            while(i<n && a[i]<=k)
            {
                if(a[i]==k)
                    flag=1;
                count++;
                i++;
            }
            if(flag==1)
                {
                    ans+=count;
//                    flag=0;
                }
            while(i<n &&a[i]>k)
                i++;
        }
        return ans;
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
         int k = in.nextInt();
         System.out.println(getLengthNonOverlapping(a,n,k));
	 }
	 }
    
}
