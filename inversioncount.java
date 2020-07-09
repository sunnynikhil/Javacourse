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
public class inversioncount {
    
    public static int countInversions(int a[]){
        int count=0;
        for(int i=0;i<a.length-1;i++)
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                    count++;
            }
        return count;
    }
    public static int  mergecount(int a[],int l,int m ,int r){
        int left[] = Arrays.copyOfRange(a, l, m+1);
        int right[] = Arrays.copyOfRange(a, m+1, r+1);
        for(int i=0;i<left.length;i++)
            System.out.print(left[i]+" ");
        System.out.println();
        for(int i=0;i<right.length;i++)
            System.out.print(right[i]+" ");
        System.out.println();
        int i=0,j=0,k=l,swaps=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                a[k++]=left[i++];
            }
            else{
                a[k++]=right[j++];
                swaps+=(m+1)-(l+i);
            }
        }
        while(i<left.length){
            a[k++]=left[i++];
        }
        while(j<right.length)
            a[k++]=right[j++];
        
        System.out.println("swaps:"+swaps);
        return swaps;
    }
    public static int mergesort(int a[],int l,int r){
        int count=0;
        if(l<r){
            int m=(l+r)/2;
            count+=mergesort(a,l,m);
            count+=mergesort(a,m+1,r);
            count+=mergecount(a,l,m,r);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print("count:"+mergesort(a,0,a.length-1));
    }
}
