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
public class twosubsets {
    
    public static boolean isSubsetSum(int a[],int n)
    {
        int sum=0,i,j;
        for(i=0;i<n;i++)
            sum+=a[i];
        if(sum%2!=0)
            return false;
        boolean part[][] = new boolean[sum/2+1][n+1];
        for(i=0;i<=n;i++)
            part[0][i]=true;
        for(i=1;i<=sum/2;i++)
            part[i][0]=false;
        for(i=1;i<=sum/2;i++)
        {
            for(j=1;j<=n;j++)
            {
                part[i][j]=part[i][j-1];
                if(i>=a[j-1])
                    part[i][j] = part[i][j]||part[i-a[j-1]][j-1];
            }
        }
        return part[sum/2][n];
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
         System.out.println(isSubsetSum(a,n));
	 }
	 }
}
