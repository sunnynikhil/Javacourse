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
public class peekelement {
    public static int peekutil(int a[],int l , int h,int n){
        int mid=(l+h)/2;
        if((mid==0 || a[mid]>a[mid-1])&&(mid==n|| a[mid]>a[mid+1]))
            return mid;
        else if(mid>0 && a[mid-1]>a[mid])
            return peekutil(a,l,mid-1,n);
        else
            return peekutil(a,mid+1,h,n);
    }
    public static int peekof(int a[], int n){
        return peekutil(a,0,n-1,n);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i]=in.nextInt();
            System.out.println(peekof(a,n));
        }
    }
}
