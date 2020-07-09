/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.roatatematrix.rotatematrix;

/**
 *
 * @author oyo
 */
public class searchinmatrix {
    public static int serachonmatrix(int a[][],int n,int m,int k)
    {
        if(k<a[0][0] || k>a[n-1][m-1])
            return 0;
        int row=0,col=m-1;
        while(row<n && col>=0)
        {
            if(a[row][col]==k)
                return 1;
            else if(a[row][col]>k)
                col--;
            else
                row++;
        }
        return 0;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=in.nextInt();
        int k=in.nextInt();
        System.out.print(serachonmatrix(a,n,m,k));
    }
}
