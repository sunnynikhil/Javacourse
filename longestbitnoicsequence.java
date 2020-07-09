/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class longestbitnoicsequence {
    public static int findLongestsubsequnece(int a[],int n)
    {
        int[] incresing = new int[n];
        int[] decrseing = new int[n];
        int tail1[] = new int[n];
        int tail2[] = new int[n];
        if(n==0)
            return 0;
        int in=1;
        incresing[0]=a[0];
        tail1[0]=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]<incresing[0])
            {
                incresing[0]=a[i];
                tail1[i]=0;
            }
            else if (a[i]>incresing[in-1])
            {
                incresing[in++]=a[i];
                tail1[i]=in-1;
            }
            else
            {
                int getIndex=Arrays.binarySearch(incresing,0,in, a[i]);
                if(getIndex<=-1)
                    continue;
                incresing[getIndex]=a[i];
                tail1[i]=getIndex;
                
            }
        }
        in = 1;
        reverse(a);
        decrseing[0]=a[0];
        tail2[0]=0;
        for(int i=0;i<n;i++)
        {
          if(a[i]<decrseing[0])
            {
                decrseing[0]=a[i];
                tail2[i]=0;
            }
            else if (a[i]>decrseing[in-1])
            {
                decrseing[in++]=a[i];
                tail2[i]=in-1;
            }
            else
            {
                int getIndex=Arrays.binarySearch(decrseing,0,in, a[i]);
                if(getIndex<=-1)
                    continue;
                decrseing[getIndex]=a[i];
                tail2[i]=getIndex;
                
            }  
        }
        int ans = 0; 
        reverse(tail2);
        for (int i = 0; i < n; i++) 
        { 
            if (ans < (tail1[i] + tail2[i] + 1)) 
                ans = (tail1[i] + tail2[i] + 1); 
        } 
        return ans;
    }
    public static void reverse(int a[])
    {
        int i=0,j=a.length-1;
        while(i<j)
        {
           int temp = a[j];
           a[j]=a[i];
           a[i]=temp;
           i++;
           j--;
        }
    }
    public static void main (String[] args)
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
         System.out.println(findLongestsubsequnece(a,n));
	 
	 }
	 }
    
}
