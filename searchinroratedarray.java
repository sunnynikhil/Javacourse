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
public class searchinroratedarray {
    public static int search(int a[],int l,int h,int key){
        if(l>h)
            return -1;
        int mid = (l+h)/2;
        if(a[mid]==key)
            return mid;
        else if(a[l]<=a[mid])
        {
            if(key>=a[l] && key<=a[mid])
                return search(a,l,mid-1,key);
            return search(a,mid+1,h,key);
            
        }
        
        else
        {
            if(key<=a[h]&& key>=a[mid])
               return search(a,mid+1,h,key);
            return search(a,l,mid-1,key);
        }
    }
 public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i]=in.nextInt();
            int key = in.nextInt();
            System.out.print(search(a,0,n-1,key));
        }
    }   
}
