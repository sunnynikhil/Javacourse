/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.searchinmatrix.serachonmatrix;

/**
 *
 * @author oyo
 */
public class sprialformofarray {
    public static void sprialform(int a[][],int n,int m)
    {
        int k=0,l=0;
        while(k<n &&l>=0)
        {
            for(int i=l;i<n;++i)
                System.out.print(a[k][i]+" ");
            k++;
            for(int i=k;i<n;++i)
                System.out.print(a[i][n-1]+" ");
            n--;
            if(k<m)
            {
                for(int i=n-1;i>=l;--i)
                    System.out.print(a[m-1][i]+" ");
                m--;
            }
            if(l<n)
            {
                for(int i=m-1;i>=k;--i)
                    System.out.print(a[i][l]+" ");
                l++;
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=in.nextInt();
        sprialform(a,n,m);
    }
}
