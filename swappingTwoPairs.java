/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class swappingTwoPairs {
    static int getSum(int X[], int n) 
    { 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
            sum += X[i]; 
        return sum; 
    }
    static int getTarget(int A[], int n, int B[], int m) 
    { 
        // Calculation of sums from both arrays 
        int sum1 = getSum(A, n); 
        int sum2 = getSum(B, m); 
   
        // because that the target must be an integer 
        if ((sum1 - sum2) % 2 != 0) 
            return 0; 
        return ((sum1 - sum2) / 2); 
    } 
    public static int isPossible(int[] A,int[] B,int n,int m)
    {
         Arrays.sort(A); 
        Arrays.sort(B); 
   
        // Note that target can be negative 
        int target = getTarget(A, n, B, m); 
   
        // target 0 means, answer is not possible 
        if (target == 0) 
            return -1; 
   
        int i = 0, j = 0; 
        while (i < n && j < m)  
        { 
            int diff = A[i] - B[j]; 
            if (diff == target)  
            { 
                return 1; 
            } 
   
            // Look for a greater value in A[] 
            else if (diff < target) 
                i++; 
   

            else
                j++; 
        }   
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
	 int m = in.nextInt();
         int a[] = new int[n];
         int b[] = new int[m];
         for(int i=0;i<n;i++)
             a[i]=in.nextInt();
         for(int j=0;j<m;j++)
             b[j]=in.nextInt();
         System.out.println(isPossible(a,b,n,m));
	 }
	 }
}
