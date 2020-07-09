/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static javacourse.findallsubarrays.maxcount;

/**
 *
 * @author oyo
 */
public class allfoursum {
    public static void allfour(int a[],int n,int sum){
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=a.length-4;i++)
        {
            for(int j=i+1;j<=n-3;j++)
            {
                ArrayList<Integer> l1 = new ArrayList<Integer>();
                int left=j+1;
                int right=n-1;
                while(left<right)
                {
                    if(a[i]+a[j]+a[left]+a[right]==sum)
                    {l1.add(a[i]);
                        l1.add(a[j]);
                        l1.add(a[left]);
                        l1.add(a[right]);
                    }
                        
                    if(a[i]+a[j]+a[left]+a[right]<sum)
                        left++;
                    else
                        right--;
                }
                if(l1!=null)
                    list.add(l1);
            }
            
        }
        System.out.print(list);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int sum=in.nextInt();
        allfour(a,n,sum);
    }
    
}
