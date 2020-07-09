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
public class minsumpartition {
    
    public static int findMin(int a[],int n)
    {
        int sum = 0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
            dp[i][0]=true;
        for(int i=0;i<=n;i++)
            dp[0][i]=false;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                dp[i][j]=dp[i-1][j];
                if(a[i-1]<=j)
                    dp[i][j] |=dp[i-1][j-a[i-1]];
            }
        }
        int diff = Integer.MAX_VALUE;
        for(int j=sum/2;j>=0;j--)
        {
            if(dp[n][j]==true)
            {
                diff=sum-2*j;
                break;
            }
        }
        return diff;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i]=in.nextInt();
            System.out.println(findMin(a,n));
        }
        
    }
}
