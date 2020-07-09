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
public class noofocccurences {
    public static boolean binary_serach(int a[],int l,int h,int key)
    {
        int mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(a[mid]==key)
                return true;
            else if(a[mid]>key)
                h=mid-1;
            else
                l=mid+1;
               
        }
        return false;
    }
    public static int upper(int a[],int l,int h,int k)
    {
        int mid=0;
        while(l<h)
        {
            mid=(l+h)/2;
            while(a[mid]==k)
            {
                if(mid==h || a[mid+1]!=k )
                    return mid;
                else
                    mid=mid+1;
            }
            if(a[mid]>k)
                h=mid-1;
            else
                l=mid+1;
                
            
        }
        return 0;
    }
     public static int lower(int a[],int l,int h,int k)
    {
        int mid=0;
        while(l<h)
        {
            mid=(l+h)/2;
            while(a[mid]==k)
            {
                if(mid==0 || a[mid-1]!=k )
                    return mid;
                else
                    mid=mid-1;
            }
            if(a[mid]>k)
                h=mid-1;
            else
                l=mid+1;
                
            
        }
        return 0;
    }
     public static int countOccurences(int a[],int n,int k)
     {
         boolean flag = binary_serach(a,0,n-1,k);
         if(flag==true)
          return upper(a,0,n-1,k)-lower(a,0,n-1,k)+1;
         else
             return -1;
     }
	public static void main (String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int k = in.nextInt();
	 int a[] = new int[n];
	 for(int i=0;i<n;i++)
	    a[i]=in.nextInt();
	 System.out.println(countOccurences(a,n,k));  
	 }
	 }
}
