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
public class optimalgame {
    public static int optimalGame(int n,int a[],int i,int j)
    {
        if(j==i)
            return a[i];
        if(j==i+1)
            return Math.max(a[i], a[j]);
        return Math.max(a[i]+Math.min(optimalGame(n,a,i+2,j),optimalGame(n,a,i+1,j-1))
                , a[j]+Math.min(optimalGame(n,a,i+1,j-1),optimalGame(n,a,i,j-2)) );
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
         {
             a[i]=in.nextInt();
         }
         System.out.println(optimalGame(n,a,0,n-1));
	 }
    }
}
