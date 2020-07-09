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
public class numberofgroups {
    public static int getMinNumberOfGroups(int a[],int n)
    {
        int count=0;
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if((a[i]+a[j])%3==0)
                    count++;
        for(int i=0;i<n-2;i++)
            for(int j=i+1;j<n-1;j++)
                for(int k=j+1;k<n;k++)
                    if((a[i]+a[j]+a[k])%3==0)
                        count++;
        return count;
    }
     int findgroups(int arr[], int n)  
    { 
        // Create an array C[3] to store counts of elements with remainder 
        // 0, 1 and 2.  c[i] would store count of elements with remainder i 
        int c[] = new int[]{0, 0, 0}; 
        int i; 
  
        int res = 0; // To store the result 
  
        // Count elements with remainder 0, 1 and 2 
        for (i = 0; i < n; i++) 
            c[arr[i] % 3]++; 
  
        // Case 3.a: Count groups of size 2 from 0 remainder elements 
        res += ((c[0] * (c[0] - 1)) >> 1); 
  
        // Case 3.b: Count groups of size 2 with one element with 1 
        // remainder and other with 2 remainder 
        res += c[1] * c[2]; 
  
        // Case 4.a: Count groups of size 3 with all 0 remainder elements 
        res += (c[0] * (c[0] - 1) * (c[0] - 2)) / 6; 
  
        // Case 4.b: Count groups of size 3 with all 1 remainder elements 
        res += (c[1] * (c[1] - 1) * (c[1] - 2)) / 6; 
  
        // Case 4.c: Count groups of size 3 with all 2 remainder elements 
        res += ((c[2] * (c[2] - 1) * (c[2] - 2)) / 6); 
  
        // Case 4.c: Count groups of size 3 with different remainders 
        res += c[0] * c[1] * c[2]; 
  
        // Return total count stored in res 
        return res; 
    } 
    public static void main(String[] args)
	 {
	 //code
	 Scanner in = new Scanner(System.in);
	 int t = in.nextInt();
	 while(t-->0)
	 {
	 int n = in.nextInt();
	 int a[] = new int[n];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         System.out.println(getMinNumberOfGroups(a,n));
	 }
	 }
}
