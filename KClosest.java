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
public class KClosest {
     public static int firstevercross(int arr[],int low,int high,int x){
        if(arr[high]<=x)
            return high;
        if(arr[low]>=x)
            return low;
        int mid =(low+high)/2;
        
        if(arr[mid] <= x && arr[mid+1] > x)
            return mid;
        if(arr[mid]<x)
            return firstevercross(arr,mid+1,high,x);
        return firstevercross(arr,0,mid-1,x);
    }
    public static void kclosest(int arr[],int n,int x, int k){
        
        int l = firstevercross(arr,0,n-1,x);
        int r = l+1;
        int count =0;
        if(arr[l]==x)l--;
        
        while(l>=0 && r<n && count<k){
            if(x - arr[l] < arr[r] - x){
                System.out.print(arr[l--]+" ");
                
            }
            else
                System.out.print(arr[r++]+" ");
            
            count++;
        }
        
        while(count<k && l>=0)
        {System.out.print(arr[l--]+" ");
        count++;
        }
        
        while(count<k && r<n)
        {System.out.print(arr[r++]+" ");
        count++;
        }
        
    }
    public static void main(String[] args){
        int arr[] = new int[100];
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int x=in.nextInt();
        int k = in.nextInt();
        kclosest(arr,n,x,k);
    }
}
