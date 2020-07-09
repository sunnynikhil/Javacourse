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
public class maxareaof1s {
    public static int countOnes(int a[][],int i,int j,int n,int m)
    {
        if(i<0 || i>=n || j<0|| j>=m)
            return 0;
        if(a[i][j]!=1)
            return 0;
        int key=0;
        a[i][j]=-1;
        key+=countOnes(a,i-1,j,n,m)+1;
        key+=countOnes(a,i,j-1,n,m)+1;
        key+=countOnes(a,i-1,j-1,n,m)+1;
        key+=countOnes(a,i+1,j+1,n,m)+1;
        key+=countOnes(a,i-1,j+1,n,m)+1;
        key+=countOnes(a,i+1,j-1,n,m)+1;
        key+=countOnes(a,i,j+1,n,m)+1;
        key+=countOnes(a,i+1,j,n,m)+1;
        return key;
        
        
    }
    public static int getMaxArea(int a[][],int n,int m)
    {
        int max=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(a[i][j]==1)
                {
                    int key = countOnes(a,i,j,n,m);
                    if((key/8)>max)
                        max=key/8;
                }
            }
        return max;
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
         int a[][] = new int[n][m];
         for(int i=0;i<n;i++)
             for(int j=0;j<m;j++)
                 a[i][j]=in.nextInt();
         System.out.println(getMaxArea(a,n,m));
	 
	 }
	 }
    
}
