/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.determinantofmatrix.determinant;

/**
 *
 * @author oyo
 */

public class roatatematrix {
    public static void rotatematrix(int a[][],int n)
    {
        for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<n-i-1;j++)
            {
                int temp = a[i][j];
                a[i][j]=a[j][n-1-i];
                a[j][n-1-i]=a[n-1-j][n-1-i];
                a[n-1-j][n-1-i]=a[n-1-j][i];
                a[n-1-j][i]=temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=in.nextInt();
        rotatematrix(a,n);
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+" ");
    }
}
