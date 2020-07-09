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
public class rotatearray1 {
    public static void rotateArray(int a[][],int n)
    {
        for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<n-i-1;j++)
            {
                int temp = a[n-1-j][i];
                a[n-1-j][i] = a[n-1-i][n-1-j];
                 a[n-1-i][n-1-j] = a[j][n-1-i];
                 a[j][n-1-i]=a[i][j];
                a[i][j]=temp;
            }
        }
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
         int[][] mat = new int[n][n];
         for(int i=0;i<n;i++)
             for(int j=0;j<n;j++)
                 mat[i][j]=in.nextInt();
	 rotateArray(mat,n);
         for(int i=0;i<n;i++)
             for(int j=0;j<n;j++)
                 System.out.print(mat[i][j]+" ");
	 }
	 }
}
