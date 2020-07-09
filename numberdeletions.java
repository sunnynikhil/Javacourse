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
public class numberdeletions {
    public static int lps(String s)
    {
        int n = s.length();
         int[][] lps = new int[n][n];
         
         for(int i=0;i<n;i++)
             lps[i][i]=1;
         for(int c1=2;c1<=n;c1++)
         {
             for(int i=0;i<n-c1+1;i++)
             {
                 int j = i+c1-1;
                 if(s.charAt(i)==s.charAt(j) && c1==2)
                     lps[i][j]=2;
                 else if(s.charAt(i)==s.charAt(j))
                     lps[i][j]=lps[i+1][j-1]+2;
                 else
                     lps[i][j]=Integer.max(lps[i][j-1], lps[i+1][j]);
                     
             }
         }
         return lps[0][n-1];
    }
    public static int noDeletions(String s)
    {
        int n = s.length();
        int len = lps(s);
         return n-len;
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 String s = in.next();
         System.out.println(noDeletions(s));
	 
	 }
	 }
}
