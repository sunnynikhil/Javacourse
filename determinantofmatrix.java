/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
public class determinantofmatrix {
    public static void getcofactor(int a[][],int temp[][],int p,int q,int n)
    {
        int i=0,j=0;
        for(int row=0;row<n;row++)
            for(int col=0;col<n;col++)
            {
                if(row!=p && col!=q)
                    temp[i][j++]=a[row][col];
                if(j==n-1)
                {
                    j=0;
                    i++;
                }
            }
    }
    public static int determinant(int a[][],int n)
    {
        int d=0;
        if(n==1)
           return a[0][0];
        int temp[][] = new int[n][n];
        int sign=1;
        for(int i=0;i<n;i++)
        {
            getcofactor(a,temp,0,i,n);
            d+=sign*a[0][i]*determinant(temp,n-1);
            sign=-sign;
        }
        return d;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=in.nextInt();
        System.out.print(determinant(a,n));
    }
    
}
