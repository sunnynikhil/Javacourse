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
public class sumofmatrix {
    public static int getSumOfMatrix(int a[][],int n,int m,int x1,int y1,int x2,int y2)
    {
        int sum=0;
//        int start = x1*y1;
//        int end = x2*y2;
//        for(int i=start-1;i<end;i++)
//            sum+=a[i/m][i%m];
        for(int i=x1-1;i<x2;i++)
            for(int j=y1-1;j<y2;j++)
                sum+=a[i][j];
        return sum;
        
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int m = in.nextInt();
         int[][] a = new int[n][m];
         for(int i=0;i<n;i++)
             for(int j=0;j<m;j++)
                 a[i][j]=in.nextInt();
         int x1=in.nextInt();
         int y1=in.nextInt();
         int x2=in.nextInt();
         int y2=in.nextInt();
         System.out.println(getSumOfMatrix(a,n,m,x1,y1,x2,y2));
	 }
	 }
    
}
