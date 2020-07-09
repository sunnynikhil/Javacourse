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
public class unboundedknapsnack {
    public static int Unboundedknapsanck(int n,int W,int val[],int wt[])
    {
        int dp[] = new int[W+1];
        for(int i=0;i<=W;i++)
            for(int j=0;j<n;j++)
                if(wt[j]<=i)
                    dp[i]=Math.max(dp[i], dp[i-wt[j]]+val[j]);
       return dp[W]; 
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            int w = in.nextInt();
            int val[] = new int[n];
            int wt[] = new int[n];
            for(int i=0;i<n;i++)
                val[i]=in.nextInt();
            for(int i=0;i<n;i++)
                wt[i]=in.nextInt();
            System.out.println(Unboundedknapsanck(n,w,val,wt));
        }
    }
}
