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
public class sliptarray {
    
    public static void heapify(int a[],int n,int i){
        int large = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && a[l]>a[large])
            large=l;
        if(r<n && a[r]>a[large])
            large=r;
        if(i!=large){
            
            int swap = a[i];
            a[i]=a[large];
            a[large]=swap;
            heapify(a,n,large);
        }
    }
    public static void heapsort(int a[]){
        
        int n = a.length;
        int ls=0;
        int rs =0;
        
        for(int i=0;i<n && i<n+1;i=i+2){
            int x= a[i];
            int y = a[i+1];
            if(rs>ls){
                ls=ls+y;
                rs=rs+x;
            }
            else if(ls>=rs){
                ls=ls+x;
                rs=rs+y;
            }
            
            
        }
        int mind=Math.max(rs,ls) - Math.min(rs, ls);
        System.out.print("minimum difenernce"+mind);
        
    }
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        a[i]=in.nextInt();
    }
    for(int i=n/2-1;i>=0;i--)
    {
        heapify(a,n,i);
    }
    for(int i=n-1;i>0;i--){
            
            int swap=a[0];
            a[0]=a[i];
            a[i]=swap;
            
            heapify(a,i,0);
        }
    
    heapsort(a);
        }
}
