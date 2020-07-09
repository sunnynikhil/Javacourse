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
public class abccombinations {
    public static int countCombinationUtil(int[][][] dp,int n,int b,int c)
    {
        if(b<0 || c<0)
            return 0;
        if(n==0)
            return 1;
        if(b==0 && c==0)
            return 1;
        if(dp[n][b][c]!=-1)
            return dp[n][b][c];
        int res = countCombinationUtil(dp,n-1,b,c);
        res+=countCombinationUtil(dp,n-1,b-1,c);
        res+=countCombinationUtil(dp,n-1,b,c-1);
        return dp[n][b][c]=res;
    }
    public static int countCombination(int n,int b,int c)
    {
        int[][][] dp = new int[n+1][2][3];
        for(int i=0;i<n+1;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<3;k++)
                    dp[i][j][k]=-1;
        return countCombinationUtil(dp,n,b,c);
        
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int bcount=1,ccount=2;
         System.out.println(countCombination(n,bcount,ccount));
	 }
	 }
}
