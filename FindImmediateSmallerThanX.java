/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.Scanner;
import static javacourse.subarraysum.subarraysum;

/**
 *
 * @author oyo
 */
public class FindImmediateSmallerThanX {
        public static int immediateSmaller(int arr[], int n, int x)
        {
            int min=Integer.MAX_VALUE;
            int cur_min=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]<x && x-arr[i]<min)
                {min=x-arr[i];
                cur_min=arr[i];
                }
            }
            return cur_min;

        }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int x = in.nextInt();
        System.out.print(immediateSmaller(arr,n,x));
        
    }
}
