/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class maxsum2darray {
    public static int findMaxSum(int a[], int size) 
{ 
    int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; 
  
    for (int i = 0; i < size; i++) 
    { 
        max_ending_here = max_ending_here + a[i]; 
        if (max_so_far < max_ending_here) 
            max_so_far = max_ending_here; 
  
        if (max_ending_here < 0) 
            max_ending_here = 0; 
    } 
    return max_so_far; 
} 
    public static int getMaxSum(int a[][],int n,int m)
    {
        int cur_sum=0,max=0;
        int pre_sum[] = new int[m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(pre_sum,0);
            for(int j=i;j<n;j++)
            {
                for(int k=0;k<m;k++)
                    pre_sum[k]=pre_sum[k]+a[j][k];
                cur_sum=findMaxSum(pre_sum,n);
                if(cur_sum>max)
                    max=cur_sum;
            }
        }
        
      return max;          
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            int m = in.nextInt();
            int a[][] = new int[n][m];
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                    a[i][j]=in.nextInt();
            System.out.println(getMaxSum(a,n,m));
        }
    }
}
