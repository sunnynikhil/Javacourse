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
public class sortMatrix {
    public static void sortMartix(int a[][],int n)
    {
        int size = n*n;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(a[j/n][j%n]>a[(j+1)/n][(j+1)%n])
                {
                    int temp =a[j/n][j%n];
                    a[j/n][j%n] = a[(j+1)/n][(j+1)%n];
                    a[(j+1)/n][(j+1)%n] = temp;
                }
            }
        }
    }
    public static void printSortedMatrix(int mat[][],int n)
    {
        sortMartix(mat,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        
        }
                
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            int[][] mat = new int[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    mat[i][j]=in.nextInt();
            printSortedMatrix(mat,n);
        }
    }
}
