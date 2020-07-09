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
public class Kclosestelements {
    public static int search(int a[],int l ,int h,int key){
    
        if(l>h)
            return -1;
        
        if(a[l]>key)
            return l;
        
        if(a[h]<=key)
            return h;
        
        int mid=(l+h)/2;
        
        if(a[mid]<=key && a[mid+1]>=key)
            return mid;
        if(a[mid]<key)
            return search(a,mid+1,h,key);
        return search(a,l,mid-1,key);
}
    public static void kcolse(int a[],int key,int k)
    {
        int l=search(a,0,a.length-1,key);
        int r=l+1;
        if(a[l]==key)l=l-1;
        int count=0;
        while(l>=0 && r<a.length && count<k)
        {
            if(key-a[l]<a[r]-key)
                System.out.print(a[l--]+" ");
            else
                System.out.print(a[r++]+" ");
            
            count++;
        }
        
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int key = in.nextInt();
        int k = in.nextInt();
        kcolse(a,key,k);
    }
}
