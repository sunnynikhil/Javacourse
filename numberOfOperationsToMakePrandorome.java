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
public class numberOfOperationsToMakePrandorome {
    public static int getNoOfMerges(int a[],int n)
    {
        int ans=0,i=0,j=n-1;
        while(i<=j)
        {
            if(a[i]==a[j])
            {
                i++;
                j--;
                
            }
            else if(a[i]>a[j])
            {
                j--;
                a[j]+=a[j+1];
                ans++;
            }
            else
            {
                i++;
                a[i]+=a[i-1];
                ans++;
            }
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
	 int a[] = new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         System.out.println(getNoOfMerges(a,n));
	 }
	 }
}
