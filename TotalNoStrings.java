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
public class TotalNoStrings {
    public static int countStringsUtil(int n , int[][][] dp,int bcount,int ccount)
    {
        if(bcount<0 || ccount<0)
            return 0;
        if(n==0)
            return 1;
        if(bcount==0 && ccount==0)
            return 1;
        if(dp[n][bcount][ccount]==-1)
            return dp[n][bcount][ccount];
        int res = countStringsUtil(n-1,dp,bcount,ccount);
        res+=countStringsUtil(n-1,dp,bcount-1,ccount);
        res+=countStringsUtil(n-1,dp,bcount,ccount-1);
        return (dp[n][bcount][ccount]=res);
    }
    public static int countStrings(int n,int bcount,int ccount)
    {
        int[][][] dp = new int[n+1][2][3];
        for(int i=0;i<n+1;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<3;k++)
                    dp[i][j][k]=-1;
        return countStringsUtil(n,dp,bcount,ccount);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        while(t-->0)
        {
            int n = in.nextInt();
            int bcount=1,ccount=2;
            System.out.println(countStrings(n,bcount,ccount));
        }
    }
    
}
