/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author oyo
 */
public class largestSquare {
    public static int solve(int[][] a,int m ,int n,int px,int py,int[][] dp)
    {
        if(dp[px][py]!=-1)
            return dp[px][py];
        if(a[px][py]==1)
        {
            int temp1,temp2,temp3;
            temp1=temp2=temp3=0;
            if(isVaild(m,n,px+1,py))
            {
               temp1=solve(a,m,n,px+1,py,dp); 
            }
            if(isVaild(m,n,px+1,py+1))
            {
               temp2=solve(a,m,n,px+1,py+1,dp); 
            }
            if(isVaild(m,n,px,py+1))
            {
                temp3=solve(a,m,n,px,py+1,dp);
            }
            return dp[px][py]=a[px][py]+Math.min(Math.min(temp1,temp2), temp3);
        }
        return dp[px][py]=0;
    }
    public static boolean isVaild(int m,int n,int px,int py)
    {
        return px<m && py<n;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String[] s = br.readLine().split("\\s");
            int m = Integer.parseInt(s[0]);
            int n = Integer.parseInt(s[1]);
            s=br.readLine().split("\\s");
            int[][] a = new int[m][n];
            int[][] dp = new int[m][n];
            int ans=0,count=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=Integer.parseInt(s[count++]);
                }
            }
            for(int[] x:dp)
                Arrays.fill(x,-1);
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    solve(a,m,n,i,j,dp);
                }
            }
           for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    ans=Math.max(ans,dp[i][j]);
                }
            }
           sb.append(ans+"\n");
        }
        System.out.print(sb);
    }
}
