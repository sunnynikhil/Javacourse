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
public class matrixChainMultiplication {
    static char name;
    public static void printParathesis(int i,int j,int n,int[][] brackets)
    {
        if(i==j)
        {
            System.out.print(name++);
            return;
        }
        System.out.print('(');
        printParathesis(i,brackets[j][i],n,brackets);
        printParathesis(brackets[j][i]+1,j,n,brackets);
        System.out.print(')');
    }
    public static void  MatrixChainOrder(int a[],int n)
    {
        int i,j,k,l,q;
        int[][] m = new int[n][n];
        for(i=1;i<n;i++)
            m[i][i]=0;
        for(l=2;l<n;l++)
        {
            for(i=1;i<=n-l+1;i++)
            {
                j=i+l-1;
                if(j==n) continue;
                m[i][j]=Integer.MAX_VALUE;
                for(k=i;k<=j-1;k++)
                {
                    q = m[i][k]+m[k+1][j]+a[i-1]*a[k]*a[j];
                    if(q<m[i][j])
                    {  m[i][j]=q;
                       m[j][i]=k;
                    }
                        
                }
            }
        }
        name = 'A';
        printParathesis(1,n-1,n,m);
       
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i]=in.nextInt();
            MatrixChainOrder(a,n);
            System.out.println();
        }
    }
}
