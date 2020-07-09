/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
import java.util.*;
public class nextpermutation {
    public static void nextpermution(int a[],int n){
     int i;
     for(i=n-1;i>0;i--){
         if(a[i]>a[i-1]){
           break;}
     }
     if(i==0)
     {
         int l=0,r=n-1;
         while(l<=r)
         {
             swap(a,l,r);
             l++;
             r--;
         }
     }
     else{
         int x = a[i-1],min=i;
         for(int j=i+1;j<n;j++)
         {
             if(a[j]>x && a[j]<a[min])
                 min=j;
         }
         swap(a,i-1,min);
         Arrays.sort(a,i,n);
         
         
         
     }
     for( i=0;i<n;i++)
            System.out.print(a[i]+" ");
     
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        nextpermution(a,n);
        
    }

    private static void swap(int[] a, int i, int min) {
        int temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    }
}
