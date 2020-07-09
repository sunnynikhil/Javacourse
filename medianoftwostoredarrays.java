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
public class medianoftwostoredarrays {
    
    public static double median(int a[],int b[])
    {
        int n = a.length;
        int m = b.length;
        int px = 0,py=0,leftx=0,lefty=0,rightx=0,righty=0,start=0,end=n;
        while(start<=end)
        {
           px=(start+end)/2;
           py=(n+m+1)/2-px; 
           leftx = (px==0)?Integer.MIN_VALUE : a[px-1];
           rightx = (px==n)?Integer.MAX_VALUE:a[px];
           lefty = (py==0)?Integer.MIN_VALUE:b[py-1];
           righty = (py==m)?Integer.MAX_VALUE:b[py];
           if(leftx<=righty && rightx<=rightx)
           {
               if((n+m)%2==0)
                   return (double)(Math.max(leftx,lefty))/2+(Math.min(rightx, righty)/2);
               else
                   return (double)Math.max(leftx, lefty);
           }
           else if(leftx>righty)
           {
               end = py-1;
               
           }
           else
           {
               start = px+1;
           }
           
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[]=new int[n];
        int b[] = new int[m];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=0;i<m;i++)
            b[i]=in.nextInt();
        System.out.print(median(a,b));
    }
}
