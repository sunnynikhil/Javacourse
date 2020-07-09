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
public class zigzigarray {
    public static void swap(int a[],int x, int y)
    {
        int temp =a[x];
        
        a[x]=a[y];
        
        a[y]=temp;
        
    }
    public static void convertToZigzig(int a[],int n)
    {
        boolean flag=true;
        for(int i=0;i<n-1;i++)
        {
            if(flag==true)
            { if(a[i]>a[i+1])
            {
                swap(a,i,i+1);
            }
                }
            if(flag==false)
            {
               { 
                   if(a[i]<a[i+1])
            {
                swap(a,i,i+1);
            }
                } 
            }
            flag=!flag;
                    
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
	 int a[] = new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         convertToZigzig(a,n);
         for(int i=0;i<n;i++)
             System.out.print(a[i]+" ");
         System.out.println();
	 }
	 }
    
}
