/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class twoarrayscounting {
    public static int search(int a[],int n,int key)
    {
        int l=0,h=n-1,mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(a[mid]==key ||(mid+1<n && a[mid]<key && a[mid+1]>key))
            {
                while(mid+1<n && a[mid+1]==key)
                  mid=mid+1;
                return mid;  
            }
            else if( a[mid]<key)
               l=mid+1;
            else if( a[mid]>key)
              h=mid-1;
            
        }
        if(mid==0)
          return mid-1;
        return mid;
    }
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> res = new ArrayList<>();
       Arrays.sort(arr2);
       for(int i=0;i<m;i++)
       {
           int tmp = arr1[i];
           int mid = search(arr2,n,tmp);
           res.add(mid+1);       
       }
       return res;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for(int i=0;i<m;i++)
            arr1[i]=in.nextInt();
        for(int i=0;i<n;i++)
            arr2[i]=in.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        res = countEleLessThanOrEqual(arr1,arr2,m,n);
        System.out.print(res);
    }
}
