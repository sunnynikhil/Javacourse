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
public class PerfectSum {
    public static int getCountOfPrefectSum(int a[],int n,int sum)
    {
        int count=0;
        int[][] dp = new int[n+1][sum+1];
        
        for(int i=0;i<=n;i++)
            dp[i][0]=1;
        for(int i=1;i<=sum;i++)
            dp[0][i]=0;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(a[i-1]>j)
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-a[i-1]];
                        
                
            }
        }
                
        return dp[n][sum];
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
         int sum = in.nextInt();
         System.out.println(getCountOfPrefectSum(a,n,sum));
	 }
	 }
}
