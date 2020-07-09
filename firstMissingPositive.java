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
public class firstMissingPositive {
    public static int firstMissingPositive(int a[])
    {
        int n = a.length;
        boolean[] present = new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            if(a[i]>0 && a[i]<=n)
                present[a[i]]=true;
        }
        for(int i=1;i<=n;i++)
            if(!present[i])
                return i;
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(firstMissingPositive(a));
    }
}
