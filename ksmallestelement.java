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
public class ksmallestelement {
    public static void Heapify(int a[],int n,int i)
    {
        int largest=i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && a[l]<a[largest])
            largest = l;
        if(r<n && a[r]<a[largest])
            largest = r;
        if(largest!=i)
        {
            int temp = a[i];
            a[i]=a[largest];
            a[largest ]= temp;
            Heapify(a,n,largest);
        }
    }
    public static int getKthSmallestElement(int a[],int k)
    {
        int n = a.length;
        for(int i=n/2-1;i>=0;i--)
            Heapify(a,n,i);
        for(int i=n-1;i>0;i--)
        {
            int temp =a[0];
            a[0]=a[i];
            a[i]=temp;
            Heapify(a,i,0);
        }

        return a[n-k];
    }
    public static void main(String[] args)        
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int k = in.nextInt();
        System.out.print(getKthSmallestElement(a,k));
    }
}
