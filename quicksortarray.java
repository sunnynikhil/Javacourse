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
public class quicksortarray {
    public static int pritation(int a[],int low,int high)
    {
        int pivot = a[high];
        int i = low-1;
        for(int j=low;j<=high;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp = a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
    }
    public static void quicksort(int a[],int low,int high)
    {
        if(low<high){
        int pi = pritation(a,low,high);
        quicksort(a,low,pi-1);
        quicksort(a,pi+1,high);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        quicksort(a,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
