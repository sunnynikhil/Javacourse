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
public class countprallandromicstring {
    public static int countpralandromes(String s)
    {
        int n= s.length();
        int[][] table=new int[n+1][n+1];
        for(int i=0;i<n;i++)
            table[i][i]=1;
        for(int L=2;L<=n;L++)
        {
            for(int i=0;i<n;i++)
            {
                int k=L+i-1;
                if(k<n)
                {
                    if(s.charAt(i)==s.charAt(k))
                    {
                        table[i][k]=table[i][k-1]+table[i+1][k]+1;
                    }
                    else
                        table[i][k]=table[i][k-1]+table[i+1][k]-table[i+1][k-1];
                }
            }
        }
       return table[0][n-1];
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(countpralandromes(s));
    }
}
