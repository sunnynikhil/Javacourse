/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayList;
import java.util.Scanner;
import static javacourse.reversekarray.reverseK;

/**
 *
 * @author oyo
 */
public class rotatearray {
    
    public static void reverse(int arr[],int l ,int h){
    while(l<h)
    {
        int temp=arr[l];
        arr[l]=arr[h];
        arr[h]=temp;
        l++;
        h--;
    }
    
    }
    public static void rotateK(int arr[],int d,int n){
    
        reverse(arr,0,d-1);
        
        reverse(arr,d,n);
        
        reverse(arr,0,n);
        
        
    return;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        int k = in.nextInt();
        rotateK(arr,k,n-1);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        
    }
}
