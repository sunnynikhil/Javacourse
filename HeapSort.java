/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;

/**
 *
 * @author oyo
 */

public class HeapSort {
    public static void heapify(int arr[],int n,int i){
//        System.out.print("n="+n+"i="+i);
        int last=i;
        int l=2*i+1;
        int r=2*i+2;
//        HashMap<Integer,Integer> hash = new HashMap<>();
//        hash.containsKey(r)
        if(l<n && arr[l]>arr[last])
            last=l;
        if(r<n && arr[r]>arr[last])
            last=r;
        if(i!=last){
            int swap=arr[i];
            arr[i]=arr[last];
            arr[last]=swap;
            heapify(arr,n,last);
        }
    }
    public static void main(String[] args){
        int arr[]={4, 1, 3, 9 ,7};
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        
        for(int i=n-1;i>0;i--){
            
            int swap=arr[0];
            arr[0]=arr[i];
            arr[i]=swap;
            
            heapify(arr,i,0);
        }
        for(int i=0;i<n;i++)
           System.out.print(arr[i]+" "); 
    }
}
