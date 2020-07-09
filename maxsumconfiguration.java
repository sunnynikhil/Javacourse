/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class maxsumconfiguration {
    public static int getMaxSum(int a[],int n)
    {
        int sum=0,cur_val=0,next_val=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        for(int i=0;i<n;i++)
            cur_val+=a[i]*i;
        int res = cur_val;
        for(int i=0;i<n;i++)
        {
            next_val=(cur_val-(sum-a[i-1]))+(a[i-1]*n-1);
            cur_val=next_val;
            res = Math.max(res, next_val);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        return res;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        System.out.print(getMaxSum(a,n));
    }
}
