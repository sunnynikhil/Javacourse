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
public class maxsumwithoutajcentelements {
    
    public static int maxsum(int a[],int n)
    {
        int[] temp = new int[n+1];
        temp[0]=0;
        temp[1]=a[0];
        for(int i=2;i<=n;i++)
        {
            temp[i]=Math.max(temp[i-1], temp[i-2]+a[i-1]);
        }  
        return  temp[n];
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(maxsum(a,n));
    }
}
