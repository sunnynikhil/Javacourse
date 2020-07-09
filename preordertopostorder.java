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
public class preordertopostorder {
    static class INT{
        int d;
        INT(int d)
        {
            this.d=d;
        }
    }
    public static void findPostOrderUtil(int pre[],int n,int minval,int maxval,INT preIndex)
    {
        if(preIndex.d==n)
            return;
        if(pre[preIndex.d]<minval || pre[preIndex.d]>maxval)
            return;
        int val = pre[preIndex.d];
        preIndex.d++;
        findPostOrderUtil(pre,n,minval,val,preIndex);
        findPostOrderUtil(pre,n,val,maxval,preIndex);
        System.out.print(val+" ");
    }
    public static void preorderToPostorder(int a[],int n)
    {
        INT preIndex = new INT(0);  
  
    findPostOrderUtil(a, n, Integer.MIN_VALUE,  
                    Integer.MAX_VALUE, preIndex);
    }
    public static void reverse(int a[],int l,int h)
    {
        while(l<h)
        {
            int temp=a[h];
            a[h]=a[l];
            a[l]=temp;
            l++;
            h--;
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
         preorderToPostorder(a,n);
         
         System.out.println();
	 }
	 }
}
