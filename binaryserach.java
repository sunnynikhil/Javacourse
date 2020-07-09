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
public class binaryserach {
    public static int bin(int a[],int low, int high,int k){
        
        if(low>high)
            return -1;
        int mid=(low+high)/2;
        
        if(a[mid]==k)
            return mid;
        else if(a[mid]>k){
             return bin(a,low,mid-1,k);
        }
        else if(a[mid]<k){
           return bin(a,mid+1,high,k);
        }
        
        return -1;
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
            System.out.print(bin(a,0,n-1,key));
        }
    }
}
