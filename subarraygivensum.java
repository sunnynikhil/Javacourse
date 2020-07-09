/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author oyo
 */
public class subarraygivensum {
    public static void getsum(int a[],int sum)
    {
        int cur_sum=0,start=0,end=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            cur_sum+=a[i];
            while(cur_sum>sum)
            {
                cur_sum-=a[start++];
            }
            if(cur_sum==sum)
            {
                end=i;
                break;
            }
            
        }
        if(end==-1)
            System.out.print("-1");
        else
            System.out.print(start+1+" "+(end+1));
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int sum = in.nextInt();
        getsum(a,sum);
    }
}
