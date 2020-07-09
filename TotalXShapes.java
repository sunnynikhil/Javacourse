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
public class TotalXShapes {
    public static void DFS(boolean vist[][],char[][] a, int i,int j,int n,int m)
    {
        if(a[i][j]=='X' && vist[i][j]==false)
        {
            vist[i][j]=true;
            if(i+1<n)DFS(vist,a,i+1,j,n,m);
            if(i-1>=0)DFS(vist,a,i-1,j,n,m);
            if(j+1<m)DFS(vist,a,i,j+1,n,m);
            if(j-1>=0)DFS(vist,a,i,j-1,n,m);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            int m = in.nextInt();
            char a[][] = new char[n][m];
            boolean[][] vist = new boolean[n][m];
            for(int i=0;i<n;i++)
            { 
                String s = in.next();
                for(int j=0;j<m;j++)
                { 
                    a[i][j]=s.charAt(j);
                    vist[i][j]=false;
                
                }
            }
            int count=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(vist[i][j]==false && a[i][j]=='X')
                    {
                        DFS(vist,a,i,j,n,m);
                        count++;
                    }
                }
            }
            System.out.println(count);
           
        }
    }
    
}
