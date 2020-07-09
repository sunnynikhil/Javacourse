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
public class mergesort {
    
    public static void merge(int a[],int l,int m,int r){
        int n1=m-l+1;
        int n2 = r-m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<n1;i++)
            L[i]=a[l+i];
        for(int j=0;j<n2;j++)
            R[j]=a[m+1+j];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j])
            {
                a[k]=L[i];
                i++;
            }
            else
            {
                a[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=R[j];
            j++;
            k++;
        }
    }
    
    public static void mergesort(int a[],int l,int r){
        if(l<r){
            int m =(l+r)/2;
            mergesort(a,l,m);
            mergesort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        mergesort(a,0,n-1);
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
