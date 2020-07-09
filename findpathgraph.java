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
public class findpathgraph {
    public static boolean PathExistsOrNotUtil(int a[][],int i,int j,int n)
    {
        if(i<0 || i>=n || j<0 || j>=n)
            return false;
        if(a[i][j]==0)
            return false;
        if(a[i][j]==2)
            return true;
        
        if(a[i][j]==3 || a[i][j]==1)
        {
            a[i][j]=-1;
            if(PathExistsOrNotUtil(a,i-1,j,n))
                return true;
            else if(PathExistsOrNotUtil(a,i,j-1,n))
                return true;
            else if(PathExistsOrNotUtil(a,i+1,j,n))
                return true;
            else if(PathExistsOrNotUtil(a,i,j+1,n))
                return true;
                
        }
        return false;
                    
    }
    public static boolean PathExistsOrNot(int a[][],int n)
    {
        int s_i=-1,s_j=-1;
        for(int i=0;i<n;i++)
        { for(int j=0;j<n;j++)
                if(a[i][j]==1)
                {
                    s_i=i;
                    s_j=j;
                    break;
                }
        }
        
        return PathExistsOrNotUtil(a,s_i,s_j,n);
        
    }
    public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int[][] a = new int[n][n];
         for(int i=0;i<n;i++)
             for(int j=0;j<n;j++)
                 a[i][j]=in.nextInt();
         boolean r =PathExistsOrNot(a,n);
         if(r)
             System.out.println("1");
         else
             System.out.println("0");
	 }
	 }
}
