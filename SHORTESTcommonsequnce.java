/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class SHORTESTcommonsequnce {
    public static int lcs(char[] x,char[] y)
    {
        int[][] lcs = new int[x.length+1][y.length+1];
        for(int i=0;i<=x.length;i++)
            for(int j=0;j<=y.length;j++)
            {
                if(i==0 || j==0)
                    lcs[i][j]=0;
                else if(x[i-1]==y[j-1])
                    lcs[i][j]=lcs[i-1][j-1]+1;
                else
                    lcs[i][j]=Math.max(lcs[i][j-1], lcs[i-1][j]);
            }
        return lcs[x.length][y.length];
            
    }
    public static int getshorestString(String s1,String s2)
    {
        char[] x = s1.toCharArray();
        char[] y = s2.toCharArray();
        int l = lcs(x,y);
        return ((x.length+y.length)-l);
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
             String s = in.next();
             String s1 = in.next();
             System.out.println(getshorestString(s,s1));
	 
	 }
	 }
}
