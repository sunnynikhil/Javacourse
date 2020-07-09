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
public class noofways {
    public static long getNumberOfWays(int n)
     {
         long[] dp = new long[n+1];
         for(int i=1;i<=n && i<=3;i++)
           dp[i]=1;
        if(n>=4)
          dp[4]=2;
        for(int i=5;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-4];
        }
        return dp[n];
     }
	public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 System.out.println(getNumberOfWays(n));
	 }
	 }
}
