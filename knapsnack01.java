/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
class item
{
    int wt;
    int val;
    item(int wt,int val)
    {
        this.wt=wt;
        this.val=val;
    }
}
public class knapsnack01 {
    public static int knapsnack01(int W,int wt[],int val[],int n)
    {
        int i, w; 
        int K[][] = new int[n + 1][W + 1]; 
  
        // Build table K[][] in bottom up manner 
        for (i = 0; i <= n; i++) { 
            for (w = 0; w <= W; w++) { 
                if (i == 0 || w == 0) 
                    K[i][w] = 0; 
                else if (wt[i - 1] <= w) 
                    K[i][w] = Math.max(  
                        val[i - 1] + K[i - 1][w - wt[i - 1]], 
                        K[i - 1][w]); 
                else
                    K[i][w] = K[i - 1][w]; 
            } 
        } 
  
        return K[n][W]; 
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int w = in.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];
        for(int i=0;i<n;i++)
            val[i]=in.nextInt();
        for(int i=0;i<n;i++)
            wt[i] = in.nextInt();
        System.out.print(knapsnack01(w,wt,val,n));
    }
}
