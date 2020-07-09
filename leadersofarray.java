/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import static javacourse.equalpoint.equalpoint;

/**
 *
 * @author oyo
 */
public class leadersofarray {
    public static void printleader(int a[],int n){
        int max=a[n-1];
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(a[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>max)
            {
                max=a[i];
                res.add(a[i]);
            }
        }
        Collections.reverse(res);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        printleader(arr,n);
        
    }
}
